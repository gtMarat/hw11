import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        leapYear(2021);
    }

    public static void task2() {
        System.out.println("Задача 2");
        systemVersion(0, 2023);
    }

    public static void task3() {
        System.out.println("Задача 3");
        Delivery(110);
    }

    public static void systemVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void Delivery(int deliveryDistance) {
        int deliveryDays=1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней : " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней : " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней : " + (deliveryDays + 2));
        } else {
            System.out.println("доставки нет");
        }
    }
}


