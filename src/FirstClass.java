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


// DECLARING VARIABLES
/*
Primitive: storing simple values like numbers, strings, booleans.
Reference Types: storing complex objects like email messages
    dont actually store objects in memory, they store reference (or address of) an object in memory
    to use ref types, we need to allocate memory using the 'new' operator.
    Date now = new Date();
 */


// Notes
/*
'' for characters
"" for strings
default integer type is int. To represent a long value, add L as a postfix (after)
default floating-point type is double. To represent as a float, append F as a postfix.
 */