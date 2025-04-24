package eu.estreem.gcase.controller;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.service.EventPublisherService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping(path = "/creditcom/v1/", produces = {MediaType.APPLICATION_JSON_VALUE})
@Validated
@Tag(name = "GrossCreditAndSchemeFeesEvent", description = "the CashFlowEvent API")
@RequiredArgsConstructor
public class GrossCreditAndSchemeFeesEventController {

    private final EventPublisherService eventPublisherService;

    /**
     * POST /event : Push the full event to the financial institution
     * As and when a CRE PREPAI has been generated, a Gross Cash Flow Event is generated and  the Institution (merchant bank) is notified with the reference full event.
     *
     * @param eventId Event Identifier received in the notification (required)
     * @param event  (optional)
     * @return No content, the service completed successfully and there is no content to be returned.  (status code 204)
     *         or Incorrect number of parameters, or malformed parameter. &lt;br&gt;The &lt;code&gt;eventID&lt;/code&gt; is a &lt;b&gt;RFC 4122&lt;/b&gt; UUID v4 &lt;code&gt;nnnnnn-nnnn-4nnn-9nnn-nnnnnnnnnnnn&lt;/code&gt; (4 is the version and &#39;9&#39; first 2 bits) is the variant, here variant 1). (status code 400)
     *         or Access token is missing or invalid. (status code 401)
     *         or Unsufficient rights to push this event notification. (status code 403)
     *         or The parameter &lt;code&gt;&#39;Accept&#39;&lt;/code&gt; in the HTTP header does not contain a valid value (status code 406)
     *         or Calls limit has been reached. (status code 429)
     *         or Server internal error. (status code 500)
     *         or Service is navailable. (status code 503)
     */
    @Operation(
            operationId = "eventPost",
            summary = "Push the full event to the financial institution",
            description = "As and when a CRE PREPAI has been generated, a Gross Cash Flow Event is generated and  the Institution (merchant bank) is notified with the reference full event. ",
            tags = { "GrossCreditAndSchemeFeesEvent" },
            responses = {
                    @ApiResponse(responseCode = "204", description = "No content, the service completed successfully and there is no content to be returned. "),
                    @ApiResponse(responseCode = "400", description = "Incorrect number of parameters, or malformed parameter. <br>The <code>eventID</code> is a <b>RFC 4122</b> UUID v4 <code>nnnnnn-nnnn-4nnn-9nnn-nnnnnnnnnnnn</code> (4 is the version and '9' first 2 bits) is the variant, here variant 1)."),
                    @ApiResponse(responseCode = "401", description = "Access token is missing or invalid."),
                    @ApiResponse(responseCode = "403", description = "Unsufficient rights to push this event notification."),
                    @ApiResponse(responseCode = "406", description = "The parameter <code>'Accept'</code> in the HTTP header does not contain a valid value"),
                    @ApiResponse(responseCode = "429", description = "Calls limit has been reached."),
                    @ApiResponse(responseCode = "500", description = "Server internal error."),
                    @ApiResponse(responseCode = "503", description = "Service is navailable.")
            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/event",
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> publishGrossCashFlow(@RequestHeader(name="eventID",required = true) String eventId, @Valid @RequestBody GrossCreditAndSchemeFeesEvent event){
        try {
            eventPublisherService.publishEvent(eventId,event);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException e) {
            // Bad request - client error
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
        } catch (Exception e) {
            // Server error
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to process event", e);
        }
    }
}
