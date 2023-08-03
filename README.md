# SpringWebMvc_SpringDao_Assignment
SpringWebMVC + SpringDAO web assignment: Display form to accept vendor details, show all vendors, edit or delete them

What application does?
1. Start the application as Spring Boot Application.
2. type: http://localhost:8080/vendorweb/showCreate in the web browser to go to the form wherein a user can populate a vendor details.
3. Clicking on ViewAll, a user can navigate to see all vendors.
4. A user can perform edit or delete operation on the vendor, or go back to the vendor form using Add Vendors button.

Common errors encountered:
If the application does not start, try deleting dataSource spelling and filling it again in the application.properties file. The application will start then.

Technologies Used:
1. Spring Dao is used to interact with MySQL database.
2. Spring MVC is used to show all form views and perform CRUD operations. All the URL's where the user can be directed to are listed in the Controller.
3. To be able to create, delete table in MySQL database or workbench, refer to Vendor.sql files present inside application.properties -> sql folder.

Data flow bw different classes: 
Request from web(jsp view) directs to Controller. Controller gives command to Service. Service gives command to DaoImpl. DaoImpl uses JpaRepository to perform actions . JpaRepository performs required operations on MySQL database. 
