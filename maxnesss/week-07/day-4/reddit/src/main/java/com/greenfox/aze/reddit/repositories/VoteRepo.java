package com.greenfox.aze.reddit.repositories;

import com.greenfox.aze.reddit.models.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepo extends CrudRepository<Vote, Long> {
    @Query(value = "select * from vote where owner_id=:ownerId and post_id=:postId and value =:value", nativeQuery = true)
    Vote findVoteByOwnerId(Long ownerId, Long postId, int value);
}
