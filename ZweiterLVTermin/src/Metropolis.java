
public class Metropolis {
	public static void main(String[] args) {
		
		System.out.println("Ist die Stadt eine Metropole? "+isMetropolis(false, 200_001,300));
		
	}
		public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth)
		{
			boolean Metropole=false;
			double taxPerYear=0;
			taxPerYear=(taxPerPersonAndMonth*12)*inhabitants;
			//a:
			if (isCapital&&(inhabitants>100_000))
			{
				Metropole=true;
			}
			//b:
			if ((inhabitants>200_000)&&(taxPerYear>720_000_000))
			{
				Metropole=true;
			}
			return Metropole;					
		}


}
