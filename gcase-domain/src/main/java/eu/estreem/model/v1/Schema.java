
package eu.estreem.model.v1;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "error",
    "httpStatus",
    "cardContext",
    "merchantParameters",
    "pointOfServiceContext",
    "riskContext",
    "transactionContext",
    "verification",
    "verificationValue",
    "acquirer",
    "card",
    "cardholder",
    "merchant",
    "sponsoredMerchant",
    "terminal",
    "token",
    "wallet",
    "payee",
    "payer",
    "headerFunctionalInfo",
    "additionalResponseData",
    "chargebackData",
    "disputeData",
    "eMV",
    "eventData",
    "interchange",
    "issuerScript",
    "originalTransactionData",
    "response",
    "schemeFees",
    "security",
    "threeDs",
    "transactionDetails",
    "transactionIdentification"
})
@Generated("jsonschema2pojo")
public class Schema implements Serializable
{

    @JsonProperty("error")
    private DICOOBJETJSONError error;
    @JsonProperty("httpStatus")
    private DICOOBJETJSONHttpStatus httpStatus;
    @JsonProperty("cardContext")
    private DICOOBJETJSONCardContext cardContext;
    @JsonProperty("merchantParameters")
    private DICOOBJETJSONMerchantParameters merchantParameters;
    @JsonProperty("pointOfServiceContext")
    private DICOOBJETJSONPointOfServiceContext pointOfServiceContext;
    @JsonProperty("riskContext")
    private DICOOBJETJSONRiskContext riskContext;
    @JsonProperty("transactionContext")
    private DICOOBJETJSONTransactionContext transactionContext;
    @JsonProperty("verification")
    private DICOOBJETJSONVerification verification;
    @JsonProperty("verificationValue")
    private DICOOBJETJSONVerificationValue verificationValue;
    @JsonProperty("acquirer")
    private DICOOBJETJSONAcquirer acquirer;
    @JsonProperty("card")
    private DICOOBJETJSONCard card;
    @JsonProperty("cardholder")
    private DICOOBJETJSONCardholder cardholder;
    @JsonProperty("merchant")
    private DICOOBJETJSONMerchant merchant;
    @JsonProperty("sponsoredMerchant")
    private DICOOBJETJSONSponsoredMerchant sponsoredMerchant;
    @JsonProperty("terminal")
    private DICOOBJETJSONTerminal terminal;
    @JsonProperty("token")
    private DICOOBJETJSONToken token;
    @JsonProperty("wallet")
    private DICOOBJETJSONWallet wallet;
    @JsonProperty("payee")
    private DICOOBJETJSONPayee payee;
    @JsonProperty("payer")
    private DICOOBJETJSONPayer payer;
    @JsonProperty("headerFunctionalInfo")
    private DICOOBJETJSONHeaderFunctionalInfo headerFunctionalInfo;
    @JsonProperty("additionalResponseData")
    private DICOOBJETJSONAdditionalResponseData additionalResponseData;
    @JsonProperty("chargebackData")
    private DICOOBJETJSONChargebackData chargebackData;
    @JsonProperty("disputeData")
    private DICOOBJETJSONDisputeData disputeData;
    @JsonProperty("eMV")
    private DicoObjetJsonEmv eMV;
    @JsonProperty("eventData")
    private DICOOBJETJSONEventData eventData;
    @JsonProperty("interchange")
    private DICOOBJETJSONInterchange interchange;
    @JsonProperty("issuerScript")
    private DICOOBJETJSONIssuerScript issuerScript;
    @JsonProperty("originalTransactionData")
    private DICOOBJETJSONOriginalTransactionData originalTransactionData;
    @JsonProperty("response")
    private DICOOBJETJSONResponse response;
    @JsonProperty("schemeFees")
    private DICOOBJETJSONSchemeFees schemeFees;
    @JsonProperty("security")
    private DICOOBJETJSONSecurity security;
    @JsonProperty("threeDs")
    private DICOOBJETJSONThreeDs threeDs;
    @JsonProperty("transactionDetails")
    private DICOOBJETJSONTransactionDetails transactionDetails;
    @JsonProperty("transactionIdentification")
    private DICOOBJETJSONTransactionIdentification transactionIdentification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4347988225580984602L;

