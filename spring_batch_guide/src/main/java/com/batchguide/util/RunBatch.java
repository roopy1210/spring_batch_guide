package com.batchguide.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.rte.bat.core.launch.support.EgovCommandLineRunner;

/**
 * 배치 Job 실행하는 Main Class
 * 
 * @author Devguru
 * @since 2018.09.27
 * @see EgovCommandLineRunner
 * @version
 * 
 * <pre>
 * 	개정이력(Modification Information)
 * 
 * 수정일            수정자            수정내용
 * ---------- ---------- --------------------------------------------
 * 2018.09.27 Devguru    최초작성
 * </pre>
 */
public class RunBatch {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RunBatch.class);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void start(String...args) {
		
		
		EgovCommandLineRunner command = new EgovCommandLineRunner();
		
		HashSet<String> opts = new HashSet<String>();
		
		/**
		 * Batch Job을 실행한다.
		 * 실행을 위해서 , Job 이름 / JobExecutionID, Job Parameter
		 * 그리고 CommandLineRunner Option가 지정되어야 한다.
		 * 
		 * jobPath : Job Context가 저장된 XML 파일 경로 
		 * jobIdentifier : Job 이름 /JobExecutionID
		 * parameters : Job Parameter 
		 * opts : CommandLineRunner 옵션(-restart, -next, -stop, -abandon)
		 */
		/*JOB_PATH 설정*/
		String jobPath = args[0];
		
		/*JOB_ID 설정*/
		String jobId = args[1];
		
		/*
		 * 입력 파라미터 설정
		 * TIMESTAMP를 추가 해주는 이유는 JobInstance=Job+Parameter로 구성되는데 TIMESTAMP로 추가하지 않고
		 * 동일한 파라미터로 두번실행 시 오류가 발생하므로 추가해준다.
		 */
		ArrayList newList = new ArrayList(Arrays.asList(args));
		newList.add("TIMESTAMP=" + (new Date()).getTime());
		
		ArrayList<String> paramList = CommonUtils.makeParameters(newList);
		
		/*입력파라마터출력*/
		AtomicInteger atomicInteger = new AtomicInteger(0);
		paramList.forEach(p -> System.out.println("Parameter[" + atomicInteger.getAndIncrement() +"] : " + p));
		
		/*리스트 형태의 파라미터를 배열로 변환*/
		String[] paramArr = paramList.stream().toArray(n -> new String[n]);
		
		/*배치프로그램실행*/
		int statusCode = 0;
		
		statusCode = command.start(jobPath, jobId, paramArr, opts);
		
		/*배치실행결과출력*/
		LOGGER.info("Status Code: " + statusCode);
		
		if (statusCode == 0) {
			System.out.println(jobId + " 성공 [SUCCESS]");
		} else {
			LOGGER.error(jobId + " 실패 [FAIL]");
			LOGGER.error("Error Message: " + EgovCommandLineRunner.getErrorMessage());
		}
	}
	
}
