package com.example.restapi;

import com.example.restapi.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
		/*var user = new UserRequest();
		System.out.println(user);*/
		/*user.setUserName("홍길동");
		user.setAge(10);
		user.setEmail("dd@gmail.com");
		user.setIsKorean(true);*/

		var json = "{\"user_name\":\"홍길동\",\"age\":10,\"email\":\"22@아.com\",\"is_korean\":true}";
		//var json =objectMapper.writeValueAsString(user);	//직렬화, get으로 시작되는 메서드에 매칭됨 / get 중 사용하고 싶지 않은 건 @JsonIgnore, 이름변경 @JsonProperty("")
		System.out.println(json);

		var dto = objectMapper.readValue(json, UserRequest.class); //역직렬화
		System.out.println(dto);
	}

}
