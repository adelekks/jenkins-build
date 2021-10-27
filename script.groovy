def MavenApp() {
    echo "Maven equals ${agent_label}"
    mvn -v
}

def NodeJSApp() {
    echo "Nodejs equals ${agent_label}"
    npm -v
}       

return this
