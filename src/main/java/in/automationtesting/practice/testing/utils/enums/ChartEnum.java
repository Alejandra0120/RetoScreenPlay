package in.automationtesting.practice.testing.utils.enums;

public enum ChartEnum {

   AMOUNT_BOOK("2");

    private String value;

    public String getValue() {
        return value;
    }

    ChartEnum(String value) {
        this.value = value;
    }
}
