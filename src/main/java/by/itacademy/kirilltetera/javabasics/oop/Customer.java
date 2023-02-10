package by.itacademy.kirilltetera.javabasics.oop;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int cardNumber;
    private int accountNumber;

    public void setId(int newId) {
        id = newId;
    }
    public void setSurname(String newSurname) {
        surname = newSurname;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setPatronymic(String newPatronymic) {
        patronymic = newPatronymic;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public void setCardNumber(int newCardNumber) {
        cardNumber = newCardNumber;
    }
    public void setAccountNumber(int newAccountNumber) {
        accountNumber = newAccountNumber;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getAddress() {
        return address;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
}
