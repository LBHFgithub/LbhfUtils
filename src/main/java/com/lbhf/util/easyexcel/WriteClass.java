package com.lbhf.util.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WriteClass {
    @ExcelProperty({"主标题", "名字"})
    private String name;
    @ExcelProperty({"主标题", "年龄"})
    private int age;
    @ExcelProperty({"主标题", "性别"})
    private int sex;
    @ExcelProperty({"主标题", "地址"})
    private String adress;
}
