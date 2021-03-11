public class RoachPopulation 
{
	//rp is roach population abbreviated
	private double rp;
	
	public RoachPopulation(double startingPop)
	{
		
		rp = startingPop;
		
	}
	
	public void breed()
	{
		
		rp = rp * 2;
		
	}
	
	public void spray(double sprayPct)
	{
		
		rp = rp - (rp * sprayPct);
		
	}
	
	public double getroaches()
	{
		
		return rp;
		
	}

}
