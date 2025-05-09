package eu.estreem.gcase.mapper;

import eu.estreem.gcase.domain.GrossCreditAndSchemeFeesEvent;
import eu.estreem.gcase.domain.PrecompEvent;
import eu.estreem.gcase.domain.TracabilityEvent;
import eu.estreem.gcase.model.*;
import eu.estreem.model.v1.*;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Unit tests for GrossCreditAndSchemeFeesEventMapper.
 */
public class GrossCreditAndSchemeFeesEventMapperTest extends TestCase {

    private GrossCreditAndSchemeFeesEventMapper mapper;

    /**
     * Set up the test case
     */
    public void setUp() {
        mapper = new GrossCreditAndSchemeFeesEventMapper();
    }

    /**
     * Test toKafkaModel method
     */
    public void testToKafkaModel() {
        // Create test DTO
        GrossCreditAndSchemeFeesEventDTO dto = createTestDTO();

        // Map to Kafka model
        GrossCreditAndSchemeFeesEvent event = GrossCreditAndSchemeFeesEventMapper.toKafkaModel(dto);

        // Verify mapping
        assertNotNull("Event should not be null", event);
        
        // Verify header
        assertNotNull("Header should not be null", event.getHeaderFunctionalInfo());
        assertEquals("Message function should match", "TEST_FUNCTION", event.getHeaderFunctionalInfo().getMessageFunction());
        assertEquals("Message description should match", "Test Description", event.getHeaderFunctionalInfo().getMessageDescription());
        
        // Verify acquirer
        assertNotNull("Acquirer should not be null", event.getAcquirer());
        assertEquals("Acquirer ID should match", "ACQ123", event.getAcquirer().getAcquirerId());
        
        // Verify card
        assertNotNull("Card should not be null", event.getCard());
        assertEquals("Card brand should match", "VISA", event.getCard().getCardBrand());
        
        // Verify merchant
        assertNotNull("Merchant should not be null", event.getMerchant());
        assertEquals("Merchant ID should match", "MERCH123", event.getMerchant().getMerchantId());
        
        // Verify interchange
        assertNotNull("Interchange should not be null", event.getInterchange());
        assertEquals("Interchange amount should match", "10.50", event.getInterchange().getAmount().getAmount());
        
        // Verify transaction context
        assertNotNull("Transaction context should not be null", event.getTransactionContext());
        assertEquals("Tracability event ID should match", "TRACE123", event.getTransactionContext().getTracabilityEventID());
        
        // Verify transaction identification
        assertNotNull("Transaction identification should not be null", event.getTransactionIdentification());
        assertEquals("Transaction reference should match", "TX123", event.getTransactionIdentification().getTransactionReference());
        
        // Verify transaction details
        assertNotNull("Transaction details should not be null", event.getTransactionDetails());
        assertEquals("Total amount should match", "100.00", event.getTransactionDetails().getTotalAmount().getAmount());
        
        // Verify scheme fees
        assertNotNull("Scheme fees should not be null", event.getSchemeFees());
        assertEquals("Total amount should match", "5.00", event.getSchemeFees().getTotalAmount().getAmount());
        assertNotNull("Scheme fees details should not be null", event.getSchemeFees().getSchemeFeesDetails());
    }

    /**
     * Test mapAcquirer method
     */
    public void testMapAcquirer() {
        // Create test DTO
        AcquirerDTO dto = AcquirerDTO.builder()
                .acquirerId("ACQ123")
                .acquirerLeaderInstitutionId("LEAD123")
                .countryCode("FR")
                .build();

        // Map to model
        DICOOBJETJSONAcquirer acquirer = GrossCreditAndSchemeFeesEventMapper.mapAcquirer(dto);

        // Verify mapping
        assertNotNull("Acquirer should not be null", acquirer);
        assertEquals("Acquirer ID should match", "ACQ123", acquirer.getAcquirerId());
        assertEquals("Leader institution ID should match", "LEAD123", acquirer.getAcquirerLeaderInstitutionId());
        assertEquals("Country code should match", "FR", acquirer.getCountryCode());
    }

