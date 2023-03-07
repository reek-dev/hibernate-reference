# ✅ A zero-nonsense guide to setup a bare minimum hibernate project (Without Maven)

![](https://hibernate.org/images/hibernate-logo.svg)

### a guide to setup Hibernate in Eclipse EE IDE with MySQL without using Maven on a Windows system.

- Create a basic Java project in Eclipse with this structure

![](https://i.imgur.com/roLQN23.png)

- Now go to Hibernate website and navigate to the releases page.
`https://hibernate.org/orm/releases/`
	- Select any series (e.g. - 5.6)<br>
	- Choose any version (e.g. - 5.6.14)


![](https://i.imgur.com/1mO5hDw.png)


- Click on the `Download` button.


- A zip file will be downloaded; extract it.


-  Upon extracting, go to this folder `hibernate-release-5.6.5.Final\lib\required`


- Select all the JAR files and copy them to the `lib` folder in your project.


- Also go to this url to download the MySQL driver
`https://dev.mysql.com/downloads/connector/j/`


- And select the option `Platform Independent` under the `Select Operating System:`


![](https://i.imgur.com/Ll91e5O.png)

- Click on the `Download` button.


- A zip file will be downloaded; extract it.


- Upon extracting, open the folder. There should be only one JAR.


- Select it, copy it, and paste it into the `lib` folder.


- After all of this, you need to add these JARs to the project's classpath


- Right click on your project and select `Properties`


- Select `Java Build Path` and go to the `Libraries` tab


- Select `Classpath`


- Select `Add JARs`


![](https://i.imgur.com/BmF9oW0.png)

- Go to your project directory, select the `lib` folder


- Select all the JARs inside this `lib` folder

![](https://i.imgur.com/vAC7WMT.png)

- On the next window, select 'Apply and Close'


- Once you have successfully done that, you should have a `Referenced Libraries` section in your Eclipse project


![](https://i.imgur.com/KvSnPh5.png)


- Done.
