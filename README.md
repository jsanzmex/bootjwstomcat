This is a repo to use as a quickstart to start working with Spring Boot and deploying to the JBoss Web Server 3.0 Tomcat 8 application server.  This uses the mvn build system and creates a .jar file that can be deployed.  The code also contains a sample REST based service listening at /hello.

As an added bonus, this repo can also be deployed directly as a docker container using the JBoss Web Server 3.0 Tomcat 8 S2I builder image on OpenShift 3 with the following command:

	oc new-app jboss-webserver30-tomcat8-openshift:1.3~https://github.com/jsanzmex/bootjwstomcat.git


What, you don't have OpenShift 3 yet? Fix that immediately: www.openshift.org/vm
