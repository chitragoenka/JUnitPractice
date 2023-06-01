package org.testing;

import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestScoresTest {

    @Test
    public void testGradeA() {
        String input = "95";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Your grade is an A :)\n", getGrade());
    }

    @Test
    public void testGradeB() {
        String input = "85";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Your grade is a B :)\n", getGrade());
    }

    @Test
    public void testGradeC() {
        String input = "75";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Your grade is a C :(\n", getGrade());
    }

    @Test
    public void testGradeD() {
        String input = "65";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Your grade is a D :(\n", getGrade());
    }

    @Test
    public void testGradeF() {
        String input = "55";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Your grade is an F :(\n", getGrade());
    }

    public String getGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            return "Your grade is an A :)\n";
        } else if (score >= 80) {
            return "Your grade is a B :)\n";
        } else if (score >= 70) {
            return "Your grade is a C :(\n";
        } else if (score >= 60) {
            return "Your grade is a D :(\n";
        } else {
            return "Your grade is an F :(\n";
        }
    }
}

