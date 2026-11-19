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
                System.out.println();
        System.out.println("--- RONDA 1 ---");

        // Pregunta 1
        System.out.println("Pregunta 1. ¿Qué tipo de dato almacena números enteros?");
        System.out.println("A) double");
        System.out.println("B) int");
        System.out.println("C) String");
        System.out.print("Respuesta: ");
        String respuesta1 = teclado.nextLine();
        if (respuesta1.equalsIgnoreCase("B")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }

        // Pregunta 2
        System.out.println();
        System.out.println("Pregunta 2. ¿Con qué símbolo termina una instrucción en Java?");
        System.out.println("A) ;");
        System.out.println("B) :");
        System.out.println("C) .");
        System.out.print("Respuesta: ");
        String respuesta2 = teclado.nextLine();
        if (respuesta2.equalsIgnoreCase("A")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }

        // Pregunta 3
        System.out.println();
        System.out.println("Pregunta 3. ¿Qué palabra se usa para declarar una constante?");
        System.out.println("A) static");
        System.out.println("B) const");
        System.out.println("C) final");
        System.out.print("Respuesta: ");
        String respuesta3 = teclado.nextLine();
        if (respuesta3.equalsIgnoreCase("C")) {
            System.out.println("¡Correcto!");
            aciertos++;
        } else {
            System.out.println("Incorrecto.");
        }


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