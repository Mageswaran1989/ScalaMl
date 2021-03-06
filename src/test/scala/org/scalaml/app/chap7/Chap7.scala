/**
 * Copyright (c) 2013-2015  Patrick Nicolas - Scala for Machine Learning - All rights reserved
 *
 * The source code in this file is provided by the author for the sole purpose of illustrating the 
 * concepts and algorithms presented in "Scala for Machine Learning". It should not be used 
 * to build commercial applications. 
 * ISBN: 978-1-783355-874-2 Packt Publishing.
 * Unless required by applicable law or agreed to in writing, software is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * Version 0.98.1
 */
package org.scalaml.app.chap7

import org.scalaml.app.ScalaMlTest



		/**
		 * <p>Test driver for the techniques described in the Chapter 7 Sequential data models<br>
		 * <ul>
		 * 	 <li>Hidden Markov Model evaluation form</li>
		 *   <li>Hidden Markov Model training form</li>
		 *   <li>Conditional Random Fields</li>
		 * </ul></p>
		 * @see org.scalaml.app.ScalaMlTest
		 * @author Patrick Nicolas
		 * @since May 28, 2014
		 * @note Scala for Machine Learning Chapter 7 Sequential data model
		 */
final class Chap7 extends ScalaMlTest {
		/**
		 * Name of the chapter the tests are related to
		 */
	val chapter: String = "Chap 7"
	
	  	/**
		 * Maximum duration allowed for the execution of the evaluation
		 */
	val maxExecutionTime: Int = 25
	
	test(s"$chapter Hidden Markov Model evaluation form") {
		evaluate(HMMEval, Array[String]("evaluation"))
	}
   
	test(s"$chapter Hidden Markov Model training form") {
		evaluate(HMMEval, Array[String]("training"))
	}

	test(s"$chapter Conditional Random Fields") {
		evaluate(CrfEval)
	}
}

// --------------------------------  EOF -------------------------------