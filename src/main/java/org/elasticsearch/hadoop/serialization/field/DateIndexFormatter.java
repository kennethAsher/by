package org.elasticsearch.hadoop.serialization.field;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.elasticsearch.hadoop.util.Constants;
import org.elasticsearch.hadoop.util.DateUtils;
import org.elasticsearch.hadoop.util.StringUtils;

public class DateIndexFormatter {
    private String format;
    private SimpleDateFormat dateFormat;
//    配置format和dateFormat
    public void configure(String format) {
        this.format = format;
        format = fixDateForJdk(format);
        this.dateFormat = new SimpleDateFormat(format);
    }
//    格式化jdk版本string
    private String fixDateForJdk(String format) {
        if (Constants.JRE_IS_MINIMUM_JAVA7) {
            return format;
        }
        // JDK 6 - fix year formatting

        // a. lower case Y to y
        if (format.contains("Y")) {
            format = format.replace("Y", "y");
        }

        // gotta love regex
        // use lookahead to match isolated y/yyy with yyyy
        format = format.replaceAll("((?<!y)(?:y|yyy)(?!y))", "yyyy");

        return format;
    }

//    设置任务所在的时间
    public String format(String value) {
        if (!StringUtils.hasText(value)) {
            return null;
        }

        Calendar calendar = DateUtils.parseDate(value);
        dateFormat.setCalendar(calendar);
        return dateFormat.format(calendar.getTime());
    }
}
