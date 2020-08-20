pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh './gradlew build'
            }
        }
        stage('Deploy') { 
            steps {
                sh 'java -jar build/libs/demo-1.0.0-SNAPSHOT-boot.jar &' 
            }
        }
    }
}
