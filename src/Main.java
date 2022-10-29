public class Main {
    public static void main(String[] args) {

        // Задание 1
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке.");
        }

        // Задание 2
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else if (clientOS == 0) {
                System.out.println("Установите версию для iOS по ссылке.");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        }


        // Задание 3
        int year = 2404;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется 1 день.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня.");
        }

        // Задание 5
        int monthNumber = 6;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}