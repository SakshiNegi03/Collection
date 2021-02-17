package collection1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class qus8 {

    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");
        System.out.println(date.format(new Date()));
    }
}