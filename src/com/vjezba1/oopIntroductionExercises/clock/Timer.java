package com.vjezba1.oopIntroductionExercises.clock;
/*
   Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
 */

public class Timer {
    private ClockHand hundredOfSecond;
    private  ClockHand seconds;

    public Timer() {
        this.hundredOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(1000);
    }

    public void advance() {
        this.hundredOfSecond.advance();

        if (this.hundredOfSecond.value() == 0) {
            seconds.advance();
        }

    }

    public String toString() {
        return seconds + ":" + hundredOfSecond ;
    }
}
