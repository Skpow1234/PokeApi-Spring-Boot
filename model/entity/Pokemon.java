package com.Pokemon.API.model.entity;

import lombok.*;

@Getter
@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    private String name;
    private String url;

}