    /**
     * Test mapMerchant method
     */
    public void testMapMerchant() {
        // Create test DTO
        MerchantDTO dto = MerchantDTO.builder()
                .merchantId("MERCH123")
                .merchantName("Test Merchant")
                .merchantCategoryCode("1234")
                .companyRegistrationNumber("REG123")
                //.companyRegistrationNumberCategory(Collections.emptyList())
                .countryCode("FR")
                .build();

        // Map to model
        DICOOBJETJSONMerchant merchant = GrossCreditAndSchemeFeesEventMapper.mapMerchant(dto);

        // Verify mapping
        assertNotNull("Merchant should not be null", merchant);
        assertEquals("Merchant ID should match", "MERCH123", merchant.getMerchantId());
        assertEquals("Merchant name should match", "Test Merchant", merchant.getMerchantName());
        assertEquals("Merchant category code should match", "1234", merchant.getMerchantCategoryCode());
        assertEquals("Company registration number should match", "REG123", merchant.getCompanyRegistrationNumber());
    }

    /**
     * Test mapCard method
     */
    public void testMapCard() {
        // Create test DTO
        CardDTO dto = CardDTO.builder()
                //.cardBrand("VISA")
                //.cardBrandProductCode(Collections.emptyList())
                //.cardIssuerProductCode("ISSUE123")
                .countryCode("FR")
                .primaryAccountNumber("1234567890123456")
                .build();

        // Map to model
        DICOOBJETJSONCard card = GrossCreditAndSchemeFeesEventMapper.mapCard(dto);

        // Verify mapping
        assertNotNull("Card should not be null", card);
        assertEquals("Card brand should match", "VISA", card.getCardBrand());
        assertEquals("Card issuer product code should match", "ISSUE123", card.getCardIssuerProductCode());
        assertEquals("Country code should match", "FR", card.getCountryCode());
        assertEquals("Primary account number should match", "1234567890123456", card.getPrimaryAccountNumber());
    }

    /**
     * Test mapTransactionCtx method
     */
    public void testMapTransactionCtx() {
        // Create test DTO
        TransactionContextDTO dto = TransactionContextDTO.builder()
                .tracabilityEventID("TRACE123")
                //.traceabilityService(Collections.emptyList())
                .transactionNature(Collections.emptyList())
                .jurisdiction("JURISDICTION1")
                .build();

        // Map to model
        DICOOBJETJSONTransactionContext context = GrossCreditAndSchemeFeesEventMapper.mapTransactionCtx(dto);

        // Verify mapping
        assertNotNull("Transaction context should not be null", context);
        assertEquals("Tracability event ID should match", "TRACE123", context.getTracabilityEventID());
        assertEquals("Jurisdiction should match", "JURISDICTION1", context.getJurisdiction());
    }

    /**
     * Test mapTransactionDetails method
     */
    public void testMapTransactionDetails() {
        // Create test DTO
        AmountTypeDTO amountDTO = AmountTypeDTO.builder()
                .amount(new BigDecimal("100.00"))
                .currency("EUR")
                .build();
                
        TransactionDetailsDTO dto = TransactionDetailsDTO.builder()
                .totalAmount(amountDTO)
                .cardBrandApplied(Collections.emptyList())
                .ecommerceIndicator("INDICATOR1")
                .initialGmtDateTime("2023-01-01T12:00:00Z")
                .originalUniqueIdentifier("ORIG123")
                .settlementDate("2023-01-02")
                .build();

        // Map to model
        DICOOBJETJSONTransactionDetails details = GrossCreditAndSchemeFeesEventMapper.mapTransactionDetails(dto);

        // Verify mapping
        assertNotNull("Transaction details should not be null", details);
        assertNotNull("Total amount should not be null", details.getTotalAmount());
        assertEquals("Amount should match", "100.00", details.getTotalAmount().getAmount());
        assertEquals("Currency should match", "EUR", details.getTotalAmount().getCurrency());
        assertEquals("Ecommerce indicator should match", "INDICATOR1", details.getEcommerceIndicator());
        assertEquals("Initial GMT date time should match", "2023-01-01T12:00:00Z", details.getInitialGmtDateTime());
        assertEquals("Original unique identifier should match", "ORIG123", details.getOriginalUniqueIdentifier());
        assertEquals("Settlement date should match", "2023-01-02", details.getSettlementDate());
    }

