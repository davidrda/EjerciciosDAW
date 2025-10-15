public class Main {
    public static void main(String[] args) {
        final double pi = 3.14159;
        final String app = "MiApp";
        final String version = "1.0.0";
        String nombre = "Laura";
        int nivel = 1;
        int puntuacion = 0;

        System.out.println("Aplicación: "+app);
        System.out.println("Versión: "+version);
        System.out.println("Valor de PI: "+pi);
        System.out.println("Usuario actual: "+nombre);

        nombre = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.println("Usuario actualizado: "+nombre);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuación actualizada: "+puntuacion);
    }
}
