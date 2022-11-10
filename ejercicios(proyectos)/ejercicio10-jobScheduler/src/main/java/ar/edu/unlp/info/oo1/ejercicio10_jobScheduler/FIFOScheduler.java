package ar.edu.unlp.info.oo1.ejercicio10_jobScheduler;

public class FIFOScheduler extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription nextJob = jobs.get(0);
    	this.unschedule(nextJob);
    	return nextJob;
	}

}
