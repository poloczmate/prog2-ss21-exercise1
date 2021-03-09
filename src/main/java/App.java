public class App {
    public static boolean checkPassword(String toCheck){
        //length check
        if (toCheck.length() > 25 || toCheck.length() < 8) return false;

        //Zahlen muss
        if (!toCheck.matches(".*\\d.*")) return false;

        //Klein und Großbuchstaben und Ziffer auch
        Boolean hasUpper = false;
        Boolean hasLower = false;
        Boolean hasZiffer = false;
        String ziff = "()#$?!%/@";
        for (int i = 0; i < toCheck.length(); i++){
            if (Character.isUpperCase(toCheck.charAt(i))){
                hasUpper = true;
            }else if (Character.isLowerCase(toCheck.charAt(i))){
                hasLower = true;
            }else if (ziff.indexOf(toCheck.charAt(i)) != -1){
                hasZiffer = true;
            }
        }
        if (!hasLower || !hasUpper || !hasZiffer) return false;

        //check continuous numbers
        for (int i = 0; i < toCheck.length()-2; i++){
            if (Character.isDigit(toCheck.charAt(i)) && Character.isDigit(toCheck.charAt(i+1)) && Character.isDigit(toCheck.charAt(i+2))){
                if ((int)toCheck.charAt(i) == (int)toCheck.charAt(i+1)-1 && (int)toCheck.charAt(i) == (int)toCheck.charAt(i+2)-2) return false;
            }
        }

        //check same continuous numbers
        for (int i = 0; i < toCheck.length()-3; i++){
            if (Character.isDigit(toCheck.charAt(i)) && Character.isDigit(toCheck.charAt(i+1)) && Character.isDigit(toCheck.charAt(i+2)) && Character.isDigit(toCheck.charAt(i+3))){
                if (toCheck.charAt(i) == toCheck.charAt(i+1) && toCheck.charAt(i) == toCheck.charAt(i+2) && toCheck.charAt(i) == toCheck.charAt(i+3)) return false;
            }
        }
        return true;
    }
}
