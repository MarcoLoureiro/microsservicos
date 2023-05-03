package com.portal.api.service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto2.OwnerPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostServiceImpl implements OwnerPostsService{

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public void createOwner(OwnerPostDTO ownerPostDTO) {
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }
}
