package com.techelevator;

import javax.print.attribute.standard.PrinterMakeAndModel;

public class Application {


    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {

        // create some departments
 //       Department Marketing = new Department(001);
 //       Department Sales = new Department(002);
 //       Department Engineering = new Department(003);


        // print each department by name
        printDepartments();
 //       System.out.println(Marketing);
 //       System.out.println(Sales);
 //       System.out.println(Engineering);

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();

    }

    /**
     * Create departments and add them to the collection of departments
     */
    private static void createDepartments() {
    }

    /**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {

    }

    /**
     * Print out each employee in the collection.
     */
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

    }

    /**
     * Create the 'TEams' project.
     */
    private static void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
