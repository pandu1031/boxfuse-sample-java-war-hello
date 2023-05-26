#!/bin/bash

#Install tomcat web server
echo "Install"
sudo yum install tomcat -y
sudo yum install tomcat-webapps tomcat-admin-webapps tomcat-docs-webapp tomcat-javadoc -y
sudo systemctl start tomcat
sudo systemctl restart tomcat


