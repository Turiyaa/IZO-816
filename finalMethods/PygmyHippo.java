public class PygmyHippo extends Hippo {
  void chew() {}; // Does not compile, final method cannot be overridden by a subclass
}
