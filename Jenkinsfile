pipeline {
    agent {
        label params.agent_label == "any" ? "" : params.agent_label
    }

    parameters {
        choice(name: "agent_label", choices: ["any", "maven", "nodejs"]) 
    }

    stages {
        stage("Build") {
            steps {
                sh 'chmod +x command.sh'
                sh './command.sh params.agent_label'
            }
        }
    }
}
