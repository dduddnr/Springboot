package me.youngwook.springboot_developer.service;

import lombok.RequiredArgsConstructor;
import me.youngwook.springboot_developer.domain.Article;
import me.youngwook.springboot_developer.dto.AddArticleRequest;
import me.youngwook.springboot_developer.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
