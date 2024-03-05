package com.lbhf.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateForMat {
    public void timeToAdd() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate =dateFormat.parse("2024-01-18");
        // 将当前日期转换为 Calendar 对象
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        // 增加天数
        int daysToAdd = 18; // 你想要增加的天数
        calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
        // 获取增加天数后的日期
        Date newDate = calendar.getTime();
        // 将日期转换成字符串格式
        String dateString = dateFormat.format(newDate);
        System.out.println("原始日期: " + dateFormat.format(startDate));
        System.out.println("增加天数后的日期: " + dateString);
    }
}
