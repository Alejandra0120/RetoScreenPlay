package in.automationtesting.practice.testing.models;

public class ChartModel {

    private String amount;

    public ChartModel(String amount) {
        this.amount = amount;
    }

    public ChartModel() {
    }

    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
