# Overview
A basic CRUD (`C`reate, `R`ead, `U`pdate, and `D`elete) REST (`RE`presentational `S`tate `T`ransfer) API (`A`pplication `P`rogramming `I`nterface) built with Spring Boot
using the Java programming language.

The model class used is Cloud Vendor with the following attributes:
1. `vendorId`
2. `vendorName`
3. `vendorAddress`

The CRUD operations are implemented in the controller class (CloudVendorApiService) using the following Spring Boot Annotations:
1. `@PostMapping` - To create the cloud vendor details.
2. `@GetMapping` - To retrieve the cloud vendor details.
3. `@PutMapping` - To update the cloud vendor details.
4. `@DeleteMapping` - To delete the cloud vendor details.

Postman API testing tool is used to test the proper functioning of this application.

# Screenshots

1. POST

![1](https://user-images.githubusercontent.com/74103829/182443467-7c8fe050-d3d3-484c-af1f-7c042303d569.png)

2. GET 

![2](https://user-images.githubusercontent.com/74103829/182443357-cd0cca8a-3aca-45d6-b556-0bef3dd4bfd5.png)


![3](https://user-images.githubusercontent.com/74103829/182443656-92e9f42d-b651-47ed-84d2-96b642379b0e.png)


3. PUT

![4](https://user-images.githubusercontent.com/74103829/182443944-b8d97031-e018-4b9a-89f7-92200a068fa4.png)


![5](https://user-images.githubusercontent.com/74103829/182444288-281347c8-c315-4914-bab7-951dcb5c3a7d.png)


4. DELETE


![6](https://user-images.githubusercontent.com/74103829/182444493-74490346-b8c9-4868-a5fa-d5771087417c.png)


![7](https://user-images.githubusercontent.com/74103829/182444497-fbb0e8cd-1aa6-459e-990c-42af4dc84add.png)


# References
1. Java REST API with Spring Boot Tutorial | REST API CRUD Implementation - https://www.youtube.com/watch?v=iBGkJln9BPo
2. What is REST - https://restfulapi.net/
