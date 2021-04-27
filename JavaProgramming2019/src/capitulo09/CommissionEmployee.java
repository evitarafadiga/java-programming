package capitulo09;

public class CommissionEmployee {
	private final String firstName;

	private final String lastName;

	private final String socialSecurityNumber;

	private double grossSales; // vendas brutas semanais

	private double commissionRate; // porcentagem da comiss�o

// construtor de cinco argumentos
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
// chamada impl�cita para o construtor Object ocorre aqui
// se grossSales � inv�lido, lan�a uma exce��o
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
// se commissionRate � inv�lido, lan�a uma exce��o
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} // fim do construtor
// retorna o nome

	public String getFirstName() {
		return firstName;
	}

// retorna o sobrenome
	public String getLastName() {
		return lastName;
	}

// retorna o n�mero de seguro social
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

// configura a quantidade de vendas brutas
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		this.grossSales = grossSales;
	}

// retorna a quantidade de vendas brutas
	public double getGrossSales() {
		return grossSales;
	}

// configura a taxa de comiss�o
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}

// retorna a taxa de comiss�o
	public double getCommissionRate() {
		return commissionRate;
	}

// calcula os lucros
	public double earnings() {
		return getCommissionRate()

				* getGrossSales();

	}

// retorna a representa��o String do objeto CommissionEmployee
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", getFirstName(),
				getLastName(),

				"social security number", getSocialSecurityNumber(),

				"gross sales", getGrossSales(),

				"commission rate", getCommissionRate());

	}
// fim da classe CommissionEmployee
}