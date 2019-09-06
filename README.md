# springboot-docker-jenkins-mysql-nginx
Repository URL
https://github.com/arunds/springboot-docker-jenkins-mysql-nginx.git

springboot application with docker, jenkins, mysql and nginx

## Build & Run the spring boot application without Jenkins
springboot-docker-jenkins-mysql-nginx\springboot-data-docker-mysql-app> __mvn install dockerfile:build__  
springboot-docker-jenkins-mysql-nginx> __docker-compose up__  

## After the container started we can acccess the application in the below URL  
IP Adress of the docker VM  
http://192.168.99.100:8080/

![Welcome Screen](screenshots/hello.PNG?raw=true "Welcome Screen")

## Run the Jenkins Docker Instance
cd springboot-docker-jenkins-mysql-nginx/jenkins  
springboot-docker-jenkins-mysql-nginx/jenkins> __docker-compose up__ 

Access the Jenkins in the following URL  
http://192.168.99.100:8085/

![Jenkins Login](screenshots/jenkins.PNG?raw=true "Jenkins Home Screen")

## Jenkins Configuration
Once the jenkins instance started, need to configure below steps
Create pipleline projectect using the github URL  
Add github,docker credentials in jenkins  
Configure webhook to trigger automatic build   

![Jenkins Job](screenshots/jenkins-job.PNG?raw=true "Jenkins Job Screen")

Once the jenkins job is started, we can see the below containers in docker console

![Docker Console](screenshots/docker-ps.PNG?raw=true "Docker Terminal Screen")


Below is the application running on docker container
![Welcome Screen](screenshots/hello.PNG?raw=true "Welcome Screen")

Now we can make some changes as mentioned

![Welcome Screen](screenshots/after_change.PNG?raw=true "Home Screen")

Below is the mysql workbench data details

![MySql Workbench Screen](screenshots/mysql-workbench.PNG?raw=true "Database Screen")



