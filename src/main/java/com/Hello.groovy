//println "Jenkins CI/CD DevOps for Spring Boot microservices Redis cache 1232435454665897432"

//println "Spring Boot event driven microservis"
def  value = 32 
println "Value is: $value"
println  "value:"+value
value="MongoDB+Kafka"
println  value
value=9676.8767
println  "=========>$value"

pipeline { 
    agent any 
    stages { 
        stage('Test') { 
            steps { 
                echo 'Running tests...' 
            } 
        }
     } 
}