package start;

public enum RomanNumeral implements IRomanNumeral{
	
	ONE_THOUSAND{

		@Override
		public Integer getDecimalValue() {
			return 1000;
		}

		@Override
		public String getRomanValue() {
			// TODO Auto-generated method stub
			return "M";
		}
		
	},
	FIVE_HUNDRED{

		@Override
		public Integer getDecimalValue() {
			// TODO Auto-generated method stub
			return 500;
		}

		@Override
		public String getRomanValue() {
			// TODO Auto-generated method stub
			return "D";
		}
		
	},
	ONE_HUNDRED{

		@Override
		public Integer getDecimalValue() {
			// TODO Auto-generated method stub
			return 100;
		}

		@Override
		public String getRomanValue() {
			// TODO Auto-generated method stub
			return "C";
		}
		
	},
	FIFTY{

		@Override
		public Integer getDecimalValue() {
			// TODO Auto-generated method stub
			return 50;
		}

		@Override
		public String getRomanValue() {
			// TODO Auto-generated method stub
			return "L";
		}
		
	},
	TEN{

		@Override
		public Integer getDecimalValue() {
			// TODO Auto-generated method stub
			return 10;
		}

		@Override
		public String getRomanValue() {
			// TODO Auto-generated method stub
			return "X";
		}
		
	},
	FIVE{

		@Override
		public Integer getDecimalValue() {
			// TODO Auto-generated method stub
			return 5;
		}

		@Override
		public String getRomanValue() {
			// TODO Auto-generated method stub
			return "V";
		}
		
	},
	ONE{

		@Override
		public Integer getDecimalValue() {
			// TODO Auto-generated method stub
			return 1;
		}

		@Override
		public String getRomanValue() {
			// TODO Auto-generated method stub
			return "I";
		}
		
	};
	
	public static RomanNumeral findRomanNumeralViaRomanChar(String c){
		for(RomanNumeral rn: RomanNumeral.values()){
			if(rn.getRomanValue().equals(c.toUpperCase())){
				return rn;
			}
		}
		return null;
	}
	
	public static RomanNumeral findRomanNumeralViaDecimalInteger(Integer c){
		for(RomanNumeral rn: RomanNumeral.values()){
			if(rn.getDecimalValue().equals(c)){
				return rn;
			}
		}
		return null;
	}

}
