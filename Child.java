// since 'Child' class extends from 'Parent' class ...
// 'Child' class inherits 'name' variable & 'greeting()' method from 'Parent' class
public class Child extends Parent {
    // declare int variable 'age'
    int age;

    // @Override -- overriding method -- method signature is exactly SAME 
    public void greeting(){
        System.out.println("Hello my name is " + name + " and I am " + age + " years old");
    }
}

// Notes: 

// Method overloading is methods w/ same name but different method signature ...
// ... either by number of parameters, type of parameters, or even combination
// Can't override static methods otherwise it becomes hidden
