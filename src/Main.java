public class Main {
    public static void main(String[] args) {
        task5 ();
    }
    public static void task1 () {
         int clientOS = 0;
         if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
         } else {
             System.out.println("Установите версию приложения для Android по ссылке");
         }

    }
    public static void task2 () {
        int clientOS = 1;
        int yearOfRelease = 2014;
        if (clientOS == 1) {
            if (yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                if (yearOfRelease < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            }
        }

    }
    public static void task3 () {
        int yers = 2021;
        if ((yers % 4 == 0) && (yers % 100 != 0) || (yers % 400 == 0)) {
            System.out.println(yers + " год является високосным");
        } else {
            System.out.println(yers + " год является не високосным");
        }

    }
    public static void task4 () {
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);

    }
    public static void task5 () {
        int monthNumber = 4;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}