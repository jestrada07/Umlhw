Chapter7: A subclass extends a superclass. 
A subclass Inherits all public Instance
variables and methods of the superclass, but
does not Inherit the private Instance variables
and methods of the superclass,
Inherited methods can be overridden; instance
vartables cannot beoverridden. Use the IS-A test to verify that your
inheritance hierarchy is valid. If X extends Y,
then X IS-A Y must make sense. 

Chapter 8: When you don’t want a class to be instantiated (in other words, you don’t want anyone to make a new object of that class type) mark the class with   the abstract keyword. A class that is abstract can have both abstract and concrete methods. Abstract methods have no body. All abstract methods must be implemented in the first concrete subclass in the inheritance tree.
Methods can be declared with Object arguments and/or return types.
An interface is like a 100% pure abstract class. It defines only abstract methods.

Chapter 9:
Instance variables live within the object they belong to, on the heap.
If the instance variable is a reference to an object, both the reference and the object it refers to are on the Heap. Overloaded constructors means you have more than one constructor in your class. If you don't put a constructor in your class, the compiler will put In a default consnuctor.

Chapter 10: 
The keyword static lets
a method run without any instance o/the class. A static method means
behavior not dependent on an instance variable, so no instance/object
is required.Just the class. Static variables in a class are initialized before any object of that class can be created.
Static variables in a class are initialized before any static method
of the class runs. A static method cannot access a non-static method,
since non-static methods are usually associated with
instance variable state. Assigning a value to a final Instance variable must be
either at the time It is declared, or in the constructor.A final class cannot be extended (subclassed).























