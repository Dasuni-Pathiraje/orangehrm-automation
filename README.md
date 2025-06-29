# OrangeHRM Automation Project

This project is a sample Selenium test automation framework for **OrangeHRM Instance** using:

- **Selenium WebDriver**
- **TestNG**
- **Page Object Model (POM)**
- **Maven**
- **WebDriverManager**

---

## 📁 Project Structure
```
orangehrm-automation/
├── pom.xml
├── testng.xml
└── src
    └── test
        ├── java
        │   ├── base
        │   │   └── BaseTest.java
        │   ├── pages
        │   │   └── LoginPage.java
        │   └── tests
        │       └── LoginTest.java
```

## 🧪 Test Scenario
- Navigate to OrangeHRM demo login page
- Enter valid credentials
- Click Login
- Assert user is redirected to the Dashboard

---

## 🔧 Configuration
- All test execution is managed through `testng.xml`
- Login credentials and URLs can be externalized later to a config file if needed

---

## 🚀 Future Enhancements
- Add logout and negative login tests
- Add WebDriver explicit waits
- Generate test reports with Extent Reports

---

## 👩‍💻 Author
**Dasuni Pathiraje**
**Quality Assurance Engineer**
