package com.batchguide.util;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageUtils {
	
	private static MessageSource resources = new ClassPathXmlApplicationContext(
			"classpath:/config/batch/message/context-message.xml");

	public static String getMessage(String code) {
		return resources.getMessage(code, (Object[]) null, Locale.getDefault());
	}
	
	public static String getMessage(String code, Object[] params) {
		return resources.getMessage(code, params, Locale.getDefault());
	}
	
}
