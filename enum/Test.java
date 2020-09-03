public class Test{
  public static void main( String [] args){
    Season s = Season.SUMMER;

    System.out.println(Season.SUMMER); // prints SUMMER
    System.out.println(s == Season.SUMMER); // prints true

    // Enum values() method
    // Best practice is to stick with human readable enum value
    // Orinal int value is based on declaration order
    // int and enum can't be compared directly since enum is a type not a primitive
    for(Season season: Season.values()) {
      System.out.println(season.name() + " " + season.ordinal());
    }
    // Retrieving enum value froma String using valueOf(), Handy for working with legacy code
    Season v = Season.valueOf("SUMMER");
    System.out.println(v.name() + " " + v.ordinal());

    // passed string value must exactly match the enum value
    //Season e = Season.valueOf("summer");
    //System.out.println(e.name() + " " + e.ordinal());

    //
    Week w = Week.FRIDAY;
    System.out.println(w.name());
    w.printExpectedVisitors();
  }
}
