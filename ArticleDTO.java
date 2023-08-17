package com.ottt.ottt.dto;
import java.util.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ArticleDTO {
	
	private	Integer	article_no;
	private Integer	user_no;
	private char	article_index_no;
	private String	article_content;
	private String	article_image;
	private String	article_title;
	private Date	article_create_dt;
	private Date	article_mod_dt;
	private Integer	like_count;
	private Integer	comment_count;
	private Integer	report_cnt;
	private String  user_nicknm;
	private String  user_id;
	private Integer	check_like_count;
	private MultipartFile upFile;
	private String article_image_name;
	private String image;
	private String	writer_chk;
	private String fileDeleteYn;
	private Integer report_count;
	
	private List<String> baseballArray;
	private String sex;
	private String category;
	private String baseball;
	
	private Integer hit_count;
	
	
}
