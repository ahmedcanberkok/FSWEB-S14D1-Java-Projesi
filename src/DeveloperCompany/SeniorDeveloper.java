package DeveloperCompany;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.setSalary(55000);
        System.out.println(getName() + " Senior Developer starts to working");
    }


}
