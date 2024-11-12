public class Main {
    public static void main(String[] args) {
        int price_ticket;  //цена билета
        int price_mile;  //стоимость бонусной мили
        int bonus;      //бонусные мили

        /*ввод данных*/
        price_mile = 20;
        price_ticket = 13676;

        /*расчет бонусов*/
        bonus = price_ticket / price_mile;
        System.out.println("Поздравляем! Ваш бонус: " + bonus + " бесплатных миль");
    }
}

