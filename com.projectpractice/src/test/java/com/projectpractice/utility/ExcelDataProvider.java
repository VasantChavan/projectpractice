package com.projectpractice.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataProvider {

    private Workbook workbook;

    // Constructor to initialize Excel data provider
    public ExcelDataProvider(String filePath) {
        File src = new File(filePath); // Excel file path
        try {
            FileInputStream fis = new FileInputStream(src); // Load the file
            workbook = WorkbookFactory.create(fis); // Initialize workbook using Apache POI
        } catch (IOException e) {
            System.out.println("Error initializing Excel Data Provider: " + e.getMessage());
        }
    }

    // Method to get the workbook
    public Workbook getWorkbook() {
        return workbook;
    }

    // Additional methods to retrieve data can be added here, for example:
    // Method to get data from a specific sheet, row, and cell
    public String getData(int sheetIndex, int rowIndex, int cellIndex) {
        return workbook.getSheetAt(sheetIndex).getRow(rowIndex).getCell(cellIndex).toString();
    }
}