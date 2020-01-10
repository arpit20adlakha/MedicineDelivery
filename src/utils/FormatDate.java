package utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FormatDate  {
    public static Date formatDate(String date){
        Date dateValue = null;
        String sDate6 = "31-Dec-1998 23:37:50";
        try {
            SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
             dateValue = formatter6.parse(date);
        }
        catch(ParseException e){
            System.out.println("There is a parse exception");
        }
        return dateValue;
    }
}
