pipeline{
	agent any
	stages{
		stage('Compile stage'){
			steps{
				withMaven(maven:'maven'){
					sh 'mvn clean compile''
				}	
			}
		}	
		stage('Test stage'){
			steps{
				withMaven(maven:'maven'){
					sh 'mvn test''
				}		
			}
		}	
	}
}