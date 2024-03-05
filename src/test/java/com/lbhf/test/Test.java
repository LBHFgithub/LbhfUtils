package com.lbhf.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.handler.WriteHandler;
import com.lbhf.util.easyexcel.CustomCellStyleHandler;
import com.lbhf.util.easyexcel.EasyExcelUtil;
import com.lbhf.util.easyexcel.WriteClass;
import org.apache.poi.ss.usermodel.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.*;
import java.util.stream.Collectors;


@SpringBootTest
public class Test {
    @org.junit.jupiter.api.Test
    public void test01() {
        String a = "LBHF";
        String b = "LBHF";
        a.equals(b);
    }

    public static String maskMiddle(String input) {
        int length = input.length();
        // 如果字符串长度小于等于4，则直接返回原字符串
        if (length <= 4) {
            return input;
        }

        // 获取需要替换为星号的部分的起始位置和结束位置
        int start = 6;  // 从字符串的四分之一位置开始
        int end = input.length() - 4;  // 到字符串的四分之三位置结束

        // 将起始位置到结束位置的部分替换为星号
        String maskedPart = input.substring(start, end).replaceAll(".", "*");

        // 将原始字符串的起始位置到结束位置的部分替换为星号后的字符串
        return input.substring(0, start) + maskedPart + input.substring(end);
    }

    public static int CalculateAge(String idCard) {
        int age = 0;
        String birthdayStr = "";
        if (idCard.length() == 18) {
            //获取生日 eg:19991212
            birthdayStr = idCard.substring(6, 14);
            //转换Date
            Calendar date = Calendar.getInstance();
            date.set(Integer.valueOf(birthdayStr.substring(0, 4)), Integer.valueOf(birthdayStr.substring(4, 6)), Integer.valueOf(birthdayStr.substring(6, 8)));
            Date birthday = date.getTime();
            //当前日期
            Date currentDate = new Date();
            // 计算年龄
            age = currentDate.getYear() - birthday.getYear();

            // 如果生日还未到，年龄减一
            if (currentDate.getMonth() < birthday.getMonth() || (currentDate.getMonth() == birthday.getMonth() && currentDate.getDate() < birthday.getDate())) {
                age--;
            }
        }
        return age;
    }

    @org.junit.jupiter.api.Test
    public void test03() {
        List<WriteClass> userList = Arrays.asList(
                new WriteClass("Alice", 25, 1, "123"),
                new WriteClass("Bob", 30, 2, "aa")
        );

        String exportFilePath = "exported_data_with_custom_title_2style.xlsx";
        EasyExcelUtil.exportExcel(exportFilePath, WriteClass.class, userList, new CustomCellStyleHandler(List.of(10)));


        System.out.println("Excel 导出成功，文件路径：" + exportFilePath);
    }

    @org.junit.jupiter.api.Test
    public void testList() {
        // 获取 Java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }
    }

}

