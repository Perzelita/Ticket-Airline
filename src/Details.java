
 class Details extends Demostic { //Sub class
	 
	 private String name;
	 private String seat;
	 private String gates;
	//Constructors and Inheritance
	public Details(String arrival, String departures, String airlines, String flight, String name, String seat, String gates) {
		super(arrival, departures, airlines, flight);
		this.name=name;
		this.seat=seat;
		this.gates=gates;
		
		
	}
	public String getName(){return name;}
	public String getSeat(){return seat;}
	public String getGates(){return gates;}
	public void setName(String name){this.name=name;}
	public void setSeat(String seat){this.seat=seat;}
	public void setGates(String gates){this.gates=gates;}
	public String BoardingPass()
	{return "DETAILS "+"\n"+"Name :"+"\t"+name+"\n"+"SEAT :"+"\t"+seat+"\n"+"GATE :"+"\t"+gates+"\n";}
}
