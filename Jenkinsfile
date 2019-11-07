pipeline {
    agent any
    environment {
		dockerImage = ''
    }
    stages {
    	stage('CheckOut Code'){
         	steps{
            	checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/dllmhliu/FSD_SBA.git']]])
            }
        }
        stage('Maven Build'){
        	steps{
        	    bat 'mvn clean package -DskipTests'
        	}
        }
        stage('Image Build'){
        	steps{
        	    bat 'mvn dockerfile:build'
        	}
        }
        stage('Image Push'){
        	steps{
        	    bat 'docker push dllmhliu/registry:latest'
        	    
        	}
        }
        stage('Remove Image'){
        	steps{
        	    bat 'docker rmi dllmhliu/registry'
        	    bat 'docker image prune -f'
        	}
        }
    }
}