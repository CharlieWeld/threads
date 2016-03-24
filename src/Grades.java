import java.util.ArrayList;

/**
 * Created by Charlie on 24/03/2016.
 */
public class Grades {

    private String passwords[];
    private ArrayList<String> grades;

    public Grades(){
        passwords = new String[]{"pass1", "pass2", "pass3"};
        grades = new ArrayList<String>();
    }


    public static void main(String args[]){

        Grades g = new Grades();

        g.grades.add("grade1");
        g.grades.add("grade2");
        g.grades.add("grade3");

        int num = 1;
        String pass = "pass2";

        if (g.passwords[num].equals(pass))
            System.out.println(g.grades.get(num));
        else
            System.out.println("Incorrect Password");



    }
}