    /**
     * Test mapTransactionIdentification method
     */
    public void testMapTransactionIdentification() {
        // Create test DTO
        TransactionIdentificationDTO dto = TransactionIdentificationDTO.builder()
                .localDateTime("2023-01-01T12:00:00")
                .transactionReference("TX123")
                .build();

        // Map to model
        DICOOBJETJSONTransactionIdentification identification = GrossCreditAndSchemeFeesEventMapper.mapTransactionIdentification(dto);

        // Verify mapping
        assertNotNull("Transaction identification should not be null", identification);
        assertEquals("Local date time should match", "2023-01-01T12:00:00", identification.getLocalDateTime());
        assertEquals("Transaction reference should match", "TX123", identification.getTransactionReference());
    }

    /**
     * Test mapHeaderFunctionalInfo method
     */
    public void testMapHeaderFunctionalInfo() {
        // Create test DTO
        HeaderFunctionalInfoDTO dto = HeaderFunctionalInfoDTO.builder()
                //.messageFunction("TEST_FUNCTION")
                .messageDescription("Test Description")
                .datetime("2023-01-01T12:00:00")
                .vacationNumber("VAC123")
                .build();

        // Map to model
        DICOOBJETJSONHeaderFunctionalInfo header = GrossCreditAndSchemeFeesEventMapper.mapHeaderFunctionalInfo(dto);

        // Verify mapping
        assertNotNull("Header should not be null", header);
        assertEquals("Message function should match", "TEST_FUNCTION", header.getMessageFunction());
        assertEquals("Message description should match", "Test Description", header.getMessageDescription());
        assertEquals("Date time should match", "2023-01-01T12:00:00", header.getDatetime());
        assertEquals("Vacation number should match", "VAC123", header.getVacationNumber());
    }

    /**
     * Test mapInterchange method
     */
    public void testMapInterchange() {
        // Create test DTO
        AmountTypeDTO amountDTO = AmountTypeDTO.builder()
                .amount(new BigDecimal("10.50"))
                .currency("EUR")
                .build();
                
        KeyValueTypeDTO keyValue = KeyValueTypeDTO.builder()
                .key("KEY1")
                .value("VALUE1")
                .build();
                
        List<KeyValueTypeDTO> additionalCodes = new ArrayList<>();
        additionalCodes.add(keyValue);
                
        InterchangeDTO dto = InterchangeDTO.builder()
                .amount(amountDTO)
                .rate("0.5")
                //.iCScode("ICS123")
                //.additionalCodes(additionalCodes)
                .build();

        // Map to model
        DICOOBJETJSONInterchange interchange = GrossCreditAndSchemeFeesEventMapper.mapInterchange(dto);

        // Verify mapping
        assertNotNull("Interchange should not be null", interchange);
        assertNotNull("Amount should not be null", interchange.getAmount());
        assertEquals("Amount should match", "10.50", interchange.getAmount().getAmount());
        assertEquals("Currency should match", "EUR", interchange.getAmount().getCurrency());
        assertEquals("Rate should match", "0.5", interchange.getRate());
        assertEquals("ICS code should match", "ICS123", interchange.getICScode());
        assertNotNull("Additional code should not be null", interchange.getAdditionalCode());
        assertEquals("Additional code key should match", "KEY1", interchange.getAdditionalCode().getKey());
        assertEquals("Additional code value should match", "VALUE1", interchange.getAdditionalCode().getValue());
    }

