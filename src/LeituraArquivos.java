
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.File;
import java.io.IOException;
import java.util.*;

public class LeituraArquivos {
    public static void main(String[] args) {

        //Leitura básica arquivos
            File file = new File("E:\\Java\\Arquivos\\src\\files\\nome.txt");
            Scanner scanner = null;

            try{
                scanner = new Scanner(file);
                while(scanner.hasNextLine()){
                    System.out.println(scanner.nextLine());
                }

            }
            catch (IOException e ){
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                if( scanner != null){
                    scanner.close();
                }
            }


    }
    }
