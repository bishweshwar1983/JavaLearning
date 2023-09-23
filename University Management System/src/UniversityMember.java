abstract class UniversityMember implements Person{

    abstract int getID();
    String name;
    int age;
    String address;

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
