package by.itacademy.kirilltetera.javabasics.oop;

public class Person extends Student{

    private int salary;
    public void setIncome(int newSalary) {
        salary = newSalary;
    }
    public int getIncome() {
        return salary + getIncomeGrant();
    }
}
