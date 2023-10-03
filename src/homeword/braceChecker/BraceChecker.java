package homeword.braceChecker;

public class BraceChecker {
  private String text;


  public BraceChecker(String text) {
    this.text = text;
  }

  public void check() {
    Stack stack = new Stack();
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      int pop;
      switch (c) {
        case '(', '{', '[' -> stack.push(c);
        case ')' -> {
          pop = stack.pop();
          if (pop == 0) {
            System.out.println(STR."ERROR. \{c} closed, but not opened at \{i}");
          } else if (pop != '(') {
            System.out.println(STR."ERROR. \{c} closed, but opened \{(char)pop} at \{i}");
          }
        }
        case '}' -> {
          pop = stack.pop();
          if (pop == 0) {
            System.out.println(STR."ERROR. \{c} closed, but not opened at \{i}");
          } else if (pop != '{') {
            System.out.println(STR."ERROR. \{c} closed, but opened \{(char)pop} at \{i}");
          }
        }
        case ']' -> {
          pop = stack.pop();
          if (pop == 0) {
            System.out.println(STR."ERROR. \{c} closed, but not opened at \{i}");
          } else if (pop != '[') {
            System.out.println(STR."ERROR. \{c} closed, but opened \{(char)pop} at \{i}");
          }
        }
      }
    }
  }
}
