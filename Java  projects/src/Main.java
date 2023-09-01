import java.lang.Math;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //int fac;

        //Exercise1 exe1 = new Exercise1();
         //exe1.reverse();
         //System.out.println(exe1.calcFalc2(4));
         //System.out.println(exe1.calc_avg());
         //exe1.find_common();
        //System.out.println(exe1.conc_str());
//        if (exe1.check_prime(13)) {
//            System.out.println("prime number");
//        }
//        else {
//            System.out.println("Not prime");
//        }



        //System.out.print(exe1.gcd(72,12));

        //Algorithms algo = new Algorithms();
        //System.out.println(algo.binarysearch());
        //algo.bubblesort();

//        Car c = new Car();
//        c.drive();
//        c.stop();
//
//        Cycle cy = new Cycle();
//        cy.drive();
//        cy.stop();




//    Algo1 myobj = new Algo1();
//    myobj.Largestnumber();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10);
//            System.out.println(array[i]);
//        }

//        ArrayList<Integer> newarraylist = new ArrayList<>();
//
//
//        for (int i = 0; i < 5; i++) {
//            newarraylist.add((int) (Math.random() * 10));
//        }
//
//        for (int e : newarraylist) {
//            System.out.println(e);
//            System.out.println(newarraylist.size());
//        }
//
//        Stack<Integer> newstack = new Stack<>();
//        newstack.push(3);
//        newstack.push(2);
//        System.out.println(newstack.pop());
//        System.out.println(newstack.pop());
//
//
//        Queue<Integer> newqueue = new LinkedList<>();
//        newqueue.add(10);
//        newqueue.add(20);
//
//        System.out.println(newqueue.remove());
//        System.out.println(newqueue.remove());
//
//
//        Map<String, Integer> newmap = new HashMap<>();
//        newmap.put("one", 1);
//        newmap.put("two", 2);
//
//        System.out.println(newmap.get("one"));

//            Rectangle r = new Rectangle();
//            Circle c = new Circle();
//            r.area();
//            c.area();

        Refrigerator ref = new Refrigerator();
        ref.function();
        ref.switchOn();

        Fan f = new Fan();
        f.function();
        f.switchOn();

    }

}


//Interface
class Car implements Vehicle{

    public void drive(){
        System.out.println("car driving");
    }

    public void stop(){
        System.out.println("car stopping");
    }

}


class Cycle implements Vehicle{

    public void drive(){
        System.out.println("cycle driving");
    }

    public void stop(){
        System.out.println("cycle stopping");
    }

}



//Polymorphism
class Rectangle extends Shape{
    void area(){
        System.out.println("Rectangle area");
    }

    void perimeter(){
        System.out.println("Rectangle perimeter");
    }
}

class Circle extends Shape{
    void area(){
        System.out.println("Circle area");
    }

    void perimeter(){
        System.out.println("Circle perimeter");
    }
}


class Refrigerator extends Appliance{
    public void function(){
        System.out.println("refrigerator");
    }

    public void switchOn(){
        System.out.println("refrigerator switch on");
    }
}

class Fan extends Appliance{
    public void function(){
        System.out.println("fan");
    }
}