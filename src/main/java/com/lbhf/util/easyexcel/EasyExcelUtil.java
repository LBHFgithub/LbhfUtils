package com.lbhf.util.easyexcel;

import com.alibaba.excel.EasyExcel;
import java.util.*;

public class EasyExcelUtil {


    public static <T> void exportExcel(String filePath, Class<T> clazz, List<T> dataList, CustomCellStyleHandler styleStrategy) {
        // 导出 Excel，并使用自定义样式策略
        EasyExcel.write(filePath, clazz).sheet("Sheet 1")
                .registerWriteHandler(styleStrategy)// 注册自定义样式策略
                .doWrite(dataList);

    }
}
