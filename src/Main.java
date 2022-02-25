import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = Double.parseDouble("1,2");
		System.out.println(a);
		
		Date now = new Date();
		System.out.println(now);
		
		long uts = now.getTime();
		System.out.println(uts);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String nowSTR = sdf.format(now);//esto se requiere para el seguimiento
		System.out.println(nowSTR);
		
		String initDate = "2022-01-17";
		String finalDate = "2022-06-03";
		
		try {
			Date f1 = sdf.parse(initDate);
			Date f2 = sdf.parse(finalDate);
			
			if(now.getTime() > f1.getTime() && now.getTime()<f2.getTime()) {
				System.out.println("Está dentro del rango de fechas");
			}else {
				System.out.println("NO está dentro del rango de fechas");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
