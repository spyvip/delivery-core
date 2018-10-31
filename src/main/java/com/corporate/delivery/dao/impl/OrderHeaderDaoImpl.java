package com.corporate.delivery.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.corporate.deliver.utils.Utils;
import com.corporate.delivery.dao.AbstractDao;
import com.corporate.delivery.dao.OrderHeaderDao;
import com.corporate.delivery.model.OrderRestaurantMenu;
import com.corporate.delivery.model.Restaurant;
import com.corporate.delivery.model.order.OrderHeader;

@Repository("orderHeaderDao")
public class OrderHeaderDaoImpl extends AbstractDao<Integer, OrderHeader> implements OrderHeaderDao {

	public List<OrderHeader> getOrderHeader(Integer userId) {

		Query query = this.getSession().createQuery("from OrderHeader up where up.userId = " + new Integer(userId));
		List<OrderHeader> list = query.list();
		// return list.subList(0, 10);
		return list;
	}

	public List<OrderHeader> getMerchantOrRestaurantOrders(Integer zipBustypeMerchantId) {
		Criteria cr = getSession().createCriteria(OrderHeader.class);
		cr.add(Restrictions.eq("zipBustypeMerchantId", zipBustypeMerchantId));

		/* Date today = "2018-07-21"; */
		List<OrderHeader> result = new ArrayList<OrderHeader>();
		List<OrderHeader> list = cr.list();
		for (OrderHeader orderHeader : list) {
			Date date = orderHeader.getOrderDate();
			boolean isToday = Utils.isSameDay(date, new Date());
			if (isToday) {
				result.add(orderHeader);
			}
		}
		return result;
	}

	/*
	 * @RequestMapping(value = "/restaurantsInZip", method = RequestMethod.GET)
	 * public @ResponseBody Map<Integer, List<Restaurant>>
	 * getRestaurantsWithZipBustypeMerchantId(@RequestParam("city") String
	 * city, @RequestParam("state") String state, @RequestParam("zipcode") String
	 * zipcode) {
	 * 
	 * Map<Integer, List<Restaurant>> restaurantsMap = new HashMap<Integer,
	 * List<Restaurant>>(); List<ZipBusTypeMerchant> list =
	 * orderTypesService.getOrderTypes(zipcode);
	 * 
	 * if(list != null && !list.isEmpty()) { ZipBusTypeMerchant zipBusTypeMerchant =
	 * list.get(0); List<Restaurant> restaurants =
	 * restaurantService.getByZipcodeAndOrderType(zipBusTypeMerchant.getId());
	 * restaurantsMap.put(zipBusTypeMerchant.getId(), restaurants); } return
	 * restaurantsMap; }
	 */

	public List<OrderHeader> getOrderHeaderDetail(Integer zipBustypeMerchantId, String fromdate, String todate) {
		Criteria crit = getSession().createCriteria(OrderHeader.class);
		crit.add(Restrictions.eq("zipBustypeMerchantId", zipBustypeMerchantId));
		List<OrderHeader> result = new ArrayList<OrderHeader>();
		Date fromDate = Utils.formatDate(fromdate);
		Date toDate = Utils.formatDate(todate);
		/*
		 * Date fromDate; Date toDate; try { SimpleDateFormat dateFormat = new
		 * SimpleDateFormat("yyyy-M-dd"); fromDate = dateFormat.parse(fromdate);
		 * System.out.println(fromDate); toDate= dateFormat.parse(todate);
		 * System.out.println(toDate);
		 * 
		 * } catch( ParseException e) { throw new
		 * RuntimeException("Error in formatting date"); }
		 */

		List<OrderHeader> list = crit.list();
		for (OrderHeader orderHeader : list) {
			Date orderDate = orderHeader.getOrderDate();

			boolean isAfterDay = Utils.isAfterDay(orderDate, fromDate);
			boolean isBeforeDay = Utils.isBeforeDay(orderDate, toDate);

			if (isAfterDay && isBeforeDay) {
				result.add(orderHeader);
			}
		}
		return result;
	}

	public List<Restaurant> getRestaurantDetail() {
		return null;
	}

	public void insert(OrderHeader orderHeader) {
		this.getSession().save(orderHeader);
	}

	public void updateOrderHeader(OrderHeader orderHeader) {
		this.getSession().update(orderHeader);
	}

	public void deleteOrderHeader(OrderHeader orderHeader) {
		this.getSession().delete(orderHeader);
	}

	public void deleteOrderHeader(Integer userId) {
		// TODO Auto-generated method stub
	}

