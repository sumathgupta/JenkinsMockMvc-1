pipeline {
    agent any

    stages {
        stage('CheckOut') {
            steps {
                echo 'Checking out'
            }
        }
            stage('Package') {
            steps {
                bat 'mvn clean package'
            }
            }
            stage('JaCoCo Report') {
            steps {
                      jacoco()
                  }
        }
        stage('sonar analysis') {
            steps {
            withSonarQubeEnv('ZensarCodeAnalysis'){
            bat 'mvn sonar:sonar'
            }
        }   
    }
}
