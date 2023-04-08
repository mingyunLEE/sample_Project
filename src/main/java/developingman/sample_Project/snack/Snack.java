package developingman.sample_Project.snack;

public class Snack {
    private long snackId;
    private String korName;
    private String engName;
    private int price;

    public Snack(long snackId, String korName, String engName, int price) {
        this.snackId = snackId;
        this.korName = korName;
        this.engName = engName;
        this.price = price;
    }

    public long getSnackId() {
        return snackId;
    }

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public int getPrice() {
        return price;
    }

    public void setSnackId(long snackId) {
        this.snackId = snackId;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
