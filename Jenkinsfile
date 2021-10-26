pipeline {
    agent {
        label params.agent_label == "any" ? "" : params.agent_label
    }

    parameters {
        choice(name: "AGENT", choices: ["any", "maven", "nodejs"]) 
    }

    stages {
        stage("Build") {
            steps {
                sh './command.sh params.agent_label'
            }
        }
    }
}
