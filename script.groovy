def MavenApp() {
    echo "Maven equals ${agent_label}"
    bat mvn -v
}

def NodeJSApp() {
    echo "Nodejs equals ${agent_label}"
    bat npm -v
}       

return this
