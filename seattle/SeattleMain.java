package seattle;

public class SeattleMain {
    public static void main(String[] args) {
        SeattleSSEmployee emp1 = new SeattleSSEmployee();
        emp1.setEmpName("森本");
   
        SeattleEmployee emp2 = new SeattleEmployee();
        emp2.setEmpName("Pepper");

        System.out.println("社員1 " + emp1.getEmpName() + ", 所属部署: " + emp1.getDept());
        System.out.println("社員2" + emp2.getEmpName() + ", 所属部署: " + emp2.getDept());
    }
}
