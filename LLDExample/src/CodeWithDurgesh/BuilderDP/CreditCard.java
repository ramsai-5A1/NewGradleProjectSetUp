package CodeWithDurgesh.BuilderDP;

public class CreditCard {

    private String cardNumber;
    private String bankName;
    private int availableLimit;
    private int totalLimit;

    private CreditCard(CreditCardBuilder builder) {
        this.cardNumber = builder.cardNumber;
        this.bankName = builder.bankName;
        this.availableLimit = builder.availableLimit;
        this.totalLimit = builder.totalLimit;
    }

    public static CreditCardBuilder getBuilderObject() {
        return new CreditCardBuilder();
    }

    @Override
    public String toString() {
        return "Card Number: " + this.cardNumber + ", Bank Name: " + this.bankName + ", Available Limit: " + this.availableLimit + ", Total Limit: " + this.totalLimit;
    }


    public static class CreditCardBuilder {
        private String cardNumber;
        private String bankName;
        private int availableLimit;
        private int totalLimit;

        public CreditCardBuilder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public CreditCardBuilder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public CreditCardBuilder setAvailableLimit(int availableLimit) {
            this.availableLimit = availableLimit;
            return this;
        }

        public CreditCardBuilder setTotalLimit(int totalLimit) {
            this.totalLimit = totalLimit;
            return this;
        }

        public CreditCard build() {
            return new CreditCard(this);
        }
    }
    
}
