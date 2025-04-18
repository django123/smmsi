
package eu.estreem.model.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "acceptanceSystemComponentsIdentifier",
    "acceptanceSystemIdentifierAssignedByAnAcquirer",
    "approvalCodeLength",
    "cardAcceptorArchitectureCategory",
    "cardAcceptorLogicalNumber",
    "cardholderAuthenticationCapabilities",
    "cardholderPickUpCapabilities",
    "cardReadingCapabilities",
    "cardWriteCapabilities",
    "countryCode",
    "ipAddress",
    "iTpsa",
    "iTpta",
    "messageDisplayPrintCapabilities",
    "pinLengthCapabilities",
    "pinReadingCapabilities",
    "poiAssignedByAnAcquirer",
    "poiInformation",
    "poiLogicalNumber",
    "serialNumber",
    "terminalCapabilities",
    "terminalCategory",
    "terminalId",
    "terminalIdsa"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONTerminal implements Serializable
{

    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("acceptanceSystemComponentsIdentifier")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 12 digits.")
    private String acceptanceSystemComponentsIdentifier;
    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("acceptanceSystemIdentifierAssignedByAnAcquirer")
    @JsonPropertyDescription("8 alphanumeric characters")
    private String acceptanceSystemIdentifierAssignedByAnAcquirer;
    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("approvalCodeLength")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 1 digits.")
    private String approvalCodeLength;
    @JsonProperty("cardAcceptorArchitectureCategory")
    private List<CardAcceptorArchitectureCategoryCodeset> cardAcceptorArchitectureCategory = new ArrayList<CardAcceptorArchitectureCategoryCodeset>();
    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("cardAcceptorLogicalNumber")
    @JsonPropertyDescription("3 alphanumeric characters")
    private String cardAcceptorLogicalNumber;
    @JsonProperty("cardholderAuthenticationCapabilities")
    private List<CardholderAuthenticationCapabilitiesCodeset> cardholderAuthenticationCapabilities = new ArrayList<CardholderAuthenticationCapabilitiesCodeset>();
    @JsonProperty("cardholderPickUpCapabilities")
    private List<CardholderPickUpCapabilitiesCodeset> cardholderPickUpCapabilities = new ArrayList<CardholderPickUpCapabilitiesCodeset>();
    @JsonProperty("cardReadingCapabilities")
    private List<CardReadingCapabilitiesCodeset> cardReadingCapabilities = new ArrayList<CardReadingCapabilitiesCodeset>();
    @JsonProperty("cardWriteCapabilities")
    private List<CardWriteCapabilitiesCodeset> cardWriteCapabilities = new ArrayList<CardWriteCapabilitiesCodeset>();
    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)")
    private String countryCode;
    /**
     * Specifies a character string with a minlength of 4 and maxlength of 45 digits.
     * 
     */
    @JsonProperty("ipAddress")
    @JsonPropertyDescription("Specifies a character string with a minlength of 4 and maxlength of 45 digits.")
    private String ipAddress;
    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("iTpsa")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 12 digits.")
    private String iTpsa;
    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("iTpta")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 12 digits.")
    private String iTpta;
    @JsonProperty("messageDisplayPrintCapabilities")
    private List<MessageDisplayPrintCapabilitiesCodeset> messageDisplayPrintCapabilities = new ArrayList<MessageDisplayPrintCapabilitiesCodeset>();
    /**
     * Number of objects represented as a positive integer.
     * 
     */
    @JsonProperty("pinLengthCapabilities")
    @JsonPropertyDescription("Number of objects represented as a positive integer.")
    private String pinLengthCapabilities;
    @JsonProperty("pinReadingCapabilities")
    private List<PinReadingCapabilitiesCodeset> pinReadingCapabilities = new ArrayList<PinReadingCapabilitiesCodeset>();
    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("poiAssignedByAnAcquirer")
    @JsonPropertyDescription("8 alphanumeric characters")
    private String poiAssignedByAnAcquirer;
    @JsonProperty("poiInformation")
    private List<POIInformationCodeset> poiInformation = new ArrayList<POIInformationCodeset>();
    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("poiLogicalNumber")
    @JsonPropertyDescription("3 alphanumeric characters")
    private String poiLogicalNumber;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("serialNumber")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String serialNumber;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 4 digits. (3 bytes)
     * 
     */
    @JsonProperty("terminalCapabilities")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 4 digits. (3 bytes)")
    private String terminalCapabilities;
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("terminalCategory")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String terminalCategory;
    /**
     *  8 alphanumeric  and special characters
     * 
     */
    @JsonProperty("terminalId")
    @JsonPropertyDescription("8 alphanumeric  and special characters")
    private String terminalId;
    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("terminalIdsa")
    @JsonPropertyDescription("8 alphanumeric characters")
    private String terminalIdsa;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 44486452077090203L;

    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("acceptanceSystemComponentsIdentifier")
    public String getAcceptanceSystemComponentsIdentifier() {
        return acceptanceSystemComponentsIdentifier;
    }

    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("acceptanceSystemComponentsIdentifier")
    public void setAcceptanceSystemComponentsIdentifier(String acceptanceSystemComponentsIdentifier) {
        this.acceptanceSystemComponentsIdentifier = acceptanceSystemComponentsIdentifier;
    }

    public DICOOBJETJSONTerminal withAcceptanceSystemComponentsIdentifier(String acceptanceSystemComponentsIdentifier) {
        this.acceptanceSystemComponentsIdentifier = acceptanceSystemComponentsIdentifier;
        return this;
    }

    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("acceptanceSystemIdentifierAssignedByAnAcquirer")
    public String getAcceptanceSystemIdentifierAssignedByAnAcquirer() {
        return acceptanceSystemIdentifierAssignedByAnAcquirer;
    }

    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("acceptanceSystemIdentifierAssignedByAnAcquirer")
    public void setAcceptanceSystemIdentifierAssignedByAnAcquirer(String acceptanceSystemIdentifierAssignedByAnAcquirer) {
        this.acceptanceSystemIdentifierAssignedByAnAcquirer = acceptanceSystemIdentifierAssignedByAnAcquirer;
    }

    public DICOOBJETJSONTerminal withAcceptanceSystemIdentifierAssignedByAnAcquirer(String acceptanceSystemIdentifierAssignedByAnAcquirer) {
        this.acceptanceSystemIdentifierAssignedByAnAcquirer = acceptanceSystemIdentifierAssignedByAnAcquirer;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("approvalCodeLength")
    public String getApprovalCodeLength() {
        return approvalCodeLength;
    }

    /**
     * Specifies a numeric string with an exact length of 1 digits.
     * 
     */
    @JsonProperty("approvalCodeLength")
    public void setApprovalCodeLength(String approvalCodeLength) {
        this.approvalCodeLength = approvalCodeLength;
    }

    public DICOOBJETJSONTerminal withApprovalCodeLength(String approvalCodeLength) {
        this.approvalCodeLength = approvalCodeLength;
        return this;
    }

    @JsonProperty("cardAcceptorArchitectureCategory")
    public List<CardAcceptorArchitectureCategoryCodeset> getCardAcceptorArchitectureCategory() {
        return cardAcceptorArchitectureCategory;
    }

    @JsonProperty("cardAcceptorArchitectureCategory")
    public void setCardAcceptorArchitectureCategory(List<CardAcceptorArchitectureCategoryCodeset> cardAcceptorArchitectureCategory) {
        this.cardAcceptorArchitectureCategory = cardAcceptorArchitectureCategory;
    }

    public DICOOBJETJSONTerminal withCardAcceptorArchitectureCategory(List<CardAcceptorArchitectureCategoryCodeset> cardAcceptorArchitectureCategory) {
        this.cardAcceptorArchitectureCategory = cardAcceptorArchitectureCategory;
        return this;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("cardAcceptorLogicalNumber")
    public String getCardAcceptorLogicalNumber() {
        return cardAcceptorLogicalNumber;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("cardAcceptorLogicalNumber")
    public void setCardAcceptorLogicalNumber(String cardAcceptorLogicalNumber) {
        this.cardAcceptorLogicalNumber = cardAcceptorLogicalNumber;
    }

    public DICOOBJETJSONTerminal withCardAcceptorLogicalNumber(String cardAcceptorLogicalNumber) {
        this.cardAcceptorLogicalNumber = cardAcceptorLogicalNumber;
        return this;
    }

    @JsonProperty("cardholderAuthenticationCapabilities")
    public List<CardholderAuthenticationCapabilitiesCodeset> getCardholderAuthenticationCapabilities() {
        return cardholderAuthenticationCapabilities;
    }

    @JsonProperty("cardholderAuthenticationCapabilities")
    public void setCardholderAuthenticationCapabilities(List<CardholderAuthenticationCapabilitiesCodeset> cardholderAuthenticationCapabilities) {
        this.cardholderAuthenticationCapabilities = cardholderAuthenticationCapabilities;
    }

    public DICOOBJETJSONTerminal withCardholderAuthenticationCapabilities(List<CardholderAuthenticationCapabilitiesCodeset> cardholderAuthenticationCapabilities) {
        this.cardholderAuthenticationCapabilities = cardholderAuthenticationCapabilities;
        return this;
    }

    @JsonProperty("cardholderPickUpCapabilities")
    public List<CardholderPickUpCapabilitiesCodeset> getCardholderPickUpCapabilities() {
        return cardholderPickUpCapabilities;
    }

    @JsonProperty("cardholderPickUpCapabilities")
    public void setCardholderPickUpCapabilities(List<CardholderPickUpCapabilitiesCodeset> cardholderPickUpCapabilities) {
        this.cardholderPickUpCapabilities = cardholderPickUpCapabilities;
    }

    public DICOOBJETJSONTerminal withCardholderPickUpCapabilities(List<CardholderPickUpCapabilitiesCodeset> cardholderPickUpCapabilities) {
        this.cardholderPickUpCapabilities = cardholderPickUpCapabilities;
        return this;
    }

    @JsonProperty("cardReadingCapabilities")
    public List<CardReadingCapabilitiesCodeset> getCardReadingCapabilities() {
        return cardReadingCapabilities;
    }

    @JsonProperty("cardReadingCapabilities")
    public void setCardReadingCapabilities(List<CardReadingCapabilitiesCodeset> cardReadingCapabilities) {
        this.cardReadingCapabilities = cardReadingCapabilities;
    }

    public DICOOBJETJSONTerminal withCardReadingCapabilities(List<CardReadingCapabilitiesCodeset> cardReadingCapabilities) {
        this.cardReadingCapabilities = cardReadingCapabilities;
        return this;
    }

    @JsonProperty("cardWriteCapabilities")
    public List<CardWriteCapabilitiesCodeset> getCardWriteCapabilities() {
        return cardWriteCapabilities;
    }

    @JsonProperty("cardWriteCapabilities")
    public void setCardWriteCapabilities(List<CardWriteCapabilitiesCodeset> cardWriteCapabilities) {
        this.cardWriteCapabilities = cardWriteCapabilities;
    }

    public DICOOBJETJSONTerminal withCardWriteCapabilities(List<CardWriteCapabilitiesCodeset> cardWriteCapabilities) {
        this.cardWriteCapabilities = cardWriteCapabilities;
        return this;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public DICOOBJETJSONTerminal withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 4 and maxlength of 45 digits.
     * 
     */
    @JsonProperty("ipAddress")
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Specifies a character string with a minlength of 4 and maxlength of 45 digits.
     * 
     */
    @JsonProperty("ipAddress")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public DICOOBJETJSONTerminal withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("iTpsa")
    public String getiTpsa() {
        return iTpsa;
    }

    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("iTpsa")
    public void setiTpsa(String iTpsa) {
        this.iTpsa = iTpsa;
    }

    public DICOOBJETJSONTerminal withiTpsa(String iTpsa) {
        this.iTpsa = iTpsa;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("iTpta")
    public String getiTpta() {
        return iTpta;
    }

    /**
     * Specifies a numeric string with an exact length of 12 digits.
     * 
     */
    @JsonProperty("iTpta")
    public void setiTpta(String iTpta) {
        this.iTpta = iTpta;
    }

    public DICOOBJETJSONTerminal withiTpta(String iTpta) {
        this.iTpta = iTpta;
        return this;
    }

    @JsonProperty("messageDisplayPrintCapabilities")
    public List<MessageDisplayPrintCapabilitiesCodeset> getMessageDisplayPrintCapabilities() {
        return messageDisplayPrintCapabilities;
    }

    @JsonProperty("messageDisplayPrintCapabilities")
    public void setMessageDisplayPrintCapabilities(List<MessageDisplayPrintCapabilitiesCodeset> messageDisplayPrintCapabilities) {
        this.messageDisplayPrintCapabilities = messageDisplayPrintCapabilities;
    }

    public DICOOBJETJSONTerminal withMessageDisplayPrintCapabilities(List<MessageDisplayPrintCapabilitiesCodeset> messageDisplayPrintCapabilities) {
        this.messageDisplayPrintCapabilities = messageDisplayPrintCapabilities;
        return this;
    }

    /**
     * Number of objects represented as a positive integer.
     * 
     */
    @JsonProperty("pinLengthCapabilities")
    public String getPinLengthCapabilities() {
        return pinLengthCapabilities;
    }

    /**
     * Number of objects represented as a positive integer.
     * 
     */
    @JsonProperty("pinLengthCapabilities")
    public void setPinLengthCapabilities(String pinLengthCapabilities) {
        this.pinLengthCapabilities = pinLengthCapabilities;
    }

    public DICOOBJETJSONTerminal withPinLengthCapabilities(String pinLengthCapabilities) {
        this.pinLengthCapabilities = pinLengthCapabilities;
        return this;
    }

    @JsonProperty("pinReadingCapabilities")
    public List<PinReadingCapabilitiesCodeset> getPinReadingCapabilities() {
        return pinReadingCapabilities;
    }

    @JsonProperty("pinReadingCapabilities")
    public void setPinReadingCapabilities(List<PinReadingCapabilitiesCodeset> pinReadingCapabilities) {
        this.pinReadingCapabilities = pinReadingCapabilities;
    }

    public DICOOBJETJSONTerminal withPinReadingCapabilities(List<PinReadingCapabilitiesCodeset> pinReadingCapabilities) {
        this.pinReadingCapabilities = pinReadingCapabilities;
        return this;
    }

    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("poiAssignedByAnAcquirer")
    public String getPoiAssignedByAnAcquirer() {
        return poiAssignedByAnAcquirer;
    }

    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("poiAssignedByAnAcquirer")
    public void setPoiAssignedByAnAcquirer(String poiAssignedByAnAcquirer) {
        this.poiAssignedByAnAcquirer = poiAssignedByAnAcquirer;
    }

    public DICOOBJETJSONTerminal withPoiAssignedByAnAcquirer(String poiAssignedByAnAcquirer) {
        this.poiAssignedByAnAcquirer = poiAssignedByAnAcquirer;
        return this;
    }

    @JsonProperty("poiInformation")
    public List<POIInformationCodeset> getPoiInformation() {
        return poiInformation;
    }

    @JsonProperty("poiInformation")
    public void setPoiInformation(List<POIInformationCodeset> poiInformation) {
        this.poiInformation = poiInformation;
    }

    public DICOOBJETJSONTerminal withPoiInformation(List<POIInformationCodeset> poiInformation) {
        this.poiInformation = poiInformation;
        return this;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("poiLogicalNumber")
    public String getPoiLogicalNumber() {
        return poiLogicalNumber;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("poiLogicalNumber")
    public void setPoiLogicalNumber(String poiLogicalNumber) {
        this.poiLogicalNumber = poiLogicalNumber;
    }

    public DICOOBJETJSONTerminal withPoiLogicalNumber(String poiLogicalNumber) {
        this.poiLogicalNumber = poiLogicalNumber;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("serialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("serialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public DICOOBJETJSONTerminal withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 4 digits. (3 bytes)
     * 
     */
    @JsonProperty("terminalCapabilities")
    public String getTerminalCapabilities() {
        return terminalCapabilities;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 4 digits. (3 bytes)
     * 
     */
    @JsonProperty("terminalCapabilities")
    public void setTerminalCapabilities(String terminalCapabilities) {
        this.terminalCapabilities = terminalCapabilities;
    }

    public DICOOBJETJSONTerminal withTerminalCapabilities(String terminalCapabilities) {
        this.terminalCapabilities = terminalCapabilities;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("terminalCategory")
    public String getTerminalCategory() {
        return terminalCategory;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("terminalCategory")
    public void setTerminalCategory(String terminalCategory) {
        this.terminalCategory = terminalCategory;
    }

    public DICOOBJETJSONTerminal withTerminalCategory(String terminalCategory) {
        this.terminalCategory = terminalCategory;
        return this;
    }

    /**
     *  8 alphanumeric  and special characters
     * 
     */
    @JsonProperty("terminalId")
    public String getTerminalId() {
        return terminalId;
    }

    /**
     *  8 alphanumeric  and special characters
     * 
     */
    @JsonProperty("terminalId")
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public DICOOBJETJSONTerminal withTerminalId(String terminalId) {
        this.terminalId = terminalId;
        return this;
    }

    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("terminalIdsa")
    public String getTerminalIdsa() {
        return terminalIdsa;
    }

    /**
     *  8 alphanumeric characters
     * 
     */
    @JsonProperty("terminalIdsa")
    public void setTerminalIdsa(String terminalIdsa) {
        this.terminalIdsa = terminalIdsa;
    }

    public DICOOBJETJSONTerminal withTerminalIdsa(String terminalIdsa) {
        this.terminalIdsa = terminalIdsa;
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

    public DICOOBJETJSONTerminal withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONTerminal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acceptanceSystemComponentsIdentifier");
        sb.append('=');
        sb.append(((this.acceptanceSystemComponentsIdentifier == null)?"<null>":this.acceptanceSystemComponentsIdentifier));
        sb.append(',');
        sb.append("acceptanceSystemIdentifierAssignedByAnAcquirer");
        sb.append('=');
        sb.append(((this.acceptanceSystemIdentifierAssignedByAnAcquirer == null)?"<null>":this.acceptanceSystemIdentifierAssignedByAnAcquirer));
        sb.append(',');
        sb.append("approvalCodeLength");
        sb.append('=');
        sb.append(((this.approvalCodeLength == null)?"<null>":this.approvalCodeLength));
        sb.append(',');
        sb.append("cardAcceptorArchitectureCategory");
        sb.append('=');
        sb.append(((this.cardAcceptorArchitectureCategory == null)?"<null>":this.cardAcceptorArchitectureCategory));
        sb.append(',');
        sb.append("cardAcceptorLogicalNumber");
        sb.append('=');
        sb.append(((this.cardAcceptorLogicalNumber == null)?"<null>":this.cardAcceptorLogicalNumber));
        sb.append(',');
        sb.append("cardholderAuthenticationCapabilities");
        sb.append('=');
        sb.append(((this.cardholderAuthenticationCapabilities == null)?"<null>":this.cardholderAuthenticationCapabilities));
        sb.append(',');
        sb.append("cardholderPickUpCapabilities");
        sb.append('=');
        sb.append(((this.cardholderPickUpCapabilities == null)?"<null>":this.cardholderPickUpCapabilities));
        sb.append(',');
        sb.append("cardReadingCapabilities");
        sb.append('=');
        sb.append(((this.cardReadingCapabilities == null)?"<null>":this.cardReadingCapabilities));
        sb.append(',');
        sb.append("cardWriteCapabilities");
        sb.append('=');
        sb.append(((this.cardWriteCapabilities == null)?"<null>":this.cardWriteCapabilities));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("ipAddress");
        sb.append('=');
        sb.append(((this.ipAddress == null)?"<null>":this.ipAddress));
        sb.append(',');
        sb.append("iTpsa");
        sb.append('=');
        sb.append(((this.iTpsa == null)?"<null>":this.iTpsa));
        sb.append(',');
        sb.append("iTpta");
        sb.append('=');
        sb.append(((this.iTpta == null)?"<null>":this.iTpta));
        sb.append(',');
        sb.append("messageDisplayPrintCapabilities");
        sb.append('=');
        sb.append(((this.messageDisplayPrintCapabilities == null)?"<null>":this.messageDisplayPrintCapabilities));
        sb.append(',');
        sb.append("pinLengthCapabilities");
        sb.append('=');
        sb.append(((this.pinLengthCapabilities == null)?"<null>":this.pinLengthCapabilities));
        sb.append(',');
        sb.append("pinReadingCapabilities");
        sb.append('=');
        sb.append(((this.pinReadingCapabilities == null)?"<null>":this.pinReadingCapabilities));
        sb.append(',');
        sb.append("poiAssignedByAnAcquirer");
        sb.append('=');
        sb.append(((this.poiAssignedByAnAcquirer == null)?"<null>":this.poiAssignedByAnAcquirer));
        sb.append(',');
        sb.append("poiInformation");
        sb.append('=');
        sb.append(((this.poiInformation == null)?"<null>":this.poiInformation));
        sb.append(',');
        sb.append("poiLogicalNumber");
        sb.append('=');
        sb.append(((this.poiLogicalNumber == null)?"<null>":this.poiLogicalNumber));
        sb.append(',');
        sb.append("serialNumber");
        sb.append('=');
        sb.append(((this.serialNumber == null)?"<null>":this.serialNumber));
        sb.append(',');
        sb.append("terminalCapabilities");
        sb.append('=');
        sb.append(((this.terminalCapabilities == null)?"<null>":this.terminalCapabilities));
        sb.append(',');
        sb.append("terminalCategory");
        sb.append('=');
        sb.append(((this.terminalCategory == null)?"<null>":this.terminalCategory));
        sb.append(',');
        sb.append("terminalId");
        sb.append('=');
        sb.append(((this.terminalId == null)?"<null>":this.terminalId));
        sb.append(',');
        sb.append("terminalIdsa");
        sb.append('=');
        sb.append(((this.terminalIdsa == null)?"<null>":this.terminalIdsa));
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
        result = ((result* 31)+((this.cardholderAuthenticationCapabilities == null)? 0 :this.cardholderAuthenticationCapabilities.hashCode()));
        result = ((result* 31)+((this.acceptanceSystemIdentifierAssignedByAnAcquirer == null)? 0 :this.acceptanceSystemIdentifierAssignedByAnAcquirer.hashCode()));
        result = ((result* 31)+((this.terminalId == null)? 0 :this.terminalId.hashCode()));
        result = ((result* 31)+((this.approvalCodeLength == null)? 0 :this.approvalCodeLength.hashCode()));
        result = ((result* 31)+((this.cardAcceptorArchitectureCategory == null)? 0 :this.cardAcceptorArchitectureCategory.hashCode()));
        result = ((result* 31)+((this.cardWriteCapabilities == null)? 0 :this.cardWriteCapabilities.hashCode()));
        result = ((result* 31)+((this.messageDisplayPrintCapabilities == null)? 0 :this.messageDisplayPrintCapabilities.hashCode()));
        result = ((result* 31)+((this.pinLengthCapabilities == null)? 0 :this.pinLengthCapabilities.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        result = ((result* 31)+((this.iTpta == null)? 0 :this.iTpta.hashCode()));
        result = ((result* 31)+((this.serialNumber == null)? 0 :this.serialNumber.hashCode()));
        result = ((result* 31)+((this.acceptanceSystemComponentsIdentifier == null)? 0 :this.acceptanceSystemComponentsIdentifier.hashCode()));
        result = ((result* 31)+((this.ipAddress == null)? 0 :this.ipAddress.hashCode()));
        result = ((result* 31)+((this.cardAcceptorLogicalNumber == null)? 0 :this.cardAcceptorLogicalNumber.hashCode()));
        result = ((result* 31)+((this.pinReadingCapabilities == null)? 0 :this.pinReadingCapabilities.hashCode()));
        result = ((result* 31)+((this.poiLogicalNumber == null)? 0 :this.poiLogicalNumber.hashCode()));
        result = ((result* 31)+((this.terminalIdsa == null)? 0 :this.terminalIdsa.hashCode()));
        result = ((result* 31)+((this.terminalCategory == null)? 0 :this.terminalCategory.hashCode()));
        result = ((result* 31)+((this.poiInformation == null)? 0 :this.poiInformation.hashCode()));
        result = ((result* 31)+((this.terminalCapabilities == null)? 0 :this.terminalCapabilities.hashCode()));
        result = ((result* 31)+((this.cardReadingCapabilities == null)? 0 :this.cardReadingCapabilities.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.iTpsa == null)? 0 :this.iTpsa.hashCode()));
        result = ((result* 31)+((this.poiAssignedByAnAcquirer == null)? 0 :this.poiAssignedByAnAcquirer.hashCode()));
        result = ((result* 31)+((this.cardholderPickUpCapabilities == null)? 0 :this.cardholderPickUpCapabilities.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONTerminal) == false) {
            return false;
        }
        DICOOBJETJSONTerminal rhs = ((DICOOBJETJSONTerminal) other);
        return ((((((((((((((((((((((((((this.cardholderAuthenticationCapabilities == rhs.cardholderAuthenticationCapabilities)||((this.cardholderAuthenticationCapabilities!= null)&&this.cardholderAuthenticationCapabilities.equals(rhs.cardholderAuthenticationCapabilities)))&&((this.acceptanceSystemIdentifierAssignedByAnAcquirer == rhs.acceptanceSystemIdentifierAssignedByAnAcquirer)||((this.acceptanceSystemIdentifierAssignedByAnAcquirer!= null)&&this.acceptanceSystemIdentifierAssignedByAnAcquirer.equals(rhs.acceptanceSystemIdentifierAssignedByAnAcquirer))))&&((this.terminalId == rhs.terminalId)||((this.terminalId!= null)&&this.terminalId.equals(rhs.terminalId))))&&((this.approvalCodeLength == rhs.approvalCodeLength)||((this.approvalCodeLength!= null)&&this.approvalCodeLength.equals(rhs.approvalCodeLength))))&&((this.cardAcceptorArchitectureCategory == rhs.cardAcceptorArchitectureCategory)||((this.cardAcceptorArchitectureCategory!= null)&&this.cardAcceptorArchitectureCategory.equals(rhs.cardAcceptorArchitectureCategory))))&&((this.cardWriteCapabilities == rhs.cardWriteCapabilities)||((this.cardWriteCapabilities!= null)&&this.cardWriteCapabilities.equals(rhs.cardWriteCapabilities))))&&((this.messageDisplayPrintCapabilities == rhs.messageDisplayPrintCapabilities)||((this.messageDisplayPrintCapabilities!= null)&&this.messageDisplayPrintCapabilities.equals(rhs.messageDisplayPrintCapabilities))))&&((this.pinLengthCapabilities == rhs.pinLengthCapabilities)||((this.pinLengthCapabilities!= null)&&this.pinLengthCapabilities.equals(rhs.pinLengthCapabilities))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))))&&((this.iTpta == rhs.iTpta)||((this.iTpta!= null)&&this.iTpta.equals(rhs.iTpta))))&&((this.serialNumber == rhs.serialNumber)||((this.serialNumber!= null)&&this.serialNumber.equals(rhs.serialNumber))))&&((this.acceptanceSystemComponentsIdentifier == rhs.acceptanceSystemComponentsIdentifier)||((this.acceptanceSystemComponentsIdentifier!= null)&&this.acceptanceSystemComponentsIdentifier.equals(rhs.acceptanceSystemComponentsIdentifier))))&&((this.ipAddress == rhs.ipAddress)||((this.ipAddress!= null)&&this.ipAddress.equals(rhs.ipAddress))))&&((this.cardAcceptorLogicalNumber == rhs.cardAcceptorLogicalNumber)||((this.cardAcceptorLogicalNumber!= null)&&this.cardAcceptorLogicalNumber.equals(rhs.cardAcceptorLogicalNumber))))&&((this.pinReadingCapabilities == rhs.pinReadingCapabilities)||((this.pinReadingCapabilities!= null)&&this.pinReadingCapabilities.equals(rhs.pinReadingCapabilities))))&&((this.poiLogicalNumber == rhs.poiLogicalNumber)||((this.poiLogicalNumber!= null)&&this.poiLogicalNumber.equals(rhs.poiLogicalNumber))))&&((this.terminalIdsa == rhs.terminalIdsa)||((this.terminalIdsa!= null)&&this.terminalIdsa.equals(rhs.terminalIdsa))))&&((this.terminalCategory == rhs.terminalCategory)||((this.terminalCategory!= null)&&this.terminalCategory.equals(rhs.terminalCategory))))&&((this.poiInformation == rhs.poiInformation)||((this.poiInformation!= null)&&this.poiInformation.equals(rhs.poiInformation))))&&((this.terminalCapabilities == rhs.terminalCapabilities)||((this.terminalCapabilities!= null)&&this.terminalCapabilities.equals(rhs.terminalCapabilities))))&&((this.cardReadingCapabilities == rhs.cardReadingCapabilities)||((this.cardReadingCapabilities!= null)&&this.cardReadingCapabilities.equals(rhs.cardReadingCapabilities))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.iTpsa == rhs.iTpsa)||((this.iTpsa!= null)&&this.iTpsa.equals(rhs.iTpsa))))&&((this.poiAssignedByAnAcquirer == rhs.poiAssignedByAnAcquirer)||((this.poiAssignedByAnAcquirer!= null)&&this.poiAssignedByAnAcquirer.equals(rhs.poiAssignedByAnAcquirer))))&&((this.cardholderPickUpCapabilities == rhs.cardholderPickUpCapabilities)||((this.cardholderPickUpCapabilities!= null)&&this.cardholderPickUpCapabilities.equals(rhs.cardholderPickUpCapabilities))));
    }

}
