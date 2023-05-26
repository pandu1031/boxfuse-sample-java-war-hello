//Deployment pipeline
//declarative pipeline
pipeline {

    agent any
    stages {
        stage("Download war artifacts") {
        steps {
            sh """ hostname 
             ls -l
             pwd
             scp -i /tmp/demo.pem deployment.sh ec2-user@${serverip}:/tmp/
             ssh -i /tmp/demo.pem ec2-user@${serverip} "echo "Im in tomcat" && sudo chmod +x /tmp/deployment.sh && sudo bash /tmp/deployment.sh ${jobname} ${branch_name} ${build_number}"

             """
            }
        }
    }

}