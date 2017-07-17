package ru.abdt.ba;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Artur Badretdinov (Gaket)
 *         20.12.2016.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i <= 100; i++) {
            final int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(singleFizzBuzz(finalI));
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }


    static String singleFizzBuzz(int num) {
        String answer = "";

        if (num % 3 == 0) {
            answer += "Fizz";
        }
        if (num % 5 == 0) {
            answer += "Buzz";
        }

        if (answer.isEmpty()) {
            answer = String.valueOf(num);
        }

        return answer;
    }
}
