import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playA;
        boolean pass = true, inputredo;
        Scanner kb = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");
        double sA, sB, sC; //sides of the triangle
        String sideA=" ", sideB, sideC;

        //Loop that oversees all game
        do {

            //Loop that takes care of the input being valid
            do {
                //Loop that validates input A
                do {
                    System.out.print("Enter the first side of your triangle: ");
                    sideA = kb.nextLine();
                    if ((sideA.substring(0).matches("^[0-9]+(\\.[0-9]{1,2})?$"))) { //regex to validate input
                        sA = Double.valueOf(sideA);
                        if(sA>0) { //making sure input is not 0
                            pass = true;
                        }else{
                            System.out.print("Error, enter valid input." + newLine);
                            pass=false;
                        }
                    }else {
                        System.out.print("Error, enter valid input." + newLine);
                        pass = false;
                    }

                } while (!pass);
                sA = Double.valueOf(sideA);
                //Loop that validates input B
                do {
                    System.out.print("Enter the second side of your triangle: ");
                    sideB = kb.nextLine();

                    if (sideB.substring(0).matches("^[0-9]+(\\.[0-9]{1,2})?$")) {
                        sB = Double.valueOf(sideB);
                        if(sB>0){
                            pass=true;
                        }else {
                            System.out.print("Error, enter valid input." + newLine);
                            pass = false;
                        }
                    } else {
                        System.out.print("Error, enter valid input." + newLine);
                        pass = false;
                    }
                } while (!pass);
                sB = Double.valueOf(sideB);
                //Loop that validates input C
                do {
                    System.out.print("Enter the third side of your triangle: ");
                    sideC = kb.nextLine();
                    if (sideC.substring(0).matches("^[0-9]+(\\.[0-9]{1,2})?$"))  {
                        sC = Double.valueOf(sideC);
                        if(sC>0){
                            pass=true;
                        }else{
                            System.out.print("Error, enter valid input." + newLine);
                            pass = false;
                        }
                    } else {
                        System.out.print("Error, enter valid input." + newLine);
                        pass = false;
                    }
                } while (!pass);
                sC = Double.valueOf(sideC);

                triangle p = new triangle();
                inputredo = p.NotATriangle(sA, sB, sC);

            }while (!inputredo);

            triangle t = new triangle(sA, sB, sC);
            t.TriangleT();

            String option;
            //Loop to see if user wants to play again
            do {
                pass = true;
                System.out.print(newLine + "Want to do it again? Press 1 for yes or 2 to exit.");
                option= kb.nextLine();
                if (option.substring(0).matches("^[1-2]$")){
                    pass = true;
                }else{
                    System.out.print("Error, enter valid input." + newLine);
                    pass = false;
                }
            }while(!pass);
            double decision=Double.valueOf(option);
            if(decision== 1)
            {
                playA=true;

            }else{
                playA=false;
                System.out.println("Thank you for using our program");
            }

        }while(playA==true);
    }
}

