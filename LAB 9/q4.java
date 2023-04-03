// Create an user defined exception named Check Argument to check the number of arguments passed through command line. If the number of arguments is less than four, throw the Check Argument exception, else print the addition of squares of all the four elements
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class q4 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Less than four arguments passed through command line");
            } else {
                int sum = 0;
                for (int i = 0; i < 4; i++) {
                    sum += Integer.parseInt(args[i]) + Integer.parseInt(args[i]);
                }
                System.out.println("Addition of squares of all the four elements: " + sum);
            }
        } catch (CheckArgument e) {
            System.out.println(e.getMessage());
        }
    }
}
