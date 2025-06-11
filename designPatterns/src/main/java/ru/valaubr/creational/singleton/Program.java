package ru.valaubr.creational.singleton;

public class Program {

    public void startProgram() {
        ProcessStandardSingleton process1 = new ProcessStandardSingleton();
        ProcessStandardSingleton process2 = new ProcessStandardSingleton();

        process1.start();
        process2.start();
        sleep();

        ProcessGoodSingleton process3 = new ProcessGoodSingleton();
        ProcessGoodSingleton process4 = new ProcessGoodSingleton();

        process3.start();
        process4.start();
        sleep();

        ProcessGoodSingletonLikeJoke process5 = new ProcessGoodSingletonLikeJoke();
        ProcessGoodSingletonLikeJoke process6 = new ProcessGoodSingletonLikeJoke();

        process5.start();
        process6.start();
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private class ProcessStandardSingleton extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                StandardSingleton.getInstance().incrementValue();
            }
        }
    }

    private class ProcessGoodSingleton extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                GoodSingleton.getInstance().incrementValue();
            }
        }
    }

    private class ProcessGoodSingletonLikeJoke extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                GoodSingletonLikeAJoke.INSTANCE.getInstance().incrementValue();
            }
        }
    }
}
