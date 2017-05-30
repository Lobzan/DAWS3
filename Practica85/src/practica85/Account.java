package practica85;

import java.util.Random;
import java.util.Scanner;

public class Account {

    private String name;

    private String firstSurname;

    private String secondSurname;

    private String dni;

    private String type;

    private String accountNumber;

    private double interest;

    private double credit;

    public Account() {
    }

    public Account(String name, String firstSurname, String secondSurname, String dni, String type, String accountNumber, double interest, double credit) {
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

    public void setDeposit(double ammount) {
        this.credit += ammount;
    }

    public void setCharge(double ammount) {
        this.credit -= ammount;
    }

    public void doTransfer(Account targetAccount, double ammount) {
        this.credit -= ammount;
        targetAccount.credit += ammount;
    }

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

    public String getAccountNumber() {
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

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void fillAccount() {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Introduce el nombre");
        this.name = teclado.nextLine();
        System.out.println("Introduce el primer apellido");
        this.firstSurname = teclado.nextLine();
        System.out.println("Introduce el segundo apellido");
        this.secondSurname = teclado.nextLine();
        System.out.println("Introduce el dni");
        this.dni = teclado.nextLine();
        System.out.println("Introduce el tipo de cuenta");
        this.type = teclado.nextLine();        
        this.accountNumber = Integer.toString(rand.nextInt(8999) + 1000);
        System.out.println("Introduce el interes");
        this.interest = teclado.nextDouble();
        System.out.println("Introduce el credito disponible");
        this.credit = teclado.nextDouble();
    }
    
    public void manage(MenuController menuController) {
        menuController.printMenu(1);
        
        //pedir al usuario qué desea hacer
        
        //switch con esas opciones
    }

    @Override
    public String toString() {
        return "name: " + this.name
                + ", firstSurname: " + this.firstSurname
                + ", secondSurname: " + this.secondSurname
                + ", dni: " + this.dni
                + ", type: " + this.type
                + ", accountNumber: " + this.accountNumber
                + ", interest: " + this.interest
                + ", credit: " + this.credit;
    }
}
