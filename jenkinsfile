pipeline {
    agent any
    stages {
        stage ('Clone sources') {
            steps {
                echo 'Cloning...'
                git url: 'https://github.com/SviatoslavDusko/RealEstateGradle.git'
            }
        }
        stage ('Test') {
            steps {
                sh './gradlew clean test'
            }
        }
    }
}