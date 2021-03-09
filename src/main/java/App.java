public class App {
    public static boolean checkPassword(String toCheck){
        // TODO: 08.03.21 max 2 Zahlen im Reihenfolge
        // TODO: 08.03.21 maximal 3 Zahlen nacheinander

        //length check
        if (toCheck.length() > 25 || toCheck.length() < 8) return false;

        //Zahlen muss
        if (!toCheck.matches(".*\\d.*")) return false;

        //Klein und Großbuchstaben auch und Ziffer
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
        return true;
    }
}
