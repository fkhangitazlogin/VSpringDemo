pipeline {
    agent any

    stages {
        stage('GitRepoFetch')
        {
            steps
            {
                 git 'https://github.com/fkhangitazlogin/VSpringDemo.git'
            }

        }
        stage('MvnProjectBuild')
        {
            steps
            {
                sh "mvn clean install"
            }
        }
    }
}