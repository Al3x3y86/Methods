public class Main {

    public static void main(String[] args) {

        int year = leapYear(2024);

        int clientOS = 0;
        int clientDeviceYear = 2015;
        phoneVersion(clientDeviceYear, clientOS);

        int deliveryDistance = 21;
        allDays(deliveryDistance);
    }
    public static int leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
            System.out.println(year + " — високосный год.");
        }
        else {
            System.out.println(year + " — не високосный год.");
        }
        return year;
    }

    public static void phoneVersion(int clientDeviceYear, int clientOS) {

        int currentYear = 2015;
        if (clientDeviceYear < currentYear) {
            if (clientOS < 1 ) {
                System.out.println("Установите версию облегченную приложения для iOS по ссылке: ");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке: ");

        } else if (clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        } else System.out.println("Установите версию приложения для Android по ссылке: ");
    }
    public static void allDays(int deliveryDistance) {

        int oneDay = 1;
        int twoDays = 2;
        int threeDays = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + oneDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + twoDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + threeDays);
        }
    }
}