package Exam.Q4;

public class a {
    /** binding: process pf associating a call a.m(..) to a concrete target method m
     * static binding
     * a call a.m(...) is resolved using the static type(the declared type) of a
     * binding takes place at compile time
     *
     * dynamic binding
     * a call a.m(...) is resolved using the dynamic type (the current value type) of a
     * binding takes place at run-time
     * java usus dunamic binding in all calls to non-static methods
     * the target method in a call a.m(...) is determined by the type of the object reference by a. Assume type X:
     *  if m(..) is declared in X, call X.m()
     *  If not, use m(..) in the first super class where m() is defined
     *
     *
     *  abstract class:
     *  has methods bot no object
     *  a abstract method has no implementation
     *  if a class has a abstract method, it must be declared as abstract
     *  abstract methods must be implemented by its subclasses
     *  it is not possible to create objects of abstract classes
     *
     *  interface:
     *  doesnt make any methods,
     *  a completely abstract class, just signatures, no implementation
     *  */
}