    /**
     * Test mapSchemeFees method
     */
    public void testMapSchemeFees() {
        // Create test DTO
        AmountType amountType = new AmountType();
        amountType.setAmount("5.00");
        amountType.setCurrency("EUR");
        
        SchemeFeeTypeDTO schemeFeesTypeDTO = SchemeFeeTypeDTO.builder()
                .amount(amountType)
                .rechargeable(true)
                .billingId("BILL123")
                .schemeFeesLabel("LABEL1")
                .schemeFeesGroup("GROUP1")
                .build();
                
        List<SchemeFeeTypeDTO> schemeFeesDetails = new ArrayList<>();
        schemeFeesDetails.add(schemeFeesTypeDTO);
        
        SchemeFeesDTO dto = SchemeFeesDTO.builder()
                .totalAmount(amountType)
                //.schemeFeesDetails(schemeFeesDetails)
                .build();

        // Map to model
        DICOOBJETJSONSchemeFees schemeFees = GrossCreditAndSchemeFeesEventMapper.mapSchemeFees(dto);

        // Verify mapping
        assertNotNull("Scheme fees should not be null", schemeFees);
        assertNotNull("Total amount should not be null", schemeFees.getTotalAmount());
        assertEquals("Amount should match", "5.00", schemeFees.getTotalAmount().getAmount());
        assertEquals("Currency should match", "EUR", schemeFees.getTotalAmount().getCurrency());
        assertNotNull("Scheme fees details should not be null", schemeFees.getSchemeFeesDetails());
    }

    /**
     * Test fromPrecompEvent method
     */
    public void testFromPrecompEvent() {
        // Create test precomp event
        PrecompEvent precompEvent = PrecompEvent.builder()
                .eventId("EVENT123")
                .tracabilityEventId("TRACE123")
                .operationId("OP123")
                .build();

        // Map to event
        GrossCreditAndSchemeFeesEvent event = mapper.fromPrecompEvent(precompEvent);

        // Verify mapping
        assertNotNull("Event should not be null", event);
        assertNotNull("Transaction context should not be null", event.getTransactionContext());
        assertEquals("Tracability event ID should match", "TRACE123", event.getTransactionContext().getTracabilityEventID());
        assertNotNull("Header should not be null", event.getHeaderFunctionalInfo());
        assertEquals("Message description should match", "PC04 Gross Cash Flow Event", event.getHeaderFunctionalInfo().getMessageDescription());
        assertEquals("Protocol version should match", "1.0", event.getHeaderFunctionalInfo().getProtocolVersion());
    }

    /**
     * Test toEnrichedEvent method
     */
    public void testToEnrichedEvent() {
        // Create test precomp event
        PrecompEvent precompEvent = PrecompEvent.builder()
                .eventId("EVENT123")
                .tracabilityEventId("TRACE123")
                .operationId("OP123")
                .build();

        // Create test tracability event with scheme fees details
        SchemeFeesType schemeFeesType = new SchemeFeesType();
        AmountType amountType = new AmountType();
        amountType.setAmount("2.50");
        amountType.setCurrency("EUR");
        schemeFeesType.setAmount(amountType);
        schemeFeesType.setRechargeable(true);
        schemeFeesType.setBillingId("BILL123");
        schemeFeesType.setSchemeFeesLabel("LABEL1");
        schemeFeesType.setSchemeFeesGroup("GROUP1");
        
        List<SchemeFeesType> schemeFeesDetails = new ArrayList<>();
        schemeFeesDetails.add(schemeFeesType);
        
        TracabilityEvent tracabilityEvent = TracabilityEvent.builder()
                .eventId("TRACE123")
                .totalSchemeFeesAmount("50.00")
                .schemeFeeCurrency("EUR")
                .operationId("OP123")
                .precompEventId("EVENT123")
                .merchantId("MERCH123")
                .build();
        
        // Map to enriched event
        GrossCreditAndSchemeFeesEvent event = GrossCreditAndSchemeFeesEventMapper.toEnrichedEvent(precompEvent, tracabilityEvent);

        // Verify mapping
        assertNotNull("Event should not be null", event);
        
        // Verify transaction context
        assertNotNull("Transaction context should not be null", event.getTransactionContext());
        assertEquals("Tracability event ID should match", "TRACE123", event.getTransactionContext().getTracabilityEventID());
        
        // Verify header
        assertNotNull("Header should not be null", event.getHeaderFunctionalInfo());
        assertEquals("Message description should match", "PC04 Gross Cash Flow Event", event.getHeaderFunctionalInfo().getMessageDescription());
        assertEquals("Protocol version should match", "1.0", event.getHeaderFunctionalInfo().getProtocolVersion());
        
        // Verify merchant
        assertNotNull("Merchant should not be null", event.getMerchant());
        assertEquals("Merchant ID should match", "MERCH123", event.getMerchant().getMerchantId());
        
        // Verify scheme fees
        assertNotNull("Scheme fees should not be null", event.getSchemeFees());
        assertNotNull("Total amount should not be null", event.getSchemeFees().getTotalAmount());
        assertEquals("Amount should match", "50.00", event.getSchemeFees().getTotalAmount().getAmount());
        assertEquals("Currency should match", "EUR", event.getSchemeFees().getTotalAmount().getCurrency());
        
        // Verify transaction identification
        assertNotNull("Transaction identification should not be null", event.getTransactionIdentification());
        assertEquals("Transaction reference should match", "OP123", event.getTransactionIdentification().getTransactionReference());
    }

