
class Dateandmin extends Demostic { //Sub class
	private int aday;
	private	int amonth;
	private int ayear;
	private int dday;
	private int dmonth;
	private	int dyear;
	private	int ahour;
	private int amin;
	private int dhour;
	private int dmin;
	
	
	//Constructors and Inheritance
	public Dateandmin(String arrival, String departures, String airlines, String flight, int aday, int amonth, int ayear,int ahour, int amin, int dday, int dmonth, int dyear,  int dhour, int dmin) {
		super(arrival, departures, airlines, flight);
		  this.aday=aday;
		  this.amonth=amonth;
		  this.ayear=ayear;
		  this.dday=dday;
		  this.dmonth=dmonth;
		  this.dyear=dyear;
		  this.ahour=ahour;
		  this.amin=amin;
		  this.dhour=dhour;
		  this.dmin=dmin;
	}
	public int getAday (){return aday;}
	public int getAmonth(){return amonth;}
	public int getAyear(){return ayear;}
	public int getDday(){return dday;}
	public int getDmonth(){return dmonth;}
	public int getDyear(){return dyear;}
	public int getAhour(){return ahour;}
	public int getAmin(){return amin;}
	public int getDhour(){return dhour;}
	public int getDmin(){return dmin;}


public void setAday (int aday){this.aday=aday;}
public void setAmonth(int amonth){this.amonth=amonth;}
public void setAyear(int ayear){this.ayear=ayear;}
public void setDday(int dday){this.dday= dday;}
public void setDmonth(int dmonth){this.dmonth=dmonth;}
public void setDyear(int dyear){this.dyear=dyear;}
public void setAhour(int ahour){this.ahour=ahour;}
public void setAmin(int amin){this.amin=amin;}
public void setDhour(int dhour){this.dhour= dhour;}
public void setDmin(int dmin){this.dmin= dmin;}

public String BoardingPass()
{return "DATE"+"\n"+"ARRIVAL  :"+"\t"+String.format("%02d", aday)+"/"+String.format("%02d", amonth)+"/"+ayear+"\t"+String.format("%02d", ahour)+":"+String.format("%02d",amin)+"\n"
+"DEPARTURES :"+"\t"+String.format("%02d", dday)+"/"+String.format("%02d", dmonth)+"/"+dyear+"\t"+String.format("%02d", dhour)+":"+String.format("%02d",dmin)+"\n";}
}