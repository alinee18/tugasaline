public class fulltime extends teacher {
    protected int Anual_salary;
    protected String unit;

    public int getAnual_salary() {
        return this.Anual_salary;
    }

    public void setAnual_salary(int anual_salary) {
        this.Anual_salary = anual_salary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public fulltime() {
        super();
        Anual_salary=0;
        unit = "";


    }

    public fulltime(String name, int age, String Subject, int Anual_salary, String unit) {
        super(name, age, Subject);
        this.Anual_salary = Anual_salary;
        this.unit = unit;

    }

    public void print() {
        System.out.println("Anual Salary:" + Anual_salary);
        System.out.println("Unit:" + unit);

    }
}
