//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // 1 задача
        System.out.println("Hello and welcome!");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Android");
        } else  {
            System.out.println("У вас ПК");
        }

        // 2 задача

        int clientOS2 = 0;
        int clientDeviceYear = 2014;

        if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // 3 задача
        int year = 2021;

        if ( year > 1584 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }

        // 4 задача
        int deliveryDistance = 95;
        int deliveryDays = 1;


        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет: " + deliveryDays);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет: " + deliveryDays++);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет: " + (++deliveryDays +1 ));
        } else {
            System.out.println("Доставки нет");
        }


        // 5 задача

        int monthNumber = 12;
        String monthName = null;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                monthName = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                monthName = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                monthName = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                monthName = "Осень";
                break;
        } System.out.println(monthName);
    }
}