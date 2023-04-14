public class UniqueCharactersInString {


    public boolean checkIfDuplicateCharacterExists(String input) {
        if(input.length() > 128) return false;

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
