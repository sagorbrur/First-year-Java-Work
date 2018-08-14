/*
 * This is a Alarm Clock
 */
public class AlarmClock extends Clock
{
	public int alarmHour;
	public int alarmMinute;
	public int alarmSecond;
	
	//Constructor
	public AlarmClock()
	{
		super();
		alarmHour=0;
		alarmMinute=0;
		alarmSecond=0;
	}
	public AlarmClock(int Hour,int Minute,int Second,int alarmH,int alarmM,int alarmS)
	{
		super(Hour,Minute,Second);
		setAlarmHour(alarmH);
		setAlarmMinute(alarmM);
		setAlarmSecond(alarmS);
	}
	
	//accessors
	public void setAlarmHour(int alarmH)
	{
		if((alarmH>=0)&&(alarmH<=24))
			alarmHour=alarmH;
		else
			System.out.println("Fatal error: invalid alarm Hour");
	}
	public void setAlarmMinute(int alarmM)
	{
		if((alarmM>=0)&&(alarmM<=60))
			alarmMinute=alarmM;
		else
			System.out.println("Fatal Error: Invalid minute");
		
	}
	public void setAlarmSecond(int alarmS)
	{
		if((alarmS>=0)&&(alarmS<=60))
			alarmSecond=alarmS;
		else
			System.out.println("Fatal Error: Invalid Second");
	}
	//Mutators
	public int getAlarmHour()
	{
		return alarmHour;
	}
	public int getAlarmMinute()
	{
		return alarmMinute;
	}
	public int getAlarmSecond()
	{
		return alarmSecond;
	}
	
	//Facilitators
	public String toString()
	{
		return "The current time is " + getHour()+":" +getMinute()+":"+getSecond() + "\nThe alarm is set to " + getAlarmHour() + ":" + getAlarmMinute() + ":" + getAlarmSecond();
	}
	public boolean equals(Object o)
	{
	    if(o == null)
	       return false;
	    else if(getClass() != o.getClass())
	       return false;
	    else
	    {
	    	                         AlarmClock otherClock = (AlarmClock) o;
	    	                          return((getHour() == otherClock.getHour()) && (getMinute() == otherClock.getMinute())
	    	                                         && (getSecond() == otherClock.getSecond()) && (alarmHour == otherClock.alarmHour)
	    	                                        && (alarmMinute == otherClock.alarmMinute) && (alarmSecond == otherClock.alarmSecond));
	    }
	}

}
