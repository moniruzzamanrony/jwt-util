package com.itvillage;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.itvillage.client.UaaClientService;
import com.itvillage.client.dto.response.AccessTokenResponse;
import com.itvillage.client.dto.request.LoginRequest;

import java.util.Optional;

@Service
@AllArgsConstructor
public class FeignUtil {

    private  UaaClientService uaaClientService;

    public  String login(String userName,String password) {

        Optional<AccessTokenResponse> accessTokenResponseOptional=uaaClientService.login(
                new LoginRequest(userName,password));
        if(!accessTokenResponseOptional.isPresent())
        {

        }
        return accessTokenResponseOptional.get().getToken();
    }
}
