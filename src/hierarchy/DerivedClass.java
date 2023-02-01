package hierarchy;

public class DerivedClass extends BaseClass{
    @Override
    public void print() {
        System.out.println("The first one is " + "\"Derived Class\".");
        System.out.print("The second one is "); super.print();
    }
}
