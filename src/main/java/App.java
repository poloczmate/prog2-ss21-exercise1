public class App {
    public static boolean checkPassword(String toCheck){
        // TODO: 08.03.21 Klein und Gross auch
        // TODO: 08.03.21 Muss Zahlen
        // TODO: 08.03.21 min 1 Ziffer von "()#$?!%/@", andere nicht erlaubt
        // TODO: 08.03.21 max 2 Zahlen im Reihenfolge
        // TODO: 08.03.21 maximal 3 Zahlen nacheinander

        //length check
        if (toCheck.length() > 25 || toCheck.length() < 8) return false;

        //Zahlen muss
        if (!toCheck.matches(".*\\d.*")) return false;

        
        return true;
    }
}
