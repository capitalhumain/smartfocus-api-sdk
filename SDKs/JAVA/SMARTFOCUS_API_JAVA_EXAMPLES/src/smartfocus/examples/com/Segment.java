package smartfocus.examples.com;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import com.emailvision.apiccmd.service.api.ApiSegmentation;
import com.emailvision.apiccmd.service.api.ApiSegmentationSampleType;
import com.emailvision.apiccmd.service.api.ApiStringDemographicCriteria;
import com.emailvision.apiccmd.service.api.ApiStringDemographicOperator;
import com.emailvision.apiccmd.service.api.CcmdExceptionDetails;
import com.emailvision.apiccmd.service.api.CcmdServiceProxy;
import com.emailvision.apiccmd.service.api.ConnectionExceptionDetails;

public class Segment {

	private static String token;
	private static CcmdServiceProxy CcmdServiceProxy = null;
	private static final String  login = "{your_login}";
	private static final String  pwd = "{your_password}";
	private static final String  key = "{your_api_key}";
	private static final String  endpoint  = "http://{your_pod_url}/apiccmd/services/CcmdService";
	
	public static void main(String[] args) {
		// Open Connection
		openConnectionForCcmd(login , pwd , key);

		//create segment
		createSegment(token);

	}
	
	private static void openConnectionForCcmd(String login , String pwd , String key){
		CcmdServiceProxy = new CcmdServiceProxy();
		CcmdServiceProxy.setEndpoint(endpoint);
			
		try {
			token = CcmdServiceProxy.openApiConnection(login, pwd, key);
		} catch (ConnectionExceptionDetails e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	private static void createSegment (String key){
		ApiSegmentation apiSegmentation = new ApiSegmentation();
		apiSegmentation.setDateCreate((new GregorianCalendar()));
		apiSegmentation.setSampleType(ApiSegmentationSampleType.ALL);
		apiSegmentation.setDescription("some description");
		apiSegmentation.setName("some name");
		apiSegmentation.setId(0);
		
		long seg_id ;
		try {
			//create segment
			seg_id = CcmdServiceProxy.segmentationCreateSegment(key, apiSegmentation);
			
			//create criteria
			ApiStringDemographicCriteria criteria = new ApiStringDemographicCriteria();
			criteria.setId(seg_id);
			criteria.setColumnName("EMAIL");
			criteria.setOperator(ApiStringDemographicOperator.IS_NOT_EMPTY);
			
			//update segment			
			CcmdServiceProxy.segmentationAddStringDemographicCriteriaByObj(key, criteria);
			
			//count segment
			int seg_count=CcmdServiceProxy.segmentationCount(token,seg_id);
			System.out.println("segment [ "+apiSegmentation.getName()+" ] has "+seg_count+" members");
			

		} catch (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails e) {
			e.printStackTrace();
		} catch (CcmdExceptionDetails e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
