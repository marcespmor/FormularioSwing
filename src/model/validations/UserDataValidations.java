package model.validations;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import exceptions.BadDateFormatException;
import exceptions.BadLengthException;
import exceptions.NotNumericException;

/**
 *
 * @author marcespmor
 */
public class UserDataValidations {
  // NIF
  private static String[] abc = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
  
  /**
   * Check ID
   * @param typeDoc
   * @param id
   * @return true or false
   */
  public static boolean checkId(int typeDoc, String id) {
    if(typeDoc==1 && id.length()!=9) return false;
    switch (typeDoc) {
        case 1:
          int r = Integer.parseInt(id.substring(0, id.length()-1))%23-1;
          if(abc[r].equals(id.substring(id.length()-1, id.length()).toUpperCase())) return true;
          break;
        default:
          break;
      }
      return false;
  }

  /**
   * Check Format Date
   * @param date
   * @return true or false
   */
  public static boolean checkFormatDate(String date) {
    return date.split("/").length==3 && date.length()==10;
    /* String[] splitedDate = date.split("/");
    if (splitedDate.length!=3 || date.length()!=10) return false;
    return true; */
  }

  /**
   * Calculate age
   * @param birthDate
   * @return years
   */
  public static int calculateAge(String birthDate) throws BadDateFormatException {
    if(!checkFormatDate(birthDate)) throw new BadDateFormatException();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return Period.between(LocalDate.parse(birthDate, formatter), LocalDate.now()).getYears();
  }

  /**
   * Check Postal Code
   * @param zip
   * @return true or false
   */
  public static boolean checkPostalCode(String zip) throws BadLengthException, NotNumericException {
    if(zip.length()!=5) throw new BadLengthException(); // Bad Length
    for(String s : zip.split("")) if(!isNumeric(s)) throw new NotNumericException(); // If one character is not numeric, return false
    return true;
  }

  /**
   * Is Numeric
   * @param str
   * @return true or false
   */
  public static boolean isNumeric(String str) {
    try {
      Integer.parseInt(str); // Try to convert to Integer
      return true;
    }catch(NumberFormatException e) { // Is not a number
      return false;
    }
  }

  /**
   * is Alphabetic
   * @param str
   * @return true or false
   */
  public static boolean isAlphabetic(String str) {
    return str.matches("[a-zA-Z]+");
  }

  /**
   * Check Email
   * @param email
   * @return true or false
   */
  public static boolean checkEmail(String email){
    return email.matches(".+@.+\\.[a-zA-Z]{2,}$");
    /* 
     * .+ --> any length before "@"
     * @ --> there is a "@"
     * .+ --> any length before "."
     * \\. --> protect the character, "." means any character
     * [a-zA-Z]{2,} --> at least 2 characters
     * $ --> assert that is in the end of the string
     */
  }

  /**
   * Check Name
   * @param name
   * @return true or false
   */
  public static boolean checkName(String name) {
    return isAlphabetic(name) && name.length()>1;
  }
    
}
