package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class TMContent {
    private String img;
    private String price;
    private String title;
    private String shopName;
    private String link;
}
