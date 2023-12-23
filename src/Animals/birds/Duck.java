package Animals.birds;
import data.ColorData;
import Animals.Animal;

public class Duck extends Animal implements IFLY {

    public Duck(int age, String name, int weight, ColorData colorData) {
        super(age, name, weight, colorData);
    }

    public void fly() {
        System.out.println("Я лечу");
    }
}