package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    private String saying;

    public Dog(String saying) {
        this.saying = saying;
    }

    @Override
    void say() {
        System.out.println(saying);
    }
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
