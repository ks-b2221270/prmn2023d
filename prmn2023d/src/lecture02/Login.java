package lecture02;
import java.util.Scanner;
public class Login {
    String[][] number;
    String[][] gakuseki;

    Login(String[][] num) {
        number = num;
        gakuseki=new String[1][2];
    }

    void hanbetu() {
        Scanner input = new Scanner(System.in);
        System.out.print("学籍番号を入力してください。");
        gakuseki[0][0] = input.next();
        for (int i = 0; i < number.length; i++) {

                if (number[i][0].equals(gakuseki[0][0])) {
                    System.out.print("パスワードを入力してください。");
                    gakuseki[0][1]=input.next();
                        if (number[i][1].equals(gakuseki[0][1])) {
                            System.out.println("ログイン完了");
                            System.exit(0);
                        }
                }
            }
        System.out.println("error");
        }
    }

