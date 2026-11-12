package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin // 👈 就是这个注解，它允许你的 HTML 跨域访问 Java
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping("/adopt")
    public String adopt(@RequestBody Adopter adopter) {
        System.out.println("收到领养人：" + adopter.getName() + "，电话：" + adopter.getPhone());

        String sql = "INSERT INTO adopter (name, phone) VALUES (?, ?)";

        jdbcTemplate.update(sql, adopter.getName(), adopter.getPhone());

        return "🎉 后端：领养成功！数据已入库";
    }
}