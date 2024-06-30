import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosmaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];



        //Estructura de control bucle for
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //Estructura de control bucle while
        while(!palabraAdivinada && intentos < intentosmaximos){
            System.out.println("Palabra a a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra por favor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }

            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto!, te quedan " + (intentosmaximos - intentos) + "intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡Felicidades!, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if(!palabraAdivinada){
            System.out.println("¡Que pena!, te haz quedadp sin intentos, GAME OVER");
        }

        scanner.close();
        
    }
}
