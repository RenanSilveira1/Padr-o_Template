package Padrao_Template;

public abstract class ReportGenerator {
    
    // Template method
    public final void generateReport() {
        fetchData();
        processData();
        exportReport();
    }

    // Passos que podem ser customizados pelas subclasses
    protected abstract void fetchData();
    protected abstract void processData();
    protected abstract void exportReport();
}

