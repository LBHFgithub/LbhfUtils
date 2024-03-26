package com.lbhf.util.easyexcel.read;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 基础数据类.这里的排序和excel里面的排序一致
 * @author LBHF
 * @date 2024/3/26
 * 
 */
@Getter
@Setter
public class DemoData {

    private String string;  //样例字符串字段
    @JSONField(format = "yyyy-MM-dd HH:mm:ss") //防止JSON转换成时间戳
    private Date date;  //样例日期字段
    private Double doubleDate;  //样例浮点数字段


}