    /**
     * Test null handling in toKafkaModel
     */
    public void testToKafkaModelWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.toKafkaModel(null));
    }

    /**
     * Test null handling in mapAcquirer
     */
    public void testMapAcquirerWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapAcquirer(null));
    }

    /**
     * Test null handling in mapMerchant
     */
    public void testMapMerchantWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapMerchant(null));
    }

    /**
     * Test null handling in mapCard
     */
    public void testMapCardWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapCard(null));
    }

    /**
     * Test null handling in mapTransactionCtx
     */
    public void testMapTransactionCtxWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapTransactionCtx(null));
    }

    /**
     * Test null handling in mapTransactionDetails
     */
    public void testMapTransactionDetailsWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapTransactionDetails(null));
    }

    /**
     * Test null handling in mapTransactionIdentification
     */
    public void testMapTransactionIdentificationWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapTransactionIdentification(null));
    }

    /**
     * Test null handling in mapHeaderFunctionalInfo
     */
    public void testMapHeaderFunctionalInfoWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapHeaderFunctionalInfo(null));
    }

    /**
     * Test null handling in mapInterchange
     */
    public void testMapInterchangeWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapInterchange(null));
    }

    /**
     * Test null handling in mapSchemeFees
     */
    public void testMapSchemeFeesWithNull() {
        assertNull("Null input should return null", GrossCreditAndSchemeFeesEventMapper.mapSchemeFees(null));
    }

    /**
     * Test null handling in fromPrecompEvent
     */
    public void testFromPrecompEventWithNull() {
        assertNull("Null input should return null", mapper.fromPrecompEvent(null));
    }

    /**
     * Test null handling in toEnrichedEvent
     */
    public void testToEnrichedEventWithNull() {
        PrecompEvent precompEvent = PrecompEvent.builder()
                .eventId("EVENT123")
                .tracabilityEventId("TRACE123")
                .operationId("OP123")
                .build();
                
        assertNull("Null tracability event should return null", 
                GrossCreditAndSchemeFeesEventMapper.toEnrichedEvent(precompEvent, null));
                
        TracabilityEvent tracabilityEvent = TracabilityEvent.builder()
                .eventId("TRACE123")
                .totalSchemeFeesAmount("50.00")
                .schemeFeeCurrency("EUR")
                .operationId("OP123")
                .precompEventId("EVENT123")
                .merchantId("MERCH123")
                .build();
                
        assertNull("Null precomp event should return null", 
                GrossCreditAndSchemeFeesEventMapper.toEnrichedEvent(null, tracabilityEvent));
    }

    /**
     * Helper method to create a test DTO
     */
    private GrossCreditAndSchemeFeesEventDTO createTestDTO() {
        // Create header
        HeaderFunctionalInfoDTO header = HeaderFunctionalInfoDTO.builder()
                //.messageFunction("TEST_FUNCTION")
                .messageDescription("Test Description")
                .datetime("2023-01-01T12:00:00")
                .vacationNumber("VAC123")
                .build();

        // Create acquirer
        AcquirerDTO acquirer = AcquirerDTO.builder()
                .acquirerId("ACQ123")
                .acquirerLeaderInstitutionId("LEAD123")
                .countryCode("FR")
                .build();

        // Create card
        CardDTO card = CardDTO.builder()
                //.cardBrand("VISA")
                //.cardBrandProductCode(Collections.emptyList())
                //.cardIssuerProductCode("ISSUE123")
                .countryCode("FR")
                .primaryAccountNumber("1234567890123456")
                .build();

        // Create merchant
        MerchantDTO merchant = MerchantDTO.builder()
                .merchantId("MERCH123")
                .merchantName("Test Merchant")
                .merchantCategoryCode("1234")
                .companyRegistrationNumber("REG123")
               // .companyRegistrationNumberCategory(Collections.emptyList())
                .countryCode("FR")
                .build();

        // Create interchange
        AmountTypeDTO interchangeAmount = AmountTypeDTO.builder()
                .amount(new BigDecimal("10.50"))
                .currency("EUR")
                .build();
                
        KeyValueTypeDTO keyValue = KeyValueTypeDTO.builder()
                .key("KEY1")
                .value("VALUE1")
                .build();
                
        List<KeyValueTypeDTO> additionalCodes = new ArrayList<>();
        additionalCodes.add(keyValue);
                
        InterchangeDTO interchange = InterchangeDTO.builder()
                .amount(interchangeAmount)
                .rate("0.5")
               // .iCScode("ICS123")
               // .additionalCodes(additionalCodes)
                .build();

        // Create transaction context
        TransactionContextDTO transactionContext = TransactionContextDTO.builder()
                .tracabilityEventID("TRACE123")
                //.traceabilityService(Collections.emptyList())
                .transactionNature(Collections.emptyList())
                .jurisdiction("JURISDICTION1")
                .build();

        // Create transaction identification
        TransactionIdentificationDTO transactionIdentification = TransactionIdentificationDTO.builder()
                .localDateTime("2023-01-01T12:00:00")
                .transactionReference("TX123")
                .build();

        // Create transaction details
        AmountTypeDTO totalAmount = AmountTypeDTO.builder()
                .amount(new BigDecimal("100.00"))
                .currency("EUR")
                .build();
                
        TransactionDetailsDTO transactionDetails = TransactionDetailsDTO.builder()
                .totalAmount(totalAmount)
                .cardBrandApplied(Collections.emptyList())
                .ecommerceIndicator("INDICATOR1")
                .initialGmtDateTime("2023-01-01T12:00:00Z")
                .originalUniqueIdentifier("ORIG123")
                .settlementDate("2023-01-02")
                .build();

        // Create scheme fees
        AmountType schemeFeesAmount = new AmountType();
        schemeFeesAmount.setAmount("5.00");
        schemeFeesAmount.setCurrency("EUR");
        
        AmountType feeAmount = new AmountType();
        feeAmount.setAmount("2.50");
        feeAmount.setCurrency("EUR");
        
        SchemeFeeTypeDTO schemeFeesTypeDTO = SchemeFeeTypeDTO.builder()
                .amount(feeAmount)
                .rechargeable(true)
                .billingId("BILL123")
                .schemeFeesLabel("LABEL1")
                .schemeFeesGroup("GROUP1")
                .build();
                
        List<SchemeFeeTypeDTO> schemeFeesDetailsList = new ArrayList<>();
        schemeFeesDetailsList.add(schemeFeesTypeDTO);
        
        SchemeFeesDTO schemeFees = SchemeFeesDTO.builder()
                .totalAmount(schemeFeesAmount)
               // .schemeFeesDetails(schemeFeesDetailsList)
                .build();

        // Create and return the DTO
        return GrossCreditAndSchemeFeesEventDTO.builder()
                .hearderFunctionalInfo(header)
                .acquirer(acquirer)
                .card(card)
                .merchant(merchant)
                .interchange(interchange)
                .transactionContext(transactionContext)
                .transactionIdentification(transactionIdentification)
                .transactionDetails(transactionDetails)
                .schemeFees(schemeFees)
                .build();
    }
}