package com.piotrmucha.manning.project.data;


import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
 public record Transaction(Integer type, LocalDate date, Integer accountNumber, String currency, BigDecimal amount,
                          String merchantName, String merchantLogo) {

}
