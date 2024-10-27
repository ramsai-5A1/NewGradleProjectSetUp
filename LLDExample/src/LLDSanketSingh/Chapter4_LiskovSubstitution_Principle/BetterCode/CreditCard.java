package LLDSanketSingh.Chapter4_LiskovSubstitution_Principle.BetterCode;

public abstract class CreditCard {

    private String ownerName;
    private int cvv;
    private String ccNumber;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getCvv() {
        return this.cvv;
    }

    public String getCcNumber() {
        return this.ccNumber;
    }

    public abstract void tapAndPay();

    public abstract void swipeAndPay();

    public abstract void onlineTransfer();

    public abstract void mandataryPayments();

    public void displayCreditCard() {
        System.out.println("CC number: " + this.ccNumber + ", OwnerName: " + this.ownerName);
    }
}
