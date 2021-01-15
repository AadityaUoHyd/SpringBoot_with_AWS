package org.aadi.dynamoDB_Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDynamoDbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDynamoDbDemoApplication.class, args);
	}

}

/*

Before running this programs as springBootApp, 
kindly create a User,Group & 'employee' table in AWS DynamoDB.
Also provide your own AWS accessKey, secretKey, and region inside application.yml file.

After running them feed DB using post mapping from Postman tool.
URL should be :http://localhost:8081/employee

=> Say JSON data be like (for Post) :
 
 {
  "firstName" : "Virat",
  "lastName":"Kohli",
  "email" : "Kohli@gmail.com",
  "department" : {
    "departmentName" : "New",
    "departmentCode" : "Modern-235"
  }
}

=> For Get, use url : http://localhost:8081/employee/{find employeeId from DynamoDB}

=>Same process for put & delete.

*/