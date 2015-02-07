package start;

public class RomanNumeralNode implements IEvaluateRomanNumeral {

	private String rnRepresentation;
	private RomanNumeral rnValue;
	private RomanNumeralNode rnnLeft;
	private RomanNumeralNode rnnRight;

	public RomanNumeralNode(String str) {
		this.setRnRepresentation(str);
	}

	@Override
	public Integer evaluate() throws NonRomanNumeralParseException {

		if (rnRepresentation.length() == 0) {
			return 0;
		} else if (rnRepresentation.length() == 1) {
			if (RomanNumeral.findRomanNumeralViaRomanChar(String
					.valueOf(rnRepresentation.charAt(0))) != null) {
				rnValue = RomanNumeral.findRomanNumeralViaRomanChar(String
						.valueOf(rnRepresentation.charAt(0)));
				return rnValue.getDecimalValue();
			} else {
				throw new NonRomanNumeralParseException();
			}
		} else {
			for (int i = 0; i < rnRepresentation.length(); i++) {

				char c = rnRepresentation.charAt(i);
				String val = String.valueOf(c);
				RomanNumeral rn = RomanNumeral
						.findRomanNumeralViaRomanChar(val);
				if (rn == null) {
					throw new NonRomanNumeralParseException();
				}
				if (biggerNumberToTheRight(
						rn,
						rnRepresentation.substring(i + 1,
								rnRepresentation.length()))) {
					continue;
				} else {
					rnnLeft = new RomanNumeralNode(rnRepresentation.substring(
							0, i));
					rnnRight = new RomanNumeralNode(rnRepresentation.substring(
							i + 1, rnRepresentation.length()));
					return rn.getDecimalValue() + rnnRight.evaluate()
							- rnnLeft.evaluate();
				}

			}

		}
		return null;
	}

	private boolean biggerNumberToTheRight(RomanNumeral rn, String rightString)
			throws NonRomanNumeralParseException {

		for (int i = 0; i < rightString.length(); i++) {
			char c = rightString.charAt(i);
			String val = String.valueOf(c);
			RomanNumeral rnTemp = RomanNumeral
					.findRomanNumeralViaRomanChar(val);
			if (rn == null || rnTemp == null) {
				throw new NonRomanNumeralParseException();
			}
			if (rnTemp.getDecimalValue() > rn.getDecimalValue()) {
				return true;
			}
		}
		return false;
	}

	public String getRnRepresentation() {
		return rnRepresentation;
	}

	public void setRnRepresentation(String rnRepresentation) {
		this.rnRepresentation = rnRepresentation;
	}

	public RomanNumeral getRnValue() {
		return rnValue;
	}

	public void setRnValue(RomanNumeral rnValue) {
		this.rnValue = rnValue;
	}

}
