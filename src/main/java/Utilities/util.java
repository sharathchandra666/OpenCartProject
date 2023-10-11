package Utilities;

import java.util.Date;

public class util {
    public static String TimestampEmail()
    {
        Date date =new Date();
        String RandomEmail=date.toString().replace(" ","_").replace(":","_");
        return "sharathchandra"+RandomEmail+"@Gmail.com";
    }
}
