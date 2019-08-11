import javax.swing.*;
import java.util.*;

public class twoTimes {

    public static void main(String[] args) {

        int num = getInput();

        MyMath math = new MyMath();
        math.generateTable(2, num);
    }


    public static int getInput(){

        String input = (String) JOptionPane.showInputDialog("What number should the table be up to?");
        return Integer.parseInt(input);
    }
}

