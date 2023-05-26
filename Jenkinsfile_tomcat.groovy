//tomcat
pipeline {

    agent any

    stages {

        stage("Install tomcat") {
            steps {
              sh """  scp -o StrictHostKeyChecking=no -i /tmp/demo.pem tomcatinstall.sh ec2-user@${serverip}:/tmp/ 
                      ssh -o StrictHostKeyChecking=no -i /tmp/demo.pem ec2-user@${serverip} " hostname -i && sudo chmod +x /tmp/tomcatinstall.sh && sudo bash /tmp/tomcatinstall.sh "

                """ 
            }

        }
    }

}