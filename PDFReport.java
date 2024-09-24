package Padrao_Template;

public class PDFReport extends ReportGenerator {

    @Override
    protected void fetchData() {
        System.out.println("Fetching data for PDF report...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing data for PDF report...");
    }

    @Override
    protected void exportReport() {
        System.out.println("Exporting PDF report...");
    }
}

