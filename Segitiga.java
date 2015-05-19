public class Segitiga
{
	int alas;
	int tinggi;
	float simir;
	
	 public Segitiga(int a, int t, int s){
		alas = a;
		tinggi = t;
		simir = s;
	}
	
	public double getLuasSegitiga()
	{

		return 0.5*alas*tinggi;	
	}

	public double getKelilingSegitiga()
	{

		return 2*simir+alas;	
	}
	public void cetakProperti()
		{
			System.out.println("Alasnya \t= "+alas); 
			System.out.println("Tingginya\t= "+tinggi);
			System.out.println("Sisi miringnya\t= "+simir);
		}

	public void cetakData()
	{
		System.out.println("Luas Lingkaran \t= "+ getLuasSegitiga());
		System.out.println("Keliling Lingkaran \t= "+ getKelilingSegitiga());
	}
	
}