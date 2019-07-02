pipeline {
    agent any
    stages {
        stage('Git Clone') {
            steps {
                git credentialsId: 'xebia_github', url: 'https://github.com/axebia/multibranch-pipe-example.git'
            }
        }
        stage('deploy micro1-helmchart') {
            steps {
                withCredentials([kubeconfigContent(credentialsId: 'kube-config', variable: 'KUBECONFIG_CONTENT')]) {
    		sh label: '', script: 'helm install micro1-helmchart'
                }
            }
        }
        stage('deploy micro1-helmchart') {
            steps {
                withCredentials([kubeconfigContent(credentialsId: 'kube-config', variable: 'KUBECONFIG_CONTENT')]) {
    		sh label: '', script: 'helm install micro2-helmchart'
                }
            }
        }
    }
}
