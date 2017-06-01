package practica.pkg85;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    private String name;

    private String firstSurname;

    private String secondSurname;

    private String dni;

    private String type;

    private int accountNumber;

    private double interest;

    private double credit;

    public Account() {
    }

    public Account(String name, String firstSurname, String secondSurname, String dni, String type, int accountNumber, double interest, double credit) {
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.dni = dni;
        this.type = type;
        this.accountNumber = accountNumber;
        this.interest = interest;
        this.credit = credit;
    }

    public Account(Account account) {
        this.name = account.name;
        this.firstSurname = account.firstSurname;
        this.secondSurname = account.secondSurname;
        this.dni = account.dni;
        this.type = account.type;
        this.accountNumber = account.accountNumber;
        this.interest = account.interest;
        this.credit = account.credit;
    }

    public void fillAccount() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        this.name = teclado.nextLine();
        System.out.println("Introduce el apellido");
        this.firstSurname = teclado.nextLine();
        System.out.println("Introduce el  2 apellido");
        this.firstSurname = teclado.nextLine();
        System.out.println("Introduce el  dni");
        this.firstSurname = teclado.nextLine();
      

    }

    public void doDeposit(double ammount) {
        this.credit += ammount;
    }

    public void doCharge(double ammount) {
        this.credit -= ammount;
    }

    public void doTransfer(Account targetAccount, double ammount) {
        this.credit -= ammount;
        targetAccount.credit += ammount;
    }

//getters y setters
    public String getName() {
        return name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public String getDni() {
        return dni;
    }

    public String getType() {
        return type;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Nº cuenta: " + this.accountNumber + " - Titular: " + this.name
                + " " + this.firstSurname + "\n";
    }

    public String getAllInfo() {
        return "Nº cuenta: " + this.accountNumber + " - Titular: " + this.name
                + " " + this.firstSurname + " " + this.secondSurname + " "
                + this.dni + " - tipo " + this.type + " - interes "
                + this.interest + " - credito: " + this.credit + "\n";
    }

}
