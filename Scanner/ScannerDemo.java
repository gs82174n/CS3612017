/**
 * @author Christelle
 * done with Nick Krawczeniuk
 * 
 */
public class ScannerDemo {

	private static String tester = "C:\\Users\\cscharff\\Desktop\\TESTSCANNERPARSER2010\\GIVEN\\PARSER\\prog2.jay";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(tester);

		System.out.println(tester);

		while (!ts.isEndofFile()) {
			System.out.print("Token " + counter + " - " );
			Token t = ts.nextToken();
			if(t == null) {
				System.out.println("Token is null");
			} else { System.out.println(t.toString());
			counter = counter+1;
			}
		}
	}
}
