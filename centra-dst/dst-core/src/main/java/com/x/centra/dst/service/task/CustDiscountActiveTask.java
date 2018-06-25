package com.x.centra.dst.service.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.x.centra.dst.constants.DiscountConstants;
import com.x.centra.dst.service.kafka.DstActiveProcessorHandler;
import com.x.sdk.component.mds.IMessageConsumer;
import com.x.sdk.component.mds.MDSClientFactory;

/**
 * 权益激活kafka任务
 * @author wangluyang
 *
 */
public class CustDiscountActiveTask {

	private static final Logger LOG = LoggerFactory.getLogger(CustDiscountActiveTask.class);
	
	public CustDiscountActiveTask() {
		init();
	}
	public void init() {
		//kafka启动
		MainThread te = new MainThread();
		te.start();
	}

	// 内部类
	private class MainThread extends Thread {
		public MainThread() {
		}
		public void run() {
			IMessageConsumer msgConsumer = MDSClientFactory.getConsumerClient(DiscountConstants.MDS_PROCESSOR_PATH, new DstActiveProcessorHandler());
			msgConsumer.start();
			synchronized (CustDiscountActiveTask.class) {
				while (true) {
					try {
						CustDiscountActiveTask.class.wait();
					} catch (Exception e) {
						LOG.error(">>>>>>>>> MDS 消费错误，具体信息为：" + e.getMessage());
					}
				}
			}

		}
	}
}
