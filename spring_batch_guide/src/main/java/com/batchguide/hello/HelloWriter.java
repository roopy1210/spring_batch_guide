package com.batchguide.hello;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

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
public class HelloWriter implements ItemWriter<String> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWriter.class);

	@Override
	public void write(List<? extends String> names) throws Exception {
		for (String name : names) {
			LOGGER.info("안녕 " + name);
		}
	}

}
