pipeline {
  agent any
  stages {
    stage('build') {
      agent {
        docker {
        image 'maven:3-alpine'
          args '-v /root/.m2:/root/ .m2'
        }
      }
      steps {
        sh './mvnw -B clean package'
        stash name: 'war', includes: 'target'
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
