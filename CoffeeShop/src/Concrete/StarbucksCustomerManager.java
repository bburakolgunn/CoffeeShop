package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public  class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer){
		
		if(_customerCheckService.CheckIfRealPerson(customer)) 
		{
		
		super.save(customer);
		}else {
			System.out.println("Geçersiz kişidir.");
		}
		
		}

	private void CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
	}
}
