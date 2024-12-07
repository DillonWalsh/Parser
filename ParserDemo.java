public class ParserDemo {

	public static void main(String[] args) {

		TokenStream tStream = new TokenStream("C:\\Users\\dwals\\Downloads\\Programs\\ScannerParser\\prog1.kay");

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");

	}

}