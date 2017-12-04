public class ParserDemo {

	public static void main(String[] args) {
		
		private static String file1 = 
				"C:\\Users\\cscharff\\Desktop\\TESTSCANNERPARSER2010\\GIVEN\\PARSER\\prog2.jay";
				 //"C:\\Users\\gianna8123\\Desktop\\jay\\test2.jay";

		
		TokenStream tStream = new TokenStream(file1);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}

