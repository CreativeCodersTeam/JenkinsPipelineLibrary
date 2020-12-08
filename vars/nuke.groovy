def call(Map args) {

    environment{
        API_KEY = credentials('nuget.dev.apikey')
    }

    def command = 'nuke'
    command = command + " ${args.target}"

    //String apiKey = credentials('nuget.dev.apikey')

    echo 'API_KEY ' + API_KEY

    for(def argument in args) {        
        if (argument.key != 'target') {
            def key = argument.key
            def value = argument.value

            command = command + ' --' + key + ' \"' + value + '\"'
        }        
    }

    sh command
}