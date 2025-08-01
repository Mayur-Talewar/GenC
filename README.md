# 🌱 Spring + Maven + Angular Implementation

This repository is a hands-on exploration of core Spring concepts—especially **Spring Dependency Injection (DI)** and Demo Apringboot and Angular Projects

---

## 📘 Project Overview

This project demonstrates:

- 🧩 Basic setup of a Spring application using Maven.
- 🔁 Implementation of **Spring Dependency Injection** via:
  - Constructor Injection
  - Setter Injection
  - Field Injection (with `@Autowired`)
- 🛠️ Use of simple service classes to show how Spring manages bean wiring.

# ☕ Coffee Machine Simulation - Spring Core Assignment

This project simulates a basic coffee machine system using **Spring Core** principles. It's designed for beginners learning about **IoC**, **Dependency Injection**, **Bean Scopes**, **Lifecycle methods**, and **AOP** (Aspect-Oriented Programming).

---

## 📘 Objective

To build and understand a Spring Core-based system where different coffee machines are managed using Spring’s powerful features like annotations, scopes, and aspects.

---

## 🧩 Requirements

### 🔧 Interfaces & Implementations

- **CoffeeMachine** (Interface)
- **Implementations**:
  - `EspressoMachine`
  - `LatteMachine`

> Use `@Component` and `@Qualifier` annotations to register and distinguish between the implementations.

---

### 🔄 Dependency Injection

- Create a `CafeService` class that depends on `CoffeeMachine`.
- Use **Constructor Injection** with:
  - `@Autowired`
  - `@Qualifier`

---

### 🧠 Bean Scopes

- `EspressoMachine` ➜ Singleton (`@Scope("singleton")`)
- `LatteMachine` ➜ Prototype (`@Scope("prototype")`)

> Print a message in each constructor to illustrate bean instantiation frequency.

---

### 🔁 Bean Lifecycle

- Use `@PostConstruct` and `@PreDestroy` annotations in `CafeService` and/or `EspressoMachine`.
- Add print statements to observe lifecycle callback execution.

---

## ✅ Success Criteria

- Proper usage of annotations:
  - `@Component`, `@Autowired`, `@Qualifier`
  - `@Scope`, `@PostConstruct`, `@PreDestroy`
  - AOP annotations
- Console output displays:
  - Bean instantiation
  - Method logs
  - Lifecycle callbacks
- Observably different behavior for singleton vs prototype beans

---

