public class Main {
    public static void main(String[] args) {
        task5 ();
    }
    public static void task1 () {
         int clientOS = 1;
         int Android = 1;
         int iOS = 0;
         if (clientOS == Android) {
            System.out.println("Установите версию приложения для Android по ссылке");
         } else if (clientOS == iOS) {
             System.out.println("Установите версию приложения для iOS по ссылке");
         }

    }
    public static void task2 () {
        int clientOS = 1;
        int Android = 1;
        int iOS = 0;
        int yearOfRelease = 2015;
        if (clientOS == Android && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == Android && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == iOS && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == iOS && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    public static void task3 () {
        int yers = 2021;
        boolean gradeYear = ((yers % 4 == 0) && (yers % 100 != 0) || (yers % 400 == 0));
        if (gradeYear) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год является не високосным");
        }

    }
    public static void task4 () {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Доставка займет 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Доставка займет 3 дня");
        }
    }
    public static void task5 () {
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь зимний месяц");
                break;
            case 2:
                System.out.println("Февраль зимний месяц");
                break;
            case 3:
                System.out.println("Март весенний месяц");
                break;
            case 4:
                System.out.println("Апрель весенний месяц");
                break;
            case 5:
                System.out.println("Май весенний месяц");
                break;
            case 6:
                System.out.println("Июнь летний месяц");
                break;
            case 7:
                System.out.println("Июль летний месяц");
                break;
            case 8:
                System.out.println("Август летний месяц");
                break;
            case 9:
                System.out.println("Сентябрь осенний месяц");
                break;
            case 10:
                System.out.println("Октябрь осенний месяц");
                break;
            case 11:
                System.out.println("Ноябрь осенний месяц");
                break;
            case 12:
                System.out.println("Декабрь зимний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}