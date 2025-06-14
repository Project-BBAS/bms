package com.bbas.bms.entity.board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class PostCategoryTest {

    @PersistenceContext
    private EntityManager em;

    /**
     * auditorAwareConfig가 아직 정의되지 않아서 BaseEntity의 아래 4개컬럼 주석으로 변환 후 시행
     */
    @Test
    void 게시판_카테고리_생성() {
        PostCategory postCategory = new PostCategory("팀 모집");
        em.persist(postCategory);
        em.flush();

        assertNotNull(postCategory.getId());
    }

    /**
     * auditorAwareConfig가 아직 정의되지 않아서 BaseEntity의 아래 4개컬럼 주석으로 변환 후 시행
     */
    @Test
    void softDelete_테스트() {
        PostCategory postCategory = new PostCategory("팀 모집");
        em.persist(postCategory);
        em.remove(postCategory);
        em.flush();
        em.clear();

        // 영속성 컨텍스트 초기화 후 DB에서 다시 조회
        PostCategory found = em.find(PostCategory.class, postCategory.getId());
        assertNotNull(postCategory.getId());
        assertEquals(found.isDeleteFlag(), true);
    }
}