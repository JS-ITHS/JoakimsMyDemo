import org.junit.jupiter.api.Test;

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


}