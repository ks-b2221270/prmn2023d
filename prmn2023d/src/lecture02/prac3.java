package lecture02;
import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        String[][] number=new String[5][2];
        number[0][0]="B2001000";
        number[0][1]="abcde";
        number[1][0]="B2001001";
        number[1][1]="acbde";
        number[2][0]="B2001002";
        number[2][1]="acdbe";
        number[3][0]="B2001003";
        number[3][1]="bcade";
        number[4][0]="B2001004";
        number[4][1]="cbade";


    Login log=new Login(number);
    log.hanbetu();

    }
}
