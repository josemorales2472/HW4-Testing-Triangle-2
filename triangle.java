/**
 * Created by Daniel on 9/15/2016.
 */
public class triangle {
    double sideA, sideB, sideC;

        public triangle(){

        }

        public triangle(double a, double b, double c){
            this.sideA= a;
            this.sideB= b;
            this.sideC= c;
        }

        public static boolean NotATriangle(double a, double b, double c){
            boolean pass=true;
            if(((a+b)<c)||((b+c)<a)) {
                System.out.print("Error. Please enter appropriate values for a triangle.");
                System.out.println();
                pass = false;
            }
            return pass;
        }

        public void TriangleT(){

            if(sideA == sideB && sideA == sideC && sideB==sideC) {
                System.out.print("This is an equilateral triangle. Thank you for our using our program.");
                System.out.println();
            }
            else if((sideA==sideB && sideB!=sideC)||(sideA==sideC&& sideB!= sideA)||(sideB==sideC && sideA!=sideB) ){
                System.out.print("This is an isosceles triangle. Thank you for our using our program.");
                System.out.println();
            }
            else {System.out.print("This is an scalene triangle. Thank you for our using our program.");}
            System.out.println();
        }
}


