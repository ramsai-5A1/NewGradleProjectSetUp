package CodeWithDurgesh.BuilderDP;

public class CreditCardClient {
    public static void main(String[] args) {

        CreditCard creditCard = CreditCard.getBuilderObject()
            .setAvailableLimit(150000)
            .setBankName("HDFC")
            .setCardNumber("4331112233443322")
            .build();

        System.out.println(creditCard);
    }
}
