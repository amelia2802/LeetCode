import java.util.*;

public class LongestSubstringWithKDistinct {
    public static int distinct(String str,int k ){
        int output = 0; //initialize output to 0, so if there's no distinct character present it will return 0.

        for (int i = 0; i < str.length(); i++) {	//using two pointers to find possible substrings
                for (int j = i + 1; j <= str.length(); j++) {	//i is starting index and j is ending index of the string

                    HashSet<Character> distinct = new HashSet<>();	//create a set to find distinct characters
            
                    for (int index = i; index < j; index++) {
                            distinct.add(str.charAt(index));//add characters from the substring
                    }

                    if (distinct.size() == k) {//check if the number of distinct characters equals to k
                            output = Math.max(output, j - i); //update the output with the max length
                    }
                }
        }

        return output;
    }

    public static void main(String[] args) {
        String s = "aabaabcdsadddssa";
        int k = 3;
        int result = distinct(s, k);
        System.out.println(result); //output:9,substring:dsadddssa
    }

}
