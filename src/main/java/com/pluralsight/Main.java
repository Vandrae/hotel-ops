package com.pluralsight;

public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee(1, "bob", "a",1.00,0);

    employee.punchIn(10);
    employee.punchOut(17);
        System.out.println(employee.getTotalPay());
    }
}
