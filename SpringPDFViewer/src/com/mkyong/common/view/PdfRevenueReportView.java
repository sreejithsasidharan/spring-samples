package com.mkyong.common.view;

import java.util.Map;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;

public class PdfRevenueReportView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map model, Document document,
			PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Map<String,String> revenueData = (Map<String,String>) model.get("revenueData");

		document.open();
		document.setPageSize(PageSize.A4.rotate());
		
		float w = PageSize.A4.rotate().getWidth();
      float h = PageSize.A4.rotate().getHeight();
      
      System.out.println(" PDF WIDTH :"+w);
      System.out.println(" PDF HEIGHT :"+h);
      
		
			
			document.newPage();
			document.add(new Paragraph("Page 2"));
			PdfContentByte canvas = writer.getDirectContentUnder();
//			Image image = Image.getInstance("http://mtest.hotcoursesabroad.com/mob-cont/agency/2015/pdf/jpg/hci-studyabroad_page1_842x595.jpg");
			Image image = Image.getInstance("http://mtest.hotcoursesabroad.com/mob-cont/agency/2015/pdf/new/hci-studyabroad_v5.png");
			image.scaleToFit(842,595);
			image.setAbsolutePosition(0, 0);			
			canvas.addImage(image);
			    
			document.newPage();
			document.add(new Paragraph("Page 3"));
			image = Image.getInstance("http://mtest.hotcoursesabroad.com/mob-cont/agency/2015/pdf/new/hci-studyabroad_page2split.png");
			image.scaleToFit(842,595);
			image.setAbsolutePosition(0, 0);			
			canvas.addImage(image);
			
			document.newPage();
			document.add(new Paragraph("Page 4"));
			image = Image.getInstance("http://mtest.hotcoursesabroad.com/mob-cont/agency/2015/pdf/new/step_title.png");
			image.scaleToFit(842,595);
			image.setAbsolutePosition(0, 0);			
			canvas.addImage(image);
			
			document.newPage();
			document.add(new Paragraph("Page 5"));
			image = Image.getInstance("http://mtest.hotcoursesabroad.com/mob-cont/agency/2015/pdf/new/page_2_1178.png");
			image.scaleToFit(842,595);
			image.setAbsolutePosition(0, 0);			
			canvas.addImage(image);
			
			document.newPage();
			document.add(new Paragraph("Page 6"));
			image = Image.getInstance("http://mtest.hotcoursesabroad.com/mob-cont/agency/2015/pdf/new/backcover.png");
			image.scaleToFit(842,595);
			image.setAbsolutePosition(0, 0);			
			canvas.addImage(image);
			
			document.newPage();
			document.add(new Paragraph("Page 7"));
			Table table = new Table(3);
			table.setWidth(100);
			//table.setWidth(w);
	       // table.setWidths(new int[]{2, 1, 1});
	        
			Cell monthCell = new Cell("Month");
			Cell revenueCell = new Cell("Revenue");
			Cell logoCell = new Cell("Logo");
			
			/*monthCell.setBorder(Rectangle.NO_BORDER);
			revenueCell.setBorder(Rectangle.NO_BORDER);
			logoCell.setBorder(Rectangle.NO_BORDER);*/
			
			table.addCell(monthCell);
			table.addCell(revenueCell);
			table.addCell(logoCell);		
			
			
			Cell imageCell = new Cell();

			imageCell.addElement( Image.getInstance("http://images3.content-hca.com/commimg/myhotcourses/institution/myhc_106304.jpg"));

			for (Map.Entry<String, String> entry : revenueData.entrySet()) {
				
				table.addCell(entry.getKey());
				table.addCell(entry.getValue());
				table.addCell(imageCell);
				
				// http://www.programcreek.com/java-api-examples/index.php?api=com.lowagie.text.Chunk 
	        }
			
				document.add(table);
				
			document.close();
			
	}

	
}