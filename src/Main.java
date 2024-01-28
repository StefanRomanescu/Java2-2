//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialAmount = 399;
        int refill = 599;
        int coefficient = 100;
        int quantityBonuses;
        if (refill >= 1000) {
            quantityBonuses = (refill / coefficient);
        } else {
            quantityBonuses = 0;

        }
        int finalAmount = quantityBonuses+refill+initialAmount;
        System.out.println("Сумма на Вашем счёте составляет"+" "+ finalAmount+" "+"рублей.");
        System.out.println("Количество бонусов на счёте:"+ quantityBonuses+".");

    }
}

