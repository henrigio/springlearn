pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'echo build'
      }
    }
    stage('backend') {
      steps {
        parallel(
          "backend unit": {
            sh 'echo backend'
            
          },
          "performance": {
            sh 'echo performance'
            
          }
        )
      }
    }
    stage('fronttest') {
      steps {
        sh 'echo fronttest'
      }
    }
    stage('staticanalysis') {
      steps {
        sh 'echo static analysis'
      }
    }
    stage('deploy') {
      steps {
        sh 'deploy'
      }
    }
  }
}