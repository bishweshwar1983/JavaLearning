import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

 /*   public int calcFalc1(int num) {
        int fact;

        if (num == 1) {
            return 1;
        }
        else {
            fact = num * calcFalc(num - 1);
        }

        return fact;

    }
*/

    public int calcFalc2(int num) {
        int fact = 1;
        for(int i = 2; i<= num; i++) {
            fact*=i;
        }
        return fact;

    }


    public void reverse() {

        System.out.println("Enter the string to reverse: ");
        Scanner newstr = new Scanner(System.in);
        String words = newstr.next();

        ArrayList<Character> sample = new ArrayList<Character>();

        for (int i = words.length()-1; i >= 0; i--) {
            sample.add(words.charAt(i));

        }
        for (char e: sample) {
            System.out.print(e);
        }
        System.out.println();
    }

    public int calc_avg() {

        int avg_sum = 0;
        int[] array1 = {34, 456, 7, 34, 7};

        for(int i=0; i < array1.length; i++) {
            avg_sum+=array1[i];
        }
        return avg_sum/array1.length;
    }

    public void find_common() {

        int[] array1 = {34, 456, 7, 10, 7};
        int[] array2 = {456, 98, 6734, 34, 29};
        ArrayList<Integer> common_num = new ArrayList<>();

        for(int e: array1){
            for(int f: array2) {
                if(e == f) {
                    common_num.add(e);
                    break;
                }
            }
        }

        for (int e: common_num) {
            System.out.println(e);
        }
    }

    public String conc_str() {
        String str1 = "string12345666";
        String str2 = "string243974934";
        String str3 = "";
        int str1_length = str1.length();
        int str2_length = str2.length();

        char[] char_array = new char[str1_length+str2_length];

        for(int i=0; i<str1_length; i++){
            char_array[i] = str1.charAt(i);
        }

        for(int i=0; i<str2_length; i++){
            char_array[str1_length] = str2.charAt(i);
            str1_length+=1;
        }

        for(int i=0; i<char_array.length; i++){
            str3 = str3 + char_array[i];
        }
        return str3;
    }

 /*   public boolean check_prime(int pr) {
        if (pr < 2){
            return false;
        }
        int sq_rt = (int)Math.sqrt(pr);
        int result = 0;
        for(int i=2; i<sq_rt; i++) {
            if(pr % i == 0) {
                result+=1;
                break;
            }
        }
        if (result == 0){
            return true;
        }
        else {
            return false;
        }
    }

  */

    public boolean check_prime(int pr) {
        boolean isprime = true;
        if (pr < 2){
            isprime = false;
        }
        else {
            for (int i = 2; i < (int) Math.sqrt(pr); i++) {
                if (pr % i == 0) {
                    isprime = false;
                    break;
                }

            }
        }
        return isprime;
    }

    public int gcd(int a, int b) {
        int first_num, sec_num;
        first_num = a;
        sec_num = b;

        while (sec_num != 0){

            int r = first_num % sec_num;
            first_num = sec_num;
            sec_num = r;

        }

        return first_num;
    }



}