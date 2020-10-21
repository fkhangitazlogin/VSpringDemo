pipeline {
    agent any
    tools
    {
            maven 'mvnhome'
    }

    stages {
        //stage('GitRepoFetch')
        //{
            //steps
            //{
                 //git 'https://github.com/fkhangitazlogin/VSpringDemo.git'
            //}

        //}
        stage('MvnProjectBuild')
        {
            steps
            {
                sh "java -version"
                sh "mvn --version"
                sh "mvn clean install"
            }
        }
    }
    post {
            cleanup {
                /* clean up our workspace */
                deleteDir()
                /* clean up tmp directory */
                dir("${workspace}@tmp") {
                    deleteDir()
                }
                /* clean up script directory */
                dir("${workspace}@script") {
                    deleteDir()
                }
            }
        }
}
