def call(Map args) {
        
    def command = 'nuke'
    command = command + " ${args.target}"

    sh command
}