//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // 1 задача
        System.out.println("Hello and welcome!");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию для iOS");
                break;
            case 1:
                System.out.println("Установите версию для Android");
                break;
            default:
                System.out.println("Установите версию для ПК");
        }

        // 2 задача

        int clientOS2 = 0;
        int clientDeviceYear = 2014;

        if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения iOS по ссылке");
            }
        } else if (clientOS2 == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения Android по ссылке");
            } else {
                System.out.println("Установите версию приложения Android по ссылке");
            }
        }

        // 3 задача
        int year = 2021;

        if ( year % 4 == 2021 && year % 100 != 2021 || year % 400 == 2021) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }

        // 4 задача
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 100) {
            System.out.println(" Доставки нет ");
        } else {
            if (deliveryDistance > 20) {
                deliveryDays++;
            } if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней:" + deliveryDays);
        }

        // 5 задача

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь принадлежит к сезону зима");
            break;
            case 2:
                 System.out.println("Февраль принадлежит к сезону зима");
            break;
            case 3:
                System.out.println("Март принадлежит к сезону весна");
            break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна");
            break;
            case 5:
                System.out.println("Май принадлежит к сезону весна");
            break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето");
            break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето");
            break;
            case 8:
                System.out.println("Август принадлежит к сезону лето");
            break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень");
            break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень");
            break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень");
            break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима");
            break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}