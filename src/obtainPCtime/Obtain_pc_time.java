package obtainPCtime;

public class Obtain_pc_time {

	

	public static void main(String[] args) {
		while(true) {
		long totalmilisecond=System.currentTimeMillis();
		long totalSeconds=totalmilisecond/1000;
		long currentsecond=totalSeconds%60;
		long totalMinutes=totalSeconds/60;
		long currentminute=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currenthour=totalHours%24;
		
		System.out.println("total miliseconds "+ totalmilisecond);
		System.out.println("total seconds "+totalSeconds);
		System.out.println("current second "+currentsecond);
		System.out.println("total minute "+totalMinutes);
		System.out.println("current minute "+currentminute);
		System.out.println("total hour "+totalHours);
		System.out.println("current hour "+currenthour);
		long mycurrentHour=currenthour-6;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException E) {
		}
		
		System.out.println(mycurrentHour+":"+currentminute+":"+currentsecond);
		
		
		
		
		
		
		}
		
	  }

	}
