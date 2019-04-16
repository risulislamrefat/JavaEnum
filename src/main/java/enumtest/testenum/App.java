package enumtest.testenum;

public class App 
{
    public static void main( String[] args )
    {
        
    	Month []months=Month.values();
    	for(Month month :months  ) {
    		System.out.println("Month Name: "+month.getMonthName()+" "+month.getDays());
    	}
    	
    	String monthName = Month.contains("Apr");
    	if(monthName==null) {
    	
    		System.out.println("Not found");
    	}
    	else
    	{
    		System.out.println(monthName);
    	}
    		
    }
}
