// Fina static variable need to be initialized when declared or using
// static initializers
public class Panda {
  final static String name = "Ronda";
  static final int bamboo;
  static final double height; // Doesn't compile
  static { bamboo = 5; }
}
