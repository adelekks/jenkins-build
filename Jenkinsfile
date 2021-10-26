pipeline {
    agent {
        label params.agent_label == "any" ? "" : params.agent_label
    }

    parameters {
        choice(name: "AGENT", choices: ["any", "maven", "nodejs"]) 
    }

    stage ('Version Check') {
            steps {
                sh './command.sh ${agent_label}'
            }
        }
  }
