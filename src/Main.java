import polymorphism.Animal;
import polymorphism.Calc;
import polymorphism.Cat;
import polymorphism.Dog;
import statik.College;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello bharath");
//        Bank b1 = new Bank();
//        b1.setBalance(1000);
//        System.out.println("bank balance: "+ b1.getBalance());
//        Vahicle v1 = new Car();
//        v1.start();
//        Calc c = new Calc();
//        int result = c.add(1,9, 10);
//        double result1 = c.add(9.0,91.5);
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println("sbk");
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//        dog.sound();
//        cat.sound();
//        College c1 = new College();
//        College c2 = new College();
//        c1.student_name = "bharath";
//        c2.student_name = "virat kohli";
//        c1.show();
//        c2.show();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.increment();
        c1.increment();
        c2.increment();
    }
}