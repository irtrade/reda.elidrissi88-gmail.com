import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 

/**
 * Tests for MathTools.
 *
 * @author sebastien.choplin@u-picardie.fr
 */
public class MathToolsTests {

    @Test
    public void testMin() {
	assertEquals(2,MathTools.pgcd(2,5));
    }
    
    @Test
    public void testPgcd() {
	assertEquals(8,MathTools.pgcd(24,16));
	assertEquals(10,MathTools.pgcd(0,10));
	assertEquals(0,MathTools.pgcd(0,0));
    }

    @Test
    public void testPgcdArguments1() {
	try {
	    MathTools.pgcd(-1,1);
	    fail("exception pas detectée sur a");
	} catch (IllegalArgumentException e) {
	    // ok
	}
    }
   
    @Test
    public void testPgcdArguments2() {
	try {
	    MathTools.pgcd(1,-1);
	    fail("exception pas detectée sur b");
	} catch (IllegalArgumentException e) {
	    // ok
	}
    }

}
