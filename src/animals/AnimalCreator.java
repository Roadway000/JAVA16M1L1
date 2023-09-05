package animals;

public class AnimalCreator {
    public static void main(String[] args) {
        Dog barsik = new Dog();
        Dog bobik = new Dog();
        Cat murka = new Cat();
        barsik.name="Barsik";
        bobik.name="Bobik";
        murka.name="Murka";
        barsik.Bark();
        bobik.Bark();
        murka.Mew();
    }
}
