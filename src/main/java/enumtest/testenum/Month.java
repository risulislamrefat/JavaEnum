package enumtest.testenum;

public enum Month {
	JANUARY("January",31),
	FEBRUARY("February",28),
	MARCH("March",31),
	APRIL("April",31),
	MAY("May",31),
	JUNE("June",31),
	JULY("July",31),
	AUGUST("August",31),
	SEPTEMBOR("Septembor",31),
	OCTOBOR("Octobor",31),
	NOVEMBOR("Novembor",31),
	DECEMBOR("Decembor",31);
	
	private final String monthName;
    private final int days;
    static String mon;
    static String notFound;
	private Month(String monthName, int days) {
		this.monthName = monthName;
		this.days = days;
	}
	public String getMonthName() {
		return monthName;
	}
	public int getDays() {
		return days;
	}

    // order of fields matter
	public static String contains(String s)
	  {
	      for(Month choice:values())
	      {
	    	   if (choice.getMonthName().equals(s)) 
	    	   {
	        	   mon = choice.getMonthName().substring(0, 3)+" "+choice.getDays();
	        	  
	           }
	     }
	        
            return mon;
	    
	  }
	

    

	
    
	

}

