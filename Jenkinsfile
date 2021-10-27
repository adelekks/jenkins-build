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
			if [ "maven" == "${agent_label}" ];
			then
			    gv.MavenApp()
			fi

			# if condition is Nodejs
			if [ "nodejs" == "${agent_label}" ];
			then
			    gv.NodeJSApp()
			fi
		     """
	      }   
           }
       }
   }
}
