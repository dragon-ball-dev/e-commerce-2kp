package com.giangnam.vn.Ecommerce.Website.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {

	public String message;
	public String accessToken;
}
