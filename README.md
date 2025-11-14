# JavaWebApps-Servlets-JSP-JDBC

## 📚 Complete Java Web Applications Collection

This repository contains **three fully working Java web applications** demonstrating core concepts of **Servlets, JSP, and JDBC**. Perfect for learning and understanding web development with Java technologies.

---

## 🚀 Projects Overview

### **Part A: User Login System (HTML + Servlet)**
A simple authentication system with hardcoded credentials
- ✅ HTML login form with styled interface
- ✅ Servlet-based validation logic
- ✅ Dynamic HTML response generation
- ✅ Success/Failure message handling

**Credentials:** `admin` / `password123`

### **Part B: Employee Records Display (Servlet + JDBC + Search)**
A database-driven application to manage employee records
- ✅ Display all employees from MySQL database
- ✅ Search functionality by Employee ID
- ✅ JDBC connection management
- ✅ Dynamic HTML table generation

### **Part C: Student Attendance Portal (JSP + Servlet + JDBC)**
An attendance tracking system with form submission
- ✅ JSP-based input form
- ✅ Servlet processes POST requests
- ✅ Stores attendance records in MySQL
- ✅ Success confirmation messages

---

## 📂 Repository Structure

```
JavaWebApps-Servlets-JSP-JDBC/
├── PartA_LoginServlet/
│   ├── index.html              # Login form UI
│   ├── LoginServlet.java       # Authentication logic
│   ├── web.xml                 # Servlet mapping
│   └── README.md               # Part A documentation
│
├── PartB_EmployeeJDBC/
│   ├── employee.html           # Employee display/search UI
│   ├── EmployeeServlet.java    # Servlet with JDBC
│   ├── DBConnection.java       # Database connection utility
│   ├── employee.sql            # Database table schema
│   ├── web.xml                 # Servlet configuration
│   └── README.md               # Part B documentation
│
├── PartC_AttendancePortal/
│   ├── attendance.jsp          # Attendance form (JSP)
│   ├── AttendanceServlet.java  # Form handler servlet
│   ├── DBConnection.java       # DB connection utility
│   ├── attendance.sql          # Attendance table schema
│   ├── web.xml                 # Servlet mapping
│   └── README.md               # Part C documentation
│
└── README.md                   # Main documentation (this file)
```

---

## 🛠️ Prerequisites

Before running these applications, ensure you have:

1. **Java Development Kit (JDK)** - Version 8 or higher
2. **Apache Tomcat Server** - Version 9.0+ recommended
3. **MySQL Database** - Version 5.7+ or 8.0+
4. **IDE** (Optional but recommended):
   - Eclipse for Java EE
   - IntelliJ IDEA Ultimate
   - NetBeans
5. **Servlet API** - `servlet-api.jar` (usually included with Tomcat)

---

## ⚙️ Setup Instructions

### 1️⃣ **Clone the Repository**

```bash
git clone https://github.com/Ranjeet-Sahu07/JavaWebApps-Servlets-JSP-JDBC.git
cd JavaWebApps-Servlets-JSP-JDBC
```

### 2️⃣ **Database Setup (For Part B & C)**

#### Start MySQL and create database:

```sql
CREATE DATABASE webapp_db;
USE webapp_db;
```

#### Run SQL scripts:

**For Part B (Employee):**
```bash
mysql -u root -p webapp_db < PartB_EmployeeJDBC/employee.sql
```

**For Part C (Attendance):**
```bash
mysql -u root -p webapp_db < PartC_AttendancePortal/attendance.sql
```

#### Update database credentials:

Edit `DBConnection.java` in both Part B and Part C:

```java
private static final String URL = "jdbc:mysql://localhost:3306/webapp_db";
private static final String USER = "root";           // Your MySQL username
private static final String PASSWORD = "yourpass";   // Your MySQL password
```

### 3️⃣ **Deploy on Apache Tomcat**

#### Option A: Using IDE (Eclipse/IntelliJ)

1. **Import Project:**
   - `File` → `Import` → `Existing Projects into Workspace`
   - Select each Part folder separately

2. **Add Tomcat Server:**
   - Go to `Servers` view → `Add Server`
   - Select Apache Tomcat v9.0
   - Point to your Tomcat installation directory

