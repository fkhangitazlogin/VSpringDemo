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

            success 
            {
                mail to: 'nalamalavardhan@gmail.com', subject: 'The Pipeline Passed :)'
                body: "Get Deatils from this BuildURL: ${BUILD_URL}"
            }

            failure 
            {
                mail to: 'nalamalavardhan@gmail.com', subject: 'The Pipeline failed :('
                body: " For error logs Check this BuildURL: ${BUILD_URL}"
            }
            
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
