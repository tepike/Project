package hegyek;

public class beolvasas {


	   private int magassag;
	   private String hegycsucsneve;
	   private String hegyseg;

	   
	   




	public  beolvasas(String hegycsucsneve, String hegyseg, int magassag) {
	       
	       this.magassag = magassag;
	       this.hegycsucsneve = hegycsucsneve;
	       this.hegyseg = hegyseg;

	   }



	   public int getmagassag() {
	       return magassag;
	   }




	   public String gethegycsucsneve() {
	       return hegycsucsneve;
	   }




	   public String gethegyseg() {
	       return hegyseg;
	   }







	   public void setmagassag(int magassag) {
	       this.magassag = magassag;
	   }




	   public void sethegycsucsneve(String hegycsucsneve) {
	       this.hegycsucsneve = hegycsucsneve;
	   }




	   public void sethegyseg(String hegyseg) {
	       this.hegyseg = hegyseg;
	   }







	   @Override
	   public String toString() {
	       return "Beolvasas  [Hegycsucsneve=" + hegycsucsneve + ", Hegyseg=" + hegyseg + ", Magassag=" +magassag+ "]";
	   }
}