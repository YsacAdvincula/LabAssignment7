public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf1 = registry.createPdf("annual_report_2024.pdf", 150);
        pdf1.open();

        Document text = registry.getTextDocumentPrototype();
        text.open();

        Document spreadsheet = registry.getSpreadsheetPrototype();
        spreadsheet.open();

        Document pdf2 = registry.createPdf("summary_report.pdf", 30);
        pdf2.open();
    }
}