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
                  sh """
		      # if condition is Maven
			if (${agent_label}) {
			    gv.MavenApp();
			{
			# if condition is Nodejs
			if (${agent_label}) {
			    gv.NodeJSApp();
			}
		     """
	      }   
           }
       }
   }
}
