package demo;

import java.util.Objects;

public class Money {
    public int amount;
    public String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
