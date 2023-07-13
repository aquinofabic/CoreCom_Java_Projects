import java.util.Scanner;
        class UserScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a scanner object
        System.out.println("Enter username:");

        String userName = myObj.nextLine();  // .nextLine() scans from current position until it finds a line separator delimiter
        System.out.println("Hi," + userName + ". how high do you want to count?");

        Scanner objCounter = new Scanner(System.in);  // New scanner object
        Integer counter = objCounter.nextInt();  // .nextInt() scans from current pos to integer separator delimiter
        int countFrom = 1;
        while (countFrom <= counter){
            System.out.println(countFrom);
            countFrom++;
        }

    }
}