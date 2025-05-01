import java.util.*;

public class TokenRing{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of nodes you want to add in ring");
        int n=sc.nextInt();
        System.out.println("nodes Follow the below ring:");

        for(int i=0;i<n;i++){
            System.out.println(i+"");
        }
        System.out.println("0");

        int choice=0;
        do{
            System.out.println("Enter Sender:");
            int sender=sc.nextInt();

            System.out.println("Enter Receiver");
            int receiver=sc.nextInt();

            System.out.println("Enter Data to be send:");
            int data=sc.nextInt();

            int token=0;

            System.out.println("Token Processing:");
            for(int i=token;i<sender;i++){
                System.out.println(""+i+"->");
            }
            System.out.println(""+sender);
            System.out.println("sender"+sender+"sending data:"+data);

            for(int i=sender;i!=receiver;i=(i+1)%n){
                System.out.println("Data"+data+"Forwarded By:"+i);
            }
            System.out.println("Receiver:"+receiver+"Received the Data:"+data);

            token=sender;

            System.out.println("Do you want to add data again?If Yes Enter1,If No enter 0");
            choice=sc.nextInt();
        }while(choice==1);

    }
}