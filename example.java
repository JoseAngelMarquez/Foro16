import java.io.File;

public class ListarDirectorios {
    public static void main(String[] args) {
        String ruta = System.getProperty("user.dir");
        System.out.println("Ruta actual: " + ruta);

        File carpeta = new File(ruta);
        String[] archivos = carpeta.list();

        if (archivos != null) {
            System.out.println("Contenido del directorio:");
            for (String archivo : archivos) {
                System.out.println(" - " + archivo);
            }
        } else {
            System.out.println("No se pudo acceder al directorio.");
        }
    }
}
