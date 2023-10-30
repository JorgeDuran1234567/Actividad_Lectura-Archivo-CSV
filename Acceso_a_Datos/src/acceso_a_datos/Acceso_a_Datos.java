/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso_a_datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 *
 * @author jorge
 */
public class Acceso_a_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\jorge\\OneDrive\\Escritorio\\2º DAM\\REPETICIÓN\\Acceso a Datos\\Tema1\\AlumnosNotas.txt";
        String outputFile = "C:\\Users\\jorge\\OneDrive\\Escritorio\\2º DAM\\REPETICIÓN\\Acceso a Datos\\Tema1\\notasMedias.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length >= 2) {
                    String nombre = parts[0];
                    double nota1 = Double.parseDouble(parts[1]);
                    double nota2 = Double.parseDouble(parts[2]);
                    double nota3 = Double.parseDouble(parts[3]);
                    double notaMedia = (nota1 + nota2 + nota3)/3;

                    writer.println(nombre + ": " + notaMedia);
                }
            }

            System.out.println("Notas medias calculadas y guardadas en " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
