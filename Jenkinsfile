def gv
pipeline {
    agent {
        label params.agent_label == "any" ? "" : params.agent_label
    }

    tools {
       maven 'Maven3'
    }
    parameters {
        choice(name: "agent_label", choices: ["any", "maven", "nodejs"]) 
    }

    stages {
        stage("init") {
            steps {
		script {
		   gv = load "script.groovy"
		}
            }
        }
        stage("Build"){
	   steps {
              script {
		     if ("maven" == params.agent_label)
		         def proc = gv.MavenApp()
		     if ("nodejs" == params.agent_label)
		         def proc = gv.NodeJSApp()
	      }   
           }
       }
   }
}
