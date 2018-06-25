package com.x.centra.dst.service.kafka;

import java.util.ArrayList;
import java.util.List;

import com.x.sdk.component.mds.IMessageProcessor;
import com.x.sdk.component.mds.IMsgProcessorHandler;

public class DstActiveProcessorHandler implements IMsgProcessorHandler {

	@Override
	public IMessageProcessor[] createInstances(int paramInt) {
		// TODO Auto-generated method stub
		List<IMessageProcessor> processors = new ArrayList<>();
		IMessageProcessor processor = null;
		for (int i = 0; i < paramInt; i++) {
			processor = new DstActiveMessageProcessorImpl();
			processors.add(processor);
		}
		return processors.toArray(new IMessageProcessor[processors.size()]);
	}

}
