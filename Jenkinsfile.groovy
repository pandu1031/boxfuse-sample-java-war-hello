//declarative piepline

pipeline {

    agent { label 'slaver1' }
    stages {
        stage("Checkout git repo") {

            steps {
                println "clone git code "
                git branch: "${BRANCH_NAME}",
                credentialsId: 'slaveid',
                url: 'https://github.com/KuruvaSomaSekhar/boxfuse-sample-java-war-hello.git'

                //sh "ls -lat"
            }
        }

        stage("build code"){
            steps {
                println "Build code"
                sh "mvn clean package"
            }
        }
        stage("Upload artifacts to s3") {
            steps {
                sh "aws s3 cp target/*.war s3://artificats061/$JOB_NAME/${BRANCH_NAME}/$BUILD_NUMBER/"
            }
        }
    }

}
