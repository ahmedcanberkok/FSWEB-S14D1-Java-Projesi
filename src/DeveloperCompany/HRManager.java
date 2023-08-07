package DeveloperCompany;

public class HRManager extends  Employee {
     private JuniorDeveloper[] juniors ;
    private MidDeveloper[] mids ;
    private SeniorDeveloper[] seniors ;


    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }



    public  void addEmployee( int index,JuniorDeveloper developer) {
        try {
            if (juniors[index] == null) {
                juniors[index] = developer ;
            }else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage() );
        }
    }
    public  void addEmployee( int index,MidDeveloper developer) {
        try {
            if (mids[index] == null) {
                mids[index] = developer ;
            }else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage() );
        }
    }
    public  void addEmployee( int index,SeniorDeveloper developer) {
        try {
            if (seniors[index] == null) {
                seniors[index] = developer ;
            }else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index not found" + ex.getMessage() );
        }
    }

    @Override
    public void work() {
        super.setSalary(2200);
        System.out.println(getName() +"HR Manager starts to working");
    }

}
