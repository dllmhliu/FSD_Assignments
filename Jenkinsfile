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
        	    bat 'docker push dllmhliu/gateway:latest'
        	    bat 'docker push dllmhliu/payment:latest'
        	    bat 'docker push dllmhliu/search:latest'
        	    bat 'docker push dllmhliu/security:latest'
        	    bat 'docker push dllmhliu/technology:latest'
        	    bat 'docker push dllmhliu/training:latest'
        	    bat 'docker push dllmhliu/user:latest'
        	}
        }
        stage('Remove Image'){
        	steps{
        	    bat 'docker rmi dllmhliu/registry'
        	    bat 'docker rmi dllmhliu/gateway'
        	    bat 'docker rmi dllmhliu/payment'
        	    bat 'docker rmi dllmhliu/search'
        	    bat 'docker rmi dllmhliu/security'
        	    bat 'docker rmi dllmhliu/technology'
        	    bat 'docker rmi dllmhliu/training'
        	    bat 'docker rmi dllmhliu/user'
        	    bat 'docker image prune -f'
        	}
        }
    }
}