	public void updateOrderStatus(String id, String orderStatus) {
		Query query = this.getSession()
				.createQuery("UPDATE OrderHeader oh set oh.orderStatus = :orderStatus where oh.id = :id");
		query.setParameter("orderStatus", Integer.parseInt(orderStatus));
		query.setParameter("id", Integer.parseInt(id));
		query.executeUpdate();
	}

	/*
	 * public void updateOrderStatus(Integer id,Integer orderStatus){ Query query =
	 * this.getSession().
	 * createQuery("UPDATE OrderHeader oh set oh.orderStatus = :orderStatus where oh.id = :id"
	 * ); query.setParameter("orderStatus", orderStatus); query.setParameter("id",
	 * id); query.executeUpdate(); }
	 */

	/*
	 * public List<OrderHeader> getMerchantOrRestaurantOrders(Merchant merchant) {
	 * 
	 * if(merchant.getMrType().equals(MerchantType.MERCHANT.getValue())) { Query
	 * query = this.getSession().
	 * createQuery("from OrderHeader up where up.zipBustypeMerchantId = " + new
	 * Integer(merchant.getId())); List<OrderHeader> list = query.list(); } else {
	 * Query query = this.getSession().
	 * createQuery("from OrderHeader up where up.zipBustypeMerchantId = " + new
	 * Integer(merchant.getId())); }
	 * 
	 * return null; }
	 */
	public List<OrderHeader> getOrderByFilter(String userType, String orderType, String fromdate, String todate) {

		Date fromDate = null;
		Date toDate = null;
		Integer userId = 0;
		Boolean schedule = true;
		Boolean nonschedule = false;

		if (!fromdate.equals("null") && !todate.equals("null")) {

			fromDate = Utils.formatDate(fromdate);
			toDate = Utils.formatDate(todate);
		}

//For Range of date:
		if (!fromdate.equals("null") && !todate.equals("null") && userType.equals("null") && orderType.equals("null")) {

			/*
			 * Date fromDate=Utils.formatDate(fromdate); Date
			 * toDate=Utils.formatDate(todate);
			 */
			String hql = "FROM OrderHeader oh WHERE oh.orderDate BETWEEN :fromDate AND :toDate";
			Query query = this.getSession().createQuery(hql);
			query.setParameter("fromDate", fromDate);
			query.setParameter("toDate", toDate);
			List<OrderHeader> list = query.list();
			return list;
		} 

//For UserType
		else if (fromdate.equals("null") && todate.equals("null") && !userType.equals("null") && orderType.equals("null")) {

			if (userType.equals("guest")) {
				Query query = this.getSession()
						.createQuery("FROM OrderHeader oh WHERE oh.userId = " + new Integer("0"));
				List<OrderHeader> list = query.list();
				return list;
			} else {
				Query query = this.getSession()
						.createQuery("FROM OrderHeader oh WHERE oh.userId != " + new Integer("0"));
				List<OrderHeader> list = query.list();
				return list;
			}
		}
		
//For OrderType
		else if (fromdate.equals("null") && todate.equals("null") && userType.equals("null") && !orderType.equals("null")) {

			if (orderType.equals("schedule")) {
				Query query = this.getSession().createQuery("FROM OrderHeader oh WHERE oh.schedule = " + true);
				List<OrderHeader> list = query.list();
				return list;
			} else {
				Query query = this.getSession().createQuery("FROM OrderHeader oh WHERE oh.schedule = " + false);
				List<OrderHeader> list = query.list();
				return list;
			}

		}
		
//For Range of Date and userType
		else if (!fromdate.equals("null") && !todate.equals("null") && !userType.equals("null") && orderType.equals("null")) {

			/*
			 * Date fromDate=Utils.formatDate(fromdate); Date
			 * toDate=Utils.formatDate(todate); Integer userId=0;
			 */
			if (userType.equals("guest")) {

				String hql = "FROM OrderHeader oh WHERE oh.userId = :userId AND oh.orderDate BETWEEN :fromDate AND :toDate";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("fromDate", fromDate);
				query.setParameter("toDate", toDate);
				List<OrderHeader> list = query.list();
				return list;
			} else {

				String hql = "FROM OrderHeader oh WHERE oh.userId != :userId AND oh.orderDate BETWEEN :fromDate AND :toDate";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("fromDate", fromDate);
				query.setParameter("toDate", toDate);
				List<OrderHeader> list = query.list();
				return list;
			}

//For Range of Dates, userType and orderType
			
		} else if (!fromdate.equals("null") && !todate.equals("null") && !userType.equals("null") && !orderType.equals("null")) {

			/*
			 * Date fromDate=Utils.formatDate(fromdate); Date
			 * toDate=Utils.formatDate(todate); Integer userId=0; Boolean schedule=true;
			 * Boolean nonschedule=false;
			 */

			if (userType.equals("guest") && orderType.equals("schedule")) {

				String hql = "FROM OrderHeader oh WHERE oh.userId = :userId AND oh.schedule = :schedule AND oh.orderDate BETWEEN :fromDate AND :toDate";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("schedule", schedule);
				query.setParameter("fromDate", fromDate);
				query.setParameter("toDate", toDate);
				List<OrderHeader> list = query.list();
				return list;

			} else if (userType.equals("guest") && orderType.equals("nonschedule")) {

				String hql = "FROM OrderHeader oh WHERE oh.userId = :userId AND oh.schedule = :nonschedule AND oh.orderDate BETWEEN :fromDate AND :toDate";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("nonschedule", nonschedule);
				query.setParameter("fromDate", fromDate);
				query.setParameter("toDate", toDate);
				List<OrderHeader> list = query.list();
				return list;

			} else if (userType.equals("login") && orderType.equals("schedule")) {

				String hql = "FROM OrderHeader oh WHERE oh.userId != :userId AND oh.schedule = :schedule AND oh.orderDate BETWEEN :fromDate AND :toDate";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("schedule", schedule);
				query.setParameter("fromDate", fromDate);
				query.setParameter("toDate", toDate);
				List<OrderHeader> list = query.list();
				return list;

			} else if (userType.equals("login") && orderType.equals("nonschedule")) {

				String hql = "FROM OrderHeader oh WHERE oh.userId != :userId AND oh.schedule = :nonschedule AND oh.orderDate BETWEEN :fromDate AND :toDate";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("nonschedule", nonschedule);
				query.setParameter("fromDate", fromDate);
				query.setParameter("toDate", toDate);
				List<OrderHeader> list = query.list();
				return list;
			}

		}
		
//For Range of Dates and orderType
		else if (!fromdate.equals("null") && !todate.equals("null") && userType.equals("null") && !orderType.equals("null")) {

			/*
			 * Date fromDate=Utils.formatDate(fromdate); Date
			 * toDate=Utils.formatDate(todate); Integer userId=0; Boolean schedule=true;
			 * Boolean nonschedule=false;
			 */

			if (orderType.equals("schedule")) {
				String hql = "FROM OrderHeader oh WHERE oh.schedule = :schedule AND oh.orderDate BETWEEN :fromDate AND :toDate";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("schedule", schedule);
				query.setParameter("fromDate", fromDate);
				query.setParameter("toDate", toDate);
				List<OrderHeader> list = query.list();
				return list;
			} else {
				String hql = "FROM OrderHeader oh WHERE oh.schedule = :nonschedule AND oh.orderDate BETWEEN :fromDate AND :toDate";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("nonschedule", nonschedule);
				query.setParameter("fromDate", fromDate);
				query.setParameter("toDate", toDate);
				List<OrderHeader> list = query.list();
				return list;

			}

		} 
		
//For userType and orderType
		
		else if (fromdate.equals("null") && todate.equals("null") && !userType.equals("null") && !orderType.equals("null")) {
			/*
			 * Integer userId=0; Boolean schedule=true; Boolean nonschedule=false;
			 */
			if (userType.equals("guest") && orderType.equals("schedule")) {
				String hql = "FROM OrderHeader oh WHERE oh.userId = :userId AND oh.schedule = :schedule";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("schedule", schedule);
				List<OrderHeader> list = query.list();
				return list;

			} else if (userType.equals("guest") && orderType.equals("nonschedule")) {
				String hql = "FROM OrderHeader oh WHERE oh.userId = :userId AND oh.schedule = :nonschedule";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("nonschedule", nonschedule);
				List<OrderHeader> list = query.list();
				return list;

			} else if (userType.equals("login") && orderType.equals("schedule")) {

				String hql = "FROM OrderHeader oh WHERE oh.userId != :userId AND oh.schedule = :schedule";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("schedule", schedule);
				List<OrderHeader> list = query.list();
				return list;

			} else if (userType.equals("login") && orderType.equals("nonschedule")) {
				String hql = "FROM OrderHeader oh WHERE oh.userId != :userId AND oh.schedule = :nonschedule";
				Query query = this.getSession().createQuery(hql);
				query.setParameter("userId", userId);
				query.setParameter("nonschedule", nonschedule);
				List<OrderHeader> list = query.list();
				return list;

			}
		}
		return null;
	}

}
