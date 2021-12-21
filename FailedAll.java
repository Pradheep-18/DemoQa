package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		IRetryAnalyzer r = annotation.getRetryAnalyzer();
		
		if(annotation==null) {
			annotation.setRetryAnalyzer(ReRun_10.class);
		}
		
	}

}
