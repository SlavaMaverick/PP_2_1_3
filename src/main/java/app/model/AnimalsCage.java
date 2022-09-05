package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    private Timer timer;
    @Autowired
    @Qualifier("dog")
    private Animal animal;

    public Timer getTimer(){
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");

// новый таймер, создает каждый раз новое время
//        System.out.println(new Timer().getTime());

// таймер, который показывает одинаковое время
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
