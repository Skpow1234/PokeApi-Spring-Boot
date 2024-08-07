package com.Pokemon.API.model.response;

import com.Pokemon.API.model.entity.Pokemon;
import lombok.*;

import java.util.List;

@Getter
@Data
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PokeApiResponse {
    private int count;
    private String next;
    private String previous;
    private List<Pokemon> results;
}
