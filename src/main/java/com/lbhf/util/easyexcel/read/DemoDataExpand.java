package com.lbhf.util.easyexcel.read;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.data.CellData;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;
import org.apache.poi.ss.formula.functions.T;

import java.util.Date;

/**
 * 实体拓展
 * @author LBHF
 * @date 2024/3/26
 *
 */
@Getter
@Setter
public class DemoDataExpand {

    private String id;  //样例字符串字段
    /**
     * 用名字去匹配，这里需要注意，如果名字重复，会导致只有一个字段读取到数据
     */
    @ExcelProperty(value = "字符串标题",converter = CustomStringStringConverter.class)
    private String string;  //样例字符串字段
    @ExcelProperty("日期标题")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;  //样例日期字段
    /**
     * 强制读取第三个 这里不建议 index 和 name 同时用，要么一个对象只用index，要么一个对象只用name去匹配
     * 读取指定列
     */
    @ExcelProperty(index = 2)  //index列从0开始
    private Double doubleDate;  //样例浮点数字段
    /**
     * 我自定义 转换器，不管数据库传过来什么 。我给他加上“自定义：”
     */
    @ExcelProperty(converter = CustomStringStringConverter.class,value = "自定义转换器",index = 3)
    private String dateTest;

    // 这里注意 虽然是日期 但是 类型 存储的是number 因为excel 存储的就是number T泛型
    private CellData<T> cellData;


}
