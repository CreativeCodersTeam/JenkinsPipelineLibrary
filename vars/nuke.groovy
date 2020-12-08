def call(Map args) {
        
    def command = 'nuke'
    command = command + " ${args.target}"

    for(def argument in args) {
        if (argument.key != 'target') {
            command = command + " --${argument.key} \"${argument.value}\""
        }        
    }

    sh command
}