
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
    "applicationId",
    "applicationInterchangeProfile",
    "billingAddress",
    "cardApplication",
    "cardBrand",
    "cardBrandProductCode",
    "cardIssuerCountryZone",
    "cardIssuerProductCode",
    "cardSecurityCodeIndicator",
    "cardSequenceNumber",
    "contactlessDevice",
    "countryCode",
    "embossedName",
    "encryptedPan",
    "expiryDate",
    "issuerId",
    "issuerInstitutionId",
    "issuerLeaderInstitutionId",
    "mastercardProduct",
    "mastercardProgram",
    "paymentAccountReference",
    "primaryAccountNumber",
    "primaryAccountNumberL4D",
    "processorCardData",
    "processorIssuerData",
    "track1",
    "track2"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONCard implements Serializable
{

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 7 and a maxlength of 22 digits. (5 to 16 bytes)
     * 
     */
    @JsonProperty("applicationId")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 7 and a maxlength of 22 digits. (5 to 16 bytes)")
    private String applicationId;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 3 digits. (2 bytes)
     * 
     */
    @JsonProperty("applicationInterchangeProfile")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 3 digits. (2 bytes)")
    private String applicationInterchangeProfile;
    @JsonProperty("billingAddress")
    private PostalAddressType billingAddress;
    @JsonProperty("cardApplication")
    private List<CardApplicationCodeset> cardApplication = new ArrayList<CardApplicationCodeset>();
    @JsonProperty("cardBrand")
    private List<BrandCodeset> cardBrand = new ArrayList<BrandCodeset>();
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 9 digits
     * 
     */
    @JsonProperty("cardBrandProductCode")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 9 digits")
    private String cardBrandProductCode;
    @JsonProperty("cardIssuerCountryZone")
    private List<CountryZoneCodeset> cardIssuerCountryZone = new ArrayList<CountryZoneCodeset>();
    @JsonProperty("cardIssuerProductCode")
    private List<CardProductCodeCodeset> cardIssuerProductCode = new ArrayList<CardProductCodeCodeset>();
    @JsonProperty("cardSecurityCodeIndicator")
    private List<CardSecurityCodeIndicatorCodeset> cardSecurityCodeIndicator = new ArrayList<CardSecurityCodeIndicatorCodeset>();
    /**
     * Specifies a numeric string with a minlength of 2 digits and a maxlength of 3 digits.
     * 
     */
    @JsonProperty("cardSequenceNumber")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 2 digits and a maxlength of 3 digits.")
    private String cardSequenceNumber;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 47 digits. (max of 35 bytes)
     * 
     */
    @JsonProperty("contactlessDevice")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 47 digits. (max of 35 bytes)")
    private String contactlessDevice;
    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)
     * 
     */
    @JsonProperty("countryCode")
    @JsonPropertyDescription("Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Numeric-3 code)")
    private String countryCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 45 characters
     * 
     */
    @JsonProperty("embossedName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 45 characters")
    private String embossedName;
    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 27 digits (20 bytes)
     * 
     */
    @JsonProperty("encryptedPan")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with an exact length of 27 digits (20 bytes)")
    private String encryptedPan;
    /**
     * Month within a particular calendar year represented by YYYY-MM (ISO 8601).
     * 
     */
    @JsonProperty("expiryDate")
    @JsonPropertyDescription("Month within a particular calendar year represented by YYYY-MM (ISO 8601).")
    private String expiryDate;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("issuerId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.")
    private String issuerId;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("issuerInstitutionId")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String issuerInstitutionId;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("issuerLeaderInstitutionId")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 35 characters")
    private String issuerLeaderInstitutionId;
    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("mastercardProduct")
    @JsonPropertyDescription("3 alphanumeric characters")
    private String mastercardProduct;
    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("mastercardProgram")
    @JsonPropertyDescription("3 alphanumeric characters")
    private String mastercardProgram;
    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 29 digits.
     * 
     */
    @JsonProperty("paymentAccountReference")
    @JsonPropertyDescription("Specifies an alphanumeric string with a minlength of 1 and maxlength of 29 digits.")
    private String paymentAccountReference;
    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("primaryAccountNumber")
    @JsonPropertyDescription("Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.")
    private String primaryAccountNumber;
    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("primaryAccountNumberL4D")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 4 digits.")
    private String primaryAccountNumberL4D;
    @JsonProperty("processorCardData")
    private ProcessorCardDataType processorCardData;
    @JsonProperty("processorIssuerData")
    private ProcessorIssuerDataType processorIssuerData;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 76 characters.
     * 
     */
    @JsonProperty("track1")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 76 characters.")
    private String track1;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 37 characters.
     * 
     */
    @JsonProperty("track2")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 37 characters.")
    private String track2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1339578435820083392L;

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 7 and a maxlength of 22 digits. (5 to 16 bytes)
     * 
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 7 and a maxlength of 22 digits. (5 to 16 bytes)
     * 
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public DICOOBJETJSONCard withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 3 digits. (2 bytes)
     * 
     */
    @JsonProperty("applicationInterchangeProfile")
    public String getApplicationInterchangeProfile() {
        return applicationInterchangeProfile;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 3 digits. (2 bytes)
     * 
     */
    @JsonProperty("applicationInterchangeProfile")
    public void setApplicationInterchangeProfile(String applicationInterchangeProfile) {
        this.applicationInterchangeProfile = applicationInterchangeProfile;
    }

    public DICOOBJETJSONCard withApplicationInterchangeProfile(String applicationInterchangeProfile) {
        this.applicationInterchangeProfile = applicationInterchangeProfile;
        return this;
    }

    @JsonProperty("billingAddress")
    public PostalAddressType getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billingAddress")
    public void setBillingAddress(PostalAddressType billingAddress) {
        this.billingAddress = billingAddress;
    }

    public DICOOBJETJSONCard withBillingAddress(PostalAddressType billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    @JsonProperty("cardApplication")
    public List<CardApplicationCodeset> getCardApplication() {
        return cardApplication;
    }

    @JsonProperty("cardApplication")
    public void setCardApplication(List<CardApplicationCodeset> cardApplication) {
        this.cardApplication = cardApplication;
    }

    public DICOOBJETJSONCard withCardApplication(List<CardApplicationCodeset> cardApplication) {
        this.cardApplication = cardApplication;
        return this;
    }

    @JsonProperty("cardBrand")
    public List<BrandCodeset> getCardBrand() {
        return cardBrand;
    }

    @JsonProperty("cardBrand")
    public void setCardBrand(List<BrandCodeset> cardBrand) {
        this.cardBrand = cardBrand;
    }

    public DICOOBJETJSONCard withCardBrand(List<BrandCodeset> cardBrand) {
        this.cardBrand = cardBrand;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 9 digits
     * 
     */
    @JsonProperty("cardBrandProductCode")
    public String getCardBrandProductCode() {
        return cardBrandProductCode;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 9 digits
     * 
     */
    @JsonProperty("cardBrandProductCode")
    public void setCardBrandProductCode(String cardBrandProductCode) {
        this.cardBrandProductCode = cardBrandProductCode;
    }

    public DICOOBJETJSONCard withCardBrandProductCode(String cardBrandProductCode) {
        this.cardBrandProductCode = cardBrandProductCode;
        return this;
    }

    @JsonProperty("cardIssuerCountryZone")
    public List<CountryZoneCodeset> getCardIssuerCountryZone() {
        return cardIssuerCountryZone;
    }

    @JsonProperty("cardIssuerCountryZone")
    public void setCardIssuerCountryZone(List<CountryZoneCodeset> cardIssuerCountryZone) {
        this.cardIssuerCountryZone = cardIssuerCountryZone;
    }

    public DICOOBJETJSONCard withCardIssuerCountryZone(List<CountryZoneCodeset> cardIssuerCountryZone) {
        this.cardIssuerCountryZone = cardIssuerCountryZone;
        return this;
    }

    @JsonProperty("cardIssuerProductCode")
    public List<CardProductCodeCodeset> getCardIssuerProductCode() {
        return cardIssuerProductCode;
    }

    @JsonProperty("cardIssuerProductCode")
    public void setCardIssuerProductCode(List<CardProductCodeCodeset> cardIssuerProductCode) {
        this.cardIssuerProductCode = cardIssuerProductCode;
    }

    public DICOOBJETJSONCard withCardIssuerProductCode(List<CardProductCodeCodeset> cardIssuerProductCode) {
        this.cardIssuerProductCode = cardIssuerProductCode;
        return this;
    }

    @JsonProperty("cardSecurityCodeIndicator")
    public List<CardSecurityCodeIndicatorCodeset> getCardSecurityCodeIndicator() {
        return cardSecurityCodeIndicator;
    }

    @JsonProperty("cardSecurityCodeIndicator")
    public void setCardSecurityCodeIndicator(List<CardSecurityCodeIndicatorCodeset> cardSecurityCodeIndicator) {
        this.cardSecurityCodeIndicator = cardSecurityCodeIndicator;
    }

    public DICOOBJETJSONCard withCardSecurityCodeIndicator(List<CardSecurityCodeIndicatorCodeset> cardSecurityCodeIndicator) {
        this.cardSecurityCodeIndicator = cardSecurityCodeIndicator;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 2 digits and a maxlength of 3 digits.
     * 
     */
    @JsonProperty("cardSequenceNumber")
    public String getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Specifies a numeric string with a minlength of 2 digits and a maxlength of 3 digits.
     * 
     */
    @JsonProperty("cardSequenceNumber")
    public void setCardSequenceNumber(String cardSequenceNumber) {
        this.cardSequenceNumber = cardSequenceNumber;
    }

    public DICOOBJETJSONCard withCardSequenceNumber(String cardSequenceNumber) {
        this.cardSequenceNumber = cardSequenceNumber;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 47 digits. (max of 35 bytes)
     * 
     */
    @JsonProperty("contactlessDevice")
    public String getContactlessDevice() {
        return contactlessDevice;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 47 digits. (max of 35 bytes)
     * 
     */
    @JsonProperty("contactlessDevice")
    public void setContactlessDevice(String contactlessDevice) {
        this.contactlessDevice = contactlessDevice;
    }

    public DICOOBJETJSONCard withContactlessDevice(String contactlessDevice) {
        this.contactlessDevice = contactlessDevice;
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

    public DICOOBJETJSONCard withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 45 characters
     * 
     */
    @JsonProperty("embossedName")
    public String getEmbossedName() {
        return embossedName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 45 characters
     * 
     */
    @JsonProperty("embossedName")
    public void setEmbossedName(String embossedName) {
        this.embossedName = embossedName;
    }

    public DICOOBJETJSONCard withEmbossedName(String embossedName) {
        this.embossedName = embossedName;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 27 digits (20 bytes)
     * 
     */
    @JsonProperty("encryptedPan")
    public String getEncryptedPan() {
        return encryptedPan;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with an exact length of 27 digits (20 bytes)
     * 
     */
    @JsonProperty("encryptedPan")
    public void setEncryptedPan(String encryptedPan) {
        this.encryptedPan = encryptedPan;
    }

    public DICOOBJETJSONCard withEncryptedPan(String encryptedPan) {
        this.encryptedPan = encryptedPan;
        return this;
    }

    /**
     * Month within a particular calendar year represented by YYYY-MM (ISO 8601).
     * 
     */
    @JsonProperty("expiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Month within a particular calendar year represented by YYYY-MM (ISO 8601).
     * 
     */
    @JsonProperty("expiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public DICOOBJETJSONCard withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("issuerId")
    public String getIssuerId() {
        return issuerId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 11 digits.
     * 
     */
    @JsonProperty("issuerId")
    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public DICOOBJETJSONCard withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("issuerInstitutionId")
    public String getIssuerInstitutionId() {
        return issuerInstitutionId;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("issuerInstitutionId")
    public void setIssuerInstitutionId(String issuerInstitutionId) {
        this.issuerInstitutionId = issuerInstitutionId;
    }

    public DICOOBJETJSONCard withIssuerInstitutionId(String issuerInstitutionId) {
        this.issuerInstitutionId = issuerInstitutionId;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("issuerLeaderInstitutionId")
    public String getIssuerLeaderInstitutionId() {
        return issuerLeaderInstitutionId;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 35 characters
     * 
     */
    @JsonProperty("issuerLeaderInstitutionId")
    public void setIssuerLeaderInstitutionId(String issuerLeaderInstitutionId) {
        this.issuerLeaderInstitutionId = issuerLeaderInstitutionId;
    }

    public DICOOBJETJSONCard withIssuerLeaderInstitutionId(String issuerLeaderInstitutionId) {
        this.issuerLeaderInstitutionId = issuerLeaderInstitutionId;
        return this;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("mastercardProduct")
    public String getMastercardProduct() {
        return mastercardProduct;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("mastercardProduct")
    public void setMastercardProduct(String mastercardProduct) {
        this.mastercardProduct = mastercardProduct;
    }

    public DICOOBJETJSONCard withMastercardProduct(String mastercardProduct) {
        this.mastercardProduct = mastercardProduct;
        return this;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("mastercardProgram")
    public String getMastercardProgram() {
        return mastercardProgram;
    }

    /**
     *  3 alphanumeric characters
     * 
     */
    @JsonProperty("mastercardProgram")
    public void setMastercardProgram(String mastercardProgram) {
        this.mastercardProgram = mastercardProgram;
    }

    public DICOOBJETJSONCard withMastercardProgram(String mastercardProgram) {
        this.mastercardProgram = mastercardProgram;
        return this;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 29 digits.
     * 
     */
    @JsonProperty("paymentAccountReference")
    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    /**
     * Specifies an alphanumeric string with a minlength of 1 and maxlength of 29 digits.
     * 
     */
    @JsonProperty("paymentAccountReference")
    public void setPaymentAccountReference(String paymentAccountReference) {
        this.paymentAccountReference = paymentAccountReference;
    }

    public DICOOBJETJSONCard withPaymentAccountReference(String paymentAccountReference) {
        this.paymentAccountReference = paymentAccountReference;
        return this;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("primaryAccountNumber")
    public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    /**
     * Specifies a numeric string with minlength of 1 and a maxlength of 19 digits.
     * 
     */
    @JsonProperty("primaryAccountNumber")
    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }

    public DICOOBJETJSONCard withPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("primaryAccountNumberL4D")
    public String getPrimaryAccountNumberL4D() {
        return primaryAccountNumberL4D;
    }

    /**
     * Specifies a numeric string with an exact length of 4 digits.
     * 
     */
    @JsonProperty("primaryAccountNumberL4D")
    public void setPrimaryAccountNumberL4D(String primaryAccountNumberL4D) {
        this.primaryAccountNumberL4D = primaryAccountNumberL4D;
    }

    public DICOOBJETJSONCard withPrimaryAccountNumberL4D(String primaryAccountNumberL4D) {
        this.primaryAccountNumberL4D = primaryAccountNumberL4D;
        return this;
    }

    @JsonProperty("processorCardData")
    public ProcessorCardDataType getProcessorCardData() {
        return processorCardData;
    }

    @JsonProperty("processorCardData")
    public void setProcessorCardData(ProcessorCardDataType processorCardData) {
        this.processorCardData = processorCardData;
    }

    public DICOOBJETJSONCard withProcessorCardData(ProcessorCardDataType processorCardData) {
        this.processorCardData = processorCardData;
        return this;
    }

    @JsonProperty("processorIssuerData")
    public ProcessorIssuerDataType getProcessorIssuerData() {
        return processorIssuerData;
    }

    @JsonProperty("processorIssuerData")
    public void setProcessorIssuerData(ProcessorIssuerDataType processorIssuerData) {
        this.processorIssuerData = processorIssuerData;
    }

    public DICOOBJETJSONCard withProcessorIssuerData(ProcessorIssuerDataType processorIssuerData) {
        this.processorIssuerData = processorIssuerData;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 76 characters.
     * 
     */
    @JsonProperty("track1")
    public String getTrack1() {
        return track1;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 76 characters.
     * 
     */
    @JsonProperty("track1")
    public void setTrack1(String track1) {
        this.track1 = track1;
    }

    public DICOOBJETJSONCard withTrack1(String track1) {
        this.track1 = track1;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 37 characters.
     * 
     */
    @JsonProperty("track2")
    public String getTrack2() {
        return track2;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 37 characters.
     * 
     */
    @JsonProperty("track2")
    public void setTrack2(String track2) {
        this.track2 = track2;
    }

    public DICOOBJETJSONCard withTrack2(String track2) {
        this.track2 = track2;
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

    public DICOOBJETJSONCard withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONCard.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("applicationId");
        sb.append('=');
        sb.append(((this.applicationId == null)?"<null>":this.applicationId));
        sb.append(',');
        sb.append("applicationInterchangeProfile");
        sb.append('=');
        sb.append(((this.applicationInterchangeProfile == null)?"<null>":this.applicationInterchangeProfile));
        sb.append(',');
        sb.append("billingAddress");
        sb.append('=');
        sb.append(((this.billingAddress == null)?"<null>":this.billingAddress));
        sb.append(',');
        sb.append("cardApplication");
        sb.append('=');
        sb.append(((this.cardApplication == null)?"<null>":this.cardApplication));
        sb.append(',');
        sb.append("cardBrand");
        sb.append('=');
        sb.append(((this.cardBrand == null)?"<null>":this.cardBrand));
        sb.append(',');
        sb.append("cardBrandProductCode");
        sb.append('=');
        sb.append(((this.cardBrandProductCode == null)?"<null>":this.cardBrandProductCode));
        sb.append(',');
        sb.append("cardIssuerCountryZone");
        sb.append('=');
        sb.append(((this.cardIssuerCountryZone == null)?"<null>":this.cardIssuerCountryZone));
        sb.append(',');
        sb.append("cardIssuerProductCode");
        sb.append('=');
        sb.append(((this.cardIssuerProductCode == null)?"<null>":this.cardIssuerProductCode));
        sb.append(',');
        sb.append("cardSecurityCodeIndicator");
        sb.append('=');
        sb.append(((this.cardSecurityCodeIndicator == null)?"<null>":this.cardSecurityCodeIndicator));
        sb.append(',');
        sb.append("cardSequenceNumber");
        sb.append('=');
        sb.append(((this.cardSequenceNumber == null)?"<null>":this.cardSequenceNumber));
        sb.append(',');
        sb.append("contactlessDevice");
        sb.append('=');
        sb.append(((this.contactlessDevice == null)?"<null>":this.contactlessDevice));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("embossedName");
        sb.append('=');
        sb.append(((this.embossedName == null)?"<null>":this.embossedName));
        sb.append(',');
        sb.append("encryptedPan");
        sb.append('=');
        sb.append(((this.encryptedPan == null)?"<null>":this.encryptedPan));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("issuerId");
        sb.append('=');
        sb.append(((this.issuerId == null)?"<null>":this.issuerId));
        sb.append(',');
        sb.append("issuerInstitutionId");
        sb.append('=');
        sb.append(((this.issuerInstitutionId == null)?"<null>":this.issuerInstitutionId));
        sb.append(',');
        sb.append("issuerLeaderInstitutionId");
        sb.append('=');
        sb.append(((this.issuerLeaderInstitutionId == null)?"<null>":this.issuerLeaderInstitutionId));
        sb.append(',');
        sb.append("mastercardProduct");
        sb.append('=');
        sb.append(((this.mastercardProduct == null)?"<null>":this.mastercardProduct));
        sb.append(',');
        sb.append("mastercardProgram");
        sb.append('=');
        sb.append(((this.mastercardProgram == null)?"<null>":this.mastercardProgram));
        sb.append(',');
        sb.append("paymentAccountReference");
        sb.append('=');
        sb.append(((this.paymentAccountReference == null)?"<null>":this.paymentAccountReference));
        sb.append(',');
        sb.append("primaryAccountNumber");
        sb.append('=');
        sb.append(((this.primaryAccountNumber == null)?"<null>":this.primaryAccountNumber));
        sb.append(',');
        sb.append("primaryAccountNumberL4D");
        sb.append('=');
        sb.append(((this.primaryAccountNumberL4D == null)?"<null>":this.primaryAccountNumberL4D));
        sb.append(',');
        sb.append("processorCardData");
        sb.append('=');
        sb.append(((this.processorCardData == null)?"<null>":this.processorCardData));
        sb.append(',');
        sb.append("processorIssuerData");
        sb.append('=');
        sb.append(((this.processorIssuerData == null)?"<null>":this.processorIssuerData));
        sb.append(',');
        sb.append("track1");
        sb.append('=');
        sb.append(((this.track1 == null)?"<null>":this.track1));
        sb.append(',');
        sb.append("track2");
        sb.append('=');
        sb.append(((this.track2 == null)?"<null>":this.track2));
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
        result = ((result* 31)+((this.mastercardProgram == null)? 0 :this.mastercardProgram.hashCode()));
        result = ((result* 31)+((this.processorCardData == null)? 0 :this.processorCardData.hashCode()));
        result = ((result* 31)+((this.cardIssuerCountryZone == null)? 0 :this.cardIssuerCountryZone.hashCode()));
        result = ((result* 31)+((this.primaryAccountNumber == null)? 0 :this.primaryAccountNumber.hashCode()));
        result = ((result* 31)+((this.embossedName == null)? 0 :this.embossedName.hashCode()));
        result = ((result* 31)+((this.cardApplication == null)? 0 :this.cardApplication.hashCode()));
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.issuerId == null)? 0 :this.issuerId.hashCode()));
        result = ((result* 31)+((this.cardIssuerProductCode == null)? 0 :this.cardIssuerProductCode.hashCode()));
        result = ((result* 31)+((this.issuerInstitutionId == null)? 0 :this.issuerInstitutionId.hashCode()));
        result = ((result* 31)+((this.countryCode == null)? 0 :this.countryCode.hashCode()));
        result = ((result* 31)+((this.primaryAccountNumberL4D == null)? 0 :this.primaryAccountNumberL4D.hashCode()));
        result = ((result* 31)+((this.cardBrand == null)? 0 :this.cardBrand.hashCode()));
        result = ((result* 31)+((this.cardBrandProductCode == null)? 0 :this.cardBrandProductCode.hashCode()));
        result = ((result* 31)+((this.cardSequenceNumber == null)? 0 :this.cardSequenceNumber.hashCode()));
        result = ((result* 31)+((this.contactlessDevice == null)? 0 :this.contactlessDevice.hashCode()));
        result = ((result* 31)+((this.track1 == null)? 0 :this.track1 .hashCode()));
        result = ((result* 31)+((this.track2 == null)? 0 :this.track2 .hashCode()));
        result = ((result* 31)+((this.cardSecurityCodeIndicator == null)? 0 :this.cardSecurityCodeIndicator.hashCode()));
        result = ((result* 31)+((this.issuerLeaderInstitutionId == null)? 0 :this.issuerLeaderInstitutionId.hashCode()));
        result = ((result* 31)+((this.encryptedPan == null)? 0 :this.encryptedPan.hashCode()));
        result = ((result* 31)+((this.mastercardProduct == null)? 0 :this.mastercardProduct.hashCode()));
        result = ((result* 31)+((this.applicationInterchangeProfile == null)? 0 :this.applicationInterchangeProfile.hashCode()));
        result = ((result* 31)+((this.paymentAccountReference == null)? 0 :this.paymentAccountReference.hashCode()));
        result = ((result* 31)+((this.processorIssuerData == null)? 0 :this.processorIssuerData.hashCode()));
        result = ((result* 31)+((this.billingAddress == null)? 0 :this.billingAddress.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.applicationId == null)? 0 :this.applicationId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONCard) == false) {
            return false;
        }
        DICOOBJETJSONCard rhs = ((DICOOBJETJSONCard) other);
        return (((((((((((((((((((((((((((((this.mastercardProgram == rhs.mastercardProgram)||((this.mastercardProgram!= null)&&this.mastercardProgram.equals(rhs.mastercardProgram)))&&((this.processorCardData == rhs.processorCardData)||((this.processorCardData!= null)&&this.processorCardData.equals(rhs.processorCardData))))&&((this.cardIssuerCountryZone == rhs.cardIssuerCountryZone)||((this.cardIssuerCountryZone!= null)&&this.cardIssuerCountryZone.equals(rhs.cardIssuerCountryZone))))&&((this.primaryAccountNumber == rhs.primaryAccountNumber)||((this.primaryAccountNumber!= null)&&this.primaryAccountNumber.equals(rhs.primaryAccountNumber))))&&((this.embossedName == rhs.embossedName)||((this.embossedName!= null)&&this.embossedName.equals(rhs.embossedName))))&&((this.cardApplication == rhs.cardApplication)||((this.cardApplication!= null)&&this.cardApplication.equals(rhs.cardApplication))))&&((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate))))&&((this.issuerId == rhs.issuerId)||((this.issuerId!= null)&&this.issuerId.equals(rhs.issuerId))))&&((this.cardIssuerProductCode == rhs.cardIssuerProductCode)||((this.cardIssuerProductCode!= null)&&this.cardIssuerProductCode.equals(rhs.cardIssuerProductCode))))&&((this.issuerInstitutionId == rhs.issuerInstitutionId)||((this.issuerInstitutionId!= null)&&this.issuerInstitutionId.equals(rhs.issuerInstitutionId))))&&((this.countryCode == rhs.countryCode)||((this.countryCode!= null)&&this.countryCode.equals(rhs.countryCode))))&&((this.primaryAccountNumberL4D == rhs.primaryAccountNumberL4D)||((this.primaryAccountNumberL4D!= null)&&this.primaryAccountNumberL4D.equals(rhs.primaryAccountNumberL4D))))&&((this.cardBrand == rhs.cardBrand)||((this.cardBrand!= null)&&this.cardBrand.equals(rhs.cardBrand))))&&((this.cardBrandProductCode == rhs.cardBrandProductCode)||((this.cardBrandProductCode!= null)&&this.cardBrandProductCode.equals(rhs.cardBrandProductCode))))&&((this.cardSequenceNumber == rhs.cardSequenceNumber)||((this.cardSequenceNumber!= null)&&this.cardSequenceNumber.equals(rhs.cardSequenceNumber))))&&((this.contactlessDevice == rhs.contactlessDevice)||((this.contactlessDevice!= null)&&this.contactlessDevice.equals(rhs.contactlessDevice))))&&((this.track1 == rhs.track1)||((this.track1 != null)&&this.track1 .equals(rhs.track1))))&&((this.track2 == rhs.track2)||((this.track2 != null)&&this.track2 .equals(rhs.track2))))&&((this.cardSecurityCodeIndicator == rhs.cardSecurityCodeIndicator)||((this.cardSecurityCodeIndicator!= null)&&this.cardSecurityCodeIndicator.equals(rhs.cardSecurityCodeIndicator))))&&((this.issuerLeaderInstitutionId == rhs.issuerLeaderInstitutionId)||((this.issuerLeaderInstitutionId!= null)&&this.issuerLeaderInstitutionId.equals(rhs.issuerLeaderInstitutionId))))&&((this.encryptedPan == rhs.encryptedPan)||((this.encryptedPan!= null)&&this.encryptedPan.equals(rhs.encryptedPan))))&&((this.mastercardProduct == rhs.mastercardProduct)||((this.mastercardProduct!= null)&&this.mastercardProduct.equals(rhs.mastercardProduct))))&&((this.applicationInterchangeProfile == rhs.applicationInterchangeProfile)||((this.applicationInterchangeProfile!= null)&&this.applicationInterchangeProfile.equals(rhs.applicationInterchangeProfile))))&&((this.paymentAccountReference == rhs.paymentAccountReference)||((this.paymentAccountReference!= null)&&this.paymentAccountReference.equals(rhs.paymentAccountReference))))&&((this.processorIssuerData == rhs.processorIssuerData)||((this.processorIssuerData!= null)&&this.processorIssuerData.equals(rhs.processorIssuerData))))&&((this.billingAddress == rhs.billingAddress)||((this.billingAddress!= null)&&this.billingAddress.equals(rhs.billingAddress))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.applicationId == rhs.applicationId)||((this.applicationId!= null)&&this.applicationId.equals(rhs.applicationId))));
    }

}
