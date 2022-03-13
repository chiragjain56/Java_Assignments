package day7.q1;

abstract class Bird{
    public abstract void fly();

    public void sing(){}
}

class Parrot extends Bird{

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }

    @Override
    public void sing(){
        System.out.println("I am Singing");
    }
}
public class Main{
    public static void main(String[] args) {
        Bird b1 = new Parrot();
        b1.fly();
        b1.sing();
    }
}

