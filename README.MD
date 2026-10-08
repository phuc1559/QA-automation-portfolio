# QA Automation Portfolio

UI test automation for [SauceDemo](https://www.saucedemo.com/) using Java, Selenium WebDriver and JUnit 5, structured with the Page Object Model.

## Tech stack
- Java 21
- Selenium WebDriver 4.27.0
- JUnit 5.11.3
- Maven

## Project structure
```
src/test/java/com/johnny/qa/
├── base/BaseTest.java # driver setup/teardown
├── pages/saucedemo/ # page objects (LoginPage, InventoryPage)
└── tests/saucedemo/ # test classes
```
## How to run
Requirements: JDK 21, Maven, Google Chrome.

```bash
mvn clean test
```

## Test cases
| Test | Type | Status |
|---|---|---|
| Login with valid user opens Inventory page | Positive | Automated |
| Login with empty username shows error | Negative | Automated |
| Login with wrong password shows error | Negative | Automated |
| Add / remove cart, checkout, OrangeHRM login | | Planned |

## Limitations
- Tests run against public demo sites; availability and data are outside my control.
- No CI yet (GitHub Actions planned).

