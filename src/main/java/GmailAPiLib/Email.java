package GmailAPiLib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import org.testng.annotations.Test;

public class Email {

	@Test
		
		public static String OutlookMailReader(String mailFolderName,String emailSubjectContent, String emailContent, int lengthOfOTP) {

            
			  String hostName = "https://mail.limra.com/owa/";//change it according to your mail

			            String username = "rperabathula@limra.com";//username 

			            String password = "Krishna@10";

			            int messageCount;

			            int unreadMsgCount;

			            String emailSubject;

			            Message emailMessage;

			            String searchText=null ;

			            Properties sysProps = System.getProperties();

			            sysProps.setProperty("mail.store.protocol", "imaps");

			            try {

			                Session session = Session.getInstance(sysProps, null);

			                Store store = session.getStore();

			                store.connect(hostName, username, password);

			                Folder emailBox = store.getFolder(mailFolderName);

			                emailBox.open(Folder.READ_WRITE);

			                messageCount = emailBox.getMessageCount();

			                System.out.println("Total Message Count: " + messageCount);

			                unreadMsgCount = emailBox.getNewMessageCount();

			                System.out.println("Unread Emails count:" + unreadMsgCount);

			                for(int i=messageCount; i>(messageCount-unreadMsgCount); i--)

			                {

			                    emailMessage = emailBox.getMessage(i);

			                    emailSubject = emailMessage.getSubject();

			                    if(emailSubject.contains(emailSubjectContent))

			                    {

			                        System.out.println("OTP mail found");

			                        String line;

			                        StringBuffer buffer = new StringBuffer();

			                        BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));

			                        while ((line = reader.readLine()) != null) {

			                            buffer.append(line);

			                        }

			                        String messageContent=emailContent;

			                        String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));

			                        searchText = result.substring(messageContent.length(), messageContent.length()+lengthOfOTP);

			                        System.out.println("Text found : "+ searchText);

			                        emailMessage.setFlag(Flags.Flag.SEEN, true);

			                        break;

			                    }

			                    emailMessage.setFlag(Flags.Flag.SEEN, true);

			                }

			                emailBox.close(true);

			                store.close();


			            } catch (Exception mex) {

			                mex.printStackTrace();

			                System.out.println("OTP Not found ");

			            }

			            return searchText;

			        }
			
		
	}

		
		
		
		
		
		