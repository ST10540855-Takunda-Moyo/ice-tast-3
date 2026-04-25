package com.mycompany.persons;

import java.util.Scanner;

public class Persons {

    // Main method to drive the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Validate the name using the isValidName method from the Person class
        boolean isValid = Person.isValidName(name);

        // Get the response based on the validation result from Person class
        String response = Person.getResponse(isValid);

        // Output the response
        System.out.println(response);
    }
}

class Person {

    // Method to check if the name contains at least 2 capital letters and is no longer than 15 characters
    public static boolean isValidName(String name) {
        if (name.length() > 15) {
            return false;  // Name is too long
        }
        
        int capitalCount = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                capitalCount++;
            }
        }

        // Return true if there are at least 2 capital letters
        return capitalCount >= 2;
    }

    // Method to return a response based on the name validation
    public static String getResponse(boolean isValid) {
        if (isValid) {
            return "Properly logged in";
        } else {
            return "Could not login";
        }
    }
}