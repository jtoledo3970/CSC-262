public class EvenNumberTest {
  public static void main(String[] args) {
    EvenNumber test = new EvenNumber(16);
    System.out.println("The current number is " + test.getValue());
    System.out.println("The next even number is " + test.getNext());
    System.out.println("The previous even number is " + test.getPrevious());
  }
}

class EvenNumber {
  private int objectValue;
  public EvenNumber () {
    this.objectValue = 0;
  }
  public EvenNumber(int value) {
    this.objectValue = value;
  }
  public int getValue() {
    return objectValue;
  }
  public int getNext() {
    int test = objectValue+1;
    for (int i = 0; i <= 2; i++) {
      if (test % 2 != 0) {
        test++;
      } else if (test % 2 == 0) {
        return test;
      }
    }
    return 0;
  }
  public int getPrevious() {
    int test = objectValue-1;
    for (int i = 0; i <= 2; i++) {
      if (test % 2 != 0) {
        test--;
      } else if (test % 2 == 0) {
        return test;
      }
    }
    return 0;
  }
}
