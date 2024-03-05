package com.lbhf.util.easyexcel;

import com.alibaba.excel.write.handler.WriteHandler;
import org.apache.poi.ss.usermodel.*;


import java.util.List;

public class CustomCellStyleHandler implements WriteHandler {

    private List<Integer> columnIndexList;

    public CustomCellStyleHandler(List<Integer> columnIndexList) {
        this.columnIndexList = columnIndexList;
    }

    public void sheet(int sheetNo, Sheet sheet) {
        // 在这里可以对整个 Sheet 进行处理
    }

    public void row(int rowNum, Row row) {
        // 在这里可以对每一行进行处理
    }

    public void cell(int cellNum, Cell cell) {
        // 在这里可以对每个单元格进行处理
        if (columnIndexList.contains(cellNum)) {
            // 如果该单元格的列号在指定的列表中
            CellStyle cellStyle = cell.getCellStyle();
            // 根据需要设置单元格样式
            cellStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
            cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        }

    }
}
