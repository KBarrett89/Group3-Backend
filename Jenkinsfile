pipeline {
	agent any

	environment{
		DOCKER_ACCESS_TOKEN = credentials('DockerHubAccessToken')
		MANAGER_SSH_KEY = credentials('managerSsh')
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
				sh 'docker login -u sjknapp -p "${MANAGER_SSH_KEY}"'
				sh 'docker push sjknapp/Group3-bankend:latest'
			}
		}
		stage('deploy'){
			steps {
				sh 'scp -i "${MANAGER_SSH_KEY}" docker-compose.yaml jenkins@11.0.2.123:~'
            	sh 'ssh -i "${MANAGER_SSH_KEY}" jenkins@11.0.2.11 "docker stack deploy --compose-file docker-compose.yaml project-stack"'
			}
		}
	}
}
