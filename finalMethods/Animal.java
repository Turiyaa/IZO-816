/*
Methods marked final cannot be overridden by a subclass. This essentially prevents any polymorphic behavior on the method call and ensures that a specific version of the method is always called.
An abstract method is one that does not define a method body and can appear only inside an abstract class or interface. A final method is one that cannot be overridden by a subclass.
Selikoff, Scott. OCP Oracle Certified Professional Java SE 11 Programmer II Study Guide (pp. 77-78). Wiley. Kindle Edition.
*/
public abstract class Animal {
  abstract void chew();
}
