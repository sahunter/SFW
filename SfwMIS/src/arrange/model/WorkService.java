package arrange.model;
import java.util.*;

import onlineOrder.model.OnlineOrder;
import onlineOrder.model.OnlineOrderDAO;
public class WorkService {
	private WorkArrangeDAO workArrangeDAO;
	private WorkChangeDAO workChangeDAO;
	private OnlineOrderDAO onlineOrderDAO;
	
	public WorkService(String WORKS,WorkArrangeDAO workArrangeDAO,WorkChangeDAO workChangeDAO,OnlineOrderDAO onlineOrderDAO) {
        this(workArrangeDAO,workChangeDAO,onlineOrderDAO);
    }
    public WorkService(WorkArrangeDAO workArrangeDAO,WorkChangeDAO workChangeDAO,OnlineOrderDAO onlineOrderDAO) {
		this.workArrangeDAO=workArrangeDAO;
		this.workChangeDAO=workChangeDAO;
		this.onlineOrderDAO=onlineOrderDAO;
	}
    
    public void addWorkArrange(WorkArrange workArrange){
    	workArrangeDAO.addWorkArrange(workArrange);
	}
    
    public List<WorkArrange> getWorkArranges(WorkArrange workArrange){
		return workArrangeDAO.getWorkArranges(workArrange);
	}
    
    public List<WorkChange> getWorkChangeBLs(){
		return workChangeDAO.getWorkChangeBLs();
	}
    
    public List<WorkChange> getWorkChangeWOTs(){
		return workChangeDAO.getWorkChangeWOTs();
	}
    
    public WorkArrange getTheLastOne(){
		return workArrangeDAO.getTheLastOne();
	}
    
    public List<WorkChange> getBeingLates(WorkChange workChange){
		return workChangeDAO.getBeingLates(workChange);
	}
    
    public List<WorkChange> getPopularizations(WorkChange workChange){
		return workChangeDAO.getPopularizations(workChange);
	}
    
    public List<WorkChange> getWorkOverTimes(WorkChange workChange){
		return workChangeDAO.getWorkOverTimes(workChange);
	}
    
    public void updateWorkOverTime(WorkChange workChange) {
    	workChangeDAO.updateWorkOverTime(workChange);
	}
    
    public void updateBeingLate(WorkChange workChange) {
    	workChangeDAO.updateBeingLate(workChange);
	}
    
    public void updateRealBeingLate(WorkChange workChange) {
    	workChangeDAO.updateRealBeingLate(workChange);
	}
    
    public void addWorkChange(WorkChange workChange) {
		// TODO Auto-generated method stub
    	workChangeDAO.addWorkChange(workChange);
	}
    
    public boolean isChangeOffApplyOK(WorkChange workChange) {
    	WorkChange storedAcct=workChangeDAO.getChangeOff(workChange);
		return storedAcct.getUserName()!=null;
    }
    
    public boolean isDayOffApplyOK(WorkChange workChange) {
    	WorkChange storedAcct=workChangeDAO.getDayOff(workChange);
		return storedAcct.getUserName()!=null;
    }
    
