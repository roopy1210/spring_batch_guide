package com.batchguide.partitioner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class PartitionerHelper implements Partitioner {
	
	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {
		
		HashMap<String,ExecutionContext> result = new HashMap<String,ExecutionContext>();
		
		for (int index = 0; index < gridSize; ++index) {
			ExecutionContext value = new ExecutionContext();
			value.putInt("parallelTotal", gridSize);
			value.putInt("parallelIndex", index);
			
			result.put("partition" + index, value);
		}
		
		return result;
		
	}

}
