def call(Map config) {
    node {
      echo "${config.name}"
      sh '''
        git version
        java -version
        mvn -version
      '''
    }
}