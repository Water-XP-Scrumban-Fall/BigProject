/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bigproject.app;

import java.util.Scanner;

class MessageUtils {
    public static String getMessage() {
        return "Hello world!";
    }

    public static Integer getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = scanner.nextInt();
        scanner.close();
        return age; 
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();
        scanner.close();
        return name; 
    }
}
