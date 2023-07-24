// Firstly Functional Interface

@FunctionalInterface
interface Fiable 
{
    void func1(int i); // We can only use 1 method in @FunctionalInterface
    // void func2();
}


public class App {
    public static void main(String[] args) {
        // Fiable f1 = new Fiable() {
        //     public void func1(int a){
        //         System.out.println("in func 1");
        //     }
        // };

        //We already know we should use public void func1
        // Implement this with lambda expression

        Fiable f2 = (int a) -> { 
            System.out.println("in func 1");
            // multiple lines
        };

        f2.func1(5);

         Fiable f3 = (int a) -> System.out.println("in func 1"); // one line
         f3.func1(8);

    }
}
