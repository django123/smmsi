
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
    "bdkKeyIdentifier",
    "dataSource",
    "dataUsedForSign",
    "diversificationValue",
    "dynKeyIdentifier",
    "encryptionAlgorithm ",
    "kbpkKeyIdentifier",
    "kdkKeyIdentifier",
    "keyingMaterialSecurityData",
    "keyLength",
    "keySerialNumber",
    "kscKeyIdentifier",
    "ktKeyIdentifier",
    "macAlgorithm",
    "macLength",
    "macValue",
    "maskGeneratorAlgorithm",
    "paddingMethod",
    "partialHash",
    "partialHashLength",
    "pinBlockEncryptionFormat",
    "pinBlockFormat",
    "pinVerificationResult",
    "saltLength",
    "signature",
    "signatureAlgorithm",
    "signatureDigestAlgorithm",
    "signatureKeyIdentifier",
    "tr31AdditionalData",
    "tr31KeyBlock",
    "tr31KeyFunction",
    "tr31KeyVersion"
})
@Generated("jsonschema2pojo")
public class DICOOBJETJSONSecurity implements Serializable
{

    @JsonProperty("bdkKeyIdentifier")
    private KeyC2PDescriptionType bdkKeyIdentifier;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 5462 digits. (max of 4096 bytes)
     * 
     */
    @JsonProperty("dataSource")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 5462 digits. (max of 4096 bytes)")
    private String dataSource;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 5462 digits. (max of 4096 bytes)
     * 
     */
    @JsonProperty("dataUsedForSign")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 5462 digits. (max of 4096 bytes)")
    private String dataUsedForSign;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("diversificationValue")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)")
    private String diversificationValue;
    @JsonProperty("dynKeyIdentifier")
    private KeyC2PDescriptionType dynKeyIdentifier;
    @JsonProperty("encryptionAlgorithm ")
    private List<EncryptionAlgorithmCodeset> encryptionAlgorithm = new ArrayList<EncryptionAlgorithmCodeset>();
    @JsonProperty("kbpkKeyIdentifier")
    private KeyC2PDescriptionType kbpkKeyIdentifier;
    @JsonProperty("kdkKeyIdentifier")
    private KeyC2PDescriptionType kdkKeyIdentifier;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 340 digits. (max of 255 bytes)
     * 
     */
    @JsonProperty("keyingMaterialSecurityData")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 340 digits. (max of 255 bytes)")
    private String keyingMaterialSecurityData;
    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 4 digits
     * 
     */
    @JsonProperty("keyLength")
    @JsonPropertyDescription("Specifies a numeric string with a minlength of 1 and maxlength of 4 digits")
    private String keyLength;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 14 and a maxlength of 16 digits. (10 to 12 bytes)
     * 
     */
    @JsonProperty("keySerialNumber")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 14 and a maxlength of 16 digits. (10 to 12 bytes)")
    private String keySerialNumber;
    @JsonProperty("kscKeyIdentifier")
    private KeyC2PDescriptionType kscKeyIdentifier;
    @JsonProperty("ktKeyIdentifier")
    private KeyC2PDescriptionType ktKeyIdentifier;
    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("macAlgorithm")
    @JsonPropertyDescription("Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits")
    private String macAlgorithm;
    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("macLength")
    @JsonPropertyDescription("Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits")
    private String macLength;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 86 digits. (4 to 64 bytes)
     * 
     */
    @JsonProperty("macValue")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 86 digits. (4 to 64 bytes)")
    private String macValue;
    @JsonProperty("maskGeneratorAlgorithm")
    private List<MaskGeneratorAlgorithmCodeset> maskGeneratorAlgorithm = new ArrayList<MaskGeneratorAlgorithmCodeset>();
    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("paddingMethod")
    @JsonPropertyDescription("Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits")
    private String paddingMethod;
    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 27 and a maxlength of 86 digits. (20 to 64 bytes)
     * 
     */
    @JsonProperty("partialHash")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a minlength of 27 and a maxlength of 86 digits. (20 to 64 bytes)")
    private String partialHash;
    /**
     * Specifies a numeric string with an exact length of 8 digits.
     * 
     */
    @JsonProperty("partialHashLength")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 8 digits.")
    private String partialHashLength;
    @JsonProperty("pinBlockEncryptionFormat")
    private List<PinBlockEncryptionFormatCodeset> pinBlockEncryptionFormat = new ArrayList<PinBlockEncryptionFormatCodeset>();
    @JsonProperty("pinBlockFormat")
    private List<PinBlockFormatCodeset> pinBlockFormat = new ArrayList<PinBlockFormatCodeset>();
    @JsonProperty("pinVerificationResult")
    private List<PinVerificationResultCodeset> pinVerificationResult = new ArrayList<PinVerificationResultCodeset>();
    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("saltLength")
    @JsonPropertyDescription("Specifies a numeric string with an exact length of 2 digits.")
    private String saltLength;
    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 683 digits. (max of 512 bytes)
     * 
     */
    @JsonProperty("signature")
    @JsonPropertyDescription("Specifies a binary data to Base64URL text encoding with a maxlength of 683 digits. (max of 512 bytes)")
    private String signature;
    @JsonProperty("signatureAlgorithm")
    private List<SignatureAlgorithmCodeset> signatureAlgorithm = new ArrayList<SignatureAlgorithmCodeset>();
    @JsonProperty("signatureDigestAlgorithm")
    private List<SignatureDigestAlgorithmCodeset> signatureDigestAlgorithm = new ArrayList<SignatureDigestAlgorithmCodeset>();
    @JsonProperty("signatureKeyIdentifier")
    private KeyC2PDescriptionType signatureKeyIdentifier;
    /**
     * Specifies a character string with a minlength of 2 and maxlength of 226 digits.
     * 
     */
    @JsonProperty("tr31AdditionalData")
    @JsonPropertyDescription("Specifies a character string with a minlength of 2 and maxlength of 226 digits.")
    private String tr31AdditionalData;
    /**
     * Specifies a character string with min 72 and max 296 digits.
     * 
     */
    @JsonProperty("tr31KeyBlock")
    @JsonPropertyDescription("Specifies a character string with min 72 and max 296 digits.")
    private String tr31KeyBlock;
    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("tr31KeyFunction")
    @JsonPropertyDescription("Specifies a string with an exact length of 1 character")
    private String tr31KeyFunction;
    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("tr31KeyVersion")
    @JsonPropertyDescription("2 alphanumeric characters")
    private String tr31KeyVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 2959572575283763578L;

    @JsonProperty("bdkKeyIdentifier")
    public KeyC2PDescriptionType getBdkKeyIdentifier() {
        return bdkKeyIdentifier;
    }

    @JsonProperty("bdkKeyIdentifier")
    public void setBdkKeyIdentifier(KeyC2PDescriptionType bdkKeyIdentifier) {
        this.bdkKeyIdentifier = bdkKeyIdentifier;
    }

    public DICOOBJETJSONSecurity withBdkKeyIdentifier(KeyC2PDescriptionType bdkKeyIdentifier) {
        this.bdkKeyIdentifier = bdkKeyIdentifier;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 5462 digits. (max of 4096 bytes)
     * 
     */
    @JsonProperty("dataSource")
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 5462 digits. (max of 4096 bytes)
     * 
     */
    @JsonProperty("dataSource")
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public DICOOBJETJSONSecurity withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 5462 digits. (max of 4096 bytes)
     * 
     */
    @JsonProperty("dataUsedForSign")
    public String getDataUsedForSign() {
        return dataUsedForSign;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 5462 digits. (max of 4096 bytes)
     * 
     */
    @JsonProperty("dataUsedForSign")
    public void setDataUsedForSign(String dataUsedForSign) {
        this.dataUsedForSign = dataUsedForSign;
    }

    public DICOOBJETJSONSecurity withDataUsedForSign(String dataUsedForSign) {
        this.dataUsedForSign = dataUsedForSign;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("diversificationValue")
    public String getDiversificationValue() {
        return diversificationValue;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 11 and a maxlength of 22 digits. (8 to 16 bytes)
     * 
     */
    @JsonProperty("diversificationValue")
    public void setDiversificationValue(String diversificationValue) {
        this.diversificationValue = diversificationValue;
    }

    public DICOOBJETJSONSecurity withDiversificationValue(String diversificationValue) {
        this.diversificationValue = diversificationValue;
        return this;
    }

    @JsonProperty("dynKeyIdentifier")
    public KeyC2PDescriptionType getDynKeyIdentifier() {
        return dynKeyIdentifier;
    }

    @JsonProperty("dynKeyIdentifier")
    public void setDynKeyIdentifier(KeyC2PDescriptionType dynKeyIdentifier) {
        this.dynKeyIdentifier = dynKeyIdentifier;
    }

    public DICOOBJETJSONSecurity withDynKeyIdentifier(KeyC2PDescriptionType dynKeyIdentifier) {
        this.dynKeyIdentifier = dynKeyIdentifier;
        return this;
    }

    @JsonProperty("encryptionAlgorithm ")
    public List<EncryptionAlgorithmCodeset> getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    @JsonProperty("encryptionAlgorithm ")
    public void setEncryptionAlgorithm(List<EncryptionAlgorithmCodeset> encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public DICOOBJETJSONSecurity withEncryptionAlgorithm(List<EncryptionAlgorithmCodeset> encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    @JsonProperty("kbpkKeyIdentifier")
    public KeyC2PDescriptionType getKbpkKeyIdentifier() {
        return kbpkKeyIdentifier;
    }

    @JsonProperty("kbpkKeyIdentifier")
    public void setKbpkKeyIdentifier(KeyC2PDescriptionType kbpkKeyIdentifier) {
        this.kbpkKeyIdentifier = kbpkKeyIdentifier;
    }

    public DICOOBJETJSONSecurity withKbpkKeyIdentifier(KeyC2PDescriptionType kbpkKeyIdentifier) {
        this.kbpkKeyIdentifier = kbpkKeyIdentifier;
        return this;
    }

    @JsonProperty("kdkKeyIdentifier")
    public KeyC2PDescriptionType getKdkKeyIdentifier() {
        return kdkKeyIdentifier;
    }

    @JsonProperty("kdkKeyIdentifier")
    public void setKdkKeyIdentifier(KeyC2PDescriptionType kdkKeyIdentifier) {
        this.kdkKeyIdentifier = kdkKeyIdentifier;
    }

    public DICOOBJETJSONSecurity withKdkKeyIdentifier(KeyC2PDescriptionType kdkKeyIdentifier) {
        this.kdkKeyIdentifier = kdkKeyIdentifier;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 340 digits. (max of 255 bytes)
     * 
     */
    @JsonProperty("keyingMaterialSecurityData")
    public String getKeyingMaterialSecurityData() {
        return keyingMaterialSecurityData;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 340 digits. (max of 255 bytes)
     * 
     */
    @JsonProperty("keyingMaterialSecurityData")
    public void setKeyingMaterialSecurityData(String keyingMaterialSecurityData) {
        this.keyingMaterialSecurityData = keyingMaterialSecurityData;
    }

    public DICOOBJETJSONSecurity withKeyingMaterialSecurityData(String keyingMaterialSecurityData) {
        this.keyingMaterialSecurityData = keyingMaterialSecurityData;
        return this;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 4 digits
     * 
     */
    @JsonProperty("keyLength")
    public String getKeyLength() {
        return keyLength;
    }

    /**
     * Specifies a numeric string with a minlength of 1 and maxlength of 4 digits
     * 
     */
    @JsonProperty("keyLength")
    public void setKeyLength(String keyLength) {
        this.keyLength = keyLength;
    }

    public DICOOBJETJSONSecurity withKeyLength(String keyLength) {
        this.keyLength = keyLength;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 14 and a maxlength of 16 digits. (10 to 12 bytes)
     * 
     */
    @JsonProperty("keySerialNumber")
    public String getKeySerialNumber() {
        return keySerialNumber;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 14 and a maxlength of 16 digits. (10 to 12 bytes)
     * 
     */
    @JsonProperty("keySerialNumber")
    public void setKeySerialNumber(String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
    }

    public DICOOBJETJSONSecurity withKeySerialNumber(String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
        return this;
    }

    @JsonProperty("kscKeyIdentifier")
    public KeyC2PDescriptionType getKscKeyIdentifier() {
        return kscKeyIdentifier;
    }

    @JsonProperty("kscKeyIdentifier")
    public void setKscKeyIdentifier(KeyC2PDescriptionType kscKeyIdentifier) {
        this.kscKeyIdentifier = kscKeyIdentifier;
    }

    public DICOOBJETJSONSecurity withKscKeyIdentifier(KeyC2PDescriptionType kscKeyIdentifier) {
        this.kscKeyIdentifier = kscKeyIdentifier;
        return this;
    }

    @JsonProperty("ktKeyIdentifier")
    public KeyC2PDescriptionType getKtKeyIdentifier() {
        return ktKeyIdentifier;
    }

    @JsonProperty("ktKeyIdentifier")
    public void setKtKeyIdentifier(KeyC2PDescriptionType ktKeyIdentifier) {
        this.ktKeyIdentifier = ktKeyIdentifier;
    }

    public DICOOBJETJSONSecurity withKtKeyIdentifier(KeyC2PDescriptionType ktKeyIdentifier) {
        this.ktKeyIdentifier = ktKeyIdentifier;
        return this;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("macAlgorithm")
    public String getMacAlgorithm() {
        return macAlgorithm;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("macAlgorithm")
    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    public DICOOBJETJSONSecurity withMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
        return this;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("macLength")
    public String getMacLength() {
        return macLength;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("macLength")
    public void setMacLength(String macLength) {
        this.macLength = macLength;
    }

    public DICOOBJETJSONSecurity withMacLength(String macLength) {
        this.macLength = macLength;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 86 digits. (4 to 64 bytes)
     * 
     */
    @JsonProperty("macValue")
    public String getMacValue() {
        return macValue;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 6 and a maxlength of 86 digits. (4 to 64 bytes)
     * 
     */
    @JsonProperty("macValue")
    public void setMacValue(String macValue) {
        this.macValue = macValue;
    }

    public DICOOBJETJSONSecurity withMacValue(String macValue) {
        this.macValue = macValue;
        return this;
    }

    @JsonProperty("maskGeneratorAlgorithm")
    public List<MaskGeneratorAlgorithmCodeset> getMaskGeneratorAlgorithm() {
        return maskGeneratorAlgorithm;
    }

    @JsonProperty("maskGeneratorAlgorithm")
    public void setMaskGeneratorAlgorithm(List<MaskGeneratorAlgorithmCodeset> maskGeneratorAlgorithm) {
        this.maskGeneratorAlgorithm = maskGeneratorAlgorithm;
    }

    public DICOOBJETJSONSecurity withMaskGeneratorAlgorithm(List<MaskGeneratorAlgorithmCodeset> maskGeneratorAlgorithm) {
        this.maskGeneratorAlgorithm = maskGeneratorAlgorithm;
        return this;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("paddingMethod")
    public String getPaddingMethod() {
        return paddingMethod;
    }

    /**
     * Specifies a numeric string with a  minlength of 1 and maxlength of 2 digits
     * 
     */
    @JsonProperty("paddingMethod")
    public void setPaddingMethod(String paddingMethod) {
        this.paddingMethod = paddingMethod;
    }

    public DICOOBJETJSONSecurity withPaddingMethod(String paddingMethod) {
        this.paddingMethod = paddingMethod;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 27 and a maxlength of 86 digits. (20 to 64 bytes)
     * 
     */
    @JsonProperty("partialHash")
    public String getPartialHash() {
        return partialHash;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a minlength of 27 and a maxlength of 86 digits. (20 to 64 bytes)
     * 
     */
    @JsonProperty("partialHash")
    public void setPartialHash(String partialHash) {
        this.partialHash = partialHash;
    }

    public DICOOBJETJSONSecurity withPartialHash(String partialHash) {
        this.partialHash = partialHash;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 8 digits.
     * 
     */
    @JsonProperty("partialHashLength")
    public String getPartialHashLength() {
        return partialHashLength;
    }

    /**
     * Specifies a numeric string with an exact length of 8 digits.
     * 
     */
    @JsonProperty("partialHashLength")
    public void setPartialHashLength(String partialHashLength) {
        this.partialHashLength = partialHashLength;
    }

    public DICOOBJETJSONSecurity withPartialHashLength(String partialHashLength) {
        this.partialHashLength = partialHashLength;
        return this;
    }

    @JsonProperty("pinBlockEncryptionFormat")
    public List<PinBlockEncryptionFormatCodeset> getPinBlockEncryptionFormat() {
        return pinBlockEncryptionFormat;
    }

    @JsonProperty("pinBlockEncryptionFormat")
    public void setPinBlockEncryptionFormat(List<PinBlockEncryptionFormatCodeset> pinBlockEncryptionFormat) {
        this.pinBlockEncryptionFormat = pinBlockEncryptionFormat;
    }

    public DICOOBJETJSONSecurity withPinBlockEncryptionFormat(List<PinBlockEncryptionFormatCodeset> pinBlockEncryptionFormat) {
        this.pinBlockEncryptionFormat = pinBlockEncryptionFormat;
        return this;
    }

    @JsonProperty("pinBlockFormat")
    public List<PinBlockFormatCodeset> getPinBlockFormat() {
        return pinBlockFormat;
    }

    @JsonProperty("pinBlockFormat")
    public void setPinBlockFormat(List<PinBlockFormatCodeset> pinBlockFormat) {
        this.pinBlockFormat = pinBlockFormat;
    }

    public DICOOBJETJSONSecurity withPinBlockFormat(List<PinBlockFormatCodeset> pinBlockFormat) {
        this.pinBlockFormat = pinBlockFormat;
        return this;
    }

    @JsonProperty("pinVerificationResult")
    public List<PinVerificationResultCodeset> getPinVerificationResult() {
        return pinVerificationResult;
    }

    @JsonProperty("pinVerificationResult")
    public void setPinVerificationResult(List<PinVerificationResultCodeset> pinVerificationResult) {
        this.pinVerificationResult = pinVerificationResult;
    }

    public DICOOBJETJSONSecurity withPinVerificationResult(List<PinVerificationResultCodeset> pinVerificationResult) {
        this.pinVerificationResult = pinVerificationResult;
        return this;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("saltLength")
    public String getSaltLength() {
        return saltLength;
    }

    /**
     * Specifies a numeric string with an exact length of 2 digits.
     * 
     */
    @JsonProperty("saltLength")
    public void setSaltLength(String saltLength) {
        this.saltLength = saltLength;
    }

    public DICOOBJETJSONSecurity withSaltLength(String saltLength) {
        this.saltLength = saltLength;
        return this;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 683 digits. (max of 512 bytes)
     * 
     */
    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    /**
     * Specifies a binary data to Base64URL text encoding with a maxlength of 683 digits. (max of 512 bytes)
     * 
     */
    @JsonProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    public DICOOBJETJSONSecurity withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    @JsonProperty("signatureAlgorithm")
    public List<SignatureAlgorithmCodeset> getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    @JsonProperty("signatureAlgorithm")
    public void setSignatureAlgorithm(List<SignatureAlgorithmCodeset> signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public DICOOBJETJSONSecurity withSignatureAlgorithm(List<SignatureAlgorithmCodeset> signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    @JsonProperty("signatureDigestAlgorithm")
    public List<SignatureDigestAlgorithmCodeset> getSignatureDigestAlgorithm() {
        return signatureDigestAlgorithm;
    }

    @JsonProperty("signatureDigestAlgorithm")
    public void setSignatureDigestAlgorithm(List<SignatureDigestAlgorithmCodeset> signatureDigestAlgorithm) {
        this.signatureDigestAlgorithm = signatureDigestAlgorithm;
    }

    public DICOOBJETJSONSecurity withSignatureDigestAlgorithm(List<SignatureDigestAlgorithmCodeset> signatureDigestAlgorithm) {
        this.signatureDigestAlgorithm = signatureDigestAlgorithm;
        return this;
    }

    @JsonProperty("signatureKeyIdentifier")
    public KeyC2PDescriptionType getSignatureKeyIdentifier() {
        return signatureKeyIdentifier;
    }

    @JsonProperty("signatureKeyIdentifier")
    public void setSignatureKeyIdentifier(KeyC2PDescriptionType signatureKeyIdentifier) {
        this.signatureKeyIdentifier = signatureKeyIdentifier;
    }

    public DICOOBJETJSONSecurity withSignatureKeyIdentifier(KeyC2PDescriptionType signatureKeyIdentifier) {
        this.signatureKeyIdentifier = signatureKeyIdentifier;
        return this;
    }

    /**
     * Specifies a character string with a minlength of 2 and maxlength of 226 digits.
     * 
     */
    @JsonProperty("tr31AdditionalData")
    public String getTr31AdditionalData() {
        return tr31AdditionalData;
    }

    /**
     * Specifies a character string with a minlength of 2 and maxlength of 226 digits.
     * 
     */
    @JsonProperty("tr31AdditionalData")
    public void setTr31AdditionalData(String tr31AdditionalData) {
        this.tr31AdditionalData = tr31AdditionalData;
    }

    public DICOOBJETJSONSecurity withTr31AdditionalData(String tr31AdditionalData) {
        this.tr31AdditionalData = tr31AdditionalData;
        return this;
    }

    /**
     * Specifies a character string with min 72 and max 296 digits.
     * 
     */
    @JsonProperty("tr31KeyBlock")
    public String getTr31KeyBlock() {
        return tr31KeyBlock;
    }

    /**
     * Specifies a character string with min 72 and max 296 digits.
     * 
     */
    @JsonProperty("tr31KeyBlock")
    public void setTr31KeyBlock(String tr31KeyBlock) {
        this.tr31KeyBlock = tr31KeyBlock;
    }

    public DICOOBJETJSONSecurity withTr31KeyBlock(String tr31KeyBlock) {
        this.tr31KeyBlock = tr31KeyBlock;
        return this;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("tr31KeyFunction")
    public String getTr31KeyFunction() {
        return tr31KeyFunction;
    }

    /**
     * Specifies a string with an exact length of 1 character
     * 
     */
    @JsonProperty("tr31KeyFunction")
    public void setTr31KeyFunction(String tr31KeyFunction) {
        this.tr31KeyFunction = tr31KeyFunction;
    }

    public DICOOBJETJSONSecurity withTr31KeyFunction(String tr31KeyFunction) {
        this.tr31KeyFunction = tr31KeyFunction;
        return this;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("tr31KeyVersion")
    public String getTr31KeyVersion() {
        return tr31KeyVersion;
    }

    /**
     *  2 alphanumeric characters
     * 
     */
    @JsonProperty("tr31KeyVersion")
    public void setTr31KeyVersion(String tr31KeyVersion) {
        this.tr31KeyVersion = tr31KeyVersion;
    }

    public DICOOBJETJSONSecurity withTr31KeyVersion(String tr31KeyVersion) {
        this.tr31KeyVersion = tr31KeyVersion;
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

    public DICOOBJETJSONSecurity withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DICOOBJETJSONSecurity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bdkKeyIdentifier");
        sb.append('=');
        sb.append(((this.bdkKeyIdentifier == null)?"<null>":this.bdkKeyIdentifier));
        sb.append(',');
        sb.append("dataSource");
        sb.append('=');
        sb.append(((this.dataSource == null)?"<null>":this.dataSource));
        sb.append(',');
        sb.append("dataUsedForSign");
        sb.append('=');
        sb.append(((this.dataUsedForSign == null)?"<null>":this.dataUsedForSign));
        sb.append(',');
        sb.append("diversificationValue");
        sb.append('=');
        sb.append(((this.diversificationValue == null)?"<null>":this.diversificationValue));
        sb.append(',');
        sb.append("dynKeyIdentifier");
        sb.append('=');
        sb.append(((this.dynKeyIdentifier == null)?"<null>":this.dynKeyIdentifier));
        sb.append(',');
        sb.append("encryptionAlgorithm");
        sb.append('=');
        sb.append(((this.encryptionAlgorithm == null)?"<null>":this.encryptionAlgorithm));
        sb.append(',');
        sb.append("kbpkKeyIdentifier");
        sb.append('=');
        sb.append(((this.kbpkKeyIdentifier == null)?"<null>":this.kbpkKeyIdentifier));
        sb.append(',');
        sb.append("kdkKeyIdentifier");
        sb.append('=');
        sb.append(((this.kdkKeyIdentifier == null)?"<null>":this.kdkKeyIdentifier));
        sb.append(',');
        sb.append("keyingMaterialSecurityData");
        sb.append('=');
        sb.append(((this.keyingMaterialSecurityData == null)?"<null>":this.keyingMaterialSecurityData));
        sb.append(',');
        sb.append("keyLength");
        sb.append('=');
        sb.append(((this.keyLength == null)?"<null>":this.keyLength));
        sb.append(',');
        sb.append("keySerialNumber");
        sb.append('=');
        sb.append(((this.keySerialNumber == null)?"<null>":this.keySerialNumber));
        sb.append(',');
        sb.append("kscKeyIdentifier");
        sb.append('=');
        sb.append(((this.kscKeyIdentifier == null)?"<null>":this.kscKeyIdentifier));
        sb.append(',');
        sb.append("ktKeyIdentifier");
        sb.append('=');
        sb.append(((this.ktKeyIdentifier == null)?"<null>":this.ktKeyIdentifier));
        sb.append(',');
        sb.append("macAlgorithm");
        sb.append('=');
        sb.append(((this.macAlgorithm == null)?"<null>":this.macAlgorithm));
        sb.append(',');
        sb.append("macLength");
        sb.append('=');
        sb.append(((this.macLength == null)?"<null>":this.macLength));
        sb.append(',');
        sb.append("macValue");
        sb.append('=');
        sb.append(((this.macValue == null)?"<null>":this.macValue));
        sb.append(',');
        sb.append("maskGeneratorAlgorithm");
        sb.append('=');
        sb.append(((this.maskGeneratorAlgorithm == null)?"<null>":this.maskGeneratorAlgorithm));
        sb.append(',');
        sb.append("paddingMethod");
        sb.append('=');
        sb.append(((this.paddingMethod == null)?"<null>":this.paddingMethod));
        sb.append(',');
        sb.append("partialHash");
        sb.append('=');
        sb.append(((this.partialHash == null)?"<null>":this.partialHash));
        sb.append(',');
        sb.append("partialHashLength");
        sb.append('=');
        sb.append(((this.partialHashLength == null)?"<null>":this.partialHashLength));
        sb.append(',');
        sb.append("pinBlockEncryptionFormat");
        sb.append('=');
        sb.append(((this.pinBlockEncryptionFormat == null)?"<null>":this.pinBlockEncryptionFormat));
        sb.append(',');
        sb.append("pinBlockFormat");
        sb.append('=');
        sb.append(((this.pinBlockFormat == null)?"<null>":this.pinBlockFormat));
        sb.append(',');
        sb.append("pinVerificationResult");
        sb.append('=');
        sb.append(((this.pinVerificationResult == null)?"<null>":this.pinVerificationResult));
        sb.append(',');
        sb.append("saltLength");
        sb.append('=');
        sb.append(((this.saltLength == null)?"<null>":this.saltLength));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
        sb.append(',');
        sb.append("signatureAlgorithm");
        sb.append('=');
        sb.append(((this.signatureAlgorithm == null)?"<null>":this.signatureAlgorithm));
        sb.append(',');
        sb.append("signatureDigestAlgorithm");
        sb.append('=');
        sb.append(((this.signatureDigestAlgorithm == null)?"<null>":this.signatureDigestAlgorithm));
        sb.append(',');
        sb.append("signatureKeyIdentifier");
        sb.append('=');
        sb.append(((this.signatureKeyIdentifier == null)?"<null>":this.signatureKeyIdentifier));
        sb.append(',');
        sb.append("tr31AdditionalData");
        sb.append('=');
        sb.append(((this.tr31AdditionalData == null)?"<null>":this.tr31AdditionalData));
        sb.append(',');
        sb.append("tr31KeyBlock");
        sb.append('=');
        sb.append(((this.tr31KeyBlock == null)?"<null>":this.tr31KeyBlock));
        sb.append(',');
        sb.append("tr31KeyFunction");
        sb.append('=');
        sb.append(((this.tr31KeyFunction == null)?"<null>":this.tr31KeyFunction));
        sb.append(',');
        sb.append("tr31KeyVersion");
        sb.append('=');
        sb.append(((this.tr31KeyVersion == null)?"<null>":this.tr31KeyVersion));
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
        result = ((result* 31)+((this.kbpkKeyIdentifier == null)? 0 :this.kbpkKeyIdentifier.hashCode()));
        result = ((result* 31)+((this.partialHash == null)? 0 :this.partialHash.hashCode()));
        result = ((result* 31)+((this.pinBlockFormat == null)? 0 :this.pinBlockFormat.hashCode()));
        result = ((result* 31)+((this.pinVerificationResult == null)? 0 :this.pinVerificationResult.hashCode()));
        result = ((result* 31)+((this.dataUsedForSign == null)? 0 :this.dataUsedForSign.hashCode()));
        result = ((result* 31)+((this.tr31KeyBlock == null)? 0 :this.tr31KeyBlock.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.dynKeyIdentifier == null)? 0 :this.dynKeyIdentifier.hashCode()));
        result = ((result* 31)+((this.encryptionAlgorithm == null)? 0 :this.encryptionAlgorithm.hashCode()));
        result = ((result* 31)+((this.tr31AdditionalData == null)? 0 :this.tr31AdditionalData.hashCode()));
        result = ((result* 31)+((this.keyLength == null)? 0 :this.keyLength.hashCode()));
        result = ((result* 31)+((this.bdkKeyIdentifier == null)? 0 :this.bdkKeyIdentifier.hashCode()));
        result = ((result* 31)+((this.kscKeyIdentifier == null)? 0 :this.kscKeyIdentifier.hashCode()));
        result = ((result* 31)+((this.pinBlockEncryptionFormat == null)? 0 :this.pinBlockEncryptionFormat.hashCode()));
        result = ((result* 31)+((this.paddingMethod == null)? 0 :this.paddingMethod.hashCode()));
        result = ((result* 31)+((this.macValue == null)? 0 :this.macValue.hashCode()));
        result = ((result* 31)+((this.tr31KeyVersion == null)? 0 :this.tr31KeyVersion.hashCode()));
        result = ((result* 31)+((this.signatureDigestAlgorithm == null)? 0 :this.signatureDigestAlgorithm.hashCode()));
        result = ((result* 31)+((this.maskGeneratorAlgorithm == null)? 0 :this.maskGeneratorAlgorithm.hashCode()));
        result = ((result* 31)+((this.kdkKeyIdentifier == null)? 0 :this.kdkKeyIdentifier.hashCode()));
        result = ((result* 31)+((this.tr31KeyFunction == null)? 0 :this.tr31KeyFunction.hashCode()));
        result = ((result* 31)+((this.keyingMaterialSecurityData == null)? 0 :this.keyingMaterialSecurityData.hashCode()));
        result = ((result* 31)+((this.ktKeyIdentifier == null)? 0 :this.ktKeyIdentifier.hashCode()));
        result = ((result* 31)+((this.macLength == null)? 0 :this.macLength.hashCode()));
        result = ((result* 31)+((this.diversificationValue == null)? 0 :this.diversificationValue.hashCode()));
        result = ((result* 31)+((this.saltLength == null)? 0 :this.saltLength.hashCode()));
        result = ((result* 31)+((this.signatureAlgorithm == null)? 0 :this.signatureAlgorithm.hashCode()));
        result = ((result* 31)+((this.keySerialNumber == null)? 0 :this.keySerialNumber.hashCode()));
        result = ((result* 31)+((this.macAlgorithm == null)? 0 :this.macAlgorithm.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dataSource == null)? 0 :this.dataSource.hashCode()));
        result = ((result* 31)+((this.partialHashLength == null)? 0 :this.partialHashLength.hashCode()));
        result = ((result* 31)+((this.signatureKeyIdentifier == null)? 0 :this.signatureKeyIdentifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DICOOBJETJSONSecurity) == false) {
            return false;
        }
        DICOOBJETJSONSecurity rhs = ((DICOOBJETJSONSecurity) other);
        return ((((((((((((((((((((((((((((((((((this.kbpkKeyIdentifier == rhs.kbpkKeyIdentifier)||((this.kbpkKeyIdentifier!= null)&&this.kbpkKeyIdentifier.equals(rhs.kbpkKeyIdentifier)))&&((this.partialHash == rhs.partialHash)||((this.partialHash!= null)&&this.partialHash.equals(rhs.partialHash))))&&((this.pinBlockFormat == rhs.pinBlockFormat)||((this.pinBlockFormat!= null)&&this.pinBlockFormat.equals(rhs.pinBlockFormat))))&&((this.pinVerificationResult == rhs.pinVerificationResult)||((this.pinVerificationResult!= null)&&this.pinVerificationResult.equals(rhs.pinVerificationResult))))&&((this.dataUsedForSign == rhs.dataUsedForSign)||((this.dataUsedForSign!= null)&&this.dataUsedForSign.equals(rhs.dataUsedForSign))))&&((this.tr31KeyBlock == rhs.tr31KeyBlock)||((this.tr31KeyBlock!= null)&&this.tr31KeyBlock.equals(rhs.tr31KeyBlock))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.dynKeyIdentifier == rhs.dynKeyIdentifier)||((this.dynKeyIdentifier!= null)&&this.dynKeyIdentifier.equals(rhs.dynKeyIdentifier))))&&((this.encryptionAlgorithm == rhs.encryptionAlgorithm)||((this.encryptionAlgorithm!= null)&&this.encryptionAlgorithm.equals(rhs.encryptionAlgorithm))))&&((this.tr31AdditionalData == rhs.tr31AdditionalData)||((this.tr31AdditionalData!= null)&&this.tr31AdditionalData.equals(rhs.tr31AdditionalData))))&&((this.keyLength == rhs.keyLength)||((this.keyLength!= null)&&this.keyLength.equals(rhs.keyLength))))&&((this.bdkKeyIdentifier == rhs.bdkKeyIdentifier)||((this.bdkKeyIdentifier!= null)&&this.bdkKeyIdentifier.equals(rhs.bdkKeyIdentifier))))&&((this.kscKeyIdentifier == rhs.kscKeyIdentifier)||((this.kscKeyIdentifier!= null)&&this.kscKeyIdentifier.equals(rhs.kscKeyIdentifier))))&&((this.pinBlockEncryptionFormat == rhs.pinBlockEncryptionFormat)||((this.pinBlockEncryptionFormat!= null)&&this.pinBlockEncryptionFormat.equals(rhs.pinBlockEncryptionFormat))))&&((this.paddingMethod == rhs.paddingMethod)||((this.paddingMethod!= null)&&this.paddingMethod.equals(rhs.paddingMethod))))&&((this.macValue == rhs.macValue)||((this.macValue!= null)&&this.macValue.equals(rhs.macValue))))&&((this.tr31KeyVersion == rhs.tr31KeyVersion)||((this.tr31KeyVersion!= null)&&this.tr31KeyVersion.equals(rhs.tr31KeyVersion))))&&((this.signatureDigestAlgorithm == rhs.signatureDigestAlgorithm)||((this.signatureDigestAlgorithm!= null)&&this.signatureDigestAlgorithm.equals(rhs.signatureDigestAlgorithm))))&&((this.maskGeneratorAlgorithm == rhs.maskGeneratorAlgorithm)||((this.maskGeneratorAlgorithm!= null)&&this.maskGeneratorAlgorithm.equals(rhs.maskGeneratorAlgorithm))))&&((this.kdkKeyIdentifier == rhs.kdkKeyIdentifier)||((this.kdkKeyIdentifier!= null)&&this.kdkKeyIdentifier.equals(rhs.kdkKeyIdentifier))))&&((this.tr31KeyFunction == rhs.tr31KeyFunction)||((this.tr31KeyFunction!= null)&&this.tr31KeyFunction.equals(rhs.tr31KeyFunction))))&&((this.keyingMaterialSecurityData == rhs.keyingMaterialSecurityData)||((this.keyingMaterialSecurityData!= null)&&this.keyingMaterialSecurityData.equals(rhs.keyingMaterialSecurityData))))&&((this.ktKeyIdentifier == rhs.ktKeyIdentifier)||((this.ktKeyIdentifier!= null)&&this.ktKeyIdentifier.equals(rhs.ktKeyIdentifier))))&&((this.macLength == rhs.macLength)||((this.macLength!= null)&&this.macLength.equals(rhs.macLength))))&&((this.diversificationValue == rhs.diversificationValue)||((this.diversificationValue!= null)&&this.diversificationValue.equals(rhs.diversificationValue))))&&((this.saltLength == rhs.saltLength)||((this.saltLength!= null)&&this.saltLength.equals(rhs.saltLength))))&&((this.signatureAlgorithm == rhs.signatureAlgorithm)||((this.signatureAlgorithm!= null)&&this.signatureAlgorithm.equals(rhs.signatureAlgorithm))))&&((this.keySerialNumber == rhs.keySerialNumber)||((this.keySerialNumber!= null)&&this.keySerialNumber.equals(rhs.keySerialNumber))))&&((this.macAlgorithm == rhs.macAlgorithm)||((this.macAlgorithm!= null)&&this.macAlgorithm.equals(rhs.macAlgorithm))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dataSource == rhs.dataSource)||((this.dataSource!= null)&&this.dataSource.equals(rhs.dataSource))))&&((this.partialHashLength == rhs.partialHashLength)||((this.partialHashLength!= null)&&this.partialHashLength.equals(rhs.partialHashLength))))&&((this.signatureKeyIdentifier == rhs.signatureKeyIdentifier)||((this.signatureKeyIdentifier!= null)&&this.signatureKeyIdentifier.equals(rhs.signatureKeyIdentifier))));
    }

}
