import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {
    @Test
    public void ShouldFindMax() {
        MaxService service = new MaxService();

        int a = 5;
        int b = 3;

        int expected = a;
        int actual = service.Max(a, b);

        Assertions.assertEquals(expected, actual);
        

    }


}
