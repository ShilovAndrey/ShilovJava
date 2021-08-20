package ru.testTask.shilovJava;

public class Main {

    public static void main(String[] args) {
        try {
            Tasks task = new Tasks();
            task.solveTask1();
            Thread.sleep(1000);
            task.solveTask2();
            Thread.sleep(1000);
            task.solveTask3();
            Thread.sleep(1500);
            task.solveTask4();
        } catch (InterruptedException inter) {
            inter.printStackTrace();
        }
    }
}