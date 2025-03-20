package Tests;

public class PlusWhileExercise {

    public static void main(String [] args){
        int x = 0;

        while(x <=4){

            if (x < 3) {  // cazul când Ana are ceva
                System.out.print("Ana are");
            } else if (x == 4) {  // cazul special pentru x == 4
                System.out.println(" nu are nimic");
                break;  // ieșim din buclă după ce afișăm acest mesaj
            } else {
                System.out.print("Ana");
            }

            x=x+1;

            if(x==1){
                System.out.println(" mere");
            }
            if(x==2){
                System.out.println(" pere");
            }
            if(x==3){
                System.out.println(" struguri");
            }

        }
        x=x+1;
        System.out.println();
    }
}
