pipeline {
    agent any
    stages {
        stage('Git Clone') {
            steps {
                git credentialsId: 'xebia_github', url: 'https://github.com/axebia/multibranch-example.git'
            }
        }
        stage('Deploy Helm Chart') {
            steps {
                script {
                    if (env.BRANCH_NAME == 'master') {
                        withCredentials([file(credentialsId: 'kube-secret', variable: 'KUBECONFIG')]) {
                        sh label: '', script: 'helm install micro1-helmchart'
                        sh label: '', script: 'helm install micro2-helmchart'
                        }
                    } else {
                        echo 'Nothing to execute in this branch'
                    }
                }
            }
        }
    }
}
