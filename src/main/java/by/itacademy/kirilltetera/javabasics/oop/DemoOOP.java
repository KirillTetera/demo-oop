package by.itacademy.kirilltetera.javabasics.oop;

public class DemoOOP {
    public static void main(String[] args) {
        Customer customerOne = new Customer();
        customerOne.setId(55);
        customerOne.setSurname("Smith");
        customerOne.setName("Adam");
        customerOne.setAddress("58 Avenue");
        customerOne.setCardNumber(555);
        customerOne.setAccountNumber(888);
        System.out.println(customerOne.getId());
        System.out.println(customerOne.getSurname());
        System.out.println(customerOne.getName());
        System.out.println(customerOne.getAddress());
        System.out.println(customerOne.getPatronymic());
        System.out.println(customerOne.getAccountNumber());
        System.out.println(customerOne.getCardNumber());
    }
}
