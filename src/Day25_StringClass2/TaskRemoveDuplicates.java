package Day25_StringClass2;

public class TaskRemoveDuplicates {


public static String removeDuplicates(String str){
    String result = "";

    for (int i = 0; i < str.length(); i++) {
        if(!result.contains(str.charAt(i) + "")){
            result += str.charAt(i);
        }
    }
    return result;
}
    public static void main(String[] args) {
        String myStr = "DDEECGDDEEEEFGGDCDD"; //RESULT--> DECGF
        System.out.println("removeDuplicates(myStr) = " + removeDuplicates(myStr));
    }
}
