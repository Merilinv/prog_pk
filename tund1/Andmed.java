public class Andmed{
	//Koosta funktsioon massiivis suurima väärtuse ledidmiseks
	//int[]-i kogunevad pikkused mida tsükkel läbi käib
	public static int leiaSuurim(int[] andmed){
		//while-tsükkel:
		if(andmed.length==0){return -1;}
		int suurim=andmed[0];
		int koht=1;
		while(koht<andmed.length){
			if(andmed[koht]>suurim){suurim=andmed[koht];}
			koht++;
		}
		//for-tsükkel:
		/* int suurim = 0;
		for(int i=0; i<andmed.length; i++){
			if (andmed[i] > suurim){
				suurim = andmed[i];
			}
		} */
		return suurim;
	
	}
	public static void main(String[] arg){
		int[] pikkused=new int[4];
		pikkused[0]=168;
		pikkused[1]=158;
		pikkused[2]=178;
		pikkused[3]=173;
		System.out.println("Viimane pikkus: "+pikkused[pikkused.length-1]); 
		// pikkused[pikkused.length-1 leiab viimase väärtuse;
		System.out.println("Suurim pikkus on: "+leiaSuurim(pikkused));
	}
}