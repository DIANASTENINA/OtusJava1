package Animals.pets;
import data.ColorData;
import Animals.Animal;

public class Dog  extends Animal {

        public Dog (int age, String name,int weight, ColorData colorData) {
            super(age, name, weight, colorData);
        }


        public void say() {
            System.out.println("Гав");
        }
}
