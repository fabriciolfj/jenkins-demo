pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('curd-person-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/fabriciolfj/crud-person.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}