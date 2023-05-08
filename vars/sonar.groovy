def call(){
  withSonarQubeEnv('sonar'){
                   sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Devops-pro \
                   -Dsonar.java.binaries=. \
                   -Dsonar.projectKey=Devops-pro '''
  }
