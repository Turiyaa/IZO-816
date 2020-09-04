//Calls constructor only once
public enum OnlyOne{
  ONCE(true);

  private OnlyOne(boolean b) {
    System.out.print("constructing,");
  }
}
