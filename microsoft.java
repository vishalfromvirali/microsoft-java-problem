import java.util.*;
class microsoft{
    public static void main(String[]args) {
        String S="1047";
        String T="4637";
        int n = S.length();
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) != T.charAt(i)) {
                swaps++;
            }
        }
        
        System.out.println(swaps / 2);
    }
}