package smartfocus.examples.com;

import java.rmi.RemoteException;

import com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;
import com.emailvision.apibatchmember.service.api.BatchMemberServiceProxy;
import com.emailvision.apibatchmember.service.api.Column;
import com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails;
import com.emailvision.apibatchmember.service.api.MergeUpload;

public class BatchMember {

	private static String token;
	private static BatchMemberServiceProxy batchMemberServiceProxy = null;
	private static final String  login = "{your_login}";
	private static final String  pwd = "{your_password}";
	private static final String  key = "{your_api_key}";
	private static final String  endpoint  = "http://{your_pod_url}/apibatchmember/services/BatchMemberService";
	
	public static void main(String[] args) {
		// Open Connection
		openConnectionForBatchMember(login , pwd , key);
		
		//Do Upload
		MergeUpload(token);
	}

	private static void openConnectionForBatchMember(String login , String pwd , String key){
		batchMemberServiceProxy = new BatchMemberServiceProxy();
		batchMemberServiceProxy.setEndpoint(endpoint);
		
		try {
			token = batchMemberServiceProxy.openApiConnection(login, pwd, key);
		} catch (ConnectionExceptionDetails e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
	private static void MergeUpload(String key){
		String file = "someemial@dummymail.com\tA_first_Name\tA_last_name";
		
		MergeUpload mergeUpload = new MergeUpload();
		
		
		mergeUpload.setFileName("some_file_name.csv");
		mergeUpload.setSeparator("tab");
		mergeUpload.setSkipFirstLine(false);
		mergeUpload.setDateFormat("dd/MM/yyyy");
		mergeUpload.setCriteria("LOWER(EMAIL)");
		mergeUpload.setFileEncoding("UTF-8");
		
		Column firstName = new Column();
		Column lastName = new Column();
		Column Email = new Column();
		
		
		
		Email.setColNum(1);
		Email.setFieldName("EMAIL");
		firstName.setToReplace(true);
		
		firstName.setColNum(2);
		firstName.setFieldName("FIRSTNAME");
		firstName.setToReplace(true);
		
		lastName.setColNum(3);
		lastName.setFieldName("LASTNAME");
		lastName.setToReplace(true);		
		
		
		Column[] columns = {Email,firstName,lastName};
		
		
		mergeUpload.setMapping(columns);
		
		
		try {
			batchMemberServiceProxy.uploadFileMerge(key, mergeUpload, file.getBytes());
		} catch (ConnectionExceptionDetails e) {
			e.printStackTrace();
		} catch (BatchMemberExceptionDetails e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}


}
