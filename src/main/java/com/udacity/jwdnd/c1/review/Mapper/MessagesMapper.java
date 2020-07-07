package com.udacity.jwdnd.c1.review.Mapper;

import com.udacity.jwdnd.c1.review.Model.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessagesMapper {

    @Select("SELECT * from messages")
    public List<ChatMessage> findAllMessages();

    @Insert("INSERT into messages (username, messagetext) values (#{username}, #{messagetext}")
    @Options(useGeneratedKeys = false, keyProperty = "messageid")
    public Integer addMessage(ChatMessage chatMessage);
}
