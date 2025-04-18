package eu.estreem.gcase.enums;

public enum JurisdictionType {
    DOMESTIC("Domestic"),
    INTRA_EEA("Intra-EEA"),
    EEA_INTER("EEA-Inter");

    JurisdictionType(String label) {
        this.label = label;
    }

    private final String label;

}
