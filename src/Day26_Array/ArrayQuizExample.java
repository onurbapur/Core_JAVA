package Day26_Array;

import java.util.Scanner;

public class ArrayQuizExample {
    public static class Quiz{
        String question;
        String answer;

    }

    public static void main(String[] args) {
        System.out.println("Quiz...");

        String quiz1 ="What is the capital city of Türkiye?\n" +
                "(a) Konya\n" +
                "(b) İstanbul\n" +
                "(c) Urfa\n"+
                "(d) Ankara";

        String quiz2 ="What is the largest(population) city of Türkiye?\n" +
                "(a) Adıyaman\n" +
                "(b) İstanbul\n" +
                "(c) G.Antep\n"+
                "(d) Ankara";

        Quiz[] questions = new  Quiz[2];

        questions[0] = new Quiz();
        questions[0].question=quiz1;
        questions[0].answer="d";

        questions[1] = new Quiz();
        questions[1].question=quiz2;
        questions[1].answer="b";

        quizCoz(questions);//Method call

    }
    public static void quizCoz(Quiz[] questions){
        int dogruCevapSay=0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].question);
            System.out.print("Your answer is...: ");
            String yourAnswer = sc.nextLine();

            if (yourAnswer.equals(questions[i].answer)){
                dogruCevapSay++;
            }
        }
        System.out.println();
        System.out.println("Your number of correct answer is ...: " + dogruCevapSay + "/" + questions.length);
    }

}
