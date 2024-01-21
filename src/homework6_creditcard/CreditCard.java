//Создать класс CreditCard с полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//Добавьте метод, который выводит текущую информацию о карточке. Напишите программу, которая создает три объекта
//класса CreditCard у которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.

package homework6_creditcard;

public class CreditCard {
    String cardAccount;
    int currentAmount;

    CreditCard(String cardAccount, int currentAmount) {
        this.cardAccount = cardAccount;
        this.currentAmount = currentAmount;
    }

    public void displayInfoCurrentAmounts() {
        System.out.println("Card Account: " + this.cardAccount);
        System.out.println("Balance amount: " + this.currentAmount);
    }

    public void cashReplenishment(int amount) {
        this.currentAmount += amount;
        System.out.println("Cash was replenished in the amount of " + amount + " to account " + this.cardAccount);
    }

    public void cahsWithdrawal(int amount) {
        this.currentAmount -= amount;
        System.out.println("Cash was withdraw in the amount of " + amount + " from account " + this.cardAccount);
    }

    public void displayInfo() {
        System.out.println("Card Account: " + this.cardAccount);
        System.out.println("Balance amount: " + this.currentAmount);
    }
}
