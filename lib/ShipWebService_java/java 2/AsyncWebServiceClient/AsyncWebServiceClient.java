import java.io.*;
import com.fedex.async.stub.*;


/** 
 * Sample code to call the FedEx Async Retrieve Jobs Web Service
 * <p>
 * com.fedex.async.stub is generated via WSDL2Java, like this:<br>
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.async.stub http://www.fedex.com/...../AddressValidationService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class AsyncWebServiceClient {
	
	public static void main(String[] args) { 
	    //
		RetrieveJobResultsRequest request = new RetrieveJobResultsRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        VersionId versionId = new VersionId("async", 1, 0, 0);
        request.setVersion(versionId);
	    //
	    TransactionDetail transactionDetail = new TransactionDetail();
	    transactionDetail.setCustomerTransactionId("java sample - RetrievJobResultsRequest"); //This is a reference field for the customer.  Any value can be used and will be provided in the return.
	    request.setTransactionDetail(transactionDetail);
        //
	    request.setJobId(System.getProperty("jobid"));
	    ArtifactRetrievalFilter filter = new ArtifactRetrievalFilter();
	    filter.setType(ArtifactType.OUTBOUND_LABEL);
	    //filter.setReferenceId("XXX");  //set this to request a specific Access Reference
	    request.setFilters(new ArtifactRetrievalFilter[]{filter});
	    //
		try {
			// Initialize the service
			ASYNCServiceLocator service;
			ASYNCPortType port;
			//	
			service = new ASYNCServiceLocator();
			updateEndPoint(service);
			port = service.getASYNCServicePort();	
			// This is the call to the web service
			RetrieveJobResultsReply reply = port.retrieveJobResults(request);
			VersionId vid = reply.getVersion();
			System.out.println("version major: " + vid.getMajor());
			System.out.println("version intermediate: " + vid.getIntermediate());
			System.out.println("version minor: "+ vid.getMinor());
			//
			if (isResponseOk(reply.getHighestSeverity()))
			{
				RetrievedArtifact[] artifacts = reply.getArtifacts();
				for(int i = 0; i < artifacts.length; i++)
				{
					String ar = artifacts[i].getAccessReference();
					String type = artifacts[i].getType().getValue();
					String format = artifacts[i].getFormat().getValue();
					System.out.println("AccessReference - " + ar);
					System.out.println("Document Type - " + type);
					System.out.println("Document Format - " + format);
					String documentname = ar + "_" + type +"."+format;
					saveDocumentsToFile(artifacts[i].getParts(),documentname, format);
				
				}
			}

			printNotifications(reply.getNotifications());

		} catch (Exception e) {
            e.printStackTrace();
		}
	}
	
	private static void saveDocumentsToFile(ArtifactPart[] parts, String documentname, String format) throws Exception{
		if(parts!= null){
			for(int i=0; i < parts.length; i++){
				ArtifactPart part = parts[i];
				String labelLocation = System.getProperty("file.label.location");
				if (labelLocation == null) {
					labelLocation = "c:\\";
				}
				String documentfilename = labelLocation + documentname;
				File documentfile = new File(documentfilename);
				FileOutputStream fos = new FileOutputStream(documentfile);
				fos.write(part.getContents());
				fos.close();
				if(format.equals("DOC") || format.equals("PDF") || format.equals("PNG") || 
						format.equals("RTF") || format.equals("TEXT") || format.equals("XML")){
					printDocument(documentfile);
				}
			}
		}
	}

	private static void printDocument(File documentfile) throws Exception{
		System.out.println("\nAssociated shipment label file name " + documentfile.getAbsolutePath());
		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + documentfile.getAbsolutePath());
	}

	private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
			notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
			notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
	}

	private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        String accountNumber = System.getProperty("accountNumber");
        String meterNumber = System.getProperty("meterNumber");
        //
        // See if the accountNumber and meterNumber properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (accountNumber == null) {
        	accountNumber = "XXX"; // Replace "XXX" with clients account number
        }
        if (meterNumber == null) {
        	meterNumber = "XXX"; // Replace "XXX" with clients meter number
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
	}
	
	private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential wac = new WebAuthenticationCredential();
        String key = System.getProperty("key");
        String password = System.getProperty("password");
        
        //
        // See if the key and password properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (key == null) {
        	key = "XXX"; // Replace "XXX" with clients key
        }
        if (password == null) {
        	password = "XXX"; // Replace "XXX" with clients password
        }
        wac.setKey(key);
        wac.setPassword(password);
		return new WebAuthenticationDetail(wac);
	}
	
	private static void printNotifications(Notification[] notifications) {
		System.out.println("Notifications:");
		if (notifications == null || notifications.length == 0) {
			System.out.println("  No notifications returned");
		}
		for (int i=0; i < notifications.length; i++){
			Notification n = notifications[i];
			System.out.print("  Notification no. " + i + ": ");
			if (n == null) {
				System.out.println("null");
				continue;
			} else {
				System.out.println("");
			}
			NotificationSeverityType nst = n.getSeverity();

			System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
			System.out.println("    Code: " + n.getCode());
			System.out.println("    Message: " + n.getMessage());
			System.out.println("    Source: " + n.getSource());
		}
	}
	
	private static void updateEndPoint(ASYNCServiceLocator serviceLocator) {
		String endPoint = System.getProperty("endPoint");
		if (endPoint != null) {
			serviceLocator.setASYNCServicePortEndpointAddress(endPoint);
		}
	}
	
}
