package com.pky;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Demo {
	
	public static void main(String[] args) {
		String originalMsg="Prem@123";
		System.out.println("Original Msg ::"+originalMsg);
		String encodedString=Demo.encodeMsg(originalMsg);
		System.out.println("Encoded Msg :"+encodedString);
		
		String decodedString=Demo.decodeMsg(encodedString);
		System.out.println("Decoded Msg ::"+decodedString);
	}
	
	
	/**
	 * this method is used to encode the data
 * @author Prem
 *
 */
	public static String encodeMsg(String msg) {
		 Encoder encoder=Base64.getEncoder();
		 
		 String encodedMsg=encoder.encodeToString(msg.getBytes());
		 
		 return encodedMsg;
	}

	/**this method is used to decode the data
	 * @param encodedMsg
	 * return String
	*/
	public static String decodeMsg(String encodedMsd) {
		Decoder decoder=Base64.getDecoder();
		byte[] decodedMsg=decoder.decode(encodedMsd);
		String decodedStr=new String(decodedMsg);
		
		return decodedStr;
	}
}
