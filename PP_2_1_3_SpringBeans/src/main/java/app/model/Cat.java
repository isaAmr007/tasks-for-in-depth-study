package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String saying;

    public Cat(String saying) {
        this.saying = saying;
    }

    @Override
    void say() {
        System.out.println(saying);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
