def call(String statusVerb) {
    def jobName = env.JOB_NAME.replaceAll("%2F", "/")
    def url = env.BUILD_URL.replaceAll("%252F", "%2F")

    mail to: env.NOTIFY_MAIL_TO,
         subject: "BUILD ${jobName} ${statusVerb}",
         charset: 'UTF-8',
         mimeType: 'text/html',
         body: "<b>Project: ${jobName}</b> <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${url}"
}