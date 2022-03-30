# Object-Oriented Programming(OOP - Java): Classes & Objects

## Classes 
Classes are blueprints of objects. They are used to defining our
objects, the information they hold and what they can do and how 
they do them.

## Instance variables & methods
Instance variables contains information about an instance of a class.

Methods are functions which helps us to interact with the variables of the 
class and defines what our class can do and how to do them.


## Constructors
Constructors are special methods that helps us to create an instance or objects
of our class. They have no return type. They take the number of instance variables 
of the class as parameters. This means that a constructor may or may not have parameters
depending on the class instance variables.

## Getters
These are methods that helps us to get the value of the class's variables.
It is important to note that the return type of getter method is the type of the 
variable that the method is getting. Getter methods do not accept any parameter.


## Setters
Setter methods helps us to change the value of the variables of our class.
It is a good programming practice to create a setter method for each variable.
The return type of setter methods is void because we are only interested in performing
a change on the variable's value.

### NB:
* toString is a method used to print the objects of a class the way we want them.
It gives a string representation of our object.


## Instance Methods
As we discussed earlier, these are methods in the class that helps us define what the object 
will be doing and how they will be doing that.


## Class Variables or static field
These are variables that represent class-wide information. They are declared using the keyword
static.

## Class methods
These are methods of the class that we can call with or without an object or instance of the class.



# Modifiers
Modifier in Java are divided into two: Access and non-access modifiers
The access modifiers controls the access level while non-access modifiers do not
control access level but provides other functionality.
Access modifier: Public & Default (used to define the access classes)

Public is an access modifier that is used to set the access level for classes, attributes, 
methods and constructors. Classes, methods and attributes declared with this access 
modifier can be accessed by any other classes.

Default is another access modifier which when used to declare a class, only classes within
the same package can access it.

The access modifiers for declaring attributes are public(accessible by all classes), private
(accessible only in the it is created), default(accessible in the same package) and protected
(accessible in the same package and subclasses).


Non-access modifiers: Abstract & final

Abstract is a non-access modifier used to declare classes and attributes. Classes declared
with this modifier cannot be used to create object. Hence, to access it, it must be inherited in 
another class.

final is another non-access modifier used to declare classes and attributes. Classes declared with
this modifier cannot be inherited by another class.

The non-access modifiers for attributes and methods are final(cannot be overridden or modified),
static(attribute/methods belongs to the class instead of object), abstract
(can only be used abstract class and can only be used on methods. The body of an abstract method
is provided by the subclass/class that inherits it), transient, synchronized, and volatile.

# The Principles of Object-Oriented Programming(OOP)

The four principles of object-oriented programming are
1. Encapsulation
2. Abstraction
3. Inheritance
4. Polymorphism

## 1. Encapsulation
The encapsulation principle involves hiding sensitive data from users.
This is achieved by 
* declaring class variables or attributes as private
* provide public get and set methods to access and update 
the value of the private variables

## 2. Inheritance
The inheritance principle gives the ability to inherit attributes and methods from one
class to another. The class that inherits another class is referred to as subclass(child)
while the class that is inherited from is known as Superclass(parent). To inherit a class
in Java, we use the "extends" keyword

## 3. Polymorphism
The polymorphism principle occurs when we have many classes related to each other through
inheritance.

## 4. Abstraction
The abstraction principle involves the process of hiding certain details or data from the user.
This can be achieved with either abstract class or interfaces.


# Interface
It is a completely abstract class, where all the methods do not have implementation. To acces the 
interface methods, the interface must be implemented by another class with the "implements"
keyword, which is like inherited. The body of the interface method is provided by the class that
implements it.



