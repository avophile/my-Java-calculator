public class Calculator {
  
  public Calculator() {
    // constructor
  }
  
  public int add(int a, int b) {
    int k = a + b;
    return k;
  }
  
  public int subtract(int a, int b) {
    int j = a - b;
    return j;
  }
  
  public int multiply(int a, int b) {
    int i = a * b;
    return i;
  }  
  
  public int divide(int a, int b) {
    int h = a / b;
    return h;
  } 
  
  public int modulo(int a, int b) {
    int g = a % b;
    return g;
  }   
public static void main(String[] args) {
  // creates a new Calculator object
    Calculator myCalculator = new Calculator(); 
    
    System.out.println(myCalculator.add(5,7));

    System.out.println(myCalculator.subtract(45,11));
  }
  
}
