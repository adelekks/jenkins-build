def gv
pipeline {
    agent {
        label params.agent_label == "any" ? "" : params.agent_label
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
		  if (params.{agent_label){
		      gv.MavenApp()
		  if (params.agent_label){
		      gv.NodeJSApp();
		}
	      }   
           }
       }
   }
 }
