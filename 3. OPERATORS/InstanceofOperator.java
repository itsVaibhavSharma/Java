class Animal {}
class Dog extends Animal {}

public class InstanceofOperator {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println("a instanceof Dog: " + (a instanceof Dog));
        System.out.println("a instanceof Animal: " + (a instanceof Animal));
    }
}