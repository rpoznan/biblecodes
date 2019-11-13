package org.torah.loader;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.torah.loader.gem.GematriaCalc;
import org.torah.loader.tran.Transliterator;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.translate.AmazonTranslate;
import com.amazonaws.services.translate.AmazonTranslateClient;
import com.amazonaws.services.translate.model.TranslateTextRequest;
import com.amazonaws.services.translate.model.TranslateTextResult;

public class VerseTranslatorTest {
	
	//User name,Password,Access key ID,Secret access key,Console login link
	//rpoznan,,AKIAYNAAEPMH4XBG7LNO,r3VYwz7jd8G4cHt8aCxw/suXbjTAEkl1AV5CvXq7,https://577673394959.signin.aws.amazon.com/console

	
	@Test
	public void split() {
		String verse = "ובְּרֵאשִׁית, בָּרָא אֱלֹהִים, אֵת הַשָּׁמַיִם, וְאֵת הָאָרֶץ";
		System.out.println(Transliterator.transliterate(verse));
		System.out.println(GematriaCalc.calculate(verse));

		String[] x = org.torah.loader.splitter.VerseSplitter.splitVerse(verse);
		System.out.println(org.torah.loader.splitter.VerseSplitter.convertTranslator(x));
		assertEquals(x.length, 7);
		for(int c=0; c < x.length; c++) {
			String y = x[c];
			System.out.println(c);
			System.out.println(y);
			//System.out.println(translateHebrew(y));
			System.out.println(GematriaCalc.calculate(y));
			System.out.println(Transliterator.transliterate(y));
		}
		
	}
	
	private static final String REGION = "us-east-1";
	
	public String translateHebrew(String x) {
		 //
		BasicAWSCredentials awsCreds2 = new BasicAWSCredentials("AKIAYNAAEPMH4XBG7LNO", "r3VYwz7jd8G4cHt8aCxw/suXbjTAEkl1AV5CvXq7");
//		AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
//		                        .withCredentials(new AWSStaticCredentialsProvider(awsCreds2))
//		                        .withRegion(REGION)
//		                        .build();
		
		
		AWSCredentialsProvider awsCreds = new AWSStaticCredentialsProvider(awsCreds2);
		 
	        AmazonTranslate translate = AmazonTranslateClient.builder()
	                .withCredentials(new AWSStaticCredentialsProvider(awsCreds.getCredentials()))
	                .withRegion(REGION)
	                .build();
	 
	        TranslateTextRequest request = new TranslateTextRequest()
	                .withText(x)
	                .withSourceLanguageCode("he")
	                .withTargetLanguageCode("en");
	        TranslateTextResult result  = translate.translateText(request);
	        return result.getTranslatedText();
	}

}
