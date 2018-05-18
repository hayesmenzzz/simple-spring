package com.seamount.spring.support;

import java.util.ResourceBundle;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goldmidai.sms.HttpSMSCaller;
import com.goldmidai.sms.bean.SMSResultBean;

public class SendMessageUtils {
	 
	private static Logger logger = LoggerFactory.getLogger(SendMessageUtils.class);
	
	/**
	 * 发送手机短信
	 * 
	 * @param mobile 手机号
	 * @param content 短信内容
	 * @return
	 */
	public static boolean sendMobiMessage(String mobile, String content) throws Exception{
		ResourceBundle rb = ResourceBundle.getBundle("application");
		String message_isSendMessage = rb.getString("message_isSendMessage");
		//如果定义message_isSendMessage=enabled，则发送短信，反之不发
		if(StringUtils.isNotEmpty(message_isSendMessage) && "enabled".equals(message_isSendMessage)){
			if(null == content){
				logger.info("短信内容为null，取消发送");
				return false;
			}
			//发送手机短信
			logger.info("发送短信：手机号："+mobile + "，发送的手机内容："+content);
			SMSResultBean resultBean = HttpSMSCaller.getInstance().sendSMS(mobile, content);
			logger.info("发送结果：" + (resultBean != null ? resultBean.isResult() : null));
			logger.info("结果描述：" + (resultBean != null ? resultBean.getResultMessage() : null));
			if(null != resultBean && resultBean.isResult()){
				return true;
			}else{
				return false;
			}
		}
		logger.info("application.properties的短信发送标识message_isSendMessage未定义或其值为disabled，短信不发送");
		return false;
	}
	public static void main(String[] args) {
		try {
			System.out.println(SendMessageUtils.sendMobiMessage("18607096005", "亲，ddd"));
		} catch (Exception e) {
		}
	}
}
