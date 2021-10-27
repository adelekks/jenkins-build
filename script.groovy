def MavenApp() {
    echo "Maven equals ${agent_label}"
    /usr/bin/mvn -v
}

def NodeJSApp() {
    echo "Nodejs equals ${agent_label}"
    /usr/bin/npm -v
}       

return this
