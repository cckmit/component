package com.x.common.service.business.sendmail;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.x.common.constants.EmailConstants;
import com.x.sdk.mail.EmailTemplateUtil;


public class PoolSend {
	//测试用
//	public static void main(String [] args){
//		PoolSend ps= new PoolSend();
//		Map<String, String> emailSetting = null;
//			emailSetting = SendEmailUtil.getHtmlEmail();
//		if(null != emailSetting){
//			EmailManagSender sender= new EmailManagSender(emailSetting, getSendEmailList());
//			FutureTask<Boolean> futureTask = new FutureTask<Boolean>(sender);
//			ps.send(futureTask);
//			try {
//				futureTask.get();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		ps.close();
//		
//	}
	
	
	 BlockingQueue<Runnable> workQueue;//任务队列  
	 ExecutorService es;//线程池的接口  
	    
	public PoolSend() {  
	        workQueue = new LinkedBlockingQueue<>();//构造无界的任务队列，资源足够，理论可以支持无线个任务  
	        es = new ThreadPoolExecutor(
	        		2, 
	        		50, 
	        		300, 
	        		TimeUnit.MINUTES, 
	        		workQueue, 
	        		new ThreadPoolExecutor.CallerRunsPolicy());
	        		
	    }  
	    public void send(Runnable task) {
	    	System.out.println("任务信息【"+es.toString()+"】");
	    	System.out.println("线程队列大小为【"+workQueue.size()+"】");
	        es.execute(task);//将任务放入线程池  
	        es.submit(task);
	    }  
	    
		public  Future<Boolean> send(Callable<Boolean> task) {
	    	System.out.println("任务信息为【"+es.toString()+"】");
	    	System.out.println("线程队列大小为【"+workQueue.size()+"】");
	       return (Future<Boolean>) es.submit(task);
	    }  
	    public void close() {// 关闭  
	    	if(es==null){
	    		System.out.println("关闭====================");
	    		 es.shutdown();  
	    	}
	    } 
	    
	    //测试用
		public static List<SendEmailParam> getSendEmailList(){
			
			List<SendEmailParam> sendlist  = new ArrayList<SendEmailParam>();
			
			SendEmailParam sendEmailParam = new SendEmailParam();
			
			sendEmailParam.setEmail("admin@qq.com");
			sendEmailParam.setAllUser(false);
			sendEmailParam.setMsgId("00000105");
			sendEmailParam.setUserId("4444364");
			sendEmailParam.setSubject("test123");
			String[] data= new String[]{"test11","sunyy3","test11"};
			//得到模板
			String htmlcontext = EmailTemplateUtil.buildHtmlTextFromTemplate(EmailConstants.EMAIL_ZH_CN_TEMPLATE, data);
	    	StringBuilder sb = new StringBuilder();
			sb.append(htmlcontext);
			sendEmailParam.setContent(sb);
			
			SendEmailParam sendEmailParam2 = new SendEmailParam();
			
			sendEmailParam2.setEmail("122706747@qq.com");
			sendEmailParam2.setAllUser(false);
			sendEmailParam2.setMsgId("00000105");
			sendEmailParam2.setUserId("4444364");
			sendEmailParam2.setSubject("test18");
			//得到模板
			String htmlcontext2 = EmailTemplateUtil.buildHtmlTextFromTemplate(EmailConstants.EMAIL_ZH_CN_TEMPLATE, data);
	    	StringBuilder sb2 = new StringBuilder();
			sb2.append(htmlcontext2);
			sendEmailParam2.setContent(sb2);
			
			sendlist.add(sendEmailParam2);
			sendlist.add(sendEmailParam);
			return sendlist;
		}
}
