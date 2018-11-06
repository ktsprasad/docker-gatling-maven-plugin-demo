                                        ================================
                                        docker-gatling-maven-plugin-demo
                                        ================================

** Project Setup **  

- Check out a project from a remote host (clone - https://github.com/ktsprasad/docker-gatling-maven-plugin-demo.git) >> IntelliJ IDEA allows you to check out (in Git terms clone) an existing repository and create a new project based on the data you've downloaded.
    
1. From the main menu, choose VCS | Checkout from Version Control | Git, or, if no project is currently opened, choose Checkout from Version Control | Git on the Welcome screen.

2. In the Clone Repository dialog, specify the URL of the remote repository you want to clone (you can click Test to make sure that connection to the remote can be established).

3. In the Directory field, specify the path where the folder for your local Git repository will be created into which the remote repository will be cloned.

4. Click Clone. If you want to create a IntelliJ IDEA project based on the sources you have cloned, click Yes in the confirmation dialog. Git root mapping will be automatically set to the project root directory.

Or 

Clone the master repo and open open the POM.xml file via intellij

Steps,
1. git clone https://github.com/ktsprasad/docker-gatling-maven-plugin-demo.git
2. open the project via intellij using POM.xml file


** How to run LoginSimulation **

Simple showcase of a maven project using the docker-gatling-maven-plugin-demo

To test it out, simply execute the following command:

    $mvn gatling:test -Dgatling.simulationClass=computerdatabase.LoginSimulation

or simply:

    $mvn gatling:test

-------------------------------------------
draft - document in progress
-------------------------------------------

Gatling setup CI and Docker

This is repo running load test with gatling locally as well as inside docker containers. It does following things

- Get Gatling Setup into your Jenkins WORKSPACE or local directory
- Docker image and contaners with Gatling setup
- Generate report in HTML.
- Easy to use bash scripts plauggable with Jenkins or any othe CI server

Usage
Pre-requisite is to have JDK(Java) installed as scala being JVM based language.

** Run Gatling Test Locally **

Download/Checkout this project
     
     $ git clone https://github.com/ktsprasad/docker-gatling-maven-plugin-demo.git
     
Running Gatling Test locally (Works from Mac)
     
     $ sh gatling_local.sh

This script will download Gatling with version 2.2.5 and unzip the binary and run tests with our simulation.
At the end you will see link to HTML report. Open it into browser and enjoy !!
(Optional) Record your load test simulations and put your class in the 'user-files/simulations'. OR You can use the pre-recorded simulation for this demo as it is

** Running Gatling Test Inside Docker Containers **

Pre-defined Simulation
Download the pre-built Docker-Gatling image from DockerHub here

       $ docker pull ktsprasad/docker-gatling-maven-plugin-demo
       
Run container using the downloaded images

     $ docker run -it -d --name docker-gatling-container ktsprasad/docker-gatling-maven-plugin-demo 
     
Run default simulations inside the docker containers

     $ docker exec docker-gatling-container /opt/gatling/bin/gatling.sh -sf /opt/gatling/user-files/simulations/ -s computerdatabase.BasicSimulation -rf /opt/gatling/results/
     
This will execute default simulation.

** Mount your own Simulation **

- Download the pre-built Docker-Gatling image from DockerHub here

       $ docker pull ktsprasad/docker-gatling-maven-plugin-demo
       
- Run container using the downloaded images with mounted simulation

docker run -it -d --rm -v conf:/opt/gatling/conf \ -v user-files:/opt/gatling/user-files \ -v results:/opt/gatling/results \ --name docker-gatling-container ktsprasad/docker-gatling-maven-plugin-demo

OR

- Running Gatling Test locally using the script

  sh docker_local.sh

This will download docker image and start container.

** Run Gatling Test on Jenkins **
- Record your load test simulations and put your class in the 'user-files/simulations'. OR You can use the pre-recorded simulation for this demo
- Run gatling-jenkins.sh as part of execute shell script
