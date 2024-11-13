public class Main {
    public static void main(String[] args) {
        int priceTicket;  //цена билета
        int priceMile;  //стоимость бонусной мили
        int bonus;      //бонусные мили

        /*ввод данных*/
        priceMile = 20;
        priceTicket = 13676;

        /*расчет бонусов*/
        bonus = priceTicket / priceMile;
        System.out.println("Поздравляем! Ваш бонус: " + bonus + " бесплатных миль");
    }
}

