public class Sisend{
	//static int summa = 0
	public static void main(String[] argumendid){
		System.out.println("Argumente: "+argumendid.length);
		//Näitab sisendit
		/*for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i]);
		}*/
		//Näitab sisendite pikkust
		int summa = 0; //vt üleval
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i].substring(0,1)+" "+ argumendid[i].length());
			//Argumentides olevate sõnade tähtede arvu summa kuvamine:
			summa += argumendid[i].length();
		}
		System.out.println(summa);
	}
}