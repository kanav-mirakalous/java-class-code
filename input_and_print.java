import java.util.Scanner;

class InputPrint { 
    public static void main(String args[]) 
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        //code to ask the durham Id number
        System.out.println("Enter your Durham ID: ");
        String id_durham = scanner.nextLine();
        System.out.println("Hello, World " + name + ". Welcome to Durham College class on OOPS");
        scanner.close();
    } 
}
