package sample;

import com.sun.jdi.IntegerValue;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField upis;
    public Label ispis;

    public  void sumaCifara(int n) {
        int suma = 0;
        int t, p = n;

        while (p != 0) {
            suma = suma + (p % 10);

            p = p / 10;

        }

        for (int i = 1; i <= n; i++) {

            if (i % suma == 0) {
               niz+=i+" ";
            }
        }

    }
String niz="";
    public void potvrdi(ActionEvent actionEvent) {

        int a;
        a=Integer.parseInt(upis.getText());


        sumaCifara(a);
         ispis.setText(niz);






    }
}
