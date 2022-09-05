package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "I am a Dog";
    }

    public Dog() {
        System.out.println("Бин Dog добавлен в контекст Spring");
    }
}
