# Selenium Multi-Browser Link Testing

This project automates and tests web page navigation across multiple browser instances sequentially using Selenium WebDriver and Java.

## 🚀 Key Features
* **Multi-Browser Testing:** Managed 3 separate browser sessions (`driver`, `driver2`, `driver3`) sequentially to optimize system memory.
* **Locators Covered:** Handled `By.linkText()`, `By.partialLinkText()`, and `By.tagName()` effectively.
* **Synchronization:** Used `WebDriverWait` to prevent `NoSuchElementException` during page loads.

## 🌐 Websites Automated
1. **QA Blog List** (`https://qabloglist.ccbp.tech/`)
2. **QA Company** (`https://qacompany.ccbp.tech/`)
3. **QA Travel Destination** (`https://qatraveldest.ccbp.tech/`)

## 💻 Tech Stack
* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **IDE:** IntelliJ IDEA
