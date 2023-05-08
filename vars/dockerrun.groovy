def call(){
  sh 'docker run -itd --name hellorepo -p 8080:8080 bharath0812/newrepo:4.0'
}
