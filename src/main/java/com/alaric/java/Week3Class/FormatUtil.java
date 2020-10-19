package com.alaric.java.Week3Class;

import com.sun.org.apache.xpath.internal.patterns.ContextMatchStepPattern;
import com.sun.org.glassfish.gmbal.ParameterNames;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/19
 **/

public class FormatUtil {
    public synchronized String format(Date date) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return sdf.format(date);
}

public synchronized static String format(Date date, Locale tz) {
    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", tz);
    sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
    return sdf.format(date.getTime());
}
public static String format(double number) {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    return decimalFormat.format(number);
}
public static String format(double number, String pattern) {
    DecimalFormat decimalFormat = new DecimalFormat();
    return decimalFormat.format(number);
}
}