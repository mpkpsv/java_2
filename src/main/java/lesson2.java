public class lesson2 {
        public static void main(String[] args) {
         isNegatiive(-5);
        }

        public static boolean isSumBetween(int a, int b) {
            int sum = a + b;
            if (sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }

        }

        public static void checkPositiveOrNegative(int a) {
            if (a >= 0) {
                System.out.println("Передано положительное число");
            } else {
                System.out.println("Передано отрицательное число");
            }
        }


        public static boolean isNegatiive(int x) {
            return x < 0;
        }

        public static void replicateLine(String words, int x) {
            for (int i = 0; i < x; i++) {
                System.out.println(words);
            }
        }

        public static void isLeapYear(int year) {
            int n = year % 4;
            int m = year % 400;
            int l = year % 100;
            if ((n != 0) || (l == 0) && (m != 0)) {
                System.out.println(year + " не високосный год");
            } else  {
                System.out.println(year + " високосный год");
            }

        }
}
//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
// от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
// отрицательное, и вернуть false если положительное.

//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
// указанную строку, указанное количество раз.

//5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.


