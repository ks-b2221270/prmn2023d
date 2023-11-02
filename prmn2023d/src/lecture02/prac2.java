package lecture02;
import java.util.Scanner;
public class prac2 {
    public static void main(String[] args) {
        int[] num=new int[5];

        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("数値"+(i+1)+"つ目");
            num[i]=input.nextInt();
            System.out.println("");
        }

        Keisan k=new Keisan();

        int x=k.add(num);
        k.print(x);


        }
    }

