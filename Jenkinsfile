pipeline {
	agent any
	stages {
		stage('build'){
			steps {
				sh 'docker-compose build'
			}
		}
		stage('deploy'){
			steps {
				sh 'docker-compose up -d'
			}
		}
	}
}