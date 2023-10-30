package ifpe;

public class Hourly extends Employee{
	
	private double hourlyRate;
	private double hours;
	public Hourly(String nome, double hourlyRate, double hours) {
		super(nome);
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}
	
	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return super.getPay();
	}
	
	private void addHours(double hours) {
		this.hours += hours;
		// TODO Auto-generated method stub

	}
	
	private void insertData() {
		addHours(hours);
		
	}

}
