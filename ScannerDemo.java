
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// This needs to be changed !
	private static String file1 = "C:\\Users\\dwals\\Downloads\\Programs\\ScannerParser\\prog1.kay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		Token tk = ts.nextToken(); 
		while (!ts.isEndofFile()) {
			// TO BE COMPLETED
			//Token tk = ts.nextToken(); 
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
			tk = ts.nextToken(); 
		}
	}
}
