package ru.netology.migrations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JdbcDaoController {
    private final JdbcDaoRepository jdbcDaoRepository;

    public JdbcDaoController (JdbcDaoRepository jdbcDaoRepository) {
        this.jdbcDaoRepository = jdbcDaoRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam("name") String name) {
        return jdbcDaoRepository.getProductName(name);
    }
}
