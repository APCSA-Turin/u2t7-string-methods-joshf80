public class CustomStringMethods {
    public CustomStringMethods() {}

    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() <= maxLength) {
            return false;
        }
        return true;
    }
    
    public String funnyString(String str, int idx) {
        return str.substring(idx, idx + 1) + str + str.substring(idx, idx + 1);
    }

    public String halvesReversed(String myString) {
        myString = myString.substring(myString.length() / 2) + myString.substring(0, myString.length() / 2);
        return myString;
    }  
    
}
