package exceptionHandling;

public class StringToInt   {

    public static String convertStringToInt(String str) throws NumberFormatException {
        try {
            return ""+Integer.parseInt(str);
        }
        catch(NumberFormatException ex){
            return "Inside the Exception \t"+ex.getMessage();
        }
    }

    public static void main(String[] args) {
        System.out.println( StringToInt.convertStringToInt("abc"));
    }
}

