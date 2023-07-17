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

DATA TYPES
String, boolean, int, float...

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
DEFINITIONS:
Class - template for creating objects
Field - variable where the scope is the whole class

FIELD
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
    int newNumber = returnNewNumber();     this is creating an INSTANCE
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

Objects encapsulate data (through fields) and behaviour on the data (through methods) inside themselves
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
    Person p1 = new Person();             // create Person object, access Person class, assign a new person using Person(); method
    p1.setName("John");                   // setName method for p1
    System.out.println(p1.getName());     // once name is set, use getName method
}
*/


// 1.6 Abstraction
/*
Data abstraction is the process of hiding certain details and showing only essential information to the user
Can be achieved with abstract classes or interfaces

The abstract keyword is a no-access modifier

    Abstract class: restricted class that CANNOT be used to create objects
    (to access it, must be inherited from another class using extends keyword.)

    Abstract method: can only be used in an abstract class, no body.
    Body is provided by the subclass.


abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz);
    }
}

This example, we cannot create an object of the Animal class:
    Animal myObj = new Animal();  // will generate an error

    // Subclass - use extends keyword
    class Pig extends Animal {
        public void animalSound() {
        // body of animalSound() provided here
        System.out.println("Pig sound");
        }
}
*/


// 1.7 Inheritance
/*
keyword: extends

DEFINITIONS:
Subclass - a class that is derived from another class. (derived, extended or child class).
Superclass - the class in which the subclass is derived from (base, parent class).

Inheritance allows creating a child class that inherits the fields and methods of the parent class
    - Implements DRY (Dont Repeat Yourself) principle
    - Improves code re-usability.
    - Multi-level inheritance, (child class can have another child class)
    - Multiple inheritance is NOT ALLOWED in Java (a class cant extend more than one class)


EXAMPLE:

class Bird {
    public String outerCovering = "feather";
}


class Eagle extends Bird {
    public String name = "eagle";
    public int lifespan = 15;
}


So, Eagle class extends the Bird parent class. Inherits its fields and methods (outerCovering)
Eagle class only defines two fields that belong to only Eagle.


class TestEagleInheritance {
    public static void main(String[] args) {
    Eagle firstEagle = new Eagle();
    System.out.println("Name:" + firstEagle.name)
    System.out.println("Outer Covering:" + firstEagle.outerCovering)
}
 */


// 1.8 Polymorphism - in progress
/*
accepts different types of data types
 */

// 1.9 Interfaces  - in progress
/*
Another way to achieve abstraction is with interfaces.
an interface is a completely "abstract class" that is used to group related methods with empty bodies.
keyword: implements

- CANNOT be used to create objects
- Interface methods DO NOT have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default ABSTRACT and PUBLIC
- Interface attributes are by default PUBLIC, STATIC, and FINAL
- An interface cannot contain a constructor (as it cannot be used to create objects)

WHEN TO USE INTERFACES
An interface allows somebody to start from scratch to implement your interface or implement your interface in some other
 code whose original or primary purpose was quite different from your interface. To them, your interface is only
 incidental, something that have to add on to the their code to be able to use your package. The disadvantage is every
 method in the interface must be public. You might not want to expose everything.

WHEN TO USE ABSTRACT CLASSES
An abstract class in contrast, provides more structure. It usually defines some default implementations and provides
 some tools useful for a full implementation. Code using it must, however, must use your class as the base.
 Highly inconvenient for other programmers wanting to use your package have already developed their own class
 hierarchy independently. In Java, a class can inherit from only ONE base class.

WHEN TO USE BOTH
Implementors can ignore your abstract class if they choose.
Drawback - calling methods via their interface name is slightly slower than calling them via their abstract class name.


 */

// Notes
/*
'' for characters
"" for strings
default integer type is int. To represent a long value, add L as a postfix (after)
default floating-point type is double. To represent as a float, append F as a postfix.
 */

