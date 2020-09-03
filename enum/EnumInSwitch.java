public class EnumInSwitch{
public static void main(String [] args){

  //Compiler knows pissible matches can be enum values only.
  //case Season.WINTER: will not compile
  Season summer = Season.SUMMER;
  switch(summer){
    case WINTER:
      System.out.println("Get out the sled!");
      break;

    case SUMMER:
      System.out.println("Time for the pool!");
      break;

    default:
      System.out.println("Is it summer yet?");
  }

  Season s = Season.valueOf("SUMMER");

  switch(s.ordinal()){
    case 2:
      System.out.println("Summer");
      break;

    default:
      System.out.println("Quack Quack");
  }
}
}
