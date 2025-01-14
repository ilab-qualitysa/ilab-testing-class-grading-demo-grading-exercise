import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradesTest {

    @Test
    void getGreetings() {
        String expected = "Welcome to Java Training";
        String actual = StudentGrades.getGreetings();
        assertEquals(expected,actual);
    }

    @Test
    void determineGrade() {
        String expected = "A";
        String actual = StudentGrades.determineGrade(89);
        assertEquals(expected,actual);
    }

    @Test
    void determineAge() {
        int expected = 29;
        int actual = StudentGrades.determineAge(1996);
        assertEquals(expected,actual);

    }
}