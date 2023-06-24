package kerites;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class keritesek {

    private int paros;
    private int szelesseg;
    private String szin;

    public keritesek(int paros, int szelesseg, String szin) {
        this.paros = paros;
        this.szelesseg = szelesseg;
        this.szin = szin;
    }

    public int getParos() {
        return paros;
    }

    public int getSzelesseg() {
        return szelesseg;
    }

    public String getSzin() {
        return szin;
    }

    public void setParos(int paros) {
        this.paros = paros;
    }

    public void setSzelesseg(int szelesseg) {
        this.szelesseg = szelesseg;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    @Override
    public String toString() {
        return paros + " " + szelesseg + " " + szin;
    }

    public static void main(String[] args) {
        int index = 0;
        keritesek[] keritesek = new keritesek[1000];
        int telkek=0;
        int paratlan=-1;
        int paros=0;
  

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("kerites.txt"), "UTF-8"));
            String sor = "";

  
            while (sor != null) {
                sor = br.readLine();
                if (sor != null) {
                    String[] darab = sor.split(" ");
                    
                    if (darab.length == 3) {
                        keritesek[index] = new keritesek(Integer.parseInt(darab[0]), Integer.parseInt(darab[1]), darab[2]);
                    } else {
                        keritesek[index] = new keritesek(Integer.parseInt(darab[0]), Integer.parseInt(darab[1]), darab[2]);
                    }
                    if((Integer.parseInt(darab[0]))==1) {
                    	paratlan+=2;
                    	System.out.println((Integer.parseInt(darab[0])));                    	                    
                   } else {
                	   paros+=2;
                	   System.out.println((Integer.parseInt(darab[0])));  
                   }
                    
                }
                
                index++;
                
            }
            
            br.close();
            telkek=index-1;
            
            
        } catch (IOException e) {
            System.out.println("hiba");
        }
        for (int i = 0; i < keritesek.length; i++) {
            if (keritesek[i] != null) {
                //System.out.println(keritesek[i].toString());
                
                
            }
        }System.out.println("Eladott telek= "+telkek);
        System.out.println("Utolso paratlan telek szama= "+paratlan);
        System.out.println("Utolso paros telek szama= "+paros);
        System.out.println("Utolso eladott adatok= "+keritesek[index-2]);
        
    }
}
