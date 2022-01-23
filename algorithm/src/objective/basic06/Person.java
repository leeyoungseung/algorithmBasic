package objective.basic06;

public class Person extends WhoWorkout{

	public Person(WorkOutTool workOutTool, WorkOut workOut, BodyPart bodyPart) {
		super(workOutTool, workOut, bodyPart);
		
	}

	@Override
	public void doWorkout() {
		workOutTool.setTool();
		workOut.execute(bodyPart);
		int effect = bodyPart.getEffect();
		muscle += effect;
		System.out.println("Get Musle : "+effect+" Total Musle mass is "+ muscle);
		
	}
	
	public static void main(String[] args) {
		Person person = new Person(new SquatRack(), new Squat(), new Lag());
		person.doWorkout();
	}

}

class SquatRack implements WorkOutTool {

	@Override
	public void setTool() {
		System.out.println("To prepare a SquatRack.");
	}
	
}

class Squat implements WorkOut {

	@Override
	public void execute(BodyPart bodyPart) {
		System.out.println("execute Squat");
	}
	
}

class Lag extends BodyPart {
	
	public Lag() {
		this.setEffect(2);
	}

	@Override
	public int getEffect() {
		if (fatigue < 0) {
			return 0;
		}

		return 2 * fatigue;
	}
	
}
