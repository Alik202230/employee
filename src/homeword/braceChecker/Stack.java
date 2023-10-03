package homeword.braceChecker;

public class Stack {

  private int[] array = new int[5];
  private int index;

  Stack() {
    index -= 1;
  }

  public void push(int element) {
    if (index == 4) {
      System.out.println("Stack is full");
    } else {
      array[++index] = element;
    }
  }

  public int pop() {
    if (index < 0) {
      return 0;
    } else {
      return array[index--];
    }
  }

}
