package ru.testTask.shilovJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Tasks {

    private Scanner scanner = new Scanner(System.in);

    public void solveTask1() {
        System.out.println("Задание_1: Введите число. Если число будет больше 7, " +
                "то в консоль выведется слово 'Привет':");
        int input;
        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
            checkInputTask1(input);
        } else if (scanner.hasNextDouble()) {
            input = (int) scanner.nextDouble();
            checkInputTask1(input);
        } else if (scanner.hasNextFloat()) {
            input = (int) scanner.nextFloat();
            checkInputTask1(input);
        } else if (scanner.hasNext()) {
            System.out.println("Неправильный ввод в Задании_1. Введите число в формате int, double или float");
        }
    }


    private void checkInputTask1(int value) {
        if (value > 7)
            System.out.println("Привет");
    }

    public void solveTask2() {
        System.out.println("Задание_2: Введите имя. Если имя совпадет с 'Вячеслав'," +
                " то в консоль выведется 'Привет, Вячеслав', если нет," +
                " то выведется 'Нет такого имени'");
        if (scanner.hasNextInt() | scanner.hasNextFloat() | scanner.hasNextDouble()) {
            System.out.println("Неправильный ввод Задание_2. Введите имя в формате String");
        } else if (scanner.hasNext()) {
            String line = scanner.next();
            if (line.equalsIgnoreCase("Вячеслав"))
                System.out.println("Привет, Вячеслав");
            else
                System.out.println("Нет такого имени");
        }
    }

    public void solveTask3() {
        System.out.println("Задание_3: Пользователь указывает размер массива. Числовой массив наполняется рандомными" +
                " значениями." +
                " Значения, кратные 3 выводятся в консоль");
        System.out.println("Укажите размер массива:");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int[] array = createArray(number);
            showNeededFigures(array);
        } else if (scanner.hasNextDouble()) {
            int number = (int) scanner.nextDouble();
            int[] array = createArray(number);
            showNeededFigures(array);
        } else if (scanner.hasNextFloat()) {
            int number = (int) scanner.nextFloat();
            int[] array = createArray(number);
            showNeededFigures(array);
        } else if (scanner.hasNext()) {
            System.out.println("Неправильный ввод в Задании_3. Введите в яисло в формате int, double или float");
        }
    }

    private int[] createArray(int number) {
        int[] array1 = new int[number];
        for (int i = 0; i < array1.length; i++) {
            int randomValue = (int) (Math.random() * 1000);
            array1[i] = randomValue;
        }
        return array1;
    }

    private void showNeededFigures(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 3 == 0)
                System.out.print(array3[i] + "; ");
        }
        System.out.println();
    }

    public void solveTask4() {
        try {
            String line = "[((())()(())]]";
            System.out.println("Задание_4: Дана скобочная последовательность: " + line);
            Thread.sleep(1000);
            System.out.println("Вопрос_1: можно ли считать эту последовательность правильной?");
            Thread.sleep(1500);
            System.out.println("Ответ: нет");
            Thread.sleep(1500);
            System.out.println("Вопрос_2: что необходимо в ней изменить, чтобы она стала правильной?");
            Thread.sleep(1500);
            System.out.println("Ответ: предпоследнюю квадратную скобку ']' заменить на круглую ')' ");
            Thread.sleep(1500);
            System.out.println("Передадим программе строковое скобочную последовательность : [((())()(())]]." +
                    " Программа сама покажет символ, в котором есть ошибка и номер индекса символа");

            BracketChecker checker = new BracketChecker(line);
            checker.check();

        } catch (InterruptedException i) {
            i.printStackTrace();
        }
    }
}
