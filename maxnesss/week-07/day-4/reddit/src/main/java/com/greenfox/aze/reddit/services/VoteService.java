package com.greenfox.aze.reddit.services;

import com.greenfox.aze.reddit.exeptions.AppExeption;
import com.greenfox.aze.reddit.models.Post;
import com.greenfox.aze.reddit.models.User;
import com.greenfox.aze.reddit.models.Vote;
import com.greenfox.aze.reddit.repositories.VoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class VoteService {

    VoteRepo voteRepo;
    @Autowired
    public VoteService(VoteRepo voteRepo) {
        this.voteRepo = voteRepo;
    }

    public void plusVote(User user, Post post){
        Optional<Vote> maybeVote = Optional.ofNullable(voteRepo.findVoteByOwnerId(user.getUser_id(),post.getId(),1));
        if (maybeVote.isEmpty()){
            Vote vote = new Vote(user.getUser_id(), post.getId(), 1);
            voteRepo.save(vote);
        } else {
            throw new AppExeption("already voted", HttpStatus.BAD_REQUEST);
        }
    }
    public void minusVote(User user, Post post){
        Optional<Vote> maybeVote = Optional.ofNullable(voteRepo.findVoteByOwnerId(user.getUser_id(),post.getId(),-1));
        if (maybeVote.isEmpty()){
            Vote vote = new Vote(user.getUser_id(), post.getId(), -1);
            voteRepo.save(vote);
        } else {
            throw new AppExeption("already voted", HttpStatus.BAD_REQUEST);
        }
    }

}
