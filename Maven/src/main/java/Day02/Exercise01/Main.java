package Day02.Exercise01;

public class Main {
    public static void main(String[] args) {

        ShelterWorker shelterWorker = new ShelterWorker("Jan","Kowalski",1);

        Animal animal1 = new Animal(1,"Max",3,"Jamnik");
        Animal animal2 = new Animal(2,"Burek",9,"Kundel");
        Animal animal3 = new Animal(3,"Edek",5,"Beagle");

        shelterWorker.addAnimal(animal1);
        shelterWorker.addAnimal(animal2);
        shelterWorker.addAnimal(animal3);


        for (Animal animal : shelterWorker.getAnimals()) {
            System.out.println(animal);
        }
    }
}
