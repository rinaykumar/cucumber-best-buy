pipeline {
agent any
stages {
stage('Build') {
steps {
echo 'Building...'
echo '...Still Building...'
sh 'mvn clean package -DskipTests'
archiveArtifacts artifacts: '**/target/*.jar'
}
}
stage('Test') {
steps {
echo 'Testing....'
sh 'mvn test -B'
}
}
}
}
