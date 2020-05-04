package com.food.ordering.zinger.service.interfaces;

import com.food.ordering.zinger.model.*;
import com.food.ordering.zinger.model.notification.UserNotificationModel;

import java.util.List;

public interface UserService {
    Response<UserPlaceModel> loginRegisterCustomer(UserModel user);

    Response<UserShopListModel> verifySeller(UserModel user);

    /**************************************************/

    Response<String> updateUser(UserModel userModel);

    Response<String> updateUserNotificationToken(UserNotificationModel userNotificationModel);

    Response<String> updateUserPlaceData(UserPlaceModel userPlaceModel);
}
