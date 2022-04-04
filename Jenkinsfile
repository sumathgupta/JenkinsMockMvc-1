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
            stage('sonar analysis') {
            steps {
                withSonarQubeEnv('ZensarCodeAnalysis'){
                    bat 'mvn sonar:sonar'
            }
        }
        stage('JaCoCo Report') {
            steps {
                jacoco()
            }
        }
    }
}
