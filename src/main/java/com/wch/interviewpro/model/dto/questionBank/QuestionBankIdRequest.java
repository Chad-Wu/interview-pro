package com.wch.interviewpro.model.dto.questionBank;

import com.wch.interviewpro.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
public class QuestionBankIdRequest extends PageRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private Boolean needQuestionList;
    private static final long serialVersionUID = 1L;
}
