def call(Map config= [:]) {
    node {
      echo "${config.name} - ${config.dayOfWeek}"
      sh '''
        git version
        java -version
        mvn -version
      '''
    }
}