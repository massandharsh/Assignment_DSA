package testing;

import org.junit.Test;
import question.Ropes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RopesTestCase {
    @Test
    public void findMinRope(){
        assertEquals(29,Ropes.findMinSingleRope(new int[]{2,3,4,6},4));
        assertNotEquals(10,Ropes.findMinSingleRope(new int[]{1,2,3},3));
        assertEquals(9,Ropes.findMinSingleRope(new int[]{1,2,3},3));
    }
}
