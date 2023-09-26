public class Main {
    public static void main(String[] args) {
        Employee direncan = new Employee("Direncan","25/07/1997","12/12/2023","10/07/2020");
        SalariedEmployee zübeyr = new SalariedEmployee("zübeyr","25/07/1998","12/12/2023","13/08/2010",3405.23);

        System.out.println(direncan);
        System.out.println(zübeyr);

        System.out.println("Zübeyr's Paycheck : $ " + zübeyr.collectPay());
        zübeyr.retire();
        System.out.println("Zübeyr's Pension Check : $ " + zübeyr.collectPay());

    }
}