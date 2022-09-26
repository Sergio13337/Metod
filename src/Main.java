public class Main {

    public static void main(String[] args) {
        int year = 2022;
        calculateLeapYear(year);
        int clientOs = 0;
        int clientDeviceYear = 2022;
        calculateDivice(clientOs, clientDeviceYear);
        int deliveryDistance = 50;
        int deliveryDays = 1;
        System.out.println("Потребуется дней " + deliveryTime(deliveryDistance, deliveryDays));

    }

    private static void calculateLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год");

        } else {
            System.out.println(year + " не високосный год");

        }


    }

    private static void calculateDivice(int clientOs, int clientDeviceYear) {
        int currentYear = 2022;
        if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегчённую версию приложения для IOS");
        } else {
            System.out.println("Установите обычную версию приложения для IOS");

        }
        if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

    }

    private static int deliveryTime(int deliveryDistance, int deliveryDays) {


        if (deliveryDistance > 20) {
            deliveryDays++;

        }
        if (deliveryDistance > 60) {
            deliveryDays ++;


        }
        return (deliveryDays);

    }
}