import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileStream {

    public static void main(String[] args) {

       //Método "sujo" de abrir/ler arquivos
//        String path = "E:\\Java\\Arquivos\\src\\files\\nome.txt";
//        FileReader fr = null;
//        BufferedReader br = null;
//
//
//        try{
//            fr = new FileReader(path);
//            br = new BufferedReader(fr);
//
//            String line = br.readLine();
//
//            while(line != null){
//                System.out.println(line);
//                line = br.readLine();
//            }
//        }
//        catch (IOException e ){
//            System.out.println("Error:" + e.getMessage());
//        }
//        finally {
//
//            try {
//                if (br != null) {
//                    br.close();
//                }
//                if (fr != null) {
//                    fr.close();
//                }
//
//            }
//            catch(IOException e){
//                e.printStackTrace();
//            }
//        }

    //Usando Block try with Resources:
        //Método "simplificado"
        String path = "E:\\Java\\Arquivos\\src\\files\\nome.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

    /*
    Bloco try-with-resources:
        • É um bloco try que declara um ou mais recursos, e garante que esses
        recursos serão fechados ao final do bloco

    */




    }

}
