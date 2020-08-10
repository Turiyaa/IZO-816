
//Final instance variable must be assigned a value when it is declered or
// whe the object is instantiated
public class PolarBear {

  final int age = 10;
  final int fishEaten;
  final String name;

  // Instance initializer
  { fishEaten = 10; }

  public PolarBear() {
    //This will be call when object is instantiated
    name = "EggHead";
  }

  // This class the non argument constructor where name variable is initialized
  public PolarBear(int height) {
    this();

  }
}
