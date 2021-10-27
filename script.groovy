def MavenApp() {
    echo "Maven equals ${agent_label}"
    sh "mvn -v"
}

def NodeJSApp() {
    echo "Nodejs equals ${agent_label}"
    sh "npm -v"
}       

return this
