package abstrakt_logik;

public class dird extends Animal {
    private String type;
    public dird(){

    }
    public dird(String type){
        this.type = type;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "dird{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
