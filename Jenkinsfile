pipeline {

    agent any

    stages {
        stage('build') {
            steps {
                sh './gradlew clean'
            }
        }
        stage('check1') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Smoke Test') {
            steps {
                sh './gradlew clean test -Dcucumber.options="Smoke/SmkFtr/Smk.feature"'
                cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'Smoke Test',
                fileIncludePattern: '**/Smk.json'
            }
        }
       stage('check2') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Sanity Test') {
            steps {
                sh './gradlew clean test -Dcucumber.options="Sanity/SntFtr/Snt.feature"'
                cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'Sanity Test',
                fileIncludePattern: '**/Snt.json'
            }
        }
        stage('check3') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
