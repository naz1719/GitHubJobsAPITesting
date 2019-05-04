
pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
                git (credentialsId: 'e0e22cc9-0ac6-4335-8b30-68b46091de2a',
                        url: 'https://github.com/naz1719/GenericTAF.git',
                        branch : 'master'
                )
            }
        }
        stage('Replace properties in general.properties file') {
            steps {
                contentReplace(
                        configs: [
                                fileContentReplaceConfig(
                                        configs: [
                                                // fileContentReplaceItemConfig(
                                                //     search: '(_hubURL_)',
                                                //     replace: 'http://localhost:4444/wd/hub',
                                                //     matchCount: 1),
                                        ],
                                        fileEncoding: 'UTF-8',
                                        filePath: './src/main/resources/general.properties')
                        ])
            }
        }
        stage('Run tests') {
            steps {
                sh label: 'Add permission to execute', script: 'chmod +x ./gradlew'
                sh label: 'Run all suites', script: './gradlew clean runAllSuite --info'
            }
        }
    }

    post('Generate allure report, save artifacts') {
        always {
            archiveArtifacts artifacts: '**'
            allure results: [[path: 'build/allure-results']]
        }
    }
}