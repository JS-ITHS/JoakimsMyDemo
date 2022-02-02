import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BigClassTest {
    BigClass testObject;

    @Test
    public void checkConstructorNoArgs() {
        //Act
        testObject = new BigClass();

        //Assert
        assertInstanceOf(BigClass.class, testObject);
    }

    @Test
    public void checkConstructorTextArg() {
        //Act
        testObject = new BigClass("Hoppla!");

        //Assert
        assertInstanceOf(BigClass.class, testObject);
    }
    @Test
    public void checkConstructorNumberArg() {
        //Act
        testObject = new BigClass(42);

        //Assert
        assertInstanceOf(BigClass.class, testObject);
    }
    @Test
    public void checkConstructorBothArgs() {
        //Act
        testObject = new BigClass(53, "Hejsan!");

        //Assert
        assertInstanceOf(BigClass.class, testObject);
    }

    @Test
    public void checkSetNumberWithNegative() {
        //Arrange
        testObject = new BigClass();

        testObject.setNumber(-1);
        int expected = 0;
        int actual = testObject.getNumber();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 42, 765328})
    public void checkSetNumber(int input) {
        testObject = new BigClass();

        testObject.setNumber(input);
        int expected = input;
        int actual = testObject.getNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void checkSetAndGetText() {
        testObject = new BigClass();

        testObject.setText("Hallå Hej!");
        String expected = "Hallå Hej!";
        String actual = testObject.getText();

        assertEquals(expected, actual);
    }

    @Test
    public void checkStringToUppercaseMethod() {
        testObject = new BigClass();

        testObject.setText("Hallå Hej!");
        testObject.stringToUpperCase();
        String expected = "HALLÅ HEJ!";
        String actual = testObject.getText();

        assertEquals(expected, actual);
    }



}