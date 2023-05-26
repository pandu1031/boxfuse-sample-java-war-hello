//declarative pipeline
pipeline {
    agent any
      stages {
          stage("checkout git"){

              steps {
                git branch: 'master',
                url: 'https://github.com/KuruvaSomaSekhar/boxfuse-sample-java-war-hello.git'

            sh "ls -latr"
            }
          }
          stage("build stages") {
              steps {
                  println "This is build stage.mvn clean package command"
              }

          }
           stage("Upload artifacts"){

               steps{
                   println "Upload artificats to S3"
               }

           }  
            stage("Deploy stage"){

                steps {
                    println "Deploy artifacts to tomcat server"
                }

            }
      }
}
