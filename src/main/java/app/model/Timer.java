package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    Timer() {
        System.out.println("создан Timer");
    }

    public Timer getTimer() {
        return this;
    }


    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