    public void addOnlineOrder(OnlineOrder kkkk) {
		onlineOrderDAO.addOnlineOrder(kkkk);
		
	}
    //
   /* public boolean isCustomerExisted(Customer customer) {
    	Customer storedAcct=customerDAO.getCustomer(customer);
		return storedAcct!=null;
    }
	
    public boolean checkLogin(Customer customer){
		if(customer.getName()!=null && customer.getPassword()!=null){
			Customer storedAcct=customerDAO.getCustomer(customer);
			return storedAcct!=null && storedAcct.getPassword().equals(customer.getPassword());
		}
		return false;
	}
    
    public boolean isGetPasswordOK(Customer customer){
		if(customer.getName()!=null && customer.getEmail()!=null){
			Customer storedAcct=customerDAO.getCustomer(customer);
			return storedAcct!=null && storedAcct.getEmail().equals(customer.getEmail());
		}
		return false;
	}
 *//**   public Customer getPassword(Customer customer) {
		
		return customerDAO.getPassword(customer);
	}*//*
    public Customer getCustomer(Customer customer) {
		
		return customerDAO.getCustomer(customer);
	}
    
	public void addCustomer(Customer customer){
		customerDAO.addCustomer(customer);
	}
	public List<Customer> getCustomers(Customer customer){
		return customerDAO.getCustomers(customer);
	}
	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
	}
	public void deleteCustomer(Customer customer){
		customerDAO.deleteCustomer(customer);
	}
	
	//
	public void addAdministrator(Administrator administrator){
		administratorDAO.addAdministrator(administrator);
	}
	public List<Administrator> getAdministrators(Administrator administrator){
		return administratorDAO.getAdministrators(administrator);
	}
	
	public void deleteAdministrator(Administrator administrator){
		administratorDAO.deleteAdministrator(administrator);
	}
	//
	 public boolean isCollectionExisted(Collection collection) {
	        return collectionDAO.isCollectionExisted(collection);
	    }
		
		public void addCollection(Collection collection){
			collectionDAO.addCollection(collection);
		}
		public List<Collection> getCollections(Collection collection){
			return collectionDAO.getCollections(collection);
		}
		public void updateCollection(Collection customer) {
			collectionDAO.updateCollection(customer);
		}
		public void deleteCollection(Collection collection){
			collectionDAO.deleteCollection(collection);
		}
		//
		public void addCOrder(COrder corder){
			corderDAO.addCOrder(corder);
		}
		public List<COrder> getCOrders(COrder corder){
			return corderDAO.getCOrders(corder);
		}
		public void updateCOrder(COrder corder) {
			corderDAO.updateCOrder(corder);
		}
		public void deleteCOrder(COrder corder){
			corderDAO.deleteCOrder(corder);
		}
		//
		public void addEvaluation(Evaluation evaluation){
			evaluationDAO.addEvaluation(evaluation);
		}
		public List<Evaluation> getEvaluations(Evaluation evaluation){
			return evaluationDAO.getEvaluations(evaluation);
		}
		public void updateEvaluation(Evaluation evaluation) {
			evaluationDAO.updateEvaluation(evaluation);
		}
		public void deleteEvaluation(Evaluation evaluation){
			evaluationDAO.deleteEvaluation(evaluation);
		}
		//
		public void addGoods(Goods goods){
			goodsDAO.addGoods(goods);
		}
		public List<Goods> getGoodses(Goods goods){
			return goodsDAO.getGoods(goods);
		}
		public void updateGoods(Goods goods) {
			goodsDAO.updateGoods(goods);
		}
		public void deleteGoods(Goods goods){
			goodsDAO.deleteGoods(goods);
		}
		//
		public void addGoodsquantity(Goodsquantity goodsquantity){
			goodsquantityDAO.addGoodsquantity(goodsquantity);
		}
		public List<Goodsquantity> getGoodsquantities(Goodsquantity goodsquantity){
			return goodsquantityDAO.getGoodsquantities(goodsquantity);
		}
		public void updateGoodsquantity(Goodsquantity goodsquantity) {
			goodsquantityDAO.updateGoodsquantity(goodsquantity);
		}
		public void deleteGoodsquantity(Goodsquantity goodsquantity){
			goodsquantityDAO.deleteGoodsquantity(goodsquantity);
		}
		//
		public boolean isSellerExisted(Seller seller) {
	        return sellerDAO.isSellerExisted(seller);
	    }
		
		public void addSeller(Seller seller){
			sellerDAO.addSeller(seller);
		}
		public List<Seller> getSellers(Seller seller){
			return sellerDAO.getSellers(seller);
		}
		public void updateSeller(Seller seller) {
			sellerDAO.updateSeller(seller);
		}
		public void deleteSeller(Seller seller){
			sellerDAO.deleteSeller(seller);
		}
		//
		public void addShoppingcart(Shoppingcart shoppingcart){
			shoppingcartDAO.addShoppingcart(shoppingcart);
		}
		public List<Shoppingcart> getShoppingcarts(Shoppingcart shoppingcart){
			return shoppingcartDAO.getShoppingcarts(shoppingcart);
		}
		public void updateShoppingcart(Shoppingcart shoppingcart) {
			shoppingcartDAO.updateShoppingcart(shoppingcart);
		}
		public void deleteShoppingcart(Shoppingcart shoppingcart){
			shoppingcartDAO.deleteShoppingcart(shoppingcart);
		}
		//
		public void addSOrder(SOrder sorder){
			sorderDAO.addSOrder(sorder);
		}
		public List<SOrder> getSOrders(SOrder sorder){
			return sorderDAO.getSOrders(sorder);
		}
		public void updateSOrder(SOrder sorder) {
			sorderDAO.updateSOrder(sorder);
		}
		public void deleteSOrder(SOrder sorder){
			sorderDAO.deleteSOrder(sorder);
		}*/
	
    public List<OnlineOrder> getOnlineOrders(OnlineOrder onlineOrder){
		return onlineOrderDAO.getOnlineOrders(onlineOrder);
	}
 
 

	
//	public void updateOnlineOrder(OnlineOrder onlineOrder) {
//		onlineOrderDAO.updateOnlineOrder(onlineOrder);
//	}
	public void deleteOnlineOrder(OnlineOrder onlineOrder){
		onlineOrderDAO.deleteOnlineOrder(onlineOrder);
	}
		
}
