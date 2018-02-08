pipeline{

	agent any
	stages{
	
		stage('Testing'){
			steps{
				echo 'Testing..'
				sh 'ant -f test.xml -v'
				junit 'reports/result.xml'
			}
			
		}

		stage('Building'){
			steps{

				echo "Building.."
				sh 'ant -f build.xml -v'
			}
	      	post {
    	    	success {
        	  		archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
       			}
			}
		}

	}
}
