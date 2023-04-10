public class UniqueCharactersInString {


    public boolean checkIfDuplicateCharacterExists(String input) {
        boolean[] ascii_char = new boolean[128];
        for(char val: input.toCharArray()){
            if(ascii_char[val]){
                return false;
            }
            ascii_char[val] = true;
        }

        return true;
    }
}
