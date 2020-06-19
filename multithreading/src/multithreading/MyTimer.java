package multithreading;

import java.util.Date;

public class MyTimer {
	
		public static void main(String[] args) {
		  // run in a second
		  final long timeInterval = 10000;
		  Runnable runnable = new Runnable() {
		  public void run() {
		      
		      System.out.println("Timer Started at:"+new Date());
		      
		      for(int i=1;i<=4;i++)
		      try {
		       Thread.sleep(timeInterval);
		       System.out.println(i*10+"s passed and "+(4-i)*10+"s left");
		      } catch (InterruptedException e) {
		    	  System.out.println(e);
		      }
		      System.out.println("Timer Stoped at:"+new Date());
		      }
		    
		  };
		  Thread thread = new Thread(runnable);
		  System.out.println("Timer Start(40s timer)");
		  thread.start();
		  }
		}