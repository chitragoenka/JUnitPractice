package testing;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class NumberComparisonTest {

    @Test
    public void testNumbersAreSame() {
        String input = "5\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Numbers are the same\n", compareNumbers());
    }

    @Test
    public void testFirstNumberIsLarger() {
        String input = "8\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("The first number was larger than the second\n", compareNumbers());
    }

    @Test
    public void testSecondNumberIsLarger() {
        String input = "2\n7\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("The second number was larger than the first\n", compareNumbers());
    }

    public String compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            return "Numbers are the same\n";
        } else if (num1 > num2) {
            return "The first number was larger than the second\n";
        } else {
            return "The second number was larger than the first\n";
        }
    }
}

