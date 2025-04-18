
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
    "acceptanceChannel",
    "acceptanceSystemLogicalNumber",
    "allowedCountry",
    "allowedCurrency",
    "allowedSchemeCode",
    "anonymousIndicator",
    "companyRegistrationNumber",
    "companyRegistrationNumberCategory",
    "cryptoCurrencyIndicator",
    "dynamicMerchantNameIndicator",
    "foreignCurrencyIndicator",
    "governmentCountryCode",
    "locationCategoryCode",
    "merchantAdditionalData",
    "merchantCategory",
    "merchantCategoryCode",
    "merchantCbId",
    "merchantCbName",
    "merchantFrenchContractNumber",
    "merchantId",
    "merchantMastercardId",
    "merchantMastercardName",
    "merchantName",
    "merchantProcessingEndDate",
    "merchantProcessingStartDate",
    "merchantVisaId",
    "merchantVisaName",
    "paymentCategory",
    "poiIdByAcquirer",
    "postalAddress",
    "schemeMerchantId",
    "signName",
    "singleContractIndicator"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONMerchant implements Serializable
{

    @JsonProperty("acceptanceChannel")
    private List<AcceptanceChannelCodeset> acceptanceChannel = new ArrayList<AcceptanceChannelCodeset>();
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("acceptanceSystemLogicalNumber")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 3 digits")
    private String acceptanceSystemLogicalNumber;
    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Text -2 code)
     * 
     */
    @JsonProperty("allowedCountry")
    @JsonPropertyDescription("Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Text -2 code)")
    private String allowedCountry;
    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("allowedCurrency")
    @JsonPropertyDescription("Code to identify the Currency (ISO 4217)")
    private String allowedCurrency;
    @JsonProperty("allowedSchemeCode")
    private List<NetworkCodeset> allowedSchemeCode = new ArrayList<NetworkCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("anonymousIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean anonymousIndicator;
    /**
     * Specifies a alphanumeric string with a minlength of 1 and maxlength of 14 digits
     * 
     */
    @JsonProperty("companyRegistrationNumber")
    @JsonPropertyDescription("Specifies a alphanumeric string with a minlength of 1 and maxlength of 14 digits")
    private String companyRegistrationNumber;
    @JsonProperty("companyRegistrationNumberCategory")
    private List<CompanyRegistrationNumberCategoryCodeset> companyRegistrationNumberCategory = new ArrayList<CompanyRegistrationNumberCategoryCodeset>();
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cryptoCurrencyIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean cryptoCurrencyIndicator;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("dynamicMerchantNameIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean dynamicMerchantNameIndicator;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("foreignCurrencyIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean foreignCurrencyIndicator;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("governmentCountryCode")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean governmentCountryCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8 characters
     * 
     */
    @JsonProperty("locationCategoryCode")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 8 characters")
    private String locationCategoryCode;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 200 characters.
     * 
     */
    @JsonProperty("merchantAdditionalData")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 200 characters.")
    private String merchantAdditionalData;
    @JsonProperty("merchantCategory")
    private List<MerchantCategoryCodeset> merchantCategory = new ArrayList<MerchantCategoryCodeset>();
    /**
     * Code used to enable the classification of merchants into specific categories. (ISO 18245).
     * 
     */
    @JsonProperty("merchantCategoryCode")
    @JsonPropertyDescription("Code used to enable the classification of merchants into specific categories. (ISO 18245).")
    private String merchantCategoryCode;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantCbId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.")
    private String merchantCbId;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantCbName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String merchantCbName;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 7 digits
     * 
     */
    @JsonProperty("merchantFrenchContractNumber")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 7 digits")
    private String merchantFrenchContractNumber;
    /**
     * Specifies a numeric string with a minlength of 7 digits and a maxlength of 15 digits.
     * 
     */
    @JsonProperty("merchantId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 7 digits and a maxlength of 15 digits.")
    private String merchantId;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantMastercardId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.")
    private String merchantMastercardId;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("merchantMastercardName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 20 characters.")
    private String merchantMastercardName;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String merchantName;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("merchantProcessingEndDate")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String merchantProcessingEndDate;
    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("merchantProcessingStartDate")
    @JsonPropertyDescription("The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>")
    private String merchantProcessingStartDate;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantVisaId")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.")
    private String merchantVisaId;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantVisaName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String merchantVisaName;
    @JsonProperty("paymentCategory")
    private List<PaymentCategoryCodeset> paymentCategory = new ArrayList<PaymentCategoryCodeset>();
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8 characters
     * 
     */
    @JsonProperty("poiIdByAcquirer")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 8 characters")
    private String poiIdByAcquirer;
    @JsonProperty("postalAddress")
    private PostalAddressType postalAddress;
    /**
     *  8 alphanumeric  and special characters
     * 
     */
    @JsonProperty("schemeMerchantId")
    @JsonPropertyDescription("8 alphanumeric  and special characters")
    private String schemeMerchantId;
    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("signName")
    @JsonPropertyDescription("Specifies a character string with a minlength of 1 and maxlength of 40 characters")
    private String signName;
    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("singleContractIndicator")
    @JsonPropertyDescription("A flag indicating a True or False value.")
    private Boolean singleContractIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -5085491065799838766L;

    @JsonProperty("acceptanceChannel")
    public List<AcceptanceChannelCodeset> getAcceptanceChannel() {
        return acceptanceChannel;
    }

    @JsonProperty("acceptanceChannel")
    public void setAcceptanceChannel(List<AcceptanceChannelCodeset> acceptanceChannel) {
        this.acceptanceChannel = acceptanceChannel;
    }

    public DICOOBJETJSONMerchant withAcceptanceChannel(List<AcceptanceChannelCodeset> acceptanceChannel) {
        this.acceptanceChannel = acceptanceChannel;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("acceptanceSystemLogicalNumber")
    public String getAcceptanceSystemLogicalNumber() {
        return acceptanceSystemLogicalNumber;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 3 digits
     * 
     */
    @JsonProperty("acceptanceSystemLogicalNumber")
    public void setAcceptanceSystemLogicalNumber(String acceptanceSystemLogicalNumber) {
        this.acceptanceSystemLogicalNumber = acceptanceSystemLogicalNumber;
    }

    public DICOOBJETJSONMerchant withAcceptanceSystemLogicalNumber(String acceptanceSystemLogicalNumber) {
        this.acceptanceSystemLogicalNumber = acceptanceSystemLogicalNumber;
        return this;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Text -2 code)
     * 
     */
    @JsonProperty("allowedCountry")
    public String getAllowedCountry() {
        return allowedCountry;
    }

    /**
     * Code to identify a country, a dependency, or another area of particular geopolitical interest (ISO 3166, Text -2 code)
     * 
     */
    @JsonProperty("allowedCountry")
    public void setAllowedCountry(String allowedCountry) {
        this.allowedCountry = allowedCountry;
    }

    public DICOOBJETJSONMerchant withAllowedCountry(String allowedCountry) {
        this.allowedCountry = allowedCountry;
        return this;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("allowedCurrency")
    public String getAllowedCurrency() {
        return allowedCurrency;
    }

    /**
     * Code to identify the Currency (ISO 4217)
     * 
     */
    @JsonProperty("allowedCurrency")
    public void setAllowedCurrency(String allowedCurrency) {
        this.allowedCurrency = allowedCurrency;
    }

    public DICOOBJETJSONMerchant withAllowedCurrency(String allowedCurrency) {
        this.allowedCurrency = allowedCurrency;
        return this;
    }

    @JsonProperty("allowedSchemeCode")
    public List<NetworkCodeset> getAllowedSchemeCode() {
        return allowedSchemeCode;
    }

    @JsonProperty("allowedSchemeCode")
    public void setAllowedSchemeCode(List<NetworkCodeset> allowedSchemeCode) {
        this.allowedSchemeCode = allowedSchemeCode;
    }

    public DICOOBJETJSONMerchant withAllowedSchemeCode(List<NetworkCodeset> allowedSchemeCode) {
        this.allowedSchemeCode = allowedSchemeCode;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("anonymousIndicator")
    public Boolean getAnonymousIndicator() {
        return anonymousIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("anonymousIndicator")
    public void setAnonymousIndicator(Boolean anonymousIndicator) {
        this.anonymousIndicator = anonymousIndicator;
    }

    public DICOOBJETJSONMerchant withAnonymousIndicator(Boolean anonymousIndicator) {
        this.anonymousIndicator = anonymousIndicator;
        return this;
    }

    /**
     * Specifies a alphanumeric string with a minlength of 1 and maxlength of 14 digits
     * 
     */
    @JsonProperty("companyRegistrationNumber")
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Specifies a alphanumeric string with a minlength of 1 and maxlength of 14 digits
     * 
     */
    @JsonProperty("companyRegistrationNumber")
    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public DICOOBJETJSONMerchant withCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
        return this;
    }

    @JsonProperty("companyRegistrationNumberCategory")
    public List<CompanyRegistrationNumberCategoryCodeset> getCompanyRegistrationNumberCategory() {
        return companyRegistrationNumberCategory;
    }

    @JsonProperty("companyRegistrationNumberCategory")
    public void setCompanyRegistrationNumberCategory(List<CompanyRegistrationNumberCategoryCodeset> companyRegistrationNumberCategory) {
        this.companyRegistrationNumberCategory = companyRegistrationNumberCategory;
    }

    public DICOOBJETJSONMerchant withCompanyRegistrationNumberCategory(List<CompanyRegistrationNumberCategoryCodeset> companyRegistrationNumberCategory) {
        this.companyRegistrationNumberCategory = companyRegistrationNumberCategory;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cryptoCurrencyIndicator")
    public Boolean getCryptoCurrencyIndicator() {
        return cryptoCurrencyIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("cryptoCurrencyIndicator")
    public void setCryptoCurrencyIndicator(Boolean cryptoCurrencyIndicator) {
        this.cryptoCurrencyIndicator = cryptoCurrencyIndicator;
    }

    public DICOOBJETJSONMerchant withCryptoCurrencyIndicator(Boolean cryptoCurrencyIndicator) {
        this.cryptoCurrencyIndicator = cryptoCurrencyIndicator;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("dynamicMerchantNameIndicator")
    public Boolean getDynamicMerchantNameIndicator() {
        return dynamicMerchantNameIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("dynamicMerchantNameIndicator")
    public void setDynamicMerchantNameIndicator(Boolean dynamicMerchantNameIndicator) {
        this.dynamicMerchantNameIndicator = dynamicMerchantNameIndicator;
    }

    public DICOOBJETJSONMerchant withDynamicMerchantNameIndicator(Boolean dynamicMerchantNameIndicator) {
        this.dynamicMerchantNameIndicator = dynamicMerchantNameIndicator;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("foreignCurrencyIndicator")
    public Boolean getForeignCurrencyIndicator() {
        return foreignCurrencyIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("foreignCurrencyIndicator")
    public void setForeignCurrencyIndicator(Boolean foreignCurrencyIndicator) {
        this.foreignCurrencyIndicator = foreignCurrencyIndicator;
    }

    public DICOOBJETJSONMerchant withForeignCurrencyIndicator(Boolean foreignCurrencyIndicator) {
        this.foreignCurrencyIndicator = foreignCurrencyIndicator;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("governmentCountryCode")
    public Boolean getGovernmentCountryCode() {
        return governmentCountryCode;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("governmentCountryCode")
    public void setGovernmentCountryCode(Boolean governmentCountryCode) {
        this.governmentCountryCode = governmentCountryCode;
    }

    public DICOOBJETJSONMerchant withGovernmentCountryCode(Boolean governmentCountryCode) {
        this.governmentCountryCode = governmentCountryCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8 characters
     * 
     */
    @JsonProperty("locationCategoryCode")
    public String getLocationCategoryCode() {
        return locationCategoryCode;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8 characters
     * 
     */
    @JsonProperty("locationCategoryCode")
    public void setLocationCategoryCode(String locationCategoryCode) {
        this.locationCategoryCode = locationCategoryCode;
    }

    public DICOOBJETJSONMerchant withLocationCategoryCode(String locationCategoryCode) {
        this.locationCategoryCode = locationCategoryCode;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 200 characters.
     * 
     */
    @JsonProperty("merchantAdditionalData")
    public String getMerchantAdditionalData() {
        return merchantAdditionalData;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 200 characters.
     * 
     */
    @JsonProperty("merchantAdditionalData")
    public void setMerchantAdditionalData(String merchantAdditionalData) {
        this.merchantAdditionalData = merchantAdditionalData;
    }

    public DICOOBJETJSONMerchant withMerchantAdditionalData(String merchantAdditionalData) {
        this.merchantAdditionalData = merchantAdditionalData;
        return this;
    }

    @JsonProperty("merchantCategory")
    public List<MerchantCategoryCodeset> getMerchantCategory() {
        return merchantCategory;
    }

    @JsonProperty("merchantCategory")
    public void setMerchantCategory(List<MerchantCategoryCodeset> merchantCategory) {
        this.merchantCategory = merchantCategory;
    }

    public DICOOBJETJSONMerchant withMerchantCategory(List<MerchantCategoryCodeset> merchantCategory) {
        this.merchantCategory = merchantCategory;
        return this;
    }

    /**
     * Code used to enable the classification of merchants into specific categories. (ISO 18245).
     * 
     */
    @JsonProperty("merchantCategoryCode")
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * Code used to enable the classification of merchants into specific categories. (ISO 18245).
     * 
     */
    @JsonProperty("merchantCategoryCode")
    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public DICOOBJETJSONMerchant withMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantCbId")
    public String getMerchantCbId() {
        return merchantCbId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantCbId")
    public void setMerchantCbId(String merchantCbId) {
        this.merchantCbId = merchantCbId;
    }

    public DICOOBJETJSONMerchant withMerchantCbId(String merchantCbId) {
        this.merchantCbId = merchantCbId;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantCbName")
    public String getMerchantCbName() {
        return merchantCbName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantCbName")
    public void setMerchantCbName(String merchantCbName) {
        this.merchantCbName = merchantCbName;
    }

    public DICOOBJETJSONMerchant withMerchantCbName(String merchantCbName) {
        this.merchantCbName = merchantCbName;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 7 digits
     * 
     */
    @JsonProperty("merchantFrenchContractNumber")
    public String getMerchantFrenchContractNumber() {
        return merchantFrenchContractNumber;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 7 digits
     * 
     */
    @JsonProperty("merchantFrenchContractNumber")
    public void setMerchantFrenchContractNumber(String merchantFrenchContractNumber) {
        this.merchantFrenchContractNumber = merchantFrenchContractNumber;
    }

    public DICOOBJETJSONMerchant withMerchantFrenchContractNumber(String merchantFrenchContractNumber) {
        this.merchantFrenchContractNumber = merchantFrenchContractNumber;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 7 digits and a maxlength of 15 digits.
     * 
     */
    @JsonProperty("merchantId")
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Specifies a numeric string with a minlength of 7 digits and a maxlength of 15 digits.
     * 
     */
    @JsonProperty("merchantId")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public DICOOBJETJSONMerchant withMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantMastercardId")
    public String getMerchantMastercardId() {
        return merchantMastercardId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantMastercardId")
    public void setMerchantMastercardId(String merchantMastercardId) {
        this.merchantMastercardId = merchantMastercardId;
    }

    public DICOOBJETJSONMerchant withMerchantMastercardId(String merchantMastercardId) {
        this.merchantMastercardId = merchantMastercardId;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("merchantMastercardName")
    public String getMerchantMastercardName() {
        return merchantMastercardName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 20 characters.
     * 
     */
    @JsonProperty("merchantMastercardName")
    public void setMerchantMastercardName(String merchantMastercardName) {
        this.merchantMastercardName = merchantMastercardName;
    }

    public DICOOBJETJSONMerchant withMerchantMastercardName(String merchantMastercardName) {
        this.merchantMastercardName = merchantMastercardName;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantName")
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantName")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public DICOOBJETJSONMerchant withMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("merchantProcessingEndDate")
    public String getMerchantProcessingEndDate() {
        return merchantProcessingEndDate;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("merchantProcessingEndDate")
    public void setMerchantProcessingEndDate(String merchantProcessingEndDate) {
        this.merchantProcessingEndDate = merchantProcessingEndDate;
    }

    public DICOOBJETJSONMerchant withMerchantProcessingEndDate(String merchantProcessingEndDate) {
        this.merchantProcessingEndDate = merchantProcessingEndDate;
        return this;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("merchantProcessingStartDate")
    public String getMerchantProcessingStartDate() {
        return merchantProcessingStartDate;
    }

    /**
     * The dateTime is specified in the following form <YYYY-MM-DDThh:mm:ss>
     * 
     */
    @JsonProperty("merchantProcessingStartDate")
    public void setMerchantProcessingStartDate(String merchantProcessingStartDate) {
        this.merchantProcessingStartDate = merchantProcessingStartDate;
    }

    public DICOOBJETJSONMerchant withMerchantProcessingStartDate(String merchantProcessingStartDate) {
        this.merchantProcessingStartDate = merchantProcessingStartDate;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantVisaId")
    public String getMerchantVisaId() {
        return merchantVisaId;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 10 digits.
     * 
     */
    @JsonProperty("merchantVisaId")
    public void setMerchantVisaId(String merchantVisaId) {
        this.merchantVisaId = merchantVisaId;
    }

    public DICOOBJETJSONMerchant withMerchantVisaId(String merchantVisaId) {
        this.merchantVisaId = merchantVisaId;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantVisaName")
    public String getMerchantVisaName() {
        return merchantVisaName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("merchantVisaName")
    public void setMerchantVisaName(String merchantVisaName) {
        this.merchantVisaName = merchantVisaName;
    }

    public DICOOBJETJSONMerchant withMerchantVisaName(String merchantVisaName) {
        this.merchantVisaName = merchantVisaName;
        return this;
    }

    @JsonProperty("paymentCategory")
    public List<PaymentCategoryCodeset> getPaymentCategory() {
        return paymentCategory;
    }

    @JsonProperty("paymentCategory")
    public void setPaymentCategory(List<PaymentCategoryCodeset> paymentCategory) {
        this.paymentCategory = paymentCategory;
    }

    public DICOOBJETJSONMerchant withPaymentCategory(List<PaymentCategoryCodeset> paymentCategory) {
        this.paymentCategory = paymentCategory;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8 characters
     * 
     */
    @JsonProperty("poiIdByAcquirer")
    public String getPoiIdByAcquirer() {
        return poiIdByAcquirer;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 8 characters
     * 
     */
    @JsonProperty("poiIdByAcquirer")
    public void setPoiIdByAcquirer(String poiIdByAcquirer) {
        this.poiIdByAcquirer = poiIdByAcquirer;
    }

    public DICOOBJETJSONMerchant withPoiIdByAcquirer(String poiIdByAcquirer) {
        this.poiIdByAcquirer = poiIdByAcquirer;
        return this;
    }

    @JsonProperty("postalAddress")
    public PostalAddressType getPostalAddress() {
        return postalAddress;
    }

    @JsonProperty("postalAddress")
    public void setPostalAddress(PostalAddressType postalAddress) {
        this.postalAddress = postalAddress;
    }

    public DICOOBJETJSONMerchant withPostalAddress(PostalAddressType postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     *  8 alphanumeric  and special characters
     * 
     */
    @JsonProperty("schemeMerchantId")
    public String getSchemeMerchantId() {
        return schemeMerchantId;
    }

    /**
     *  8 alphanumeric  and special characters
     * 
     */
    @JsonProperty("schemeMerchantId")
    public void setSchemeMerchantId(String schemeMerchantId) {
        this.schemeMerchantId = schemeMerchantId;
    }

    public DICOOBJETJSONMerchant withSchemeMerchantId(String schemeMerchantId) {
        this.schemeMerchantId = schemeMerchantId;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("signName")
    public String getSignName() {
        return signName;
    }

    /**
     * Specifies a character string with a minlength of 1 and maxlength of 40 characters
     * 
     */
    @JsonProperty("signName")
    public void setSignName(String signName) {
        this.signName = signName;
    }

    public DICOOBJETJSONMerchant withSignName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("singleContractIndicator")
    public Boolean getSingleContractIndicator() {
        return singleContractIndicator;
    }

    /**
     * A flag indicating a True or False value.
     * 
     */
    @JsonProperty("singleContractIndicator")
    public void setSingleContractIndicator(Boolean singleContractIndicator) {
        this.singleContractIndicator = singleContractIndicator;
    }

    public DICOOBJETJSONMerchant withSingleContractIndicator(Boolean singleContractIndicator) {
        this.singleContractIndicator = singleContractIndicator;
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

    public DICOOBJETJSONMerchant withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONMerchant.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acceptanceChannel");
        sb.append('=');
        sb.append(((this.acceptanceChannel == null)?"<null>":this.acceptanceChannel));
        sb.append(',');
        sb.append("acceptanceSystemLogicalNumber");
        sb.append('=');
        sb.append(((this.acceptanceSystemLogicalNumber == null)?"<null>":this.acceptanceSystemLogicalNumber));
        sb.append(',');
        sb.append("allowedCountry");
        sb.append('=');
        sb.append(((this.allowedCountry == null)?"<null>":this.allowedCountry));
        sb.append(',');
        sb.append("allowedCurrency");
        sb.append('=');
        sb.append(((this.allowedCurrency == null)?"<null>":this.allowedCurrency));
        sb.append(',');
        sb.append("allowedSchemeCode");
        sb.append('=');
        sb.append(((this.allowedSchemeCode == null)?"<null>":this.allowedSchemeCode));
        sb.append(',');
        sb.append("anonymousIndicator");
        sb.append('=');
        sb.append(((this.anonymousIndicator == null)?"<null>":this.anonymousIndicator));
        sb.append(',');
        sb.append("companyRegistrationNumber");
        sb.append('=');
        sb.append(((this.companyRegistrationNumber == null)?"<null>":this.companyRegistrationNumber));
        sb.append(',');
        sb.append("companyRegistrationNumberCategory");
        sb.append('=');
        sb.append(((this.companyRegistrationNumberCategory == null)?"<null>":this.companyRegistrationNumberCategory));
        sb.append(',');
        sb.append("cryptoCurrencyIndicator");
        sb.append('=');
        sb.append(((this.cryptoCurrencyIndicator == null)?"<null>":this.cryptoCurrencyIndicator));
        sb.append(',');
        sb.append("dynamicMerchantNameIndicator");
        sb.append('=');
        sb.append(((this.dynamicMerchantNameIndicator == null)?"<null>":this.dynamicMerchantNameIndicator));
        sb.append(',');
        sb.append("foreignCurrencyIndicator");
        sb.append('=');
        sb.append(((this.foreignCurrencyIndicator == null)?"<null>":this.foreignCurrencyIndicator));
        sb.append(',');
        sb.append("governmentCountryCode");
        sb.append('=');
        sb.append(((this.governmentCountryCode == null)?"<null>":this.governmentCountryCode));
        sb.append(',');
        sb.append("locationCategoryCode");
        sb.append('=');
        sb.append(((this.locationCategoryCode == null)?"<null>":this.locationCategoryCode));
        sb.append(',');
        sb.append("merchantAdditionalData");
        sb.append('=');
        sb.append(((this.merchantAdditionalData == null)?"<null>":this.merchantAdditionalData));
        sb.append(',');
        sb.append("merchantCategory");
        sb.append('=');
        sb.append(((this.merchantCategory == null)?"<null>":this.merchantCategory));
        sb.append(',');
        sb.append("merchantCategoryCode");
        sb.append('=');
        sb.append(((this.merchantCategoryCode == null)?"<null>":this.merchantCategoryCode));
        sb.append(',');
        sb.append("merchantCbId");
        sb.append('=');
        sb.append(((this.merchantCbId == null)?"<null>":this.merchantCbId));
        sb.append(',');
        sb.append("merchantCbName");
        sb.append('=');
        sb.append(((this.merchantCbName == null)?"<null>":this.merchantCbName));
        sb.append(',');
        sb.append("merchantFrenchContractNumber");
        sb.append('=');
        sb.append(((this.merchantFrenchContractNumber == null)?"<null>":this.merchantFrenchContractNumber));
        sb.append(',');
        sb.append("merchantId");
        sb.append('=');
        sb.append(((this.merchantId == null)?"<null>":this.merchantId));
        sb.append(',');
        sb.append("merchantMastercardId");
        sb.append('=');
        sb.append(((this.merchantMastercardId == null)?"<null>":this.merchantMastercardId));
        sb.append(',');
        sb.append("merchantMastercardName");
        sb.append('=');
        sb.append(((this.merchantMastercardName == null)?"<null>":this.merchantMastercardName));
        sb.append(',');
        sb.append("merchantName");
        sb.append('=');
        sb.append(((this.merchantName == null)?"<null>":this.merchantName));
        sb.append(',');
        sb.append("merchantProcessingEndDate");
        sb.append('=');
        sb.append(((this.merchantProcessingEndDate == null)?"<null>":this.merchantProcessingEndDate));
        sb.append(',');
        sb.append("merchantProcessingStartDate");
        sb.append('=');
        sb.append(((this.merchantProcessingStartDate == null)?"<null>":this.merchantProcessingStartDate));
        sb.append(',');
        sb.append("merchantVisaId");
        sb.append('=');
        sb.append(((this.merchantVisaId == null)?"<null>":this.merchantVisaId));
        sb.append(',');
        sb.append("merchantVisaName");
        sb.append('=');
        sb.append(((this.merchantVisaName == null)?"<null>":this.merchantVisaName));
        sb.append(',');
        sb.append("paymentCategory");
        sb.append('=');
        sb.append(((this.paymentCategory == null)?"<null>":this.paymentCategory));
        sb.append(',');
        sb.append("poiIdByAcquirer");
        sb.append('=');
        sb.append(((this.poiIdByAcquirer == null)?"<null>":this.poiIdByAcquirer));
        sb.append(',');
        sb.append("postalAddress");
        sb.append('=');
        sb.append(((this.postalAddress == null)?"<null>":this.postalAddress));
        sb.append(',');
        sb.append("schemeMerchantId");
        sb.append('=');
        sb.append(((this.schemeMerchantId == null)?"<null>":this.schemeMerchantId));
        sb.append(',');
        sb.append("signName");
        sb.append('=');
        sb.append(((this.signName == null)?"<null>":this.signName));
        sb.append(',');
        sb.append("singleContractIndicator");
        sb.append('=');
        sb.append(((this.singleContractIndicator == null)?"<null>":this.singleContractIndicator));
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
        result = ((result* 31)+((this.allowedSchemeCode == null)? 0 :this.allowedSchemeCode.hashCode()));
        result = ((result* 31)+((this.locationCategoryCode == null)? 0 :this.locationCategoryCode.hashCode()));
        result = ((result* 31)+((this.governmentCountryCode == null)? 0 :this.governmentCountryCode.hashCode()));
        result = ((result* 31)+((this.companyRegistrationNumberCategory == null)? 0 :this.companyRegistrationNumberCategory.hashCode()));
        result = ((result* 31)+((this.merchantName == null)? 0 :this.merchantName.hashCode()));
        result = ((result* 31)+((this.merchantCbName == null)? 0 :this.merchantCbName.hashCode()));
        result = ((result* 31)+((this.merchantId == null)? 0 :this.merchantId.hashCode()));
        result = ((result* 31)+((this.acceptanceChannel == null)? 0 :this.acceptanceChannel.hashCode()));
        result = ((result* 31)+((this.anonymousIndicator == null)? 0 :this.anonymousIndicator.hashCode()));
        result = ((result* 31)+((this.merchantVisaName == null)? 0 :this.merchantVisaName.hashCode()));
        result = ((result* 31)+((this.allowedCountry == null)? 0 :this.allowedCountry.hashCode()));
        result = ((result* 31)+((this.merchantProcessingEndDate == null)? 0 :this.merchantProcessingEndDate.hashCode()));
        result = ((result* 31)+((this.merchantMastercardId == null)? 0 :this.merchantMastercardId.hashCode()));
        result = ((result* 31)+((this.signName == null)? 0 :this.signName.hashCode()));
        result = ((result* 31)+((this.companyRegistrationNumber == null)? 0 :this.companyRegistrationNumber.hashCode()));
        result = ((result* 31)+((this.paymentCategory == null)? 0 :this.paymentCategory.hashCode()));
        result = ((result* 31)+((this.foreignCurrencyIndicator == null)? 0 :this.foreignCurrencyIndicator.hashCode()));
        result = ((result* 31)+((this.merchantVisaId == null)? 0 :this.merchantVisaId.hashCode()));
        result = ((result* 31)+((this.cryptoCurrencyIndicator == null)? 0 :this.cryptoCurrencyIndicator.hashCode()));
        result = ((result* 31)+((this.merchantFrenchContractNumber == null)? 0 :this.merchantFrenchContractNumber.hashCode()));
        result = ((result* 31)+((this.poiIdByAcquirer == null)? 0 :this.poiIdByAcquirer.hashCode()));
        result = ((result* 31)+((this.singleContractIndicator == null)? 0 :this.singleContractIndicator.hashCode()));
        result = ((result* 31)+((this.merchantMastercardName == null)? 0 :this.merchantMastercardName.hashCode()));
        result = ((result* 31)+((this.merchantAdditionalData == null)? 0 :this.merchantAdditionalData.hashCode()));
        result = ((result* 31)+((this.postalAddress == null)? 0 :this.postalAddress.hashCode()));
        result = ((result* 31)+((this.merchantProcessingStartDate == null)? 0 :this.merchantProcessingStartDate.hashCode()));
        result = ((result* 31)+((this.allowedCurrency == null)? 0 :this.allowedCurrency.hashCode()));
        result = ((result* 31)+((this.merchantCbId == null)? 0 :this.merchantCbId.hashCode()));
        result = ((result* 31)+((this.acceptanceSystemLogicalNumber == null)? 0 :this.acceptanceSystemLogicalNumber.hashCode()));
        result = ((result* 31)+((this.dynamicMerchantNameIndicator == null)? 0 :this.dynamicMerchantNameIndicator.hashCode()));
        result = ((result* 31)+((this.merchantCategoryCode == null)? 0 :this.merchantCategoryCode.hashCode()));
        result = ((result* 31)+((this.merchantCategory == null)? 0 :this.merchantCategory.hashCode()));
        result = ((result* 31)+((this.schemeMerchantId == null)? 0 :this.schemeMerchantId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONMerchant) == false) {
            return false;
        }
        DICOOBJETJSONMerchant rhs = ((DICOOBJETJSONMerchant) other);
        return (((((((((((((((((((((((((((((((((((this.allowedSchemeCode == rhs.allowedSchemeCode)||((this.allowedSchemeCode!= null)&&this.allowedSchemeCode.equals(rhs.allowedSchemeCode)))&&((this.locationCategoryCode == rhs.locationCategoryCode)||((this.locationCategoryCode!= null)&&this.locationCategoryCode.equals(rhs.locationCategoryCode))))&&((this.governmentCountryCode == rhs.governmentCountryCode)||((this.governmentCountryCode!= null)&&this.governmentCountryCode.equals(rhs.governmentCountryCode))))&&((this.companyRegistrationNumberCategory == rhs.companyRegistrationNumberCategory)||((this.companyRegistrationNumberCategory!= null)&&this.companyRegistrationNumberCategory.equals(rhs.companyRegistrationNumberCategory))))&&((this.merchantName == rhs.merchantName)||((this.merchantName!= null)&&this.merchantName.equals(rhs.merchantName))))&&((this.merchantCbName == rhs.merchantCbName)||((this.merchantCbName!= null)&&this.merchantCbName.equals(rhs.merchantCbName))))&&((this.merchantId == rhs.merchantId)||((this.merchantId!= null)&&this.merchantId.equals(rhs.merchantId))))&&((this.acceptanceChannel == rhs.acceptanceChannel)||((this.acceptanceChannel!= null)&&this.acceptanceChannel.equals(rhs.acceptanceChannel))))&&((this.anonymousIndicator == rhs.anonymousIndicator)||((this.anonymousIndicator!= null)&&this.anonymousIndicator.equals(rhs.anonymousIndicator))))&&((this.merchantVisaName == rhs.merchantVisaName)||((this.merchantVisaName!= null)&&this.merchantVisaName.equals(rhs.merchantVisaName))))&&((this.allowedCountry == rhs.allowedCountry)||((this.allowedCountry!= null)&&this.allowedCountry.equals(rhs.allowedCountry))))&&((this.merchantProcessingEndDate == rhs.merchantProcessingEndDate)||((this.merchantProcessingEndDate!= null)&&this.merchantProcessingEndDate.equals(rhs.merchantProcessingEndDate))))&&((this.merchantMastercardId == rhs.merchantMastercardId)||((this.merchantMastercardId!= null)&&this.merchantMastercardId.equals(rhs.merchantMastercardId))))&&((this.signName == rhs.signName)||((this.signName!= null)&&this.signName.equals(rhs.signName))))&&((this.companyRegistrationNumber == rhs.companyRegistrationNumber)||((this.companyRegistrationNumber!= null)&&this.companyRegistrationNumber.equals(rhs.companyRegistrationNumber))))&&((this.paymentCategory == rhs.paymentCategory)||((this.paymentCategory!= null)&&this.paymentCategory.equals(rhs.paymentCategory))))&&((this.foreignCurrencyIndicator == rhs.foreignCurrencyIndicator)||((this.foreignCurrencyIndicator!= null)&&this.foreignCurrencyIndicator.equals(rhs.foreignCurrencyIndicator))))&&((this.merchantVisaId == rhs.merchantVisaId)||((this.merchantVisaId!= null)&&this.merchantVisaId.equals(rhs.merchantVisaId))))&&((this.cryptoCurrencyIndicator == rhs.cryptoCurrencyIndicator)||((this.cryptoCurrencyIndicator!= null)&&this.cryptoCurrencyIndicator.equals(rhs.cryptoCurrencyIndicator))))&&((this.merchantFrenchContractNumber == rhs.merchantFrenchContractNumber)||((this.merchantFrenchContractNumber!= null)&&this.merchantFrenchContractNumber.equals(rhs.merchantFrenchContractNumber))))&&((this.poiIdByAcquirer == rhs.poiIdByAcquirer)||((this.poiIdByAcquirer!= null)&&this.poiIdByAcquirer.equals(rhs.poiIdByAcquirer))))&&((this.singleContractIndicator == rhs.singleContractIndicator)||((this.singleContractIndicator!= null)&&this.singleContractIndicator.equals(rhs.singleContractIndicator))))&&((this.merchantMastercardName == rhs.merchantMastercardName)||((this.merchantMastercardName!= null)&&this.merchantMastercardName.equals(rhs.merchantMastercardName))))&&((this.merchantAdditionalData == rhs.merchantAdditionalData)||((this.merchantAdditionalData!= null)&&this.merchantAdditionalData.equals(rhs.merchantAdditionalData))))&&((this.postalAddress == rhs.postalAddress)||((this.postalAddress!= null)&&this.postalAddress.equals(rhs.postalAddress))))&&((this.merchantProcessingStartDate == rhs.merchantProcessingStartDate)||((this.merchantProcessingStartDate!= null)&&this.merchantProcessingStartDate.equals(rhs.merchantProcessingStartDate))))&&((this.allowedCurrency == rhs.allowedCurrency)||((this.allowedCurrency!= null)&&this.allowedCurrency.equals(rhs.allowedCurrency))))&&((this.merchantCbId == rhs.merchantCbId)||((this.merchantCbId!= null)&&this.merchantCbId.equals(rhs.merchantCbId))))&&((this.acceptanceSystemLogicalNumber == rhs.acceptanceSystemLogicalNumber)||((this.acceptanceSystemLogicalNumber!= null)&&this.acceptanceSystemLogicalNumber.equals(rhs.acceptanceSystemLogicalNumber))))&&((this.dynamicMerchantNameIndicator == rhs.dynamicMerchantNameIndicator)||((this.dynamicMerchantNameIndicator!= null)&&this.dynamicMerchantNameIndicator.equals(rhs.dynamicMerchantNameIndicator))))&&((this.merchantCategoryCode == rhs.merchantCategoryCode)||((this.merchantCategoryCode!= null)&&this.merchantCategoryCode.equals(rhs.merchantCategoryCode))))&&((this.merchantCategory == rhs.merchantCategory)||((this.merchantCategory!= null)&&this.merchantCategory.equals(rhs.merchantCategory))))&&((this.schemeMerchantId == rhs.schemeMerchantId)||((this.schemeMerchantId!= null)&&this.schemeMerchantId.equals(rhs.schemeMerchantId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
