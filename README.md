# Customer Payment System

A Java course project that models a customer payment system using object-oriented programming principles including inheritance, abstract classes, interfaces, and polymorphism.

## Overview

The system supports three payment methods — Cash, Check, and Credit Card — each with its own payment calculation logic and authorization rules. Payments are sorted in descending order by calculated amount.

## Class Structure

- `CustomerPayment` — abstract base class implementing `Comparable<CustomerPayment>`, holds common fields (customer name, ID, amount) and defines the abstract `calculatePayment()` method
- `Payable` — interface that enforces an `isAuthorized()` method
- `Cash` — extends `CustomerPayment`; applies a discount rate to the amount
- `Check` — extends `CustomerPayment`, implements `Payable`; supports three check types (Cashier, Certified, Personal) and deducts from account balance when applicable
- `CreditCard` — extends `CustomerPayment`, implements `Payable`; adds a charging fee and validates against expiry date
- `Driver` — creates payment instances, filters unauthorized ones, sorts, and prints results

## Concepts Demonstrated

- Abstract classes and methods
- Interface implementation
- Inheritance and method overriding (`toString`, `calculatePayment`, `printPaymentInfo`)
- Polymorphism via `ArrayList<CustomerPayment>`
- `Comparable` for custom sorting with `Collections.sort()`
- Downcasting for interface method calls

## How to Run

1. Clone the repository
2. Open in any Java IDE (Eclipse, IntelliJ, etc.)
3. Set the package to `project`
4. Run `Driver.java`
