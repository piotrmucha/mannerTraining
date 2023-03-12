package com.piotrmucha.manning.project.data;


import java.math.BigDecimal;
import java.time.LocalDate;


public record Transaction(String type, LocalDate date, String accountNumber, String currency, BigDecimal amount,
                          String merchantName, String merchantLogo) {

}
