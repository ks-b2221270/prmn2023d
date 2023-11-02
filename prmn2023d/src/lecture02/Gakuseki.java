package lecture02;

public class Gakuseki {
    String number;
    Gakuseki(String num){
        number=num;
    }

    void hanbetu(String gakuseki){
        if (number.equals(gakuseki)) {
            System.out.println("complete");
        }else{
            System.out.println("error");
        }
    }
}
