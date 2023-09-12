package com.gfa.peer2peer.repositories;

import com.gfa.peer2peer.models.Message;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessagesRepo extends ListCrudRepository<Message,Integer> {
    List<Message> findAllByUsernameNotNullOrderByTimestampAsc();
}
