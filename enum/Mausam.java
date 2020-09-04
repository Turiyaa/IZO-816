// Bettern than creating instance variables to hold values,
// Enum handle this in better way

public enum Mausam {
  WINTER{
    public String getHours(){ return "10am-3pm";}

  },
  SPRING{
    public String getHours(){ return "9am-5pm";}

  },
  SUMMER{
    public String getHours(){ return "9am-8pm";}

  },
  FALL{
    public String getHours(){ return "9am-6pm";}

  };

  // Enum abstract method, Each and every enum value is required
  // to implement this method || compiler error
  public abstract String getHours();
}
