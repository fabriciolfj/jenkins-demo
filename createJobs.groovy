pipelineJob('curd-person-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/fabriciolfj/crud-person.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}