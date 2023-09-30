package Day25_StringClass2;

public class StringConcat {
    public static void main(String[] args) {
        String firstName = "Ahmet ";
        String lastName = "Falanca";
        String fNameAndlName = "";

        System.out.println(firstName + lastName); // + Concat...
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName.concat("Ankara")); //.concat()

        System.out.println("firstName.concat(\"Smith\") = " + firstName.concat("Smith"));
        System.out.println("firstName = " + firstName);

        fNameAndlName = firstName.concat(lastName);
        System.out.println("fNameAndlName = " + fNameAndlName);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        System.out.println("fNameAndlName.concat(\"Hello\") = " + fNameAndlName.concat("Hello"));
        System.out.println("fNameAndlName = " + fNameAndlName);

    }
}
