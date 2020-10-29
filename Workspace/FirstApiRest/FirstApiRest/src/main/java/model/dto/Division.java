package dto;

public class Division {

    private String uid;
    private int dividend;
    private int divisor;

    public Division(String uid, int dividend, int divisor) {
        this.uid = uid;
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public Division() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
}
