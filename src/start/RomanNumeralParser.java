package start;

public class RomanNumeralParser {

	public RomanNumeralParser() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer parseRomanToDecimal(String str) throws NonRomanNumeralParseException{
		RomanNumeralNode rnn = new RomanNumeralNode(str);
		return rnn.evaluate();
	}
	
	

	public static void main(String[] args) {
		args[0] = "roman";
		args[1] = "IIVVVC";
		args[1] = "XIIIIVX";
		args[1] = "IVX";
		//args[1] = "XVC";
		args[1] = "XVM VM VVM VM VMV";
		// args[1] = "MIMIM";
		RomanNumeralParser rnp = new RomanNumeralParser();
		if (args[0].toUpperCase().equals("ROMAN")) {
			try {

				System.out.println("Roman decimal value:" + rnp.parseRomanToDecimal(args[1]));

			} catch (NonRomanNumeralParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} else if (args[0].toUpperCase().equals("DECIMAL")) {
			rnp.parseDecimalToRoman(args[1]);
		} else {

		}

	}

	private void parseDecimalToRoman(String string) {
		// TODO Auto-generated method stub
		
	}

}
