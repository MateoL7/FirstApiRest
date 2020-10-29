package dto;

public class Multiplication {

    private String uid;
    private int multiplicand;
    private int multiplier;

    public Multiplication() {
    }

    public Multiplication(String uid, int multiplicand, int multiplier) {
        this.uid = uid;
        this.multiplicand = multiplicand;
        this.multiplier = multiplier;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getMultiplicand() {
        return multiplicand;
    }

    public void setMultiplicand(int multiplicand) {
        this.multiplicand = multiplicand;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
