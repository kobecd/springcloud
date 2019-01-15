package com.rongyi.core.common;

import org.apache.poi.ss.usermodel.Sheet;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/15
 */
public class ExcelHelper {

    private Integer startLine;

    private Integer pageSize;

    private Sheet sheet;

    public Integer getStartLine() {
        return startLine;
    }

    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Sheet getSheet() {
        return sheet;
    }

    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }

    @Override
    public String toString() {
        return "ExcelHelper{" +
            "startLine=" + startLine +
            ", pageSize=" + pageSize +
            ", sheet=" + sheet +
            '}';
    }
}
