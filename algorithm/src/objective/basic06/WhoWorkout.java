package objective.basic06;

public abstract class WhoWorkout {

	protected int muscle = 10;
	protected WorkOutTool workOutTool;
	protected WorkOut workOut;
	protected BodyPart bodyPart;
	
	public WhoWorkout(WorkOutTool workOutTool, WorkOut workOut, BodyPart bodyPart) {
		this.workOutTool = workOutTool;
		this.workOut     = workOut;
		this.bodyPart    = bodyPart;
	}
	
	public abstract void doWorkout();
	
}

interface WorkOutTool {
	public void setTool();
}

interface WorkOut {
	public void execute(BodyPart bodyPart);
}

abstract class BodyPart {
	protected int fatigue = 0;
	
	public void setEffect(int fatigue) {
		this.fatigue = fatigue;
	}
	public abstract int getEffect();
}