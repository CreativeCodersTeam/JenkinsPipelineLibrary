def call() {
    step([$class: 'XUnitPublisher', testTimeMargin: '3000', thresholdMode: 2,
        thresholds: [
            [$class: 'FailedThreshold', failureNewThreshold: '', failureThreshold: '0', unstableNewThreshold: '', unstableThreshold: ''],
            [$class: 'SkippedThreshold', failureNewThreshold: '', failureThreshold: '0', unstableNewThreshold: '', unstableThreshold: '']
        ],
        tools: [
            [$class: 'XUnitDotNetTestType', deleteOutputFiles: true, failIfNotNew: true, pattern: 'artifacts/test_results/*.xml', skipNoTestFiles: true, stopProcessingIfError: true]
        ]
    ])
}