package is.ru.stringcalculator;
import java.util.List;

public	class	Calculator	{

	public	static int add(String text){
		if(text.equals("")){
			return 0;
		}
    else{
      if (text.contains("\n")) {
        text = text.replace("\n", ",");
      }
      if(text.contains(",")){
        String numbers[] = text.split(",");
        return sum(numbers);
      }
			return Integer.parseInt(text);
		}
	}

  private static int toInt(String number){
  	return Integer.parseInt(number);
  }

  private static int sum(String [] numbers){
		String negatives = new String();
		int total = 0;
  	for(int i = 0; i < numbers.length; i++){
			int nextnumber = toInt(numbers[i]);
			if(nextnumber < 0){
				negatives += numbers[i] + ",";
			}
			if(nextnumber <= 1000){
	  		total += nextnumber;
			}
		}
		if(negatives.length() != 0){
			negatives = negatives.substring(0, negatives.length() - 1);
			throw new IllegalArgumentException ("Negatives not allowed: " +negatives);
		}
  	return total;
	}

}
