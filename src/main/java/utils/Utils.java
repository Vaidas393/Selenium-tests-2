package utils;

import java.security.SecureRandom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Utils {

	public Utils() {

	}

	public String randomPass() {
		String randomPassword = generateRandomLetter(1)+ generateRandomUpperLetter(1) + generateRandomNumber(1);;
		return randomPassword;
	}

		
	public static String generateRandomLetter(int length) {
        String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        String DATA_FOR_RANDOM_STRING = CHAR_LOWER;
        SecureRandom random = new SecureRandom();
    
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        
        for (int i = 0; i < 1; i++) {
            // 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            sb.append(rndChar);
        }

        return sb.toString();
    }
    
    public static String generateRandomUpperLetter(int length) {
    	String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        String CHAR_UPPER = CHAR_LOWER.toUpperCase();


        String DATA_FOR_RANDOM_STRING = CHAR_UPPER;
        SecureRandom random = new SecureRandom();
    
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        
        for (int i = 0; i < 1; i++) {
            // 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            sb.append(rndChar);
        }

        return sb.toString();
    }
    
    public static String generateRandomNumber(int length) {
        String NUMBER = "0123456789";

        String DATA_FOR_RANDOM_STRING = NUMBER;
        SecureRandom random = new SecureRandom();
    
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        
        for (int i = 0; i < 1; i++) {
            // 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            sb.append(rndChar);
        }

        return sb.toString();
    }
   
}