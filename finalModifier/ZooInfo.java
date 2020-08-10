//1.Final variables cannot be changed after it is assigned
//2.Final method cannot be overridden
//3.Final class cannot be extended
//4.Optional to assigna a value when final variable is declared,
//5.The rule is only that final variable must be assigned before it can be used

public class ZooInfo {
  public void printZooInfo(boolean isWeekend){
    final int giraffe = 5;
    final long lemur;

    if(isWeekend) lemur = 5;
    else lemur = 10;
    System.out.println(giraffe+" "+lemur);
  }

  private void printZooInfo1(boolean isWeekend) {
    final int giraffe = 5;
    final long lemur;

    if(isWeekend) lemur = 5;
    giraffe = 3;           // Doesn't compile 1

    // Doesn't compile 1 and lemur will not be assigned if isWeekend is false
    System.out.println(giraffe + " "+ lemur);
  }
}
