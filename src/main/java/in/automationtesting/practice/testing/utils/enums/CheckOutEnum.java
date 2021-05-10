package in.automationtesting.practice.testing.utils.enums;

public enum CheckOutEnum {
    FIRST_NAME("ALEJANDRA"),
    LAST_NAME("PARDO"),
    EMAIL_ADDRESS("alejandra@prueba.com"),
    PHONE("3213213211"),
    COUNTRY("COLOMBIA"),
    ADDRESS("CALLE 100"),
    CITY("BOGOTA"),
    COUNTY("ENGATIVA"),
    AMOUNT("945.00");

    private String value;

    public String getValue() {
        return value;
    }

    CheckOutEnum(String value) {
        this.value = value;
    }

}
