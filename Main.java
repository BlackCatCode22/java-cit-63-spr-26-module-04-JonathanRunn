import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Data Structures
        ArrayList<Animal> zooList = new ArrayList<>();
        HashMap<String, Integer> speciesCount = new HashMap<>();

        // 1. Processing the arrivingAnimals.txt file
        try (Scanner scanner = new Scanner(new File("arrivingAnimals.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Simple parsing logic: "4 year old female hyena..."
                String[] parts = line.split(" ");

                int age = Integer.parseInt(parts[0]); // Gets the "4"
                String species = parts[4].replace(",", ""); // Gets the "hyena"

                // Create animal based on species (Polymorphism)
                Animal newAnimal;
                if (species.equalsIgnoreCase("hyena")) {
                    newAnimal = new Hyena("Placeholder Name", age);
                } else if (species.equalsIgnoreCase("lion")) {
                    newAnimal = new Lion("Placeholder Name", age);
                } else {
                    newAnimal = new Animal("Placeholder Name", age, species);
                }

                zooList.add(newAnimal);

                // Update the HashMap count
                speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Ensure arrivingAnimals.txt is in the root folder.");
        }

        // 2. Generating the Report
        try (PrintWriter writer = new PrintWriter(new File("newAnimals.txt"))) {
            writer.println("Zoo Population Report");
            writer.println("----------------------");

            for (Animal a : zooList) {
                writer.println(a.getSpecies() + ": " + a.getName() + ", " + a.getAge() + " years old.");
            }

            writer.println("\nTotal Counts:");
            for (String key : speciesCount.keySet()) {
                writer.println(key + ": " + speciesCount.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        System.out.println("Report generated in newAnimals.txt!");
    }
}