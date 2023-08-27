package Exercise01;

import java.util.ArrayList;
import java.util.List;

public class ShelterWorker {
    private String name;
    private String surname;
    private int id;
    private List<Animal> animals;

    public ShelterWorker(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animal.setShelterWorker(this);
    }

    @Override
    public String toString() {
        return "ShelterWorker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
