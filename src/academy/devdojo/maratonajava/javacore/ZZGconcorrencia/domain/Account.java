package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.domain;

public class Account {
    private int balance = 50;

    public void withdrawal(int amount) {
        this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}