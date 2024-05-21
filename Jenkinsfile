pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello world!' 
            }
        }
    
        stage ('git checkout'){
            steps{
                git branch: 'main', credentialsId: 'Gitlab', url: 'https://github.com/sailsub/JenkinsGradle.git'
            }     
        } 
        stage ('Gradle build'){
            steps{
                bat '''gradlew.bat build'''
            }     
        }
        stage ('Gradle test'){
            steps{
                bat '''gradlew.bat test'''
            }     
        }
        stage ('Gradle build Scan'){
            steps{
                bat '''gradlew.bat build --scan'''
            }     
        }
        stage ('Gradle run'){
            steps{
                bat '''gradlew.bat build --scan'''
                println "Run successfully!!"
            }     
        }           
    }
}
