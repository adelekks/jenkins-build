pipeline {
    agent {
        label params.agent_label == "any" ? "" : params.agent_label
    }

    parameters {
        choice(name: "AGENT", choices: ["any", "maven", "nodejs"]) 
    }

 stages {
    stage('Clone Repo') {
        steps {
            git branch: 'master',
                url: 'https://github.com/adelekks/jenkins-build.git'

            sh "ls -lat"
        }
    }
    stage ('Version Check') {
            steps {
                sh './command.sh ${agent_label}'
            }
        }
  }
}
