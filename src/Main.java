public class Main {

    public static void main(String[] args) {

        // Remember to make a check on input
        //okay

        try {
            factorial(Integer.parseInt(args[2]));
        } catch (NumberFormatException e) {
            System.out.println("Input needs to be an integer");
            return;
        }

    }

    public static void factorial (Integer n) {
        for (int i=1; i<=10; i++) {
            int result = n*i;
            System.out.println(n + " times " + i + " is equal to " + result);
        }


    }
}
