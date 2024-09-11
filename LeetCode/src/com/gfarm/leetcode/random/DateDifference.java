package com.gfarm.leetcode.random;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateDifference {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.of(2024, 9, 10, 6, 45, 38);
		LocalDateTime d2 = LocalDateTime.of(2027, 3, 1, 6, 45, 38);
		
		Duration duration = Duration.between(d1, d2);
		System.out.println(duration.getSeconds());
		
		LocalDate d3 = LocalDate.of(2024, 9, 10);
		LocalDate d4 = LocalDate.of(2027, 3, 1);
		Period period = Period.between(d3, d4);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
	}

}
