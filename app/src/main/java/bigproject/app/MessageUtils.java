/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bigproject.app;

import java.util.Scanner;

class MessageUtils {
    public static String getMessage() {
        int age = getAge();
        return "Hello Peter: You are " + age + " years old";
    }

    public static Integer getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = scanner.nextInt();
        scanner.close();
        return age; 
    }
}
