
// Class 3
// Association between both the
// classes in main method
class GFG {
 
    // Main driver mmethod
    public static void main(String[] args)
    {
 
        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
 
        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()
                           + " is employee of "
                           + bank.getBankName());
    }
}