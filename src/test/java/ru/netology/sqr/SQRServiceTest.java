package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void testRangeSQRService(int expected, int x, int y) {
        SQRService service = new SQRService();

        int actual = service.calcRangeSQRService(x, y);

        Assertions.assertEquals(expected, actual);
    }
}
