package Model;

public class Paciente {
	public String inverso(String s)
			 throws Exception {
			 if (s == null || s.length() == 0)
			 throw new Exception("argumento incorrecto");
			 StringBuilder builder = new StringBuilder();
			 for (int i = s.length() - 1; i >= 0; i--)
			 builder.append(s.charAt(i));
			 return builder.toString();
			 }

}
