package abstrakt_logik;

public class Animal {
    private boolean brain;

    public Animal() {
    }

    public Animal(boolean brain) {
        this.brain = brain;
    }

    public void setBrain(boolean brain) {
        this.brain = brain;
    }

    public boolean getBrain() {
        return this.brain;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "brain=" + brain +
                '}';
    }
}