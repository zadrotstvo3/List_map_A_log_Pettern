package car;

public class Engin {
    public double volume;
    public String engineModel;

    public Engin() {
    }

    public Engin(double por, String engineModel) {
        this.volume = por;
        this.engineModel = engineModel;
    }

    public void Start(){
        this.volume = volume +1;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public String toString() {
        return "Engin{" +
                "volume=" + volume +
                ", engineModel='" + engineModel + '\'' +
                '}';
    }
}
