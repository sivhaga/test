package za.co.nedbank.eqa.digital.utils.commonUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

    private String toFullDateFormat = "dd-MM-yyyy";
    private String timeStampFormat = "yyyyMMddHHmmss";
    private String formatedTimeStampFormat = "yyyy_MM_dd_HHmmss";
    private String toDateFormat = "yyyyMMdd";

    public String getFullDate() {
        String displayTime = "";
        try {
            displayTime = (new SimpleDateFormat(toFullDateFormat).format(new Date()));
        } catch (Exception e) {
            System.out.println("Date Time Seems To Be Incorrect. : " + e.getMessage());
        }
        return displayTime;
    }

    public String getDate() {
        String displayTime = "";
        try {
            displayTime = (new SimpleDateFormat(toDateFormat).format(new Date()));
        } catch (Exception e) {
            System.out.println("Date Time Seems To Be Incorrect. : " + e.getMessage());
        }
        return displayTime;
    }

    public String getTimeStamp() {
        String displayTime = "";
        try {
            displayTime = (new SimpleDateFormat(timeStampFormat).format(new Date()));
        } catch (Exception e) {
            System.out.println("Date Time Seems To Be Incorrect. : " + e.getMessage());
        }
        return displayTime;
    }

    public String getFormatedTimeStamp() {
        String displayTime = "";
        try {
            displayTime = (new SimpleDateFormat(formatedTimeStampFormat).format(new Date()));
        } catch (Exception e) {
            System.out.println("Date Time Seems To Be Incorrect. : " + e.getMessage());
        }
        return displayTime;
    }
}
