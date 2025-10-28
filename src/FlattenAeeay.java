import java.util.*;

public class FlattenAeeay {

    public static void main(String[] args) {
        int[][] x = {{1, 2}, {3, 4, 5}, {6}, {7, 8, 9, 10}};

        List<Integer> list = new ArrayList<>();

        Arrays.stream(x).forEach(elem-> {
           for(int i=0;i< elem.length;i++) {
               list.add(elem[i]);
           }
        });

        System.out.println(list);



     /*   String ipv6 = "https://[2001:420:283:2000:3:11:142:167]:30603/nso/sso/saml/metadata/";
        String id = "https://[2001:420:283:2000:3:11:142:167]:30603/nso/sso/saml/metadata/";
        //Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}

        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        TreeSet<Integer> ts = new TreeSet<>();// provided there are no duplicates

        for (int i = 0; i < arr1.length; i++) {
            ts.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            ts.add(arr2[i]);
        }

        System.out.println(ts);*/
    }
}
