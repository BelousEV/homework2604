public class Main {
    public static void main(String[] args) {


        // 1 задание

        int n = 1;
        while (n<=10) {;
            System.out.print(n++ + " ");
        }
        System.out.print("\n");


        for (n=10; n >= 0; n-- ) {
            System.out.print(n + " ");

        }
        System.out.print("\n");

        // 2 Задание

        int friday = 4;

        while ( friday < 31) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет.");
            friday = friday+7;

        }


        // 3 Задание

        int currentYear = 2022;

        for (int year =  currentYear-200; year < currentYear + 100; year = year + 1) {
            if (year % 79 == 0) {
                System.out.println(year);

            }
        }





    }

    }