    @JsonProperty("error")
    public DICOOBJETJSONError getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(DICOOBJETJSONError error) {
        this.error = error;
    }

    public Schema withError(DICOOBJETJSONError error) {
        this.error = error;
        return this;
    }

    @JsonProperty("httpStatus")
    public DICOOBJETJSONHttpStatus getHttpStatus() {
        return httpStatus;
    }

    @JsonProperty("httpStatus")
    public void setHttpStatus(DICOOBJETJSONHttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Schema withHttpStatus(DICOOBJETJSONHttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    @JsonProperty("cardContext")
    public DICOOBJETJSONCardContext getCardContext() {
        return cardContext;
    }

    @JsonProperty("cardContext")
    public void setCardContext(DICOOBJETJSONCardContext cardContext) {
        this.cardContext = cardContext;
    }

    public Schema withCardContext(DICOOBJETJSONCardContext cardContext) {
        this.cardContext = cardContext;
        return this;
    }

    @JsonProperty("merchantParameters")
    public DICOOBJETJSONMerchantParameters getMerchantParameters() {
        return merchantParameters;
    }

    @JsonProperty("merchantParameters")
    public void setMerchantParameters(DICOOBJETJSONMerchantParameters merchantParameters) {
        this.merchantParameters = merchantParameters;
    }

    public Schema withMerchantParameters(DICOOBJETJSONMerchantParameters merchantParameters) {
        this.merchantParameters = merchantParameters;
        return this;
    }

    @JsonProperty("pointOfServiceContext")
    public DICOOBJETJSONPointOfServiceContext getPointOfServiceContext() {
        return pointOfServiceContext;
    }

    @JsonProperty("pointOfServiceContext")
    public void setPointOfServiceContext(DICOOBJETJSONPointOfServiceContext pointOfServiceContext) {
        this.pointOfServiceContext = pointOfServiceContext;
    }

    public Schema withPointOfServiceContext(DICOOBJETJSONPointOfServiceContext pointOfServiceContext) {
        this.pointOfServiceContext = pointOfServiceContext;
        return this;
    }

    @JsonProperty("riskContext")
    public DICOOBJETJSONRiskContext getRiskContext() {
        return riskContext;
    }

    @JsonProperty("riskContext")
    public void setRiskContext(DICOOBJETJSONRiskContext riskContext) {
        this.riskContext = riskContext;
    }

    public Schema withRiskContext(DICOOBJETJSONRiskContext riskContext) {
        this.riskContext = riskContext;
        return this;
    }

    @JsonProperty("transactionContext")
    public DICOOBJETJSONTransactionContext getTransactionContext() {
        return transactionContext;
    }

    @JsonProperty("transactionContext")
    public void setTransactionContext(DICOOBJETJSONTransactionContext transactionContext) {
        this.transactionContext = transactionContext;
    }

    public Schema withTransactionContext(DICOOBJETJSONTransactionContext transactionContext) {
        this.transactionContext = transactionContext;
        return this;
    }

    @JsonProperty("verification")
    public DICOOBJETJSONVerification getVerification() {
        return verification;
    }

    @JsonProperty("verification")
    public void setVerification(DICOOBJETJSONVerification verification) {
        this.verification = verification;
    }

    public Schema withVerification(DICOOBJETJSONVerification verification) {
        this.verification = verification;
        return this;
    }

    @JsonProperty("verificationValue")
    public DICOOBJETJSONVerificationValue getVerificationValue() {
        return verificationValue;
    }

    @JsonProperty("verificationValue")
    public void setVerificationValue(DICOOBJETJSONVerificationValue verificationValue) {
        this.verificationValue = verificationValue;
    }

    public Schema withVerificationValue(DICOOBJETJSONVerificationValue verificationValue) {
        this.verificationValue = verificationValue;
        return this;
    }

    @JsonProperty("acquirer")
    public DICOOBJETJSONAcquirer getAcquirer() {
        return acquirer;
    }

    @JsonProperty("acquirer")
    public void setAcquirer(DICOOBJETJSONAcquirer acquirer) {
        this.acquirer = acquirer;
    }

    public Schema withAcquirer(DICOOBJETJSONAcquirer acquirer) {
        this.acquirer = acquirer;
        return this;
    }

    @JsonProperty("card")
    public DICOOBJETJSONCard getCard() {
        return card;
    }

    @JsonProperty("card")
    public void setCard(DICOOBJETJSONCard card) {
        this.card = card;
    }

    public Schema withCard(DICOOBJETJSONCard card) {
        this.card = card;
        return this;
    }

    @JsonProperty("cardholder")
    public DICOOBJETJSONCardholder getCardholder() {
        return cardholder;
    }

    @JsonProperty("cardholder")
    public void setCardholder(DICOOBJETJSONCardholder cardholder) {
        this.cardholder = cardholder;
    }

    public Schema withCardholder(DICOOBJETJSONCardholder cardholder) {
        this.cardholder = cardholder;
        return this;
    }

    @JsonProperty("merchant")
    public DICOOBJETJSONMerchant getMerchant() {
        return merchant;
    }

    @JsonProperty("merchant")
    public void setMerchant(DICOOBJETJSONMerchant merchant) {
        this.merchant = merchant;
    }

    public Schema withMerchant(DICOOBJETJSONMerchant merchant) {
        this.merchant = merchant;
        return this;
    }

    @JsonProperty("sponsoredMerchant")
    public DICOOBJETJSONSponsoredMerchant getSponsoredMerchant() {
        return sponsoredMerchant;
    }

    @JsonProperty("sponsoredMerchant")
    public void setSponsoredMerchant(DICOOBJETJSONSponsoredMerchant sponsoredMerchant) {
        this.sponsoredMerchant = sponsoredMerchant;
    }

    public Schema withSponsoredMerchant(DICOOBJETJSONSponsoredMerchant sponsoredMerchant) {
        this.sponsoredMerchant = sponsoredMerchant;
        return this;
    }

    @JsonProperty("terminal")
    public DICOOBJETJSONTerminal getTerminal() {
        return terminal;
    }

    @JsonProperty("terminal")
    public void setTerminal(DICOOBJETJSONTerminal terminal) {
        this.terminal = terminal;
    }

    public Schema withTerminal(DICOOBJETJSONTerminal terminal) {
        this.terminal = terminal;
        return this;
    }

    @JsonProperty("token")
    public DICOOBJETJSONToken getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(DICOOBJETJSONToken token) {
        this.token = token;
    }

    public Schema withToken(DICOOBJETJSONToken token) {
        this.token = token;
        return this;
    }

    @JsonProperty("wallet")
    public DICOOBJETJSONWallet getWallet() {
        return wallet;
    }

    @JsonProperty("wallet")
    public void setWallet(DICOOBJETJSONWallet wallet) {
        this.wallet = wallet;
    }

    public Schema withWallet(DICOOBJETJSONWallet wallet) {
        this.wallet = wallet;
        return this;
    }

    @JsonProperty("payee")
    public DICOOBJETJSONPayee getPayee() {
        return payee;
    }

    @JsonProperty("payee")
    public void setPayee(DICOOBJETJSONPayee payee) {
        this.payee = payee;
    }

    public Schema withPayee(DICOOBJETJSONPayee payee) {
        this.payee = payee;
        return this;
    }

    @JsonProperty("payer")
    public DICOOBJETJSONPayer getPayer() {
        return payer;
    }

    @JsonProperty("payer")
    public void setPayer(DICOOBJETJSONPayer payer) {
        this.payer = payer;
    }

    public Schema withPayer(DICOOBJETJSONPayer payer) {
        this.payer = payer;
        return this;
    }

    @JsonProperty("headerFunctionalInfo")
    public DICOOBJETJSONHeaderFunctionalInfo getHeaderFunctionalInfo() {
        return headerFunctionalInfo;
    }

    @JsonProperty("headerFunctionalInfo")
    public void setHeaderFunctionalInfo(DICOOBJETJSONHeaderFunctionalInfo headerFunctionalInfo) {
        this.headerFunctionalInfo = headerFunctionalInfo;
    }

    public Schema withHeaderFunctionalInfo(DICOOBJETJSONHeaderFunctionalInfo headerFunctionalInfo) {
        this.headerFunctionalInfo = headerFunctionalInfo;
        return this;
    }

    @JsonProperty("additionalResponseData")
    public DICOOBJETJSONAdditionalResponseData getAdditionalResponseData() {
        return additionalResponseData;
    }

    @JsonProperty("additionalResponseData")
    public void setAdditionalResponseData(DICOOBJETJSONAdditionalResponseData additionalResponseData) {
        this.additionalResponseData = additionalResponseData;
    }

    public Schema withAdditionalResponseData(DICOOBJETJSONAdditionalResponseData additionalResponseData) {
        this.additionalResponseData = additionalResponseData;
        return this;
    }

    @JsonProperty("chargebackData")
    public DICOOBJETJSONChargebackData getChargebackData() {
        return chargebackData;
    }

    @JsonProperty("chargebackData")
    public void setChargebackData(DICOOBJETJSONChargebackData chargebackData) {
        this.chargebackData = chargebackData;
    }

    public Schema withChargebackData(DICOOBJETJSONChargebackData chargebackData) {
        this.chargebackData = chargebackData;
        return this;
    }

    @JsonProperty("disputeData")
    public DICOOBJETJSONDisputeData getDisputeData() {
        return disputeData;
    }

    @JsonProperty("disputeData")
    public void setDisputeData(DICOOBJETJSONDisputeData disputeData) {
        this.disputeData = disputeData;
    }

    public Schema withDisputeData(DICOOBJETJSONDisputeData disputeData) {
        this.disputeData = disputeData;
        return this;
    }

    @JsonProperty("eMV")
    public DicoObjetJsonEmv geteMV() {
        return eMV;
    }

    @JsonProperty("eMV")
    public void seteMV(DicoObjetJsonEmv eMV) {
        this.eMV = eMV;
    }

    public Schema witheMV(DicoObjetJsonEmv eMV) {
        this.eMV = eMV;
        return this;
    }

    @JsonProperty("eventData")
    public DICOOBJETJSONEventData getEventData() {
        return eventData;
    }

    @JsonProperty("eventData")
    public void setEventData(DICOOBJETJSONEventData eventData) {
        this.eventData = eventData;
    }

    public Schema withEventData(DICOOBJETJSONEventData eventData) {
        this.eventData = eventData;
        return this;
    }

    @JsonProperty("interchange")
    public DICOOBJETJSONInterchange getInterchange() {
        return interchange;
    }

    @JsonProperty("interchange")
    public void setInterchange(DICOOBJETJSONInterchange interchange) {
        this.interchange = interchange;
    }

    public Schema withInterchange(DICOOBJETJSONInterchange interchange) {
        this.interchange = interchange;
        return this;
    }

    @JsonProperty("issuerScript")
    public DICOOBJETJSONIssuerScript getIssuerScript() {
        return issuerScript;
    }

    @JsonProperty("issuerScript")
    public void setIssuerScript(DICOOBJETJSONIssuerScript issuerScript) {
        this.issuerScript = issuerScript;
    }

    public Schema withIssuerScript(DICOOBJETJSONIssuerScript issuerScript) {
        this.issuerScript = issuerScript;
        return this;
    }

    @JsonProperty("originalTransactionData")
    public DICOOBJETJSONOriginalTransactionData getOriginalTransactionData() {
        return originalTransactionData;
    }

    @JsonProperty("originalTransactionData")
    public void setOriginalTransactionData(DICOOBJETJSONOriginalTransactionData originalTransactionData) {
        this.originalTransactionData = originalTransactionData;
    }

    public Schema withOriginalTransactionData(DICOOBJETJSONOriginalTransactionData originalTransactionData) {
        this.originalTransactionData = originalTransactionData;
        return this;
    }

    @JsonProperty("response")
    public DICOOBJETJSONResponse getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(DICOOBJETJSONResponse response) {
        this.response = response;
    }

    public Schema withResponse(DICOOBJETJSONResponse response) {
        this.response = response;
        return this;
    }

    @JsonProperty("schemeFees")
    public DICOOBJETJSONSchemeFees getSchemeFees() {
        return schemeFees;
    }

    @JsonProperty("schemeFees")
    public void setSchemeFees(DICOOBJETJSONSchemeFees schemeFees) {
        this.schemeFees = schemeFees;
    }

    public Schema withSchemeFees(DICOOBJETJSONSchemeFees schemeFees) {
        this.schemeFees = schemeFees;
        return this;
    }

    @JsonProperty("security")
    public DICOOBJETJSONSecurity getSecurity() {
        return security;
    }

    @JsonProperty("security")
    public void setSecurity(DICOOBJETJSONSecurity security) {
        this.security = security;
    }

    public Schema withSecurity(DICOOBJETJSONSecurity security) {
        this.security = security;
        return this;
    }

    @JsonProperty("threeDs")
    public DICOOBJETJSONThreeDs getThreeDs() {
        return threeDs;
    }

    @JsonProperty("threeDs")
    public void setThreeDs(DICOOBJETJSONThreeDs threeDs) {
        this.threeDs = threeDs;
    }

    public Schema withThreeDs(DICOOBJETJSONThreeDs threeDs) {
        this.threeDs = threeDs;
        return this;
    }

    @JsonProperty("transactionDetails")
    public DICOOBJETJSONTransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    @JsonProperty("transactionDetails")
    public void setTransactionDetails(DICOOBJETJSONTransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public Schema withTransactionDetails(DICOOBJETJSONTransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
        return this;
    }

    @JsonProperty("transactionIdentification")
    public DICOOBJETJSONTransactionIdentification getTransactionIdentification() {
        return transactionIdentification;
    }

    @JsonProperty("transactionIdentification")
    public void setTransactionIdentification(DICOOBJETJSONTransactionIdentification transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public Schema withTransactionIdentification(DICOOBJETJSONTransactionIdentification transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Schema withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Schema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("httpStatus");
        sb.append('=');
        sb.append(((this.httpStatus == null)?"<null>":this.httpStatus));
        sb.append(',');
        sb.append("cardContext");
        sb.append('=');
        sb.append(((this.cardContext == null)?"<null>":this.cardContext));
        sb.append(',');
        sb.append("merchantParameters");
        sb.append('=');
        sb.append(((this.merchantParameters == null)?"<null>":this.merchantParameters));
        sb.append(',');
        sb.append("pointOfServiceContext");
        sb.append('=');
        sb.append(((this.pointOfServiceContext == null)?"<null>":this.pointOfServiceContext));
        sb.append(',');
        sb.append("riskContext");
        sb.append('=');
        sb.append(((this.riskContext == null)?"<null>":this.riskContext));
        sb.append(',');
        sb.append("transactionContext");
        sb.append('=');
        sb.append(((this.transactionContext == null)?"<null>":this.transactionContext));
        sb.append(',');
        sb.append("verification");
        sb.append('=');
        sb.append(((this.verification == null)?"<null>":this.verification));
        sb.append(',');
        sb.append("verificationValue");
        sb.append('=');
        sb.append(((this.verificationValue == null)?"<null>":this.verificationValue));
        sb.append(',');
        sb.append("acquirer");
        sb.append('=');
        sb.append(((this.acquirer == null)?"<null>":this.acquirer));
        sb.append(',');
        sb.append("card");
        sb.append('=');
        sb.append(((this.card == null)?"<null>":this.card));
        sb.append(',');
        sb.append("cardholder");
        sb.append('=');
        sb.append(((this.cardholder == null)?"<null>":this.cardholder));
        sb.append(',');
        sb.append("merchant");
        sb.append('=');
        sb.append(((this.merchant == null)?"<null>":this.merchant));
        sb.append(',');
        sb.append("sponsoredMerchant");
        sb.append('=');
        sb.append(((this.sponsoredMerchant == null)?"<null>":this.sponsoredMerchant));
        sb.append(',');
        sb.append("terminal");
        sb.append('=');
        sb.append(((this.terminal == null)?"<null>":this.terminal));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("wallet");
        sb.append('=');
        sb.append(((this.wallet == null)?"<null>":this.wallet));
        sb.append(',');
        sb.append("payee");
        sb.append('=');
        sb.append(((this.payee == null)?"<null>":this.payee));
        sb.append(',');
        sb.append("payer");
        sb.append('=');
        sb.append(((this.payer == null)?"<null>":this.payer));
        sb.append(',');
        sb.append("headerFunctionalInfo");
        sb.append('=');
        sb.append(((this.headerFunctionalInfo == null)?"<null>":this.headerFunctionalInfo));
        sb.append(',');
        sb.append("additionalResponseData");
        sb.append('=');
        sb.append(((this.additionalResponseData == null)?"<null>":this.additionalResponseData));
        sb.append(',');
        sb.append("chargebackData");
        sb.append('=');
        sb.append(((this.chargebackData == null)?"<null>":this.chargebackData));
        sb.append(',');
        sb.append("disputeData");
        sb.append('=');
        sb.append(((this.disputeData == null)?"<null>":this.disputeData));
        sb.append(',');
        sb.append("eMV");
        sb.append('=');
        sb.append(((this.eMV == null)?"<null>":this.eMV));
        sb.append(',');
        sb.append("eventData");
        sb.append('=');
        sb.append(((this.eventData == null)?"<null>":this.eventData));
        sb.append(',');
        sb.append("interchange");
        sb.append('=');
        sb.append(((this.interchange == null)?"<null>":this.interchange));
        sb.append(',');
        sb.append("issuerScript");
        sb.append('=');
        sb.append(((this.issuerScript == null)?"<null>":this.issuerScript));
        sb.append(',');
        sb.append("originalTransactionData");
        sb.append('=');
        sb.append(((this.originalTransactionData == null)?"<null>":this.originalTransactionData));
        sb.append(',');
        sb.append("response");
        sb.append('=');
        sb.append(((this.response == null)?"<null>":this.response));
        sb.append(',');
        sb.append("schemeFees");
        sb.append('=');
        sb.append(((this.schemeFees == null)?"<null>":this.schemeFees));
        sb.append(',');
        sb.append("security");
        sb.append('=');
        sb.append(((this.security == null)?"<null>":this.security));
        sb.append(',');
        sb.append("threeDs");
        sb.append('=');
        sb.append(((this.threeDs == null)?"<null>":this.threeDs));
        sb.append(',');
        sb.append("transactionDetails");
        sb.append('=');
        sb.append(((this.transactionDetails == null)?"<null>":this.transactionDetails));
        sb.append(',');
        sb.append("transactionIdentification");
        sb.append('=');
        sb.append(((this.transactionIdentification == null)?"<null>":this.transactionIdentification));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.transactionDetails == null)? 0 :this.transactionDetails.hashCode()));
        result = ((result* 31)+((this.schemeFees == null)? 0 :this.schemeFees.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.acquirer == null)? 0 :this.acquirer.hashCode()));
        result = ((result* 31)+((this.payer == null)? 0 :this.payer.hashCode()));
        result = ((result* 31)+((this.threeDs == null)? 0 :this.threeDs.hashCode()));
        result = ((result* 31)+((this.eMV == null)? 0 :this.eMV.hashCode()));
        result = ((result* 31)+((this.payee == null)? 0 :this.payee.hashCode()));
        result = ((result* 31)+((this.transactionContext == null)? 0 :this.transactionContext.hashCode()));
        result = ((result* 31)+((this.security == null)? 0 :this.security.hashCode()));
        result = ((result* 31)+((this.headerFunctionalInfo == null)? 0 :this.headerFunctionalInfo.hashCode()));
        result = ((result* 31)+((this.httpStatus == null)? 0 :this.httpStatus.hashCode()));
        result = ((result* 31)+((this.sponsoredMerchant == null)? 0 :this.sponsoredMerchant.hashCode()));
        result = ((result* 31)+((this.cardContext == null)? 0 :this.cardContext.hashCode()));
        result = ((result* 31)+((this.merchantParameters == null)? 0 :this.merchantParameters.hashCode()));
        result = ((result* 31)+((this.verification == null)? 0 :this.verification.hashCode()));
        result = ((result* 31)+((this.interchange == null)? 0 :this.interchange.hashCode()));
        result = ((result* 31)+((this.disputeData == null)? 0 :this.disputeData.hashCode()));
        result = ((result* 31)+((this.issuerScript == null)? 0 :this.issuerScript.hashCode()));
        result = ((result* 31)+((this.riskContext == null)? 0 :this.riskContext.hashCode()));
        result = ((result* 31)+((this.wallet == null)? 0 :this.wallet.hashCode()));
        result = ((result* 31)+((this.originalTransactionData == null)? 0 :this.originalTransactionData.hashCode()));
        result = ((result* 31)+((this.merchant == null)? 0 :this.merchant.hashCode()));
        result = ((result* 31)+((this.terminal == null)? 0 :this.terminal.hashCode()));
        result = ((result* 31)+((this.pointOfServiceContext == null)? 0 :this.pointOfServiceContext.hashCode()));
        result = ((result* 31)+((this.cardholder == null)? 0 :this.cardholder.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        result = ((result* 31)+((this.chargebackData == null)? 0 :this.chargebackData.hashCode()));
        result = ((result* 31)+((this.eventData == null)? 0 :this.eventData.hashCode()));
        result = ((result* 31)+((this.response == null)? 0 :this.response.hashCode()));
        result = ((result* 31)+((this.verificationValue == null)? 0 :this.verificationValue.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.additionalResponseData == null)? 0 :this.additionalResponseData.hashCode()));
        result = ((result* 31)+((this.card == null)? 0 :this.card.hashCode()));
        result = ((result* 31)+((this.transactionIdentification == null)? 0 :this.transactionIdentification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schema) == false) {
            return false;
        }
        Schema rhs = ((Schema) other);
        return ((((((((((((((((((((((((((((((((((((this.transactionDetails == rhs.transactionDetails)||((this.transactionDetails!= null)&&this.transactionDetails.equals(rhs.transactionDetails)))&&((this.schemeFees == rhs.schemeFees)||((this.schemeFees!= null)&&this.schemeFees.equals(rhs.schemeFees))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.acquirer == rhs.acquirer)||((this.acquirer!= null)&&this.acquirer.equals(rhs.acquirer))))&&((this.payer == rhs.payer)||((this.payer!= null)&&this.payer.equals(rhs.payer))))&&((this.threeDs == rhs.threeDs)||((this.threeDs!= null)&&this.threeDs.equals(rhs.threeDs))))&&((this.eMV == rhs.eMV)||((this.eMV!= null)&&this.eMV.equals(rhs.eMV))))&&((this.payee == rhs.payee)||((this.payee!= null)&&this.payee.equals(rhs.payee))))&&((this.transactionContext == rhs.transactionContext)||((this.transactionContext!= null)&&this.transactionContext.equals(rhs.transactionContext))))&&((this.security == rhs.security)||((this.security!= null)&&this.security.equals(rhs.security))))&&((this.headerFunctionalInfo == rhs.headerFunctionalInfo)||((this.headerFunctionalInfo!= null)&&this.headerFunctionalInfo.equals(rhs.headerFunctionalInfo))))&&((this.httpStatus == rhs.httpStatus)||((this.httpStatus!= null)&&this.httpStatus.equals(rhs.httpStatus))))&&((this.sponsoredMerchant == rhs.sponsoredMerchant)||((this.sponsoredMerchant!= null)&&this.sponsoredMerchant.equals(rhs.sponsoredMerchant))))&&((this.cardContext == rhs.cardContext)||((this.cardContext!= null)&&this.cardContext.equals(rhs.cardContext))))&&((this.merchantParameters == rhs.merchantParameters)||((this.merchantParameters!= null)&&this.merchantParameters.equals(rhs.merchantParameters))))&&((this.verification == rhs.verification)||((this.verification!= null)&&this.verification.equals(rhs.verification))))&&((this.interchange == rhs.interchange)||((this.interchange!= null)&&this.interchange.equals(rhs.interchange))))&&((this.disputeData == rhs.disputeData)||((this.disputeData!= null)&&this.disputeData.equals(rhs.disputeData))))&&((this.issuerScript == rhs.issuerScript)||((this.issuerScript!= null)&&this.issuerScript.equals(rhs.issuerScript))))&&((this.riskContext == rhs.riskContext)||((this.riskContext!= null)&&this.riskContext.equals(rhs.riskContext))))&&((this.wallet == rhs.wallet)||((this.wallet!= null)&&this.wallet.equals(rhs.wallet))))&&((this.originalTransactionData == rhs.originalTransactionData)||((this.originalTransactionData!= null)&&this.originalTransactionData.equals(rhs.originalTransactionData))))&&((this.merchant == rhs.merchant)||((this.merchant!= null)&&this.merchant.equals(rhs.merchant))))&&((this.terminal == rhs.terminal)||((this.terminal!= null)&&this.terminal.equals(rhs.terminal))))&&((this.pointOfServiceContext == rhs.pointOfServiceContext)||((this.pointOfServiceContext!= null)&&this.pointOfServiceContext.equals(rhs.pointOfServiceContext))))&&((this.cardholder == rhs.cardholder)||((this.cardholder!= null)&&this.cardholder.equals(rhs.cardholder))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))))&&((this.chargebackData == rhs.chargebackData)||((this.chargebackData!= null)&&this.chargebackData.equals(rhs.chargebackData))))&&((this.eventData == rhs.eventData)||((this.eventData!= null)&&this.eventData.equals(rhs.eventData))))&&((this.response == rhs.response)||((this.response!= null)&&this.response.equals(rhs.response))))&&((this.verificationValue == rhs.verificationValue)||((this.verificationValue!= null)&&this.verificationValue.equals(rhs.verificationValue))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.additionalResponseData == rhs.additionalResponseData)||((this.additionalResponseData!= null)&&this.additionalResponseData.equals(rhs.additionalResponseData))))&&((this.card == rhs.card)||((this.card!= null)&&this.card.equals(rhs.card))))&&((this.transactionIdentification == rhs.transactionIdentification)||((this.transactionIdentification!= null)&&this.transactionIdentification.equals(rhs.transactionIdentification))));
    }

}
