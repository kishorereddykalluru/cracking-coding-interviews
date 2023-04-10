import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersInStringTest {

   @Test
   void testCheckIfDuplicateCharacterExists() {
       UniqueCharactersInString uniqueCharactersInString = new UniqueCharactersInString();
       boolean abc = uniqueCharactersInString.checkIfDuplicateCharacterExists("abc");
       assertTrue(abc);
   }

    @Test
    void testCheckIfDuplicateCharacterExists_false() {
        UniqueCharactersInString uniqueCharactersInString = new UniqueCharactersInString();
        boolean abc = uniqueCharactersInString.checkIfDuplicateCharacterExists("abcb");
        assertFalse(abc);
    }
}