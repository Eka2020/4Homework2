package com.company;

public class Runner extends Thread {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

    public Runner(String name) {
        super(name);
    }
    private int runnerBack;
    private int runnerNext;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRunnerBack() {
        return runnerBack;
    }

    public void setRunnerBack(int runnerBack) {
        this.runnerBack = runnerBack;
    }

    public int getRunnerNext() {
        return runnerNext;
    }

    public void setRunnerNext(int runnerNext) {
        this.runnerNext = runnerNext;
    }

    @Override
    public void run() {
        try {
            if (getNumber() == 0) {
                if (getRunnerNext() == 6) {
                    System.out.println(this.getName() + ANSI_RED + " берет палочку "+"\n");
                    System.out.println(this.getName() + ANSI_GREEN + " бежит к" + " финишу"+"\n");
                } else {
                    System.out.println(this.getName() + ANSI_RED + " берет палочку "+"\n");
                    System.out.println(this.getName() + ANSI_BLUE + " бежит к" + " Бегуну " + getRunnerNext()+"\n");
                }
            } else {
                if (getRunnerNext() < 4) {
                    System.out.println(this.getName() + ANSI_RED + " берет палочку "+"\n");
                    System.out.println(this.getName() + ANSI_BLUE +" бежит к" + " Бегуну " + getRunnerBack()+"\n");
                } else {
                    System.out.println(this.getName() + ANSI_BLUE +" бежит к" + " Бегуну " + getRunnerBack()+"\n");
                }
            }
            sleep(5000);
            } catch (InterruptedException e) {


        }

    }
}