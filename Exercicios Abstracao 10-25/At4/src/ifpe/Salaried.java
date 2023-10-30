package ifpe;

public class Salaried extends Employee {
	
	private double  salary;

	public Salaried(String nome, double salary) {
		super(nome);
		this.salary = salary;
	}
	
	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return super.getPay();
	}
	
	private void insertData() {
		// TODO Auto-generated method stub

	}
}
