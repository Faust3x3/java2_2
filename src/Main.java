public class Main {
    public static void main(String[] args) {
        int balance = 400;
        int add = 1600;
        if (add > 1000) {
            int bonus = add / 100;
            int sum = balance + add + bonus;
            System.out.println("Сумма бонусов составила: " + bonus);
            System.out.println("Итоговый баланс равен: " + sum);
        } else {
            int sum = balance + add;
            System.out.println("Сумма бонусов составила: 0 ");
            System.out.println("Итоговый баланс равен: " + sum);
        }
    }
}