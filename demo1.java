


public class demo1 {
    public static void main(String[] args) {
        // Instantiate the Scanner object to capture input stream
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first integer number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer number: ");
        int num2 = scanner.nextInt();
        
        // Calculate the sum
        int sum = num1 + num2;
        System.out.println("The total sum is: " + sum);
        
        // Close the scanner resource to avoid memory leaks
        scanner.close();
    }
}
