package com.app.services;

import com.app.entity.OrderDetails;

public interface OrderDetailsService {

	void deleteOrderDetails(int parseInt);

	OrderDetails updateOdetails(OrderDetails od);

	OrderDetails getOdetails(int parseInt);

	OrderDetails addOdetails(OrderDetails od);

}
