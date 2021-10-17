package hiduke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class jikoku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		System.out.println(now.format(fmt));
	}

}
