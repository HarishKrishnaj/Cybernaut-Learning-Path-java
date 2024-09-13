interface A {
    void displayA();
}
interface B {
    void displayB();
}
class C implements A, B {
    @Override
    public void displayA() {
        System.out.println("Class A");
    }
    @Override
    public void displayB() {
        System.out.println("Class B");
    }
    void displayC() {
        System.out.println("Class C");
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();  
        obj.displayB();  
        
        obj.displayC(); 
    }
}
