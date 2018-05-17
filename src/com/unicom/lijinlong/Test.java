package com.unicom.lijinlong;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String packageName = "com.unicom.excel";
		Package pkg = Package.getPackage(packageName);
		Annotation[] annotations = pkg.getAnnotations();
		Arrays.asList(annotations).stream().forEach( a -> {
			System.out.println(a.annotationType());
		});
		System.out.println(PackageConstant.a);
	}
}
