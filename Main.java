public class Main {
    // standard static main() method w/ return type void (no returns)
    // main() method is the brain of the program
    public static void main(String[] args){
        // create a 'Parent' obj & assign to 'p'
        Parent p = new Parent();
        // set 'name' of 'Parent' obj 'p'
        p.name = "King";
        // call 'greeting()' method from 'Parent' obj
        p.greeting();

        // create a 'Child' obj & assign to 'c'
        Child c = new Child();
        //set 'name' of 'Child' obj
        c.name = "Arthur";
        // set 'age' of 'Child' obj
        c.age = 44;
        // call 'greeting()' method from 'Child' obj
        c.greeting();
    }
}
