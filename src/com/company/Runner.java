package com.company;

public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }

    private int runnerBack;
    private int runnerNext;

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
            if (getRunnerBack() == 0) {
                if (getRunnerNext() == 6) {
                    System.out.println(this.getName() + " берет палочку ");
                    System.out.println(this.getName() + " бежит к" + " финишу");
                } else {
                    System.out.println(this.getName() + " берет палочку ");
                    System.out.println(this.getName() + " бежит к" + " Бегуну " + getRunnerNext());
                }
            } else {
                if (getRunnerNext() != 4) {
                    System.out.println(this.getName() + " берет палочку ");
                    System.out.println(this.getName() + " бежит к" + " Бегуну " + getRunnerNext());
                } else {
                    System.out.println(this.getName() + " бежит к" + " Бегуну " + getRunnerNext());
                }
            }
            sleep(10);
        } catch (InterruptedException beg) {
            System.out.println("Бегуну 1 берет палочку");

        }

    }
}