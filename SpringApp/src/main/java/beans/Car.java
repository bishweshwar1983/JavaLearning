package beans;

public class Car {
    private Person p1;
    private String carColour;

    public Car(){
        this.carColour = "no colour";
            }

    public void setPerson(Person p1) {
        this.p1 = p1;
    }

    public Person getPerson(){
        return p1;
    }

    public void setCarColour(String carColour){
        this.carColour = carColour;
    }

    @Override
    public String toString() {
        return getPerson().getName() + "    " +carColour;
    }
}
