package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {
        //use default constructor
        Employee emp1 =new Employee();
        //assing constructor
        Employee emp2 =new Employee("Chiranan chanrod",18,"Teacher",20000);
        //call displayData()
        emp1.displayData();
        emp2.displayData();
       // System.out.println(emp2.Name);

        //assign data to emp1
        emp1.setName("chiranan chanrod");
        emp1.getAge ();
        emp1.setPosition("Teacher");
        emp1.setSalary (2000.0);



    }//main
}//class
