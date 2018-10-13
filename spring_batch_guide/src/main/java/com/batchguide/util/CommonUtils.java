package com.batchguide.util;

import java.util.ArrayList;
import java.util.List;

public class CommonUtils {

	/**
	 * 입력 파라미터 정보 추출
	 * 
	 * @param params 입력파라미터
	 * @return 입력파라미터 정보
	 */
	public static ArrayList<String> makeParameters(List<String> params) {
		
		ArrayList<String> retList = new ArrayList<String>();
		
		/*
		 * 입력파라미터는 key=value 형태로 이루어지므로 입력 스트림에 대한 필터 처리 후
		 * 파라미터 정보만 리스트에 담는다.
		 */
		params.stream().filter(p -> p.contains("=")).forEach(param -> {
			retList.add(param.split("=")[0].toUpperCase() + "=" + param.split("=")[1]);
		});
		
		return retList;
	}
	
}