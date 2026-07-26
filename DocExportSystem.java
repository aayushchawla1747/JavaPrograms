/*7. Document Export System

Setup:

Create an interface Exportable containing method:

void export();

Create classes:

* PDFExporter → prints:
    "Report exported as PDF."
* ExcelExporter → prints:
    "Report exported as Excel."

Task:
Use an Exportable reference to export a report as PDF.*/

abstract class Exporter{
	abstract public void export();
}

class PDFExporter extends Exporter{
	public void export(){
		System.out.println("Report exported as PDF.");
	}
}

class ExcelExporter extends Exporter{
	public void export(){
		System.out.println("Report exported as Excel.");
	}
}

class DocExportSystem{
	public static void main(String[] args){
		Exporter ref;
		PDFExporter p1=new PDFExporter();
		ExcelExporter e1=new ExcelExporter();
		ref=p1;
		ref.export();
	}
}