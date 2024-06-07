package Customer;

import java.util.Scanner;

public class MainServices {
    public static void main(String[] args) {
//        private String FullName;
//        private String Address;
//        private long Mobile_no;
//        private long DOB;
//        private long Addhar_Number;

        System.out.println("--------------Customer Registration Details-------------");
        System.out.println("Enter the Full Name:-");
        Scanner scanner=new Scanner(System.in);
        String FullName = scanner.nextLine();
        System.out.println("Enter the Address:-");
        String Address =  scanner.nextLine();
        System.out.println("Enter the Mobile_no:-");
        long Mobile_no = scanner.nextLong();
        System.out.println("Enter the DOB:-");
        long DOB = scanner.nextLong();
        System.out.println("Enter the  Addhar_Number:-");
        long  Addhar_Number = scanner.nextLong();

        System.out.println("-----------------Customer-------------------");
        System.out.println("FullName is:-"+FullName);
        System.out.println("Address is:-"+Address);
        System.out.println("Mobile_no is:-"+Mobile_no);
        System.out.println("DOB is:-"+DOB);
        System.out.println("Addhar_Number is:-"+Addhar_Number);




        //System.out.println("FullName:-"+FullName);


        Scanner address=new Scanner(System.in);


    }
}
