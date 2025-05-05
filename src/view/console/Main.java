package view.console;

import java.util.Scanner;

import exceptions.BadDateFormatException;
import exceptions.BadLengthException;
import exceptions.NotNumericException;
import model.validations.UserDataValidations;

/**
 *
 * @author marcespmor
 */
public class Main {
  private static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    sc.useDelimiter("\n");

    String option = "";


    System.out.println("Tester funciones UserDataValidations: ");
    System.out.println("1. testCheckId");
    System.out.println("2. testCheckFormatDate");
    System.out.println("3. testCalculateAgo");
    System.out.println("4. testCheckPostalCode");
    System.out.println("5. testIsNumeric");
    System.out.println("6. testIsAlphabetic");
    System.out.println("7. testCheckEmail");
    System.out.println("8. testCheckName");
    System.out.println("9. salir");

    System.out.print("Opcion: ");
    option = sc.nextLine();

    switch(option) {
      case "1":
        testCheckId();
        break;
      case "2":
        testCheckFormatDate();
        break;
      case "3":
        testCalculateAgo();
        break;
      case "4":
        testCheckPostalCode();
        break;
      case "5":
        testIsNumeric();
        break;
      case "6":
        testIsAlphabetic();
        break;
      case "7":
        testCheckEmail();
        break;
      case "8":
        testCheckName();
        break;
      case "9":
        System.out.println("Bye!");
        break;
      default:
        System.out.println("Incorrect Option");
        break;
    }

  }

  private static void testCheckId() {
    System.out.print("Enter your id: ");
    String nif = sc.next();
    boolean nifOk = UserDataValidations.checkId(1, nif);
    System.out.println(nifOk ? "The id is correct" : "Wrong id");
  }

  public static void testCheckFormatDate() {
    System.out.print("Date: ");
    System.out.println(UserDataValidations.checkFormatDate(sc.nextLine()));
  }
  public static void testCalculateAgo() {
    System.out.print("Birth date: ");
    try {
      int age = UserDataValidations.calculateAge(sc.nextLine());
      System.out.println(age);
    } catch (BadDateFormatException e) {
      System.out.println(e.getMessage());
    }
  }
  public static void testCheckPostalCode() {
    System.out.print("Postal Code: ");
    boolean checked;
    try {
      checked = UserDataValidations.checkPostalCode(sc.nextLine());
      System.out.println(checked);
    } catch (BadLengthException | NotNumericException e) {
      System.out.println(e.getMessage());
    }
  }
  public static void testIsNumeric() {
    System.out.print("Number: ");
    System.out.println(UserDataValidations.isNumeric(sc.nextLine()));
  }
  public static void testIsAlphabetic() {
    System.out.print("String to check: ");
    System.out.println(UserDataValidations.isAlphabetic(sc.nextLine()));
  }
  public static void testCheckEmail() {
    System.out.print("Email to check: ");
    System.out.println(UserDataValidations.checkEmail(sc.nextLine()));
  }
  public static void testCheckName() {
    System.out.print("Name: ");
    System.out.println(UserDataValidations.checkName(sc.nextLine()));
  }
}
