pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
		withMaven(maven : 'mymaven')
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
		withMaven(maven : 'mymaven')
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
		withMaven(maven : 'mymaven')
                echo 'Deploying....'
            }
        }
    }
}