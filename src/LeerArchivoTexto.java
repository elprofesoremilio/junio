import java.io.*;

public class LeerArchivoTexto {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        // BufferedReader --> FileReader --> File

        File file = new File(nombreArchivo);
        FileReader fr = null;
        BufferedReader br = null;
        System.out.println("-------- Inicio de archivo --------");

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String linea;

            while ((linea=br.readLine())!=null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir lectura de archivo");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        } finally {

            try {
                if (br!=null) {
                    br.close();
                }
                if (fr!=null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }

        System.out.println("---------- Fin de archivo ----------");


    }
}
