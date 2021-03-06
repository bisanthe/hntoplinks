package utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by eguller on 22.04.14.
 */
public class TimeUtil {
    public static String getTimeZoneId(int offSetInMinutes){
        long offSet = TimeUnit.MINUTES.toHours(offSetInMinutes);
        if(offSet < -11){
            offSet = -11;
        } else if (offSet > 11){
            offSet = 11;
        }
        return String.format("Etc/GMT%+d", offSet);
    }
}
