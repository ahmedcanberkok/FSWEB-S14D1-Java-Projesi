package DeveloperCompany;


public class Main {
    public static void main(String[] args) {
        System.out.println("**********//DEVELOPER//*********");

        JuniorDeveloper test1 = new JuniorDeveloper(1, "Canberk", 20000);
        JuniorDeveloper test2 = new JuniorDeveloper(2, "Ahmet", 20000);
        JuniorDeveloper[] juniors = new JuniorDeveloper[]{test1, test2};
        MidDeveloper test3 = new MidDeveloper(1, "Hakan", 20000);
        MidDeveloper test4 = new MidDeveloper(2, "Batuhan", 20000);
        MidDeveloper[] mids = new MidDeveloper[]{test3, test4};

        SeniorDeveloper test5 = new SeniorDeveloper(1, "Can", 20000);
        SeniorDeveloper test6 = new SeniorDeveloper(2, "Ali", 20000);
        SeniorDeveloper[] seniors = new SeniorDeveloper[]{test5, test6};


    }
}
