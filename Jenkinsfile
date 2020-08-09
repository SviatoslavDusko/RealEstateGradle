// pipeline {
//     agent any
//     stages {
//         stage ('Clone sources') {
//             steps {
//                 echo 'Cloning...'
//                 git url: 'https://github.com/SviatoslavDusko/RealEstateGradle.git'
//             }
//         }
//         stage ('Build') {
//             steps {
//                 sh './gradlew clean build'
//                 sh './gradlew model '
//             }
//         }
//         stage ('DemoJavaTask') {
//             steps {
//                 echo 'DemoJavaTask...'
//                 sh './gradlew DemoJavaTask'
//             }
//         }
//         stage ('Deploy') {
//             steps {
//                 echo 'Deploying...'
//                 sh 'ls'
//                 dir ("build/libs") {
//                     script {
//                         withEny(['JENKINS_NODE_COOKIE=dontkill']) {
//                             echo '&'
//                             sh 'java -jar lection-0.0.1-SHAPSHOT.jar &'
//                         }
//                     }
//                 }
//             }
//         }
    }
}