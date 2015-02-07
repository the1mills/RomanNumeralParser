package start;

public class RomanNumeralParser {

	public RomanNumeralParser() {

/*
 * Created by Alexander Mills >>>> www.github.com/the1mills
 * 
 * How the RNP works:
 * 
 * A roman numeral looks like this: XIV, XXX, MXIM, MIM, CCCI
 * this program also can parse very big and complex (or nonsensical/redundant) Roman Numerals like:
 * 
 * XMX (Xs cancel each other)
 * 
 * or even 
 * 
 * XVMCDVDLXLLLXLLDDD
 * 
 * as our first example -
 * 
 * Given this input: CXMXMI
 * 
 * CXMXMI = 1000 - (100+10) + (1000 - 10 + 1) = 1881
 * 
 * It goes through the full string argument and makes a binary tree, each node contains a left child node and right child node. It starts with the first highest argument, which happens to be the first
 * occurrence of M, but it could be any Roman letter, whichever is the fist occurrence of the biggest.
 * 
 * It then breaks into a tree:
 * 
 * ---M
 * -----CX (on the left)
 * -----XMI (on the right)
 * 
 * this is further broken down to
 * 
 * ---M
 * ------CX
 * ----------0
 * ----------X
 * -------------10
 * ------XMI
 * ----------X
 * -------------10
 * ----------I
 * -------------1
 * 
 * 
 * for a more complex example, we have this:
 * 
 * CDXVMXMLI
 * 
 * = 1000 + (1000 - 10 + (50 + 1)) - (500 - 100 + (10 + 5)) = 1626
 * 
 * ---M
 * ------CDXV
 * ----------C
 * ----------XV
 * -------------0
 * -------------5
 * ------XMLI
 * ----------X
 * ----------LI
 * -------------0
 * -------------1
 * 
 */
	}
	
	private Integer parseRomanToDecimal(String str) throws NonRomanNumeralParseException{
		RomanNumeralNode rnn = new RomanNumeralNode(str);
		return rnn.evaluate();
	}
	

	public static void main(String[] args) throws BadCommandLineToken, NotEnoughArguments {
		
		
		if(args.length < 2){
			 throw new NotEnoughArguments("Acceptable command line input is 'toroman xiviv' or 'todecimal 554'");
		}
		RomanNumeralParser rnp = new RomanNumeralParser();
		if (args[0].toUpperCase().equals("TODECIMAL")) {
			try {

				System.out.println("Roman decimal value:" + rnp.parseRomanToDecimal(args[1]));

			} catch (NonRomanNumeralParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} else if (args[0].toUpperCase().equals("TOROMAN")) {
			System.out.println(rnp.parseDecimalToRoman(args[1]));
		} else {
             throw new BadCommandLineToken(args[0]);
		}

	}

	private String parseDecimalToRoman(String string) {
		
		return "Currently, the RNP can only parse a roman numeral to a decimal integer. In the future, I will write it so that it can parse decimals integers into roman numerals.";
		
	}

}
