import java.util.Arrays;

public class CheckPermutationsOfStrings {


    //solution1
    public boolean checkPermutation1(String s, String t) {
        if(s.length() != t.length())
            return false;

        return sort(s).equals(sort(t));
    }


    //solution2
    public boolean checkPermutations2(String s, String t) {
        if(s.length() != t.length())
            return false;

        int [] count = new int[128]; //Assumption

        for(char c: s.toCharArray()){
            count[c]++;
        }

        for(char c: s.toCharArray()) {
            count[c]--;
        }

        for(int temp: count) {
            if(temp < 0){
                return false;
            }
        }

        return true;
    }

    public String sort(String sort) {
        char[] chars = sort.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
