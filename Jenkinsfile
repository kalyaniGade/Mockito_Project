pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'gradle clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'gradle clean test'
            }
        }
        stage('Find Bugs') {
            steps {
                echo 'FindBugs Checking..'
                sh 'gradle check'
            }
        }
       
    }
}