import java.io.*;
import java.util.Scanner;

public class Ejercicio23CopiaArchivo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("../ArchivoParaEjercicios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("../CopiaArchivoParaEjercicios.txt", true))) {
                    writer.write(linea);
                    writer.newLine(); //salto de línea
                    System.out.println("Línea escrita en el archivo.");
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al escribir en el archivo: " +
                            e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        System.out.println();
        System.out.println("----------LECTURA DEL ARCHIVO ORIGINAL----------");
        try (BufferedReader reader = new BufferedReader(new FileReader("../ArchivoParaEjercicios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        System.out.println();
        System.out.println("----------LECTURA DEL ARCHIVO COPIA----------");
        try (BufferedReader reader = new BufferedReader(new FileReader("../CopiaArchivoParaEjercicios.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        System.out.println();
        System.out.println("-----------SOLICITANDO NOMBRES DE ARCHIVOS---------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué archivo quiere copiar?");
        String archivo = sc.nextLine();
        System.out.println("¿Qué nombre quiere dar al nuevo archivo?");
        String nuevoArchivo = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader("../"+archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("../"+nuevoArchivo, true))) {
                    writer.write(linea);
                    writer.newLine(); //salto de línea
                    System.out.println("Línea escrita en el archivo.");
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al escribir en el archivo: " +
                            e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        System.out.println();
        System.out.println("----------LECTURA DEL ARCHIVO ORIGINAL----------");
        try (BufferedReader reader = new BufferedReader(new FileReader("../"+archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        System.out.println();
        System.out.println("----------LECTURA DEL ARCHIVO COPIA----------");
        try (BufferedReader reader = new BufferedReader(new FileReader("../"+nuevoArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }
    }
}