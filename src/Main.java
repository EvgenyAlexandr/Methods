
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1 - Проверка високосного года
        System.out.println("Задача 1");
        checkLeapYear(2024);
        checkLeapYear(2025);


        // Задача 2 - Рекомендация версии приложения
        System.out.println("\nЗадача 2");
        suggestAppVersion(0, 2024); // iOS, старый телефон
        suggestAppVersion(1, 2025); // Android, новый телефон


        // Задача 3 - Расчет дней доставки
        System.out.println("\nЗадача 3");
        System.out.println("Потребуется дней: " + calculateDeliveryDays(95));
        System.out.println("Потребуется дней: " + calculateDeliveryDays(101));

    }


    // Метод для задачи 1
    public static void checkLeapYear(int year) {
        boolean isLeap = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        System.out.println(year + (isLeap ? " год — високосный год" : " год — невисокосный год"));
    }

    // Метод для задачи 2
    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName   = osType == 0 ? "iOS" : "Android";
        String version  = deviceYear < currentYear ? "облегченную" : "обычную";

        System.out.println("Установите " + version + " версию приложения для " + osName + " по ссылке");
    }

    // Метод для задачи 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1; // -1 означает, что доставка невозможна
        }
    }

}