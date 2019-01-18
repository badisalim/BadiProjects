package W7_reflection.live;

public class AccountantApplication {

    public static void main(String[] args) {
        W7_reflection.live.Accountant accountant = new Accountant();
        Data data = accountant.pay();

        System.out.println("Total amount paid: " + data.getTotalPaid());
        System.out.println("Most paying department: " + data.getMostPayingDepartment());
        Worker worker = data.getTopSalaryWorker();
        System.out.println("Highest salary employee: " + worker.getName()
                + " from " + worker.getDepartment()
                + " with " + worker.getSalary() + "€");
    }

}
