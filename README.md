# OrangeHRM Data-Driven Automation Framework

## 📌 Project Overview

This project is a Selenium Automation Framework developed to automate the testing of the OrangeHRM web application. It follows the **Page Object Model (POM)** design pattern and implements **Data-Driven Testing** using TestNG. The framework is designed to improve test reusability, maintainability, and scalability.

---

## 🚀 Features

- ✅ Login with Valid Credentials
- ✅ Login with Invalid Credentials
- ✅ Add Employee
- ✅ Data-Driven Testing using TestNG
- ✅ Page Object Model (POM)
- ✅ Reusable Base Classes
- ✅ Utility Classes
- ✅ Automated Test Execution
- ✅ TestNG Reports Generation

---

## 🛠️ Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- Eclipse IDE
- Git
- GitHub

---

## 📂 Project Structure

```
OrangeHRM_DataDriven
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │   ├── base
│       │   ├── pages
│       │   ├── tests
│       │   └── utils
│       └── resources
│
├── testng.xml
├── pom.xml
├── README.md
└── target
```

---

## ▶️ How to Run the Project

1. Clone this repository.

```
git clone https://github.com/Haripriya169-hm/OrangeHRM-DataDriven-Framework.git
```

2. Open the project in Eclipse IDE.

3. Update Maven dependencies.

4. Execute the `testng.xml` file.

5. View the generated TestNG reports inside the `test-output` folder.

---

## 🧪 Test Scenarios Automated

### Login Module

- Login with valid username and password
- Login with invalid username and password
- Verify login functionality

### Employee Module

- Add a new employee
- Verify employee creation

---

## 📊 Test Reports

The framework generates TestNG execution reports after every test run.

Location:

```
test-output/index.html
```

---

## 📈 Framework Design

- Page Object Model (POM)
- Data-Driven Testing
- Maven Project Structure
- TestNG Test Suite
- Reusable Utility Classes

---

## 👩‍💻 Author

**Haripriya**

GitHub: https://github.com/Haripriya169-hm

---

## ⭐ Future Enhancements

- Screenshot Capture on Test Failure
- Cross Browser Testing
- Extent Reports Integration
- Jenkins CI/CD Integration
- Log4j Logging
- Excel Data Provider
- Parallel Test Execution
