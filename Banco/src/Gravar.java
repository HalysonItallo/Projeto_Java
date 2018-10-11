import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;



public class Gravar {
public BufferedWriter CriaArq(String vParametro_NomeArq) throws FileNotFoundException  {       
                  OutputStream vCria1 = new FileOutputStream(vParametro_NomeArq);       
                  OutputStreamWriter vCria2 = new OutputStreamWriter(vCria1);       
                  BufferedWriter AOPSai = new BufferedWriter(vCria2);       
                  return AOPSai;
}   
}
