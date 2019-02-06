public class Arvutus2{

	public static double leiaTakistus(double voimsus, double pinge){
		return pinge/leiaVool(voimsus, pinge);
		
	}
	public static double leiaVool(double voimsus, double pinge){
		return voimsus/pinge;
	}
	
	public static void main(String[] arg){
		System.out.println("Võimsus = 30 W ja Takistus = 220 V");
		System.out.println("Vool on: "+ leiaVool(30,220));
		System.out.println("Takistus on: "+ leiaTakistus(30,220));
	}
}