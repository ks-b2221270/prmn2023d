package lecture02;

public class Login2 {
    String name;
    int num;

    Login2(String nam,int n){
        name=nam;
        num=n;
    }
    void message(String name_n,int num_n){
        if(name.equals(name_n)){
            if(num==num_n){
                System.out.println("ログイン成功");
            }
        }else{
            System.out.println("ログイン失敗");
        }
    }
}
