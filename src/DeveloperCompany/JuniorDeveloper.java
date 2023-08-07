package DeveloperCompany;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.setSalary(2200);
        System.out.println(getName()+"Junior Developer starts to working");
    }


}
