package car;

import lombok.*;

public class car {
    public int id;
    public String model;
    public Engin engin;

    public car() {
    }

    //    exposotion
//    public car(int id, String model, Engin engin) {
//        this.id = id;
//        this.model = model;
//        this.engin = engin;
//    }

    //    agregation

    public car(int id, String model, double volume, String Model) {
        this.id = id;
        this.model = model;
        this.engin = new Engin(volume,Model);
    }

    //delegation
    public void Start() {
        this.engin.Start();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engin=" + engin +
                '}';
    }
}

