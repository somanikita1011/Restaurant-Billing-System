import java.util.*;
public class Main
 {
	public static void main(String[] args)
	{
	    Scanner uv=new Scanner(System.in);
	    System.out.println("welcone to CMR Restaurant");
        System.out.println("Hi,plz enter your name");
        String name=uv.nextLine();
        System.out.println("hey"+name+" what do you like to have");
        System.out.println("1.Dal fry-40 \n2.Paneer butter masala-100 \n 3.chicken curry-120\n 4.fish curry-150 \n 5.curd rice-50");
        System.out.println("select from the menu");
        int n=uv.nextInt();
        System.out.print("enter the quantity");
        int m=uv.nextInt();
        switch(n)
        {
            case 1: System.out.print("you selected Dal fry"+(m*40));
                if(uv.nextInt()==m*40){
                System.out.print("your order placed kindly wait");
                break;
                }
                else{
                    System.out.println("Invalid option");
                    break;
                }
        
        
            case 2: System.out.print("you selected Paneer butter masala"+(m*100));
                if(uv.nextInt()==m*100){
                System.out.print("your order placed kindly wait");
                break;
                }
                else{
                    System.out.println("Invalid option");
                    break;
                }
        
        
            case 3: System.out.print("you selected chicken curry"+(m*120));
                if(uv.nextInt()==m*120){
                System.out.print("your order placed kindly wait");
                break;
                }
                else{
                    System.out.println("Invalid option");
                    break;
                }
            case 4: System.out.print("you selected fish curry"+(m*150));
                if(uv.nextInt()==m*150){
                System.out.print("your order placed kindly wait");
                break;
                }
                else{
                    System.out.println("Invalid option");
                    break;
                }
            case 5: System.out.print("you selected curd rice"+(m*50));
                if(uv.nextInt()==m*50){
                System.out.print("your order placed kindly wait");
                break;
                }
                else{
                    System.out.println("Invalid option");
                    break;
                }
        }
	}
}
