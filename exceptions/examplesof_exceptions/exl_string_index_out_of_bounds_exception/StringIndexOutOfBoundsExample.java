package exceptions.examplesof_exceptions.exl_string_index_out_of_bounds_exception;

public class StringIndexOutOfBoundsExample {

  public static String exampleVariableOne = "Hello World!";

  public static void main(String[] args) {
    try {
      // StringIndexOutOfBoundsException will be thrown because
      // exampleVariableOne only has a length of 12
      exampleVariableOne.charAt(13);
      System.out.println("String Index is valid");
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("String Index is out of bounds");
    }
  }
}