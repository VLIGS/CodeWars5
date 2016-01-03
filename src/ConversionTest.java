import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversionTest {

    private Conversion conversion = new Conversion();

    @Test
    public void shouldCovertToRomanSimple() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        //assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
    }
    @Test
    public void shouldCovertToRomanHarder() {
        assertEquals("solution(1000) should equal to M", "M", conversion.solution(1000));
        assertEquals("solution(1990) should equal to MCMXC", "MCMXC", conversion.solution(1990));
        assertEquals("solution(2008) should equal to MMVIII", "MMVIII", conversion.solution(2008));
        assertEquals("solution(1666) should equal to MDCLXVI", "MDCLXVI", conversion.solution(1666));
    }

}
