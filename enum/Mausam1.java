// This is when we don't want every enum value to have method

public enum Mausam1 {
  WINTER {
    public String getHours() {return "10am - 3pm";}
  },
  SUMMER {
    public String getHours() {return "9am - 7pm";}
  },
  SPRING, FALL;
    public String getHours() {return "9am - 6pm";}
}
