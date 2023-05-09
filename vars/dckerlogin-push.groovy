def call(){
   withDockerRegistry(credentialsId: 'dokerhub') {
   sh "docker push bharath0812/newrepo:4.0 ."
   }
