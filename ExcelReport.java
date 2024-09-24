package Padrao_Template;

public class ExcelReport extends ReportGenerator {

    @Override
    protected void fetchData() {
        System.out.println("Fetching data for Excel report...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for Excel report...");
    }

    @Override
    protected void exportReport() {
        System.out.println("Exporting Excel report...");
    }
}

