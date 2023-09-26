import java.util.ArrayList;
import java.util.Random;

public class programaSimulacaoDados {
    public static void main(String[] args) {
        
        ArrayList<Integer> resultados = new ArrayList<>();

        int[] contadores = new int[6];
     
        Random rand = new Random();
        
        for (int i = 0; i < 100; i++) {
            int resultado = rand.nextInt(6) + 1;
            resultados.add(resultado);
            
            contadores[resultado - 1]++;
        }

        
        for (int i = 0; i < 6; i++) {
            int valorDado = i + 1;
            int frequencia = contadores[i];
            System.out.println("Valor " + valorDado + ": " + frequencia + " vezes");
        }
    }
}
