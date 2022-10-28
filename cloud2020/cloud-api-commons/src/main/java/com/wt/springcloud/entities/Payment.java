package com.wt.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Alanwti
 * @date :2022/10/14 15:40
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private long id;
    private String serial;
}
