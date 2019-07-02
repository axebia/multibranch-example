pipeline {
    agent any
    stages {
        stage('Git Clone') {
            steps {
                git credentialsId: 'xebia_github', url: 'https://github.com/axebia/multibranch-pipe-example.git'
            }
        }
    }
}
