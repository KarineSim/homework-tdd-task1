import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    PhoneBook sut;

    @BeforeEach
    public void initEachTest() {
        sut = new PhoneBook();
    }

    @Test
    public void addTest() {
        sut.add("Vasilii", "1111111");
        sut.add("Oleg", "2222222");
        sut.add("Oleg", "3333333");
        int actual = sut.add("Irina", "4444444");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void findByNumberTest() {
        sut.add("Vasilii", "1111111");
        sut.add("Oleg", "2222222");
        String actual = sut.findByNumber("2222222");
        String expected = "Oleg";
        assertEquals(expected, actual);
    }
}
