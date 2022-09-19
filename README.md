
# SpringBoot Curd API
#Version

Java Version 17
Mysql
Angular CLI: 13.1.3

#API

Post request
To add data in database:http://localhost:8080/menu/add

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