3. **Deploy and Run:**
   - Right-click on project → `Run As` → `Run on Server`
   - Select Tomcat server and click `Finish`

#### Option B: Manual Deployment

1. **Compile Java files:**

```bash
javac -cp "path/to/servlet-api.jar:path/to/mysql-connector.jar" *.java
```

2. **Create WAR structure:**

```
PartA/
├── WEB-INF/
│   ├── web.xml
│   └── classes/
│       └── LoginServlet.class
└── index.html
```

3. **Copy to Tomcat webapps:**

```bash
cp -r PartA/ $TOMCAT_HOME/webapps/
```

4. **Start Tomcat:**

```bash
$TOMCAT_HOME/bin/startup.sh    # Linux/Mac
$TOMCAT_HOME/bin/startup.bat   # Windows
```

### 4️⃣ **Access Applications**

- **Part A:** `http://localhost:8080/PartA/index.html`
- **Part B:** `http://localhost:8080/PartB/employee.html`
- **Part C:** `http://localhost:8080/PartC/attendance.jsp`

---

## 📖 How to Use Each Project

### **Part A - Login System**

1. Open `index.html` in your browser
2. Enter credentials:
   - **Username:** `admin`
   - **Password:** `password123`
3. Click `Login` button
4. See success or error message

### **Part B - Employee Display**

1. Open `employee.html`
2. Click `Show All Employees` to view complete list
3. Or enter an Employee ID in search box to find specific employee
4. Results displayed in formatted HTML table

### **Part C - Attendance Portal**

1. Open `attendance.jsp`
2. Fill in the form:
   - Student ID
   - Date (YYYY-MM-DD format)
   - Status (Present/Absent)
3. Click `Submit Attendance`
4. Confirmation message displayed

---

## 🗄️ Database Schemas

### Employee Table (Part B)

```sql
CREATE TABLE Employee (
    EmpID INT PRIMARY KEY,
    Name VARCHAR(100),
    Department VARCHAR(50),
    Salary DECIMAL(10,2)
);
```

### Attendance Table (Part C)

```sql
CREATE TABLE Attendance (
    AttendanceID INT AUTO_INCREMENT PRIMARY KEY,
    StudentID INT,
    Date DATE,
    Status VARCHAR(10)
);
```

---

## 🔧 Troubleshooting

| Problem | Solution |
|---------|----------|
| **404 Error** | Check if application is deployed correctly in Tomcat webapps folder |
| **500 Internal Error** | Verify servlet mappings in web.xml match Java class names |
| **Database Connection Failed** | Confirm MySQL is running and credentials in DBConnection.java are correct |
| **ClassNotFoundException** | Ensure `mysql-connector-java.jar` is in `WEB-INF/lib` folder |
| **Compilation Errors** | Add `servlet-api.jar` to classpath during compilation |

---

## 📸 Screenshots

*Screenshots can be added here showing:*
- Login page interface
- Employee records table
- Attendance submission form
- Success/Error messages

---

## 🎓 Learning Outcomes

After working with these projects, you'll understand:

✅ Servlet lifecycle and request/response handling  
✅ HTML form processing with GET/POST methods  
✅ JDBC connectivity and SQL operations  
✅ JSP syntax and expression language  
✅ Web application deployment on Tomcat  
✅ Database-driven dynamic content generation  
✅ MVC architecture basics  

---

## 📝 Notes

- **Security Warning:** These are educational projects. For production, never hardcode credentials or use plain-text passwords!
- Use **PreparedStatements** to prevent SQL injection (already implemented in JDBC examples)
- Consider adding session management for real-world applications
- Implement proper error handling and logging

---

## 🤝 Contributing

Contributions are welcome! Feel free to:

- Report bugs
- Suggest new features
- Submit pull requests
- Improve documentation

---

## 📄 License

This project is open source and available for educational purposes.

---

## 👨‍💻 Author

**Ranjeet Sahu**  
GitHub: [@Ranjeet-Sahu07](https://github.com/Ranjeet-Sahu07)

---

## 🌟 Star this Repository

If you found this helpful, please give it a ⭐ to show your support!

---

**Happy Coding! 🚀**
