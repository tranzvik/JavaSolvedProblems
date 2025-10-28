import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomProblemsDemo {

    public static void main(String[] args) throws Exception {
        /**

        int N = -5859;
        int result = 0;
        boolean negative = false;
        ArrayList<Integer> list1 = new ArrayList();
        if (N < 0) {
            negative = true;
        }

        while (Math.abs(N) > 0) {
            list1.add(Math.abs(N) % 10);
            N = Math.abs(N) / 10;
        }
        Collections.reverse(list1);
        System.out.print(list1);

        ArrayList<Integer> list2 = new ArrayList();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == 5) {
                list2.add(i);
            }
        }
        System.out.println(list2);
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < list2.size(); j++) {
            ArrayList<Integer> temp = new ArrayList(list1);
            temp.remove((int) list2.get(j));
            String str = temp.stream().map(i -> i.toString()).collect(Collectors.joining(""));
            if (negative) {
                str = "-" + str;
            }
            if (Integer.parseInt(str) > max) {
                max = Integer.parseInt(str);
            }

        }

        result = max;
        System.out.println(result);
        **/

        // new RandomProblemsDemo().purging();
        //Trees.TreeServices treeServices = new Trees.TreeServices();
        //treeServices.traverseInOrder(treeServices.createTree());

       /* Inheritance.Child1 child1= new Inheritance.Child1();
        Inheritance.Child2 child2 = new Inheritance.Child2();
        child1.incrementCounter();
        child2.incrementCounter();
        child1.incrementCounter();

        child1.getCounterValue();
        child2.getCounterValue();*/

        /*try{
            int x =2;
            System.out.println("Try Block  Start");
            x=x/0;
            System.out.println("Try Block End");
        } catch (Throwable e){
            int y=3;
            System.out.println("Catch Block Start");

            y=y/0;
            System.exit(1);
            System.out.println("Catch Block End");
        }
        finally {

            System.out.println("finally block");
            //
        }
        System.out.println("Outside Finally");*/
        // new MultiThreading.ThreadServices().executeThredServices();
/*List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Thread threadx = new Thread(()-> {
            for(int i=0; i < 10;i++) {

            }
        });*/
        /*
         *
         *	*
         *		*	*
         *	*		*	*
         *	*		*	*
         *	*	*	*	*
         */
       /* int i=0;
        int j=0;
        int c =0;

        for (i = 0; i <= 5; i++) {
            for (j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            c = 0;
            while (c < i ) {
                System.out.print("*");
                c++;
            }
            System.out.println();
        }*/

       /* 1 -> 2 -> 3
        4 -> 5 - > 6

                while(root1.nect!=null&& root2.next!=null) {
                    root1.data = root1.data+root2.data;
                    root1.next;
                    root2.next;

                    123+456=

                            Node {
                        int data;
                        int carry;
                        Node next;
                    }*/


        // }

     /* for(int i=96;i<=122;i++) {
          System.out.println((char)i);
      }*/
       /* int x = (char)'a';
        for(int i=0; i<26;i++){
            System.out.println((char)x++);
        }

        String s = "Test";
        s.charAt(2);*/


       /* ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        s1.add("anil");
        s1.add(null);

        s1.sort((o1,o2)->{
        return   o1.length()-o2.length();
        });

        System.out.println(s1);
*/

        // RandomProblemsDemo randomProblemsDemo = new RandomProblemsDemo();
        // randomProblemsDemo.VisaQuestion();
        // randomProblemsDemo.segregateOsAnd1s();

        // System.out.println("no ofcores "+Runtime.getRuntime().availableProcessors());
        //  new RandomProblemsDemo().testMap();

        //new RandomProblemsDemo().sumPair1();

      // String s = new RandomProblemsDemo().encrypt("changeit", "1234567890123456");
        //System.out.println("encrypted Value:"+ s);
        //new RandomProblemsDemo().decryptPassword(s);

        new RandomProblemsDemo().testMethod3();
    }

    public void VisaQuestion() {
        //ip : {1,9,2,3,4,6,6,8}
        //o/p : 5,7

        // List<Integer> list = Arrays.asList(1, 9, 2, 3, 4, 6, 6, 8);
        List<Integer> list = Arrays.asList(1, 1);
        //List<Integer> list = Arrays.asList(4,3,2,7,8,2,3,1);

        Map<Integer, Integer> map = list.stream().distinct().collect(Collectors.toMap(x -> x, x -> x));

        for (int i = Collections.min(list); i <= Collections.max(list); i++) {
            if (map.get(i) == null) {
                System.out.println("missing number" + i);
            }
        }
    }

    public void purging() {
        try {
            File directory = new File("/Users/anilnp/Documents/EPNM/GITHUB/ems-data-report/scheduled-export/reports/");
            if (directory.exists()) {
                String fileNames[] = directory.list((dir, name) -> name.endsWith(".pdf") || name.endsWith(".csv"));

                File[] files = directory.listFiles((dir, name) -> name.endsWith(".pdf") || name.endsWith(".csv"));
                /**
                 * May have to use .list() instead of .listFiles() if heap space issues occur.
                 * As list Files will bring the entire file in memory and may run out of heap space.
                 */
                long l = Long.parseLong("604800000");
                long deletion = System.currentTimeMillis() - l;//7 days in milliseconds
                Arrays.stream(Objects.requireNonNull(files)).forEach(x -> {
                    System.out.println("Current Last Modified:");
                    x.setLastModified(System.currentTimeMillis() - 9 * 24 * 60 * 60 * 1000);
                });

            }

        } catch (Exception e) {
            System.out.println("dfsdf");
        }
    }


    public void segregateOsAnd1s() {
        List<Integer> list = List.of(1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1);
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0)
                counter++;
        }
        for (int i = 0; i < counter; i++) {
            result.add(0);
        }
        for (int i = counter; i < list.size(); i++)
            result.add(1);

        System.out.println(result);
    }

    public void testMap() {

        List<Integer> list1 = Arrays.asList(1000, 3000, 4000, 1000, 2000, 1000);

        Map<Integer, Long> map1 = list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map1);

    }

    public void sumPair() {
        List<Integer> list1 = Arrays.asList(1, 5, 7, -1, 2);
        final int Ksum = 6;

        Map<Integer, Integer> map1 = list1.stream().collect(Collectors.toMap(x -> x, x ->  Ksum-x));
        System.out.println(map1);

        map1.entrySet().forEach(x-> {
            if(list1.contains(x.getValue())) {
                System.out.println("the pair is :"+x.getKey()+":"+x.getValue());
            }
        });

    }

    public void sumPair1() {
        List<Integer> list1 = Arrays.asList(1, 5, 7, -1, 2);
        final int Ksum = 6;

        Map<Integer,Integer> map1 = list1.stream().collect(Collectors.toMap(x->x, x-> Ksum-x));

        map1.entrySet().forEach(x-> {
            if(list1.contains(x.getValue())) {
                System.out.println(x.getKey()+"-->"+x.getValue());
            }
        });
    }

    public String decryptPassword(String encryptedPassword) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException {
        //String encryptedPassword = "ENCRYPTED_STRING";  // Replace with your encrypted password
        String key = "1234567890123456"; // Same key used for encryption

        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedPasswordBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedPassword));
        String decryptedPassword = new String(decryptedPasswordBytes);
        System.out.println("DecryptedValue:"+ decryptedPassword);
        return decryptedPassword;
    }

    public  String encrypt(String plaintext, String secretKey) throws Exception {
        // Create a SecretKeySpec from the given key
        SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), "AES");

        // Create the cipher instance for AES
        Cipher cipher = Cipher.getInstance("AES");

        // Initialize the cipher in encryption mode with the key
        cipher.init(Cipher.ENCRYPT_MODE, key);

        // Perform the encryption
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());

        // Return the encrypted value as Base64 to represent the binary data as a string
        return Base64.getEncoder().encodeToString(encryptedBytes);

    }


    public void testMethod1() {

        HashMap<String, String> map1 = new HashMap<>();
        Map<String, String> res = new HashMap<>();
        map1.put("Flamini", "1");
        map1.put("Torres", "2");
        map1.put("VanPersie", "3");
        map1.put("Crespo", "4");


        /*map1.entrySet().stream().forEach(x->{
            System.out.println(x.getKey()+"-"+x.getValue());
        });

        for(Map.Entry<String,String>x:map1.entrySet()) {
            System.out.println(x.getKey()+"--"+x.getValue());
        }*/

       res= map1.entrySet().stream().filter(x-> {
           return Integer.parseInt(x.getValue())>2;
       }).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));

        System.out.println(map1);

        testMethod2();

    }

    public void testMethod2() {

        char a = 'a';
        int i = (int) a;

        for(int j=i; j<i+26; j++) {
            System.out.println((char)j);
        }


    }


    public void testMethod3() {

       String s= "10101010";
       int sum=0;
       int place =0;

       for(int i=s.length()-1; i>=0;i--) {
           sum += (int) (Character.getNumericValue(s.charAt(i)) * Math.pow(2,place));
           place++;
       }

        System.out.println(sum);


    }






}
