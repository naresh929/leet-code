package com.designpattern;

public class StrategyPattern {

    //Behavioral design pattern
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        //Using Credit Card for payment
        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.checkout(1000);

        // Using PayPal for payment
        shoppingCart.setPaymentStrategy(new DebitCardPayment());
        shoppingCart.checkout(1500);
    }
}
// Step 1: Define the Strategy interface
interface PaymentStrategy{
    public void pay(int amount);
}
// Step 2: Create ConcreteStrategy classes
class CreditCardPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paying "+amount+" using credit card ");
    }
}
class DebitCardPayment implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paying "+amount+" using debit card ");
    }
}

// Step 3: Create the Context class
class ShoppingCart{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        this.paymentStrategy.pay(amount);
    }
}
