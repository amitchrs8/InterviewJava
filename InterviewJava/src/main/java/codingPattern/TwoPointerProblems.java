package codingPattern;

public class TwoPointerProblems {

    public static boolean isPalindrome(String s) {
        if(s==null || s.length()<=1){
            return Boolean.TRUE;
        }
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

//    public static boolean findSumOfThree(int[] nums, int target) {
//        int leftIndex=0;
//        int rightIndex=nums.length-1;
//        for(int i=0;i<)
//
//
//
//        // Replace this placeholder return statement with your code
//        return false;
//    }





    public static void main(String[] args) {
        System.out.println("Pallindrome Check : "+isPalindrome(""));
    }



}
