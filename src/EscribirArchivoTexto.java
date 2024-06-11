import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivoTexto {
    public static void main(String[] args) {
        String nombreArchivo = "pruebaEscritura.txt";

        // BufferedWriter --> FileWriter --> File

        File file = new File(nombreArchivo);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            bw.write("Hola esto es una prueba");
            bw.newLine();
            bw.write("Voy a probar salto de línea \n");
            bw.write("¿Nueva línea?");

        } catch (IOException e) {
            System.out.println("Error al escribir");
        } finally {
            try {
                if (bw!=null) {
                    bw.close();
                }
                if (fw!=null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar");
            }
        }
    }
}
