/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bigproject.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

class MessageUtilsTest {
    @Test void testGetAge() {
        InputStream stdin = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("21".getBytes());
        System.setIn(in);
        assertEquals(21, MessageUtils.getAge());
    }

    @Test void testGetAge() {
        //Prepare input for age function
        InputStream stdin = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("21".getBytes());
        System.setIn(in);


        assertEquals(21 + 3, MessageUtils.addNumberToAge(3));
    }

    @Test void testGetName() {
        InputStream stdin = System.in;
        ByteArrayInputStream in = new ByteArrayInputStream("Peter".getBytes());
        System.setIn(in);
        assertEquals("Peter", MessageUtils.getName());
    }

    @Test void testGetMessage() {
        assertEquals("Hello: Peter You are 21 years old", MessageUtils.getMessage());
    }
}
