package java_syntaxand_style.errors.exl_runtime_errors;

public class RunTimeErrorExample {

  public static int exampleVariableOne = 5;
  public static int exampleVariableTwo = exampleVariableOne/0;

  public static void main(String[] args) {
    // this creates an error because numbers cannot be divided by zero
    System.out.println(exampleVariableTwo);
  }
}