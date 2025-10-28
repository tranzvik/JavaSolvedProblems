package CommonlySolvedProblems;

public class Sum2NosCalcSum {


    public static void main(String[] args) {

        System.out.println((new Sum2NosCalcSum().getWrongIndex(123, 456, 577)));

    }


    public String getWrongIndex(int num1, int num2, int calcSum) {

        int sum= num1+num2;
        String sumString = String.valueOf(sum);
        String index= "";

        String calcSumString = String.valueOf(calcSum);


        for (int i=sumString.length()-1; i>=0; i--) {
            if(sumString.charAt(i)!=calcSumString.charAt(i)) {
                index = String.valueOf(i);
                break;
            }
        }
         return index;
    }
}
