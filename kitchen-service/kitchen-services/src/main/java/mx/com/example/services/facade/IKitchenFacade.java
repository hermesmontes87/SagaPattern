package mx.com.example.services.facade;

import mx.com.example.commons.to.UserTO;

import java.util.List;

public interface IKitchenFacade {

    List<UserTO> getAllUsers();

}
