package eu.estreem.gcase.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Gross Credit And SchemeFees Event")
                                .description("<p> Some e-commerce platforms, or their PSP (Payment Service Provider), offer reconciliation services that enable their key-account customers to reconcile payment transactions  with movements on their bank account and to obtain an indication of projected cash flow in pseudo-realtime, once these transactions have been sumitted for clearing  (process of transactions capture which can occur several times a day). <p> " +
                                        "To achieve this, the Account holding institution will send (bulk file), or make available (API service) cash flow annoucement events, representing outstanding credit,  anf if DPC customer with separate IBAN, ouststanding debit, as and when transactions are processed by the processor and received in the form of Gross Cash Flows Announcement events <p> Gross because the processor does not manage merchant commission, which is calculated by the bank according to the pricing model (blended, unblended, IC++) and specific  commercial conditions (rebates specal rates (e.g. during 1st quarter), commercial promotion, etc.). <p> <code><b>CASH FLOW NOTIFICATION</b> (institution) = </code> " +
                                        "<ul style:'class:list-unstyled;'>     " +
                                        "<li><b>Outstanding</b> (current position when 0)</li>     " +
                                        "<li>+ <strong style='background-color:Chartreuse;'>Cash Flow Annoucement</strong> (Processor) : information CRE PREPAI (json format) with detail on Scheme Fees coming from Event Traceability      (issued by Merchant Pricing Software Package) for this operation = </li>       <ul style:'class:list-unstyled;'>         <li> <b>Operation Gross Amount</b> (negative if credit invoice, positive if purchase invoice)</li>         <li> - <b>(Interchange fees</b> + &sum; <b>Scheme Fees</b> applied to this operation), if fees immediat debit,       " +
                                        "</ul>     " +
                                        "<li>+ <b>Merchant fees</b> (Institution) according to the pricing policy (blended, unblended, IC++)</li>   </ul>  " +
                                        "<hr> <p>  This service relies on subscription model for the underlying merchant bank. <ol>   " +
                                        "<li> CreditCom Service generates a CRE PREPAI and in // a Gross Cash Flow Event     <ul>       " +
                                        "<li><strong>[ESTREEM]</strong> Generate a CRE PREPAI for one of the Merchant Bank customer (a merchant).</Li>      " +
                                        " <li><strong>[ESTREEM]</strong> Generate the corresponding Gross Cash Flow event.</li>       " +
                                        "<li><strong>[ESTREEM]</strong> Push this Event to ESTREEM Dataware House.</li>       " +
                                        "<li><strong>[ESTREEM]</strong> POST this Event to SID Dataware house (exposed API).</li>      " +
                                        "<li><strong>[ESTREEM]</strong> <code>HTTP POST creditcom/V1/notification&eventID={uuid}  { payload ... }</code></li>    " +
                                        " </ul>   </li> </ol> ")
                                .contact(
                                        new Contact()
                                                .name("Stéphane COUTANT")
                                                .email("support@estreem.eu")
                                )
                                .version("2.0")
                )
                ;
    }
}
