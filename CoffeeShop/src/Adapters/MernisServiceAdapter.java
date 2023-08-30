package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@SuppressWarnings("deprecation")
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
try {
			
			if(kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase()
					,customer.getYear())) {
			return true;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return false;
	}

}
