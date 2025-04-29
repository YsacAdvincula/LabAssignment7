public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");
        textDocumentPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPdf(String fileName, int pages) {
        PdfDocument doc = (PdfDocument) pdfPrototype.clone();
        doc.setFileName(fileName);
        doc.setPageCount(pages);
        return doc;
    }

    public Document getTextDocumentPrototype() {
        return textDocumentPrototype.clone();
    }

    public Document getSpreadsheetPrototype() {
        return spreadsheetPrototype.clone();
    }
}