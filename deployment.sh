#!/bin/bash

jobname="$1"
branch_name="$2"
build_number="$3"

whoami

aws s3 ls 
ls -la
hostname -i
systemctl status tomcat
#aws s3 cp s3://artificats061/buildpipeline-git/master/15/hello-15.war /tmp/
aws s3 cp s3://artificats061/$jobname/$branch_name/$build_number/hello-$build_number.war /var/lib/tomcat/webapps
#cp /tmp/hello-$build_number.war /var/lib/tomcat/webapps
