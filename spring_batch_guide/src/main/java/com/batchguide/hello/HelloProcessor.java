package com.batchguide.hello;

import org.springframework.batch.item.ItemProcessor;

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
public class HelloProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String name) throws Exception {
		
		return name + "!!";
	}

}
