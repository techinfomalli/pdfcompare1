package MyPdfCompare.MyPdfCompare;

import java.io.IOException;
import java.util.Scanner;

import de.redsix.pdfcompare.PdfComparator;

public class App {
	public static void main(String[] args) throws IOException {
		//System.out.println("Srirama");
		//System.out.println("Nevekalavu");
		System.out.println("Welcome!!!");
		System.out.println("GAIC pdf compare");
		System.out.println("This tool need three inputs as filenames with full path \n"
				+ "Example: C:\\Users\\rama\\Downloads\\PAYSLIP1.pdf \n"
				+ "1) File1 for the first file \n"
				+ "2) File2 for the second file \n"
				+ "3) diffrence file where it should go.\n");

		// @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// String input
		System.out.println("Enter file1 name.");
		String File1 = sc.nextLine();
		System.out.println("Enter file2 name.");
		String File2 = sc.nextLine();

		System.out.println("Enter path/file name where the differences to go.");
		String Diff = sc.nextLine();
		System.out.println("Processing...");

		// String File1="C:\\Users\\rama\\Downloads\\PAYSLIP1.pdf";
		// String File2="C:\\Users\\rama\\Downloads\\PAYSLIP2.pdf";
		//System.out.println(System.getProperty("user.home"));

		// String Diff="C:\\Users\\rama\\Downloads\\diff.pdf";

		// String home= System.getProperty("user.home");
		// String Diff=null;
		// Diff=home+Diff;

		// new PdfComparator(File1, File2).compare().writeTo(Diff);
		boolean isEquals = new PdfComparator(File1, File2).compare().writeTo(Diff);
		if (!isEquals) {
			System.out.println("Differences found!");
			System.out.println("Please find differences output file at " + Diff);
		}

	}
}
