package DynamicProgramming;

public class LongestCommonSubsequence {

    //Rules to write recurrence
    // express all in index
    //explore possibility on each index
    //take the best or max among them

    public static void main(String[] args) {
        String s1= "acd";
        String s2="ced";

        int m =s1.length();
        int n = s2.length();

        int res = lcs(m-1, n-1, s1, s2);
        System.out.println("lcs length:"+ res);

    }

    public static int lcs(int m, int n , String s1, String s2) {
        if(m==-1 || n==-1) {
            return 0;
        }
        if(s1.charAt(m)==s2.charAt(n)) {
            System.out.println(s1.charAt(m));
            return (1+ lcs(m-1, n-1, s1, s2));

        } else {
            return Math.max(lcs(m-1,n, s1,s2), lcs(m, n-1, s1,s2));
        }
    }
}
