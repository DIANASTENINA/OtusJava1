package Animals.pets;
import data.ColorData;
import Animals.Animal;

public class Cat extends Animal {
    public Cat (int age, String name,int weight, ColorData colorData) {
        super(age, name, weight, colorData);
    }

    public void say() {
        System.out.println( "Мяу");

    }
}
