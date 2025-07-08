package com.wch.interviewpro.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wch.interviewpro.mapper.QuestionMapper;
import com.wch.interviewpro.model.entity.Question;
import com.wch.interviewpro.service.QuestionService;
import org.springframework.stereotype.Service;

/**
* @author 86180
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2025-07-08 17:06:52
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService {

}




