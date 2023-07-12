package hegyek;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

import valasztas.választás;

import java.io.FileReader;
public class mohegyek {

   public static void main(String[] args) {
	   Scanner bevitel = new Scanner(System.in);
	   int osszes_hegy=0;
	   double atlagmagassag=0;
	   double osszes_magassag=0;
	   int legmagasabb_hegy=0;
	   int feladat_7_megoldas=0;
	   double feet = 3.280839895;
	   int feet_ertek=3000;
       // TODO Auto-generated method stub
	   beolvasas[] beolvasas=new beolvasas[1000];

       int borzsonymagassag=0;
	   
	   
       System.out.println("Feladat 1 adatok beolvasasa kesz\n");
	   //Feladat 1
       try {
           System.setProperty("File.encoding","UTF-8");
           BufferedReader br=new BufferedReader(new FileReader("hegyekMo.txt"));
           String sor=";";
           br.readLine();
           int index=0;
      
           while(sor!=null) {
               sor=br.readLine();
               if (sor!=null) {
                   
                   String[] darab=sor.split(";");
                   if (darab.length==3) {
                	   beolvasas[index]=new beolvasas(darab[0],darab[1],(Integer.parseInt(darab[2])));
                	   if((Integer.parseInt(darab[2])*feet>feet_ertek)){                         	   
                		   feladat_7_megoldas++;
                	   }
                	   
                       
                   }
                   else {
                	   beolvasas[index]=new beolvasas(darab[0],darab[1],(Integer.parseInt(darab[2])));


                   }


                   
                   
                   osszes_magassag=osszes_magassag+Integer.parseInt(darab[2]);
                   
                   osszes_hegy++;
               }
               index++;
               
               
               
           }

           br.close();
           
           /*
            Feladat 5 Határozza meg és írja ki a képernyőre a minta szerint a legmagasabb hegy adatait!
				Feltételezheti, hogy nem alakult ki holtverseny.
				
			Feladat 6 Kérjen be a felhasználótól egy magasságértéket! A bevitt adatot nem kell ellenőriznie.
				Döntse el, hogy a Börzsöny hegységben található-e a megadott értéknél magasabb
				hegycsúcs! A keresést ne folytassa, ha a választ meg tudja adni! A képernyőre írást a
				minta szerint végezze!

*
*
*/
           
        //Feladat 2
           System.out.println("Feladat 2 adatok kiirasa: ");
   }catch (IOException e) {System.out.println("hiba");}
       for (int i=0;i<beolvasas.length;i++) {
           if (beolvasas[i]!=null) {
           
           System.out.println(beolvasas[i].toString());
           
       }
       }
       atlagmagassag=osszes_magassag/osszes_hegy;
       System.out.println("\nFeladat3  Osszes hegy = "+osszes_hegy+"db");
       System.out.println("\nFeladat4  Az atlag magassag = "+atlagmagassag+"m");
       //Feladat 5 Határozza meg és írja ki a képernyőre a minta szerint a legmagasabb hegy adatait! | Feltételezheti, hogy nem alakult ki holtverseny.
       int index_f5=0;
	   int legmagasabb=0;
	   int seged_index=0;
       while(index_f5!=osszes_hegy) {

    	   beolvasas[index_f5].getmagassag();
    	   	if(legmagasabb< beolvasas[index_f5].getmagassag()) {;
    	   		legmagasabb=beolvasas[index_f5].getmagassag();
    	   		seged_index=index_f5;
    	   		//System.out.println("Feladat 5 legmagasabb = "+legmagasabb);
    	   		//System.out.println("Feladat 5 beolvasott magassag= "+beolvasas[index_f5].getmagassag());
    	   		
    	   	}
    	    //System.out.println("Feladat 5 index nőtt = "+index_f5);
    	   
    	   
    	   index_f5++;
    	   
       }
       
       System.out.println("\nFeladat 5 lefutott"+"\n\tLegmagasabb hegy = "+legmagasabb+"m"+" \n\tHegyseg neve= "+beolvasas[seged_index].gethegycsucsneve()+"\n\tHegyseg= "+beolvasas[seged_index].gethegyseg());
       
       
       System.out.println("\nFeladat 6 ");
       int index_f6=0;
       String feladat6_hegy="Börzsöny";
       System.out.print("Add meg a borzsonyben keresni kivant hegy magassagat = ");
       int megadott_magassag=bevitel.nextInt();
       System.out.print("Megadott magassag= "+megadott_magassag+"\n");
       
       
       while(index_f6!=osszes_hegy) {
    	   
    	   	if(beolvasas[index_f6].getmagassag()>megadott_magassag&&feladat6_hegy.equals(beolvasas[index_f6].gethegyseg())) {;
    	   		System.out.println("\tVan magasabb hegy mint "+megadott_magassag+" m");
    	   		//System.out.println(beolvasas[index_f6].getmagassag());
    	   		//System.out.println(beolvasas[index_f6].gethegyseg());
    	   		
    	   	}else if(beolvasas[index_f6].getmagassag()<megadott_magassag&&feladat6_hegy.equals(beolvasas[index_f6].gethegyseg())) {;
    	   		System.out.println("Nincs magasabb hegy mint "+megadott_magassag+" m");
    	   		//System.out.println(beolvasas[index_f6].getmagassag());
    	   	//	System.out.println(beolvasas[index_f6].gethegyseg());
    	   	}
    	    //System.out.println("Feladat 5 index nőtt = "+index_f5);
    	   
    	   
    	   index_f6++;
    	   
       }
       
       System.out.println("\nFeladat 7 \n3000 labnal magasabb hegyucsok szama = "+feladat_7_megoldas);
       
       /*
       7. Határozza meg és írja ki a képernyőre a minta szerint azoknak a hegycsúcsoknak a
       számát, amelyek 3000 lábnál magasabbak! Az átváltáshoz az 1 m = 3.280839895 láb
       értékkel dolgozzon!
        */
       
       
       
       
       System.out.println("\nFeladat 8 Nincs kesz");
       
       
       
       
       
       //System.out.println(beolvasas[5].gethegyseg());
       
       

       
       
       
       //System.out.println(beolvasas[1].getmagassag()); Próba ,hogy működik a vissza kérés.

       

       }
   }

