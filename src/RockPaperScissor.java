
import java.util.Random;


public class RockPaperScissor {

    public static void main(String[] args) {
        Random ran = new Random();
        int escolha =ran.nextInt(1,3);
        if(escolha > 1){
            System.out.print("Tesoura");
        }else if(ran.nextInt(0,2) < 1){
            System.out.println("Pedra");
        }else{
            System.out.println("Papel");
        }

    }
}
