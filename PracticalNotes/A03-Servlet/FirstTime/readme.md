first tomcat server has to be installed in the machine
then below process
# First Time Servlet App
on rightside you will find an icon after the search icon "open perspective"
select "JEE" to do your first servlet app
![alt text](image.png)

![alt text](image-1.png)

![alt text](image-2.png)

![alt text](image-3.png)

above image -> click on New Runtime 
![alt text](image-4.png)

select the respective server and it's version installed in your machine
->mine => apache tomcat 9.0
![alt text](image-5.png)

![alt text](image-6.png)

![alt text](image-7.png)

![alt text](image-8.png)

![alt text](image-9.png)

This is the project structure of servlet
![alt text](image-10.png)

## Next SetUp the Server in the IDE

click on it
![alt text](image-11.png)

![alt text](image-12.png)

![alt text](image-13.png)

![alt text](image-14.png)
select app and click on add
![alt text](image-15.png)

![alt text](image-16.png)
click on finish.

next run the server
![alt text](image-17.png)

![alt text](image-18.png)

![alt text](image-19.png)
click on finish

output on the browser 
![alt text](image-20.png)

## Creating first servlet program
![alt text](image-21.png)

![alt text](image-22.png)

servlet is meant for processing logic so keep it in the controller
![alt text](image-23.png)

write servlet name in the classname.

click on next.

select and edit the url mapping as /test
![alt text](image-24.png)
![alt text](image-25.png)

click on next.

![alt text](image-26.png)

![alt text](image-27.png)

![alt text](image-28.png)

below is clean code
![alt text](image-29.png)

```java
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =  response.getWriter(); 
		out.println("<h1>First Servlet App</h1>");
		out.close();
		
	}

```
![alt text](image-30.png)

write the /test url in the url bar

![alt text](image-31.png)

![alt text](image-32.png)
