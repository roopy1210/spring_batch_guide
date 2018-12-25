package com.batchguide.partitioner;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class PartitionerHelper implements Partitioner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PartitionerHelper.class);

	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {
		
		HashMap<String,ExecutionContext> result = new HashMap<String,ExecutionContext>();
		
		for (int index = 0; index < gridSize; ++index) {
			ExecutionContext value = new ExecutionContext();
			value.putInt("parallelTotal", gridSize);
			value.putInt("parallelIndex", index);
			
			LOGGER.info("partition#{} of {}", index, gridSize);
			
			result.put("partition" + index, value);
		}
		
		return result;
		
	}

}
