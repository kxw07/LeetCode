package lt.easy.crawler_log_folder_1598;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Answer1598Test {

    private Answer1598 sut;

    @BeforeEach
    public void setup() {
        sut = new Answer1598();
    }

    @Test
    public void example1() {
        String[] logs = new String[]{"d1/", "d2/", "../", "d21/", "./"};
        Assertions.assertEquals(2, sut.minOperations(logs));
    }

    @Test
    public void example2() {
        String[] logs = new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"};
        Assertions.assertEquals(3, sut.minOperations(logs));
    }

    @Test
    public void example3() {
        String[] logs = new String[]{"d1/", "../", "../", "../"};
        Assertions.assertEquals(0, sut.minOperations(logs));
    }

}