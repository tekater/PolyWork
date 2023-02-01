import hierarchy.BaseClass;
import hierarchy.DerivedClass;

public class Main {
    public static void main(String[] args) {
        BaseClass derived = new DerivedClass(); //BaseClass base = new BaseClass();
        derived.print();
    }
}