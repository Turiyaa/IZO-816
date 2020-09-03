public enum Week {
  SUNDAY("High"), MONDAY("Low"), TUESDAY("Low"), WEDNESDAY("Low"), THURSDAY("Low"), FRIDAY("Medium"), SATURDAY("High");

  //Since enum values are shared by all processes in the JVM, it would be problematic if one of them could change the value inside an enum.
  private final String expectedVisitors;
  private Week(String expectedVisitors){
    this.expectedVisitors = expectedVisitors;
  }

  public void printExpectedVisitors(){
    System.out.println(expectedVisitors);
  }
}
