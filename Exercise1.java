public class Exercise1 {

    static boolean iwillBehave = true;
    static boolean IwillGraduate = true;
    public static void main(String[] args) throws Exception {

        // Agreement
        // Precondition

        assert iwillBehave == true : "gala parin ako ng gala";

        //method
        College();

        // Postcondition
        assert IwillGraduate == true : "Sana grumaduate";
    }

    static void College() {

        IwillGraduate = false;
        System.out.println("Sana ol Graduate");


    }
}