import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isSoldier;
        boolean isRelated;
        double bill = 9.98;

        System.out.print("Are you a soldier ? (true/false): ");
        isSoldier = scanner.nextBoolean();
        System.out.print("Are you relative of a martyr ? (true/false): ");
        isRelated = scanner.nextBoolean();

        if(isSoldier) {
            if(isRelated) {
                System.out.println("You get a martyr's discount of 20%");
                System.out.println("You get a soldier's discount of 10%");
                bill *= 0.7;
            }
            else {
                System.out.println("You get a soldier's discount of 10%");
                bill *= 0.9;
            }
            }
            else if(isRelated) {
                System.out.println("You get a martyr's discount of 20%");
                bill *= 0.8;
            } 
            else {
                bill *= 1;
            }
            System.out.printf("Your bill is $%.2f", bill);

        scanner.close();
    
}
}