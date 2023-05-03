package com.portal.api.service;

import com.portal.api.dto2.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface OwnerPostsService {

    void createOwner(OwnerPostDTO ownerPostDTO);


}
