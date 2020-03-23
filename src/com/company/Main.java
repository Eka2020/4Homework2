package com.company;

public class Main {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) throws InterruptedException {
        System.out.println(ANSI_YELLOW + "Запуск Эстафеты ");
            for (int i = 1; i <= 5; i++) {
                Runner runner = new Runner(ANSI_GREEN + "Бегун " + i);
                runner.setRunnerNext(i + 1);
                runner.setNumber(0);
                runner.start();
                runner.join();
            }
            for (int i = 5; i > 1; i--) {
                Runner runnerBack = new Runner(ANSI_GREEN + "Бегун " + i);
                runnerBack.setRunnerBack(i - 1);
                runnerBack.setNumber(1);
                runnerBack.start();
                runnerBack.join();
            }
            System.out.println(ANSI_GREEN + "Бегун 1 берет палочку");
        System.out.println(ANSI_YELLOW + "Эстафета завершена!!");
    }
}