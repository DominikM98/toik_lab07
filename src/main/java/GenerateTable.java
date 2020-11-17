import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



import java.io.FileOutputStream;

public class GenerateTable {

    public static void main(String args[]) throws Exception {
       Document document = new Document();

       PdfWriter.getInstance(document, new FileOutputStream("result.pdf"));

       document.open();

       Paragraph intro = new Paragraph("Resume\n\n");
        intro.setAlignment(Element.ALIGN_CENTER);

       PdfPTable table = new PdfPTable(2);

       PdfPCell cells [] = {
               new PdfPCell(new Phrase("First name")),
               new PdfPCell(new Phrase("Dominik")),
               new PdfPCell(new Phrase("Last name")),
               new PdfPCell(new Phrase("Majcher")),
               new PdfPCell(new Phrase("Profession")),
               new PdfPCell(new Phrase("Student")),
               new PdfPCell(new Phrase("Education")),
               new PdfPCell(new Phrase("PWSZ w Tarnowie")),
               new PdfPCell(new Phrase("Summary")),
               new PdfPCell(new Phrase("I am student and I don't work as IT worker"))

       };

        for (PdfPCell c: cells){
            c.setPadding(5);
            table.addCell(c);
        }

        document.add(intro);
        document.add(table);

        document.close();

    }
}
