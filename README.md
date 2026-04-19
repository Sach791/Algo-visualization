# 🧠 Algorithm Visualization System (Spring Boot + Thymeleaf)

## 📌 Overview  
The **Algorithm Visualization System** is a Spring Boot-based web application that helps users understand Data Structures and Algorithms through interactive execution.  

It provides functionality to perform and visualize **sorting and searching algorithms** using a web interface built with **Thymeleaf**. The project follows a clean layered architecture with controllers, services, and algorithm modules.  

---

## ✨ Key Features  

### 🔢 Sorting Algorithms  
- Bubble Sort  
- Selection Sort  
- Insertion Sort  
- Merge Sort  
- Quick Sort  

---

### 🔍 Searching Algorithms  
- Linear Search  
- Binary Search  

---

### ⚡ Backend Processing  
- Built using **Spring Boot**  
- Separate **Controller, Service, and Algorithm layers**  
- Efficient logic implementation  

---

### 🎨 Thymeleaf UI  
- Dynamic HTML pages using Thymeleaf  
- User input forms for sorting and searching  
- Result pages displaying output  

---

### 🧩 Clean Architecture  
- Controllers → Handle HTTP requests  
- Services → Business logic  
- Algorithm Package → Core implementations  
- DTO → Data transfer  

---

## 🛠️ Technology Stack  

| Layer        | Technology Used |
|-------------|----------------|
| Backend      | Spring Boot (Java) |
| Frontend     | Thymeleaf, HTML, CSS |
| Build Tool   | Maven |
| Language     | Java |

---

 📁 Project Structure  


Algo-visualization-master/
│
├── .mvn/
├── src/
│ ├── main/
│ │ ├── java/com/DSAproject/DSAproject/
│ │ │ ├── algorithm/
│ │ │ │ ├── searching/
│ │ │ │ └── sorting/
│ │ │ ├── controllers/
│ │ │ │ ├── SearchingController.java
│ │ │ │ └── SortingController.java
│ │ │ ├── services/
│ │ │ │ ├── SearchingService.java
│ │ │ │ └── SortingService.java
│ │ │ ├── DTO/
│ │ │ └── DsAprojectApplication.java
│ │ │
│ │ └── resources/
│ │ ├── templates/
│ │ │ ├── sorting.html
│ │ │ ├── searching.html
│ │ │ ├── result.html
│ │ │ └── search-result.html
│ │ └── application.properties
│ │
│ └── test/
│ └── java/com/DSAproject/DSAproject/
│ └── DsAprojectApplicationTests.java
│
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md


---

## 📦 Prerequisites  

- ☕ Java JDK (8 or above)  
- 📦 Maven  
- 🧰 IDE (IntelliJ / Eclipse recommended)  

---

## ⚙️ Setup Instructions  

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/your-username/algo-visualization.git
cd algo-visualization
2️⃣ Build the Project
mvn clean install
3️⃣ Run the Application
mvn spring-boot:run

OR run:

DsAprojectApplication.java
4️⃣ Open in Browser
http://localhost:8080/
🖥️ Usage Guide
🔢 Sorting
Enter array size
Select sorting algorithm
View sorted result
🔍 Searching
Enter array size and target value
Select searching algorithm
View search result
🚀 Future Enhancements
📊 Graphical animations (bar visualization)

🎥 Step-by-step visualization

👨‍💻 Author
Developed by Sachin 

📝 License

This project is open-source and available for educational purposes.
