class time{
	int hour;
	int minutes;
	int second;

    public time(int hour,int minutes,int second){
	   this.hour=hour;
	   this.minutes=minutes;
	   this.second=second;
    }
    public void Total_Time(time t1){
    	this.hour=this.hour+t1.hour;
    	this.minutes=this.minutes+t1.minutes;
    	this.second=this.second+t1.second;
    	if(this.minutes>59){
    		this.hour++;
    		this.minutes=minutes-60;
    	}
    	if(this.second>59){
    		this.minutes++;
    		this.second=second-60;
    	}
    	System.out.println("The Total Time Is:-"+this.hour+" hours::"+this.minutes+" minutes::"+this.second+" seconds");
    }

}
public class Lab_6B{
	public static void main(String[] args){
		time t1=new time(3,30,30);
		time t2=new time(3,30,30);

		t2.Total_Time(t1);
	}
}