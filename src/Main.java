import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner class has been defineted.
        Scanner in= new Scanner(System.in);


        //The variable data types have been defined.
        double startPrice=10,total,perKM=2.20,km ;

        //Get values from the user.
        System.out.print("Please enter kilometer=");
        km= in.nextDouble();

        //The taxi price has been calculated.
        total=perKM*km;
        total+=startPrice;

        total= (total>20) ? total : 20 ;

        System.out.print("Taxi price=" + total);


    }
}