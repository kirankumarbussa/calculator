pipeline{

	agent any
	stages{
		stage('Build'){
			steps{
				echo 'Building..'
				sh 'ant -f build.xml -v'
			}
		}
	
		stage('Testing'){
			steps{

				echo "Testing.."
				sh 'ant -f test.xml -v'
			}
		}
	}
}
