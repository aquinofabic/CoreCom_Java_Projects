// 1.1 Basics
/*
BASIC SYNTAX
Java is case sensitive.
All class names MUST have an UpperCase, including all words within a class.
All method names SHOULD start with a lowercase.
Program File Name should exactly match the class name

JAVA IDENTIFIERS
all components require names, classes, variables, methods,... called identifiers
Should begin with a letter, currency character $, or _

JAVA MODIFIERS
Access Modifiers - default, public, protected, private
Non-access Modifiers - final, abstract, strictfp

JAVA ENUMS
Name for values in an enumerated list.
Enums restrict a variable to have one of only a few predefined values.

INHERITANCE (keyword - extends)
Method to create a hierarchy between classes by inheriting from other classes
**Classes are able to inherit attributes and methods from other classes using 'extends' keyword

superclass (parent) - class being inherited from
subclass (child) - class that inherits from another class

 */

// 1.2 Java Modifiers
/*
VARIABLE ACCESS MODIFIERS
These specify accessibility or 'scope' of a field, method, constructor, or class

public - can be accessed by any other code
private - can only be accessed by other methods in the class
protected - can be accessed by the class, others in the same package, subclasses in another package
(blank) - package private, can only be accessed by methods in the class and classes in the package



VARIABLE NON ACCESS MODIFIERS

final - cant be overridden or changed; its 'immutable'
static - belongs to the class rather than any instances of the class in the form of an object
abstract - used in abstract classes, no body is defined, a subclass defines the implementation/body

transient - stops the value from being serialised.
synchronized - makes the method thread safe (can also be applied to blocks of code)
default - used in interfaces to provide default behaviour for implementing classes
 */

// 1.3 Classes and Objects
/*
Class - template for creating objects

    FIELD - variable where the scope is the whole class
public class Person { - we have a concept of a person
    private String name; - it has a name

        CONSTRUCTOR
    public Person (String name) { - when we create one we have to supply a name
        this.name - name;
    }
        METHOD
    public String getName() { - we can then as the person what it's name is
        return name;
    }
}
 */

public class FirstClass {  // class

    public static void main(String[] args){  // -method signature
        System.out.println("Hello World!");  // statement  -method body
    }  // end of method

    public class DeclaringVariables{
        public static void main(String[] args){
            // byte = 30;
            long viewsCount = 3_123_456L;
            float price = 10.99F;
            char letter = 'A';
            boolean isEligible = true;
            // terminate statements with semicolons
        }
    }
}  // end of class

// Code Structure
/*
READING CODE:
method signature
    public static void main(String[] args){
        Declare a method called main, which is public, static and returns nothing (void)
        and accepts (parameters) strings of arguments.
method body
        Declare a variable that is a List of <Integer> that is assigned the value = ...
        The method is, ..., we test,..., two/three clause for loop,...

public - access modifier
static - non access modifier
void - return type (returns nothing)
main - method name
(String[] args) - parameters

We can call a method using its name
    methodName()

if it has a return type, we can use a method to assign to a variable.
    int newNumber = returnNewNumber();
 */


// 1.4 Declaring Variables
/*
Primitive: storing simple values like numbers, strings, booleans.
Reference Types: storing complex objects like email messages
    dont actually store objects in memory, they store reference (or address of) an object in memory
    to use ref types, we need to allocate memory using the 'new' operator.
    Date now = new Date();
 */


// 1.5 Encapsulation
/*

Objects "encapsulates data (through fields) and behaviour on the data (through methods) inside themselves
These can then be passed as a single unit. Should be a boundary, no worry about how it works internally, we can just use it
The "interface" of each object is its public members (Methods, Fields, Constructors).
Chosen such that:
    - Irrelevant details are hidden from consumers
    - Invariants are preserved
    - Easy to use the class correctly
    - Class can be developed further without wide-ranging consequences
In particular, fields should be PRIVATE, accessed through accessor methods.



METHOD
1. Declare class variables/attributes as 'private'
2. Provide public get and set methods to access and update value of private variable

GET AND SET
Note: private variables can only be accessed within the same class.
    Only possible to access if we provide public get and set methods.

    set method takes a new parameter (newName) and assigns it to the name variable.
    this keyword is used to refer to the current object.

    get method returns the value of the variable name

Note: name is declared private, we cannot access it from outside this class 

Once the getter and setter have been defined, we can use it in our main file.

E.g:
// Constructor
public class Person {
    private String name;     // private = restricted access

    // Setter
    public void String setName(String newName) {
        this.name = newName;
    }
    
    // Getter
    public String getName() {
        return name;
    }
}

NOTE: If you try to return a value from a method that is declared void, you will get a compiler error.
    Any method that is not declared void must contain a return statement with a corresponding return value, like this: return returnValue;
    

In main file:

public static void main(String[] args) {
    Person p1 = new Person();             // access Person class, assign a new person using Person(); method
    p1.setName("John");                   // setName method for p1
    System.out.println(p1.getName());     // once name is set, use getName method
}
*/

// 1.6 Constructors
/*
Add info here
*/

// Notes
/*
'' for characters
"" for strings
default integer type is int. To represent a long value, add L as a postfix (after)
default floating-point type is double. To represent as a float, append F as a postfix.
 */

