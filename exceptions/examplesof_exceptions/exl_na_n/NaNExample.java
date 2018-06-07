package exceptions.examplesof_exceptions.exl_na_n;

public class NaNExample {

  public static double exampleVariableOne = -3;

  public static void main(String[] args) {
    // this will print NaN because square root of -3 is an imaginary number
    System.out.println(Math.sqrt(-3));
  }
}