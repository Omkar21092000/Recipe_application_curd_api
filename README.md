# Recipe Application
Simple web page application which contain list of recipe with there detail and having some CURD base api.For the database mysql is used to perform curd base application. All the necessary dependency has been add.


# Version
Java Version 17
Mysql
Angular CLI: 13.1.3

# Database
  Name:foodlist


# API
Post request
To add data in database:http://localhost:8080/menu/add
![AddInMenu_backend](https://user-images.githubusercontent.com/91202848/191707749-eb2e22f2-d8e8-4413-babe-9fb40a66bfa2.jpg)
![addedfood_sucessfully](https://user-images.githubusercontent.com/91202848/191708548-ce160aa2-291f-425f-b223-ffdc1c12a60b.jpg)
![addedfood_sucessfully](https://user-images.githubusercontent.com/91202848/191708608-4f967840-02f7-448b-aeb7-17f234652b00.jpg)





GET request
To fetch all data:http://localhost:8080/menu/all

Put request
To update data by id:http://localhost:8080/menu/update/{id}

Delete request
To delete data by id:http://localhost:8080/menu/delete/{id}

@Get request
Fetch Data All vegeterian
http://localhost:8080/menu/vegeterian

@Get request
Recipes that can serve 4 persons and have "potato" as ingredient
http://localhost:8080/menu/getingredient/{numserve}/{specingedient}
For exmaple:
http://localhost:8080/menu/getingredient/4/tomato



@Get request
Recipes without "salmon" as an ingredient that has "oven" in instruction
http://localhost:8080/menu/notiningredient/{ingre}/{methcook}
For example:http://localhost:8080/menu/notiningredient/salmon/oven

Home Page for Angular :
http://localhost:4200/

To Add new dish in menu:
http://localhost:4200/adddish


#Database Name: 
foodlist



