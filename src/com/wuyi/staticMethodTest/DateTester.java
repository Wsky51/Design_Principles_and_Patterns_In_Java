package com.wuyi.staticMethodTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import org.xml.sax.helpers.XMLReaderFactory;
/**
 * Created on 2017/6/10
 *
 * @author WuYi
 */
public class DateTester {
    public static void main(String[] args) {
        Locale locale=Locale.FRANCE;
        Date date=new Date();
        System.out.println(date);
        String now = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale).format(date);
        System.out.println(now);
        try {
            date = DateFormat.getDateInstance(DateFormat.DEFAULT, locale).parse("16 nov.01");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
