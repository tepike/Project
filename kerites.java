package kerites;

public class kerites {


   private int paros;
   private int szelesseg;
   private String szin;

   
   

   public kerites(int paros, int szelesseg, String szin) {
       
       this.paros = paros;
       this.szelesseg = szelesseg;
       this.szin = szin;

   }



   public int getparos() {
       return paros;
   }




   public int getszelesseg() {
       return szelesseg;
   }




   public String getszin() {
       return szin;
   }








   public void setparos(int paros) {
       this.paros = paros;
   }




   public void setszelesseg(int szelesseg) {
       this.szelesseg = szelesseg;
   }




   public void setszin(String szin) {
       this.szin = szin;
   }







   @Override
   public String toString() {
       return "keritesek [paros=" + paros + ", szelesseg=" + szelesseg + ", szin=" + szin ;
   }
}
