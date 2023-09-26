abstract class UniversityMember implements Person{

    abstract int getID();
    protected String name;
    protected int age;
    protected String address;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }
}
