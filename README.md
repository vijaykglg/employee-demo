# A Sample Application for Employee Demo

* It's a Rest API to be consumed 

* Basic functionality is to get the employees with respective roles 

### Prerequisites:
- Maven setup (ignore if already setup):
  
  a. Install maven from https://maven.apache.org/download.cgi
  
  b. Unzip maven and keep in C drive (you can keep any location. Path location will be changed accordingly).
  
  c. Set MAVEN_HOME in system variable.
- Installed Tomcat 
- Cloned project repository

### Step by step guide: 
1. Open the command prompt or terminal in the directory with pom file.
2. Build Spring Boot Project with Maven 'mvn clean install' command
3. Run Spring Boot app using Maven: 'mvn spring-boot:run'
4. Open http://localhost:8080 in your browser.
5. When you finished working with the application press **CTRL+C** in your command prompt to terminate the process

## Implementation

* Spring is used in a backend.
* H2 databases used for storing and managing data.

## Output
```
[
  {
    "id": 1,
    "firstName": "Vijay",
    "lastName": "Gupta",
    "age": 36,
    "roles": [
      {
        "id": 3,
        "role": "ROLE_USER",
        "description": "Normal user",
        "employees": []
      }
    ]
  },
  {
    "id": 2,
    "firstName": "Sri",
    "lastName": "Raghu",
    "age": 36,
    "roles": [
      {
        "id": 4,
        "role": "ROLE_ADMIN",
        "description": "Admin user",
        "employees": []
      }
    ]
  }
]
```

## Team
[![Vijay Kumar Gupta](https://avatars2.githubusercontent.com/u/57914226?s=400&u=711ef43ea909d33b585b75b406fa9a8189415a6b&v=4)](https://github.com/vijaykglg)

## License

All Rights Reserved © Vijay Gupta

## Version

* Version 1.0-SNAPSHOT