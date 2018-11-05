Installing Docker CE on Ubuntu 16.04

Docker is an application that allows to deploy programs that are run as containers. It was written in the popular Go programming language. 
This tutorial explains how to install Docker CE on Ubuntu 16.04.

Step 1: Updating all your software
First off, let's make sure that we are using a clean system. Run the apt updater.
cmd >> apt-get update

Step 2: Set up the repository
Install packages to allow apt to use a repository over HTTPS
cmd >> apt-get install apt-transport-https ca-certificates curl software-properties-common

Add Docker’s official GPG key
cmd >> curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add -

Use the following command to set up the stable repository.
cmd >> add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"

Step 3: Install Docker CE
cmd >> apt-get update
cmd >> apt-get install docker-ce

Step 4: Create a user
If you decide not to run Docker as the root user, you will need to create a non-root user.
Warning: The docker group grants privileges equivalent to the root user.
cmd >> adduser user
cmd >> usermod -aG docker user

Restart the Docker service.
cmd >> systemctl restart docker

Step 5: Test Docker
Run the Docker hello-world container to test if the installation completed successfully.
cmd >> docker run hello-world

You will see the following output.
Hello from Docker!

This message shows that your installation appears to be working correctly.

Step 6: Configure Docker to start on boot
Lastly, enable Docker to run when your system boots.
cmd >> systemctl enable docker