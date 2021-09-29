public class Task {

    public static class FirstTask {
        public static void main(String[] args) {
            int a = 5234;
            int a1 = a % 10;
            int a2 = a % 100 / 10;
            int a3 = a % 1000 / 100;
            int a4 = a / 1000;
            System.out.println((a1 + a2) == (a3 + a4));
        }
    }

    public static class SecondTask {
        public static void main(String[] args) {
            int a = 1;
            int b = 1;
            int c = 1;
            System.out.println(((b + Math.pow(((b * b) + (4 * a * c)), 0.5)) / (2 * a)) - (a * a * a * c) + Math.pow(b, -2));
        }
    }

    public static class ThirdTask {
        public static void main(String[] args) {
            int a = 4;
            int b = 3;
            System.out.println("Площадь = " + (a * b) / 2 + " Периметр = " + (Math.pow((a * a) + (b * b), 0.5) + a + b));
        }
    }

    public static class FourthTask {
        public static void main(String[] args) {
            int x = 4;
            int y = 1;
            System.out.println((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x <= 4 && x >= -4 && y <= 0 && y >= -3));
        }
    }

    public static class FifthTask {
        public static void main(String[] args) {
            int[] mas = new int[]{4, -2, -5};
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] < 0) {
                    mas[i] = mas[i] * mas[i] * mas[i] * mas[i];
                } else {
                    mas[i] = mas[i] * mas[i];
                }
            }
            for (int i : mas) {
                System.out.println(i);
            }
        }
    }

    public static class SixthTask {
        public static void main(String[] args) {
            int[] mas = new int[]{10, -12, 32};
            int max = mas[0];
            int min = mas[0];
            for (int a : mas) {
                max = Math.max(a, max);
                min = Math.min(a, min);
            }
            System.out.println("Сумма максимального и минимального = " + (max + min));
        }
    }

    public static class SeventhTask {
        public static void main(String[] args) {
            int[] mas = new int[]{423, 321, 0};
            double[] result = new double[mas.length];
            for (int i = 0; i < mas.length; i++) {
                result[i] = Math.pow(Math.sin(mas[i]), 2) - Math.cos(2 * mas[i]);
            }
            for (int i = 0; i < mas.length; i++) {
                System.out.println(mas[i] + " ---> " + result[i]);
            }
        }
    }

    public static class EighthTask {
        public static void main(String[] args) {
            int[] mas = new int[]{3, 1, 1, 1, 4, 9, 1, 1, 1, 1, 1};
            int k = 3;
            int result = 0;
            for (int i : mas) {
                if (i % k == 0) {
                    result += i;
                }
            }
            System.out.println("Сумма всех чисел кратных " + k + " = " + result);
        }
    }

    public static class NinthTask {
        public static void main(String[] args) {
            int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] mas2 = new int[]{1, 2, 3};
            int k = 2;
            int[] resultMas = new int[mas.length + mas2.length];
            for (int i = 0; i < k; i++) {
                resultMas[i] = mas[i];
            }
            for (int i = k; i < k + mas2.length; i++) {
                resultMas[i] = mas2[i - k];
            }
            for (int i = k + mas2.length; i < resultMas.length; i++) {
                resultMas[i] = mas[i - mas2.length];
            }
            for (int i : resultMas) {
                System.out.print(i + " ");
            }
        }
    }

    public static class TenthTask {
        public static void main(String[] args) {
            int n = 10;
            int[][] mas = new int[n][n];
            for (int i = 0; i < mas.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < mas[i].length; j++) {
                        mas[i][j] = j + 1;
                    }
                } else {
                    for (int j = 0; j < mas[i].length; j++) {
                        mas[i][j] = mas[j].length - j;
                    }
                }
            }
            for (int[] ma : mas) {
                for (int i : ma) {
                    System.out.print(i + "\t");
                }
                System.out.println();
            }
        }
    }
}
