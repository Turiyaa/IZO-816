public class PrintTheOne {
  public static void main (String[] args){
    System.out.print("begin,");

    //If the OnlyOne enum was used earlier, and therefore initialized sooner,
    //then the line that declares the firstCall variable would not print anything.

    OnlyOne firstClass = OnlyOne.ONCE; // Prints construction,

    OnlyOne secondCall = OnlyOne.ONCE; // Doesn't print anyting

    System.out.println("end");

    Mausam1 m1 = Mausam1.WINTER;
    System.out.println(m1.getHours());
  }
}
