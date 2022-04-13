package Unit4.day8.q1;

class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Barking...");
    }
}
class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meaw...");
    }
}
class Tiger extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Raoring...");
    }
}
class Main{
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Tiger();

        System.out.println("Calling Dog");
        animals[0].eat();
        animals[0].walk();
        animals[0].makeNoise();

        System.out.println("Calling Cat");
        animals[1].eat();
        animals[1].walk();
        animals[1].makeNoise();

        System.out.println("Calling Tiger");
        animals[2].eat();
        animals[2].walk();
        animals[2].makeNoise();

    }
}