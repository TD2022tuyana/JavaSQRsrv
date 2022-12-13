package  ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        final SQRService service = new SQRService();
        final int actual = service.calculate(200, 300);
        final int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcInexact() {
        final SQRService service = new SQRService();
        final int actual = service.calculate(200, 600);
        final int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

}
