package com.lbhf.util.easyexcel.write;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.lbhf.util.easyexcel.read.CustomStringStringConverter;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@ContentRowHeight(100)
@HeadRowHeight(20)
@ColumnWidth(25)//列宽
public class DemoDataToWriteExpand {
    @ExcelProperty(value = {"主标题","ID"})
    private Integer id;
    //自定义处理器
    @ExcelProperty(value = {"主标题","字符串"},converter = CustomStringStringConverter.class)
    private String string;
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty({"主标题","日期"})
    private Date date;
    @NumberFormat("#.##%")
    @ColumnWidth(50)//
    @ExcelProperty({"主标题","浮点数"})
    private Double doubleDate;
}
