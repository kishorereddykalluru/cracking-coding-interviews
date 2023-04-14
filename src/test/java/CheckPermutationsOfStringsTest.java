import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationsOfStringsTest {

    @Test
    public void testCheckPermutationsSol1_happycase() {
        CheckPermutationsOfStrings checkPermutationsOfStrings = new CheckPermutationsOfStrings();

        boolean happyCase = checkPermutationsOfStrings.checkPermutation1("god", "dog");
        boolean failCase = checkPermutationsOfStrings.checkPermutation1("awesome", "some");

        assertTrue(happyCase);
        assertFalse(failCase);
    }

    @Test
    public void testCheckPermutationsSol2_happycase() {
        CheckPermutationsOfStrings checkPermutationsOfStrings = new CheckPermutationsOfStrings();

        boolean happyCase = checkPermutationsOfStrings.checkPermutations2("god", "dog");
        boolean failCase = checkPermutationsOfStrings.checkPermutations2("awesome", "some");

        assertTrue(happyCase);
        assertFalse(failCase);
    }


}