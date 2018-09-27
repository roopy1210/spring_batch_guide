package com.batchguide;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.batchguide.util.RunBatch;

import egovframework.rte.bat.core.launch.support.EgovCommandLineRunner;

/**
 * 배치 Job 실행하는 Main Class
 * 
 * @author seongwon.jeong
 * @since 2018.08.21
 * @see EgovCommandLineRunner
 * @version
 * 
 * <pre>
 * 	개정이력(Modification Information)
 * 
 * 수정일            수정자            수정내용
 * ---------- ---------- --------------------------------------------
 * 2018.08.21 정성원            최초작성
 * </pre>
 */
public class CommandLineJobRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CommandLineJobRunner.class);

	public static void main(String[] args) {
		LOGGER.info("###################### Command Line Job Runner Start ######################");
		RunBatch.start(args);
		LOGGER.info("###################### Command Line Job Runner End   ######################");
	}

}
