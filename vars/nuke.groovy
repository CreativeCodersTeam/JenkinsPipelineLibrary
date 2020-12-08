def call(Map args) {

    def command = 'nuke'
    command = command + " ${args.target}"

    echo 'API_KEY ' + env.API_KEY

    for(def argument in args) {        
        if (argument.key != 'target') {
            def key = argument.key
            def value = argument.value

            command = command + ' --' + key + ' \"' + value + '\"'
        }        
    }

    sh command
}