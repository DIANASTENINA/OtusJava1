import data.CommandsData;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList

        while (true) {
            System.out.println("Введите команду add/list/exit");
            String commandStr = scanner.next().toUpperCase().trim();

            boolean isCommandExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandStr.toUpperCase(Locale.ROOT).trim())) {
                    isCommandExist = true;
                    break;
                }
            }

            if (!isCommandExist) {
                System.out.println(String.format("Вы ввели неверную команду"));
                continue;
            }

            CommandsData commandsData = CommandsData.valueOf(commandStr);

            switch (commandsData) {
                    case ADD:

                    case LIST:
                        for(Animal animal: animalList) {
                            System.out.println(animal.toString());
                        }

                    case EXIT:
                        System.exit(0);
            }

        }

    }
}