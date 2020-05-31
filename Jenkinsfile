pipeline {
  agent any
  stages{
    stage ('build')
    {
      steps{
      
      bat "mvn clean"
      echo "build has been done"
      }
    }
    stage ('test')
    {
      steps{
      echo "Testing is done"
      }
    }
    
    stage ('compile')
    {
      steps{
      bat "mvn compile"
      echo "Compile has been done"
      }
    }
     stage ('deploy')
    {
      steps{
      
      echo "Deployment has been done"
      }
    }




}
}
