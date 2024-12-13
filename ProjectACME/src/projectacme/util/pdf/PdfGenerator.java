package projectacme.util.pdf;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;

import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
import java.util.List;
import java.util.Map;

public class PdfGenerator {

    public static void generatePdf(String pdfPath, List<List<Map<String, Object>>> information, List<String> titlesReport){
        try(PdfWriter pdfWriter = new PdfWriter(pdfPath);
            PdfDocument pdfDoc = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDoc)){

            for(int i=0; i<information.size(); i++){
                // * Add title report
                document.add(new Paragraph((titlesReport.get(i)))
                        .setFont(PdfFontFactory.createFont("Helvetica-Bold"))
                        .setFontSize(15));

                // * Create horizontal line
                SolidLine lineDrawer = new SolidLine(); // * Solid line
                lineDrawer.setLineWidth(1); // * Thickness  line
                LineSeparator line = new LineSeparator(lineDrawer);
                line.setWidth(UnitValue.createPercentValue(100)); // * Width line
                document.add(line);

                document.add(new Paragraph(""));
                document.add(new Paragraph(""));

                // * Generate columns
                int columns = information.get(i).get(0).size();
                Table table = new Table(columns);

                // * Add titles

                for(String title: information.get(i).get(0).keySet()){
                    table.addCell(generateTitleCell(title));
                }

                // * Add information columns
                for(Map<String, Object> map: information.get(i)){
                    for(Object value: map.values()){
                        table.addCell((generateTextCell(value)));
                    }
                }

                document.add(table);
                document.add(new Paragraph(""));

            }

            System.out.println("PDF create susessfullly: " + pdfPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static Cell generateTitleCell(String title) throws IOException {
        // * Create Font
        PdfFont fontTitle = PdfFontFactory.createFont("Helvetica-Bold");
        return new Cell().add(new Paragraph(title)
                .setFontSize(9)
                .setFont(fontTitle)
                .setFontColor(new DeviceRgb(255, 255, 255))
                .setTextAlignment(TextAlignment.CENTER))
                .setBackgroundColor(new DeviceRgb(63, 81, 181));
    }

    private static Cell generateTextCell(Object title) throws IOException {
        // * Create Font
        PdfFont fontText = PdfFontFactory.createFont("Helvetica");
        return new Cell().add(new Paragraph(String.valueOf(title))
                .setFontSize(8)
                .setFont(fontText)
                .setTextAlignment(TextAlignment.CENTER));
    }

    public static void openPdf(String pdfPath) {
        try {
            File pdfFile = new File(pdfPath);

            // * Check if Desktop is supported
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                // * Check if the file can be opened
                if (pdfFile.exists()) {
                    desktop.open(pdfFile);
                    System.out.println("PDF file opened successfully");
                } else {
                    System.out.println("File doesn't exist: " + pdfPath);
                }
            } else {
                System.out.println("Desktop functionality is not supported on this system");
            }
        } catch (IOException e) {
            System.err.println("Error open PDF file: " + e.getMessage());
        }
    }
}
