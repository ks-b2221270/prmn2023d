package lecture02;

public class Keisan {
    int x;


    int add(int[] number){
        for(int i=0;i<5;i++){
            x+=number[i];
        }
        return x;
    }

    void print(int x){
        System.out.println("合計値:"+x);
        if(x>=100){
            System.out.println("great");
        }else if(x>=50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
