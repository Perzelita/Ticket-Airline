
 class Demostic {// Main class
	private String arrival;  //Information hiding
   private String departures;  //Information hiding
	private String airlines;  //Information hiding
	private String flight;  //Information hiding
	//Constructors 
	public Demostic (String arrival ,String departures,String airlines,String flight ){
	this.arrival=arrival;//Composition
	this.departures=departures;//Composition
	this.airlines=airlines;//Composition
	this.flight=flight;//Composition
	
	}
	//Encapsulation
	public String getArrival() {return arrival;}
	public String getDepartures(){return departures;}
	public String getAirlines(){return airlines;}
	public String getFlight(){return flight;}
	
	public void setArrival(String arrival) {this.arrival=arrival;}
	public void setDepartures(String depeatures, String departures){this.departures=departures;}
	
	public void setAirlines(String airlines){this.airlines=airlines;}
	public void setFlight(String flight){this.flight=flight;}
	
	public String BoardingPass()
	
	{return  airlines+"\t DEMOSTIC BOARDING PASS"+"\n"+"ARRIVAL :"+"\t"+arrival+"\n"+"DEPARTURES :"+"\t"+departures+"\n";}
	
	
}

