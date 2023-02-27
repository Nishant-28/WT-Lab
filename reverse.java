public class reverse
{
    public static void main(String[] args) {
        int n = 100;
        int rev = 0;

        int a = 1234;
        // System.out.println(a%10);
        // System.out.println(a/10);
        // System.out.println(a%100);
        // logic of reversing a number
        // 12345 % 10 = 5
        // 12345 / 10 = 1234
        
        // 1234 % 10 = 4
        // 1234 / 10 = 123
        
        // 123 % 10 = 3
        // 123 / 10 = 12
        while(n != 0){
        rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(rev);
    }
}