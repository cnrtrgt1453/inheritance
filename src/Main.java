public class Main {

    public static void main(String[] args) {

        Customer customer=new Customer();
        Employee employee=new Employee();

        customer.lastName="";
        customer.firstName="";
        customer.id=1;
        customer.email="abc@hotmail.com";  //customerın, person nesnesinden farkı

        employee.salary=5000;   //employenin, person nesnesinden farkı

        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();

    }
}
