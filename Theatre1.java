public class Theatre1{


	private String dayofWeek;
	private int age;

	public void setDayofWeek(String dayofWeek){
		this.dayofWeek = dayofWeek;
	}
	
	
	public void setAge(int age){
		this.age = age;
	}


	public void calcprice(){
		if(age <8 || age >65)
		{
			if(dayofWeek.equalsIgnoreCase("monday")||dayofWeek.equalsIgnoreCase("Tuesday")||dayofWeek.equalsIgnoreCase("Wednesday"))
			{
				System.out.println("Five Euro");
			}
			else if(dayofWeek.equalsIgnoreCase("friday")||dayofWeek.equalsIgnoreCase("Thursday"))
			{
				System.out.println("Free");
			}
		}
		else if(dayofWeek.equalsIgnoreCase("monday")||dayofWeek.equalsIgnoreCase("Tuesday")||dayofWeek.equalsIgnoreCase("Wednesday"))
		{
				System.out.println("20 euro");
		}
		else if(dayofWeek.equalsIgnoreCase("friday")||dayofWeek.equalsIgnoreCase("Thursday")){
				System.out.println("30 euro");
		}
		else{
			System.out.println("Invalid Selection");
		}
		
	}//end of calcprice


}