package inter;

public class main {
    public static void main(String[] args) {
        cat cat = new cat();
        dog dog = new dog();
        horse horse = new horse();

        horse.speak();
        cat.speak();
        dog.speak();

        horse.pojrat();
        cat.pojrat();
        dog.pojrat();
        dog.Skay();
        System.out.println(Animal.a);
        // constant Animal.a = 77;
        Animal CatAnimal = new cat();
        Animal DogAnimal = new dog();
        CatAnimal.speak();
        DogAnimal.speak();
        enot enot = new enot();
        enot.lalka();
        enot.rorr();
        enot.speak();
        enot.pojrat();
    }
}
