node('master'){
    try{
        stage('build'){
            ./gradlew build
        }
    } catch(error){
        throw error
    } finally {
        println "executed Jenkinsfile"
    }
}