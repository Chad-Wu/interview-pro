package com.wch.interviewpro.esdao;

import com.wch.interviewpro.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/Chad-Wu">chonghe</a>
 * @from <a href="https://github.com/Chad-Wu">chonghe</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}