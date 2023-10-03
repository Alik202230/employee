package homeword.braceChecker;

public class BraceCheckerTest {
  public static void main(String[] args) {
    String text = "JDK 21 has been (released} on September 19";

    BraceChecker braceChecker = new BraceChecker(text);
    braceChecker.check();
  }
}
