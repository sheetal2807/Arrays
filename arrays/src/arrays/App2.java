package arrays;
//20.30 time edureka
/*class MyTask{
  void executeTask() {
	  for(int doc=1;doc<=10;doc++) {
	  System.out.println("@@ PRINTING DOCUMENT #"+doc+"Printer2");
  }
  } 
}*/
//my task IS-A theread
class MyTask extends Thread{
	@Override
	 public void run() {
		  for(int doc=1;doc<=10;doc++) {
		  System.out.println("@@ PRINTING DOCUMENT #"+doc+"Printer2");
	                                  }
	                 } 
}

public class App2 {
	//main method represents main thread
		public static void main(String[] args) {
			 //whatever we write  in here will be executed by main thread
		     //threads always execute jobs in sequence
			//threads executes code in sequence 1 after another
			
			//job1
	        System.out.println("APP STARTED");
	        
	        //job2
	       // MyTask task=new MyTask(); //child thread
	       // task.executeTask();
	        //task.start();//-->start shall internally execute run method
	        
	        Runnable  r =new MyTask();
	        Thread task = new Thread(r);
	        task.start();
	        //now main and mytask perform parallelly
	        
	        //Till job2 is not finished bellow written jobs are waiting and not executed
	       //incasse  job2 is long running then jvm may give msg as not responding and job3 wont execute 
	        //job3
	        //some code to print documents
	        for (int doc=1;doc<=10;doc++) {
		       System.out.println("printing document #"+doc+" -Printer1");
	        }
	        
	        //job4
	        System.out.println("APPLICATION FINISHED");
		}

	}


