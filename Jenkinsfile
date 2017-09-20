pipeline {
  agent {
    docker {
      image 'image \'maven:3-alpine\''
    }
    
  }
  stages {
    stage('build') {
      agent {
        docker {
          image 'maven:3-alpine'
        }
        
      }
      steps {
        sh 'mvn'
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
        sh 'echo deploy'
      }
    }
  }
}