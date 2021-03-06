pipeline {
	agent any

	environment{
		DOCKER_ACCESS_TOKEN = credentials('DockerHubAccessToken')
		MANAGER_SSH_KEY = credentials('managerSSH')
		JWTSecret = credentials('JWTSecret')
		DBUrl = credentials('DBUrl')
		DBPassword = credentials('DBPassword')
	}

	stages {
		stage('build'){
			steps {
				sh 'docker system prune -f'
				sh 'docker-compose build'
			}
		}
		stage('upload image'){
			steps {
				sh 'docker login -u sjknapp -p ${DOCKER_ACCESS_TOKEN}'
				sh 'docker push sjknapp/group3-backend:latest'
			}
		}
		stage('deploy'){
			steps {
				sh 'scp -i "${MANAGER_SSH_KEY}" docker-compose.yaml jenkins@15.0.2.50:~/backend'
            	sh 'ssh -i "${MANAGER_SSH_KEY}" jenkins@15.0.2.50 "docker stack deploy --compose-file ~/backend/docker-compose.yaml project-stack"'
			}
		}
	}
}
