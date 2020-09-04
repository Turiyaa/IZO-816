// What is the world is this?
public class ScaryCode {
  private int x = 10;

  class ScaryInside {
    private int x = 20;

    class ScaryDoubleInner {
      private int x = 30;

      public void allTheX(){
        System.out.println(x);                  //30
        System.out.println(this.x);             //30
        System.out.println(ScaryInside.this.x); //20
        System.out.println(ScaryCode.this.x);   //10
      }
    }
  }

  public static void main (String[] args) {
    ScaryCode sc = new ScaryCode();
    ScaryCode.ScaryInside si = sc.new ScaryInside();
    ScaryCode.ScaryInside.ScaryDoubleInner sdi = si.new ScaryDoubleInner();
    sdi.allTheX();
  }
}
