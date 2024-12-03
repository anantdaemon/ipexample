Read me : IpTraceExample

1. Install the latest versions of Java and Python. Add their paths into Environment variable.(Refer Youtube on how to properly install Java, Python etc)
2. Install SQL Server Express Edition.
3. Install IDE like Spring Tools Suite or Eclipse or Visual Studios

4. Install Postman. 
Postman is used to test the api's by sending requests to the api.

5. After downloading the code, extract the code into your local machine.
 Make a separate folder named - SpringProjects. You can keep all your codes related to Springboot in this folder.
 
6. Import the project into IDE from the location where you have extracted and stored the project.
  For SpringToolsSuit or Eclips IDE. it is import Maven project into IDE.

7. Give 1 min to your IDE to download all the necessary files and packages for the project. This status is shown in the bottom right corner of the IDE.

8. After the download is finished, right click on the project and goto Maven->Update project -> Select force update of snapshot/releases -> press ok.
	This step is known Maven Update of project.
	
9. After Maven Update, again right click on the project, goto Run as -> Maven build... -> (write clean install in the goals section) -> give a name to this run in the Name section in the top, then press OK.
This step is known as Maven build.

10. After build, we will be having clearance on where we have errors in our projects, if all the Junits and dependency are working or not.
If everything is fine then Maven Build will give result as "Build Success".

11. After Build Success, we are ready to launch our project, for running, right click on the project, goto Run as -> Springboot app. Project should start running now.

12. Now to test the api, open Postman (after it is successfully installed). 
In the address bar of postman we need to write api url of our api. http://localhost:8080/api/client-ip
Select the method same as the method that is declard for the api in the controller, in our case it is get. 
we can also give other parameters and requests to the api via postman using parameters and body etc, but it is not needed as of now for this api.

The api will return the result in the response section of postman.
for local machine it will 0:0:0:0:0:0:0:1

13. Now we can stop the api using stop button given in the menu of IDE's.
