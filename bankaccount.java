import java.util.Scanner;

class BankBalance{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Current Balance : ");
        Float cb = input.nextFloat();
        System.out.print("Withdrawal amount : ");
        Float wa = input.nextFloat();

        if(wa > cb){
            System.out.println("Error: Insufficient balance");
        }
        else{
            Float nb = cb - wa;
            System.out.println("Withdrawal successful. New balance: "+nb);
        }
    }
}