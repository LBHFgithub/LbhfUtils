package com.lbhf.util.easyexcel.write;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
public class DemoDataToWrite {
    @ExcelProperty(value = {"主标题","ID"},index = 0)
    private Integer id;
    @ExcelProperty(value = {"主标题","字符串标题"})
    private String string;
    @ExcelProperty(value = {"主标题","日期标题"})
    private Date date;
    @ExcelProperty(value = {"主标题","浮点数标题"})
    private Double doubleDate;
    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;

}
