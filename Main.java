package Padrao_Template;

public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PDFReport();
        pdfReport.generateReport();

        System.out.println("-------------------------");

        ReportGenerator excelReport = new ExcelReport();
        excelReport.generateReport();
    }
}
