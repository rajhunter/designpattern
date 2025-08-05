package solid.dip;

public class ShoppingMall {

    private  PaymentCard card;

    public  ShoppingMall(PaymentCard card){
        this.card=card;

    }
    public void doPurchase(long amount){
        card.doTransaction(amount);
    }


    public static void main(String []args){

        PaymentCard dc= (PaymentCard) new DebitCard();
        PaymentCard cc= (PaymentCard) new CreditCard();

        ShoppingMall sm= new ShoppingMall(cc); // this can use based on the payment type
        ShoppingMall sm_dc= new ShoppingMall(dc);

        sm.doPurchase(100);


    }
}
