public class Lingkaran
{
	float radius;

	 public Lingkaran(float r){
		radius = r;
	}
	
	final static double PHI = 3.141592;

	public double getLuasLingkaran()
	{

		return radius*radius*PHI;	
	}

	public double getKelilingLingkaran()
	{

		return 2*radius*PHI;	
	}

	public void cetakProperti()
		{
			System.out.println("Radisunya \t= " + radius);
		}

	public void cetakData()
	{
		System.out.println("Luas Lingkaran \t= "+ getLuasLingkaran());
		System.out.println("Keliling Lingkaran \t= "+ getKelilingLingkaran());
	}
	
}