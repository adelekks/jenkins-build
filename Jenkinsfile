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
                sh 'echo ${agent_label}'
                sh 'chmod +x command.sh'
                sh './command.sh ${agent_label}'
            }
        }
    }
}
