# Spring FW First Project with Maven

![alt text](image.png)

![alt text](image-1.png)
click the check box - (simple project)

Next

Group ID = like a package name (eg: com.hellotecky)
Artifact ID = like a Project name (eg: FirstSpringApp)

File structure
![alt text](image-2.png)

![alt text](image-3.png)

dependencies install in maven "pom.xml"
![alt text](image-8.png)
![alt text](image-9.png)
download the popular one and stable one.
![alt text](image-10.png)
![alt text](image-11.png)
![alt text](image-12.png)

paste it in pom.xml => in between the dependencies tag
![alt text](image-13.png)


configure using the xml file by creating it.
![alt text](image-4.png)

write in search box as "xml"

select xml file (not xml schema)

![alt text](image-6.png)

![alt text](image-7.png)


```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean definitions here -->

</beans>
```







