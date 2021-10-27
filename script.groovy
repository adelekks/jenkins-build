def MavenApp() [
    echo "Maven equals $1"
    mvn --version
}

def NodeJSApp() [
    echo "Nodejs equals $1"
    npm -v
}       

return this
