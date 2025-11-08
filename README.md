# Google Calculator Automation Testing

An Appium-based mobile automation testing project for the Google Calculator Android application. This project demonstrates automated testing of basic calculator operations using Java, Selenium, TestNG, and the Page Object Model (POM) design pattern.

## 📋 Overview

This project automates testing of the Google Calculator app on Android devices/emulators. It covers mathematical operations including addition, subtraction, multiplication, division, and percentage calculations.

## 🏗️ Project Structure

```
google-calculator/
├── app/
│   └── googleCalculator.apk          # Android APK file
├── src/
│   ├── main/
│   │   ├── java/com/tanphat/
│   │   │   ├── base/                 # Base classes (BaseTest, BasePage)
│   │   │   ├── drivers/              # Driver management (DriverManager, ConfigReader)
│   │   │   ├── locators/             # Element locators
│   │   │   ├── pages/                # Page Object Model classes
│   │   │   ├── testSteps/            # Test step definitions with Allure annotations
│   │   │   └── utils/                # Utility classes (LogUtils)
│   │   └── resources/
│   │       ├── android.properties    # Appium configuration
│   │       └── log4j2.xml            # Logging configuration
│   └── test/
│       └── java/com/tanphat/
│           └── CalculatorTest.java   # Test cases
├── .github/workflows/
│   └── main.yml                      # CI/CD pipeline
└── pom.xml                           # Maven dependencies
```

## 🚀 Prerequisites

- **Java 21** or higher
- **Maven 3.6+**
- **Node.js** and **npm**
- **Appium Server** 
- **UiAutomator2 Driver** for Appium
- **Android SDK** with platform tools
- **Android Emulator** or a physical Android device
- **ADB** (Android Debug Bridge) configured

## ⚙️ Setup Instructions

### 1. Install Appium

```bash
npm install -g appium@latest
appium --version
```

### 2. Install UiAutomator2 Driver

```bash
appium driver install uiautomator2
```

### 3. Verify Installation

```bash
appium driver list --installed
```

### 4. Configure Android Environment

Ensure Android SDK is installed and `ANDROID_HOME` is set in your environment variables. Add platform tools to PATH.

### 5. Start Appium Server

```bash
appium server --port 4723
```

### 6. Start Android Emulator or Connect Device

- Start an Android emulator from Android Studio, or
- Connect a physical device via USB with USB debugging enabled

### 7. Verify Device Connection

```bash
adb devices
```

## 🧪 Running Tests

### Run Tests Locally

1. **Build the project:**
   ```bash
   mvn clean install -DskipTests
   ```

2. **Run all tests:**
   ```bash
   mvn test
   ```

3. **Run with specific test class:**
   ```bash
   mvn test -Dtest=CalculatorTest
   ```

### Configuration

Update the `src/main/resources/android.properties` file to match your device/emulator:

```properties
appiumDriver = http://127.0.0.1:4723
platformName = Android
automationName = uiautomator2
deviceName = Pixel_8a_API_36
platformVersion = 16
app = app/googleCalculator.apk
appPackage = com.google.android.calculator
appActivity = com.android.calculator2.Calculator
```

## 📊 Test Flow

The test execution follows a simple, structured flow:

1. **Test Initialization**
   - `BaseTest.setup()` initializes the Appium driver
   - DriverManager creates and configures the Appium session
   - Google Calculator app is launched on the device/emulator

2. **Test Execution**
   - Test data is provided via TestNG DataProvider
   - Test steps are executed using `CalculatorTestSteps`:
     - Enter first number
     - Perform operation (add/subtract/multiply/divide/percent)
     - Enter second number
     - Press equals button
     - Verify result
     - Clear calculator

3. **Test Completion**
   - `BaseTest.teardown()` closes the Appium session
   - Test results are logged and Allure reports are generated


## 🔍 Appium Inspector

Appium Inspector is a powerful tool for inspecting and interacting with mobile app elements during test development. It helps identify element locators and verify element properties.

### Installing Appium Inspector

Appium Inspector can be downloaded from:
- **Desktop Application**: [Download Appium Inspector](https://github.com/appium/appium-inspector/releases)
- **Web Version**: Available when Appium Server is running

### Using Appium Inspector

1. **Start Appium Server:**
   ```bash
   appium server --port 4723
   ```

2. **Launch Appium Inspector:**
   - Open the desktop application, or
   - Navigate to `http://localhost:4723` in your browser (web version)

3. **Configure Desired Capabilities:**
   Use the same capabilities as in `android.properties`:
   ```json
   {
     "platformName": "Android",
     "automationName": "uiautomator2",
     "deviceName": "Pixel_8a_API_36",
     "platformVersion": "16",
     "appPackage": "com.google.android.calculator",
     "appActivity": "com.android.calculator2.Calculator"
   }
   ```
## 📈 Reporting

### Allure Reports

The project integrates Allure TestNG for comprehensive test reporting:

1. **Generate Allure Results:**
   ```bash
   mvn test
   ```

2. **View Allure Report:**
   ```bash
   allure serve allure-results
   ```

The Allure report includes:
- Test execution history
- Step-by-step test execution with screenshots
- Test results summary
- Test duration and status

### Logs

Test execution logs are stored in `exports/logs/` directory with detailed information about each test step.

## 🔄 CI/CD

The project includes GitHub Actions workflow (`.github/workflows/main.yml`) that:

- Runs tests on Android emulator in the cloud
- Sets up Java 21 and Maven
- Installs Appium and UiAutomator2 driver
- Builds the project
- Executes tests on Android API 36 emulator
- Uploads test results and logs as artifacts

The workflow triggers on:
- Push to repository
- Pull requests

---------------------
This project is for learning and demonstration purposes.

