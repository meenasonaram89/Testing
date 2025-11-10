#  Testing Module – Complete QA Practice Project

### Overview
This repository represents a **complete QA Testing Module**, including **Manual Test Cases**, **Automation Scripts**, and **API Testing examples**.  
It is designed to demonstrate end-to-end QA skills — from requirement analysis to automation implementation — in a real-world project style.

---

## Objective
The goal of this project is to showcase practical QA expertise:
- Writing clear and structured manual test cases  
- Automating key scenarios using Selenium and Java  
- Validating APIs using Postman or REST Assured  
- Reporting bugs, results, and test coverage professionally  

---

## Modules Covered

| Module Name | Description |
|--------------|-------------|
| **Login Module** | Validates login functionality using valid and invalid credentials |
| **Raw Data Module** | Tests table view, pagination, search, and import/export features |
| **Employee Module** | Covers employee CRUD (Create, Read, Update, Delete) operations |
| **Lead Management** | Validates “Convert to Lead” and “Assign Raw Data” workflow |
| **API Testing Module** | Tests REST API requests (GET, POST, PUT, DELETE) |
| **Regression Suite** | Combination of multiple module test cases for release cycles |

---

## Features
- Manual and Automation coverage for each feature  
- Excel-based test data management using Apache POI  
- Well-documented test cases with expected and actual results  
- TestNG report generation after each automation run  
- Modular design for easy test maintenance and scalability  

---

## Tools & Technologies

| Category | Tools / Frameworks |
|-----------|--------------------|
| **Programming Language** | Java |
| **Automation Tool** | Selenium WebDriver |
| **Test Framework** | TestNG |
| **Data Handling** | Apache POI (Excel) |
| **Bug Tracking** | Jira / Excel / Trello |
| **API Testing** | Postman / REST Assured |
| **Performance Testing** | JMeter |
| **Version Control** | Git & GitHub |
| **IDE** | IntelliJ IDEA / Eclipse |

---

## Manual Test Case Example

| Test Case ID | Scenario | Steps | Expected Result | Priority |
|---------------|-----------|--------|----------------|-----------|
| TC001 | Verify Valid Login | 1. Launch App <br> 2. Enter valid credentials <br> 3. Click Login | Dashboard should open | High |
| TC002 | Verify Invalid Login | 1. Launch App <br> 2. Enter invalid credentials <br> 3. Click Login | Error message displayed | Medium |
| TC003 | Verify Pagination | 1. Navigate to Raw Data <br> 2. Change entries per page | Data should update as per selection | Medium |

---

## Automation Test Flow

1. Launch browser (Chrome)  
2. Navigate to the application  
3. Read multiple login data from Excel  
4. Execute login test one by one  
5. Capture pass/fail result using TestNG  
6. Generate HTML report  

---

## Folder Structure
Testing/
│
├── Manual_TestCases/ # Excel files for manual testing
├── Automation_Scripts/ # Selenium Java scripts
│ ├── base/ # Browser setup
│ ├── pages/ # Page Object Model classes
│ ├── tests/ # TestNG test scripts
│ └── utilities/ # Excel reader and helpers
│
├── API_Testing/ # Postman collections or REST Assured code
├── Bug_Reports/ # Excel / Word defect documents
├── Test_Reports/ # TestNG or Extent HTML reports
└── README.md # Project Documentation
---

## How to Run Automation Tests

1. **Clone the Repository**
   ```bash
   git clone https://github.com/meenasonaram89/Testing.git

@Test(dataProvider = "loginData")
public void verifyLogin(String username, String password) {
    driver.get("https://example.com/login");
    LoginPage login = new LoginPage(driver);
    login.enterUsername(username);
    login.enterPassword(password);
    login.clickLogin();

    Assert.assertTrue(login.isDashboardVisible(), "Login failed for user: " + username);
}



 
