def MavenApp() {
    echo "Maven equals ${agent_label}"
    def maven_cmd = 'mvn -v'
}

def NodeJSApp() {
    echo "Nodejs equals ${agent_label}"
    def nodejs_cmd = 'npm -v'
}       

return this
