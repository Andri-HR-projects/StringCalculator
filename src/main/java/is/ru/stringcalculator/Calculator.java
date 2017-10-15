package is.ru.stringcalculator;
import java.util.List;

public	class	Calculator	{

	public	static int add(String text){
		if(text.equals("")){
			return 0;
		}
    else{
			text = fixDelimeters(text);
			text = fixNewLine(text);
      if(text.contains(",")){
        String numbers[] = text.split(",");
				checkNegative(numbers);
        return sum(numbers);
      }
			return Integer.parseInt(text);
		}
	}

  private static int toInt(String number){
  	return Integer.parseInt(number);
  }

  private static int sum(String [] numbers){
		int total = 0;
  	for(int i = 0; i < numbers.length; i++){
			int nextnumber = toInt(numbers[i]);
			if(nextnumber <= 1000){
	  		total += nextnumber;
			}
		}
  	return total;
	}

	private static void checkNegative(String[] numbers){
		String negatives = new String();
			for(String number: numbers){
				if(toInt(number) < 0){
					negatives += number + ",";
				}
			}

			if(negatives.length() != 0){
				negatives = negatives.substring(0, negatives.length() - 1);
				throw new IllegalArgumentException ("Negatives not allowed: " +negatives);
			}
	}

	private static String fixNewLine(String text){
		if (text.contains("\n")) {
			text = text.replace("\n", ",");
		}
		return text;
	}

	private static String fixDelimeters(String text){
		if(text.contains("//;\n")){
				text = text.replace("//;\n", "");
			}
			if(text.contains(";")){
				text = text.replace(";", ",");
			}
			if(text.contains("\n")){
				text = text.replace("\n", ",");
			}

		return text;
	}

}
