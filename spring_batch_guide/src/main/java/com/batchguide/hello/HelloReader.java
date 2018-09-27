package com.batchguide.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Devguru
 * @since 2018.09.14
 * @version 1.0
 * @see <pre>
 *      개정이력(Modification Information)
 *   
 *   수정일           수정자           수정내용
 *  ---------- -------- ---------------------------
 *  2018.09.14  Devguru   최초 생성
 *  </pre>
 */
public class HelloReader implements ItemReader<String> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloReader.class);
	
	@Value("#{jobParameters['bseYm']}")
	public String bseYm;
	
	private String[] names = { "이철수",
			"김길동",
			"김영희" };
	
	private int count = 0;
	
	@Override
	public String read() throws Exception {
		if (count < names.length) {
			LOGGER.info("JOB PARAMETER VALUE : " + bseYm);
			return names[count++];
		} else {
			count = 0;
		}
		return null;
	}

	/**
	 * @param bseYm the bseYm to set
	 */
	public void setBseYm(String bseYm) {
		this.bseYm = bseYm;
	}
}
