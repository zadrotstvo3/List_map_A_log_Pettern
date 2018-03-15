package abstrakt_logik;

public class horse extends Animal {
    private int spead;

    public horse(){

    }
    public horse(int spead){
        this.spead = spead;
    }

    public int getSpead() {
        return spead;
    }

    public void setSpead(int spead) {
        this.spead = spead;
    }

    @Override
    public String toString() {
        return "horse{" +
                "spead=" + spead +
                "} " + super.toString();
    }
}
