pipeline {
     agent any
     
     tools {
        jdk 'JDK17'
        maven 'Maven3'
     }
     stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage ('UnitTesting') {
            steps {
                sh 'mvn package'
            }
        }
        stage ('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar',
                fingerprint: true
            }
        }
        stage ('Development') {
            when {
                branch 'develop'
            }
            steps {
                echo 'development build completed'
            }
        }
        stage ('feature') {
            when {
                expression {
                    env.BRANCH_NAME.startsWith('feature/')
                }
            }
            steps {
                echo 'feature branch validation completed'
            }
        }
        stage  ('Production Release') {
            when {
                branch 'main'
            }
            steps {
                echo 'production release approved!'
            }

        }
     }
}
