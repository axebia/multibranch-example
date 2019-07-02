pipeline {
    agent any
    stages {
        stage('Git Clone') {
            steps {
                git credentialsId: 'xebia_github', url: 'https://github.com/axebia/multibranch-pipe-example.git'
            }
        }
        stage('deploy micro-one-helmchart') {
            steps {
                withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
                sh label: '', script: 'helm install micro1-helmchart'
                }
            }
        }
        stage('deploy micro-two-helmchart') {
            steps {
                withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
                sh label: '', script: 'helm install micro2-helmchart'
                }
            }
        }
    }
}
