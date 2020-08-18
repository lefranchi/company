package br.com.lefranchi.company;

import org.apache.camel.dataformat.bindy.Format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateConverter implements Format<Date> {

    @Override
    public String format(Date object) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(object);
    }

    @Override
    public Date parse(String dateString) throws Exception {

        if (dateString.trim().equals("")) {
            return null;
        }

        if (Long.parseLong(dateString) >= 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            return sdf.parse(dateString);
        }

        return null;
    }
}