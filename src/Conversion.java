import java.util.HashMap;
import java.util.Map;

public class Conversion {

    public String solution(int n) {
        Map<Integer, String> mySymbols = new HashMap<Integer, String>();
        String myReturnString = "";

        String myInteger = ""+n+"";
        for(int i = myInteger.length()-1; i>=0;i--){
            //1. Isolate digit
            int myDigit =  Integer.parseInt(Character.toString(myInteger.charAt(i)));
            //2. if digit  is 0 ignore
            if(myDigit!=0){
                if(myDigit%5>3){
                    myReturnString = "I" + "V";
                }
                else{
                    for(int k = 0; k<myDigit%5; k++){
                        myReturnString = "I" + myReturnString;
                    }
                }
            }
        }
        return myReturnString;
    }
}
