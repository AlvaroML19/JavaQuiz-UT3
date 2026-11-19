import java.util.Scanner;

public class JavaQuiz {

    public static void main(String[] args) {

        // Scanner para leer las respuestas del usuario
        Scanner teclado = new Scanner(System.in);

        // Variable compartida para contar los aciertos
        int aciertos = 0;

        // Presentación del concurso
        System.out.println("========== JAVAQUIZ ==========");
        System.out.println("Concurso de preguntas sobre Java");
        System.out.println("Responde escribiendo A, B o C.");

        // INICIO RONDA 1 - INTEGRANTE A


        // FIN RONDA 1 - INTEGRANTE A


        // INICIO RONDA 2 - INTEGRANTE B
        System.out.println();
        System.out.println("--- RONDA 2 ---");

        // Pregunta 4
        System.out.println("Pregunta 4. ¿Cuál es el primer índice de un array en Java?");
        System.out.println("A) 1");
        System.out.println("B) -1");
        System.out.println("C) 0");
        System.out.print("Respuesta: ");
        String respuesta4 = teclado.nextLine();
        if (respuesta4.equalsIgnoreCase("C")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }


        // FIN RONDA 2 - INTEGRANTE B


        // RESULTADO FINAL - INTEGRANTE B


        // Cerrar Scanner
        teclado.close();
    }
}