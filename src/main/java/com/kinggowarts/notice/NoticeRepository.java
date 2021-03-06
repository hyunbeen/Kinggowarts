package com.kinggowarts.notice;

import com.kinggowarts.notice.models.Notice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
    Page<Notice> findAllByCategory_Name(String category, Pageable pageable);
    List<Notice> findAllByCategory_Name(String category);
    List<Notice> findAllByOrderByIdDesc();
}
