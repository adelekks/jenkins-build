def MavenApp() {
    echo "Maven equals ${agent_label}"
    def cmd = 'mvn -v'
}

def NodeJSApp() {
    echo "Nodejs equals ${agent_label}"
    def cmd = 'npm -v'
}       

return this
