import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "I")
	public static int anInt2968;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1947(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method1948(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(97) URL local97 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt2968 + "&v1=" + Class70.aString15 + "&v2=" + Class70.aString12 + "&e=" + local1);
			@Pc(103) DataInputStream local103 = new DataInputStream(local97.openStream());
			local103.read();
			local103.close();
		} catch (@Pc(110) Exception local110) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method1948(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString9 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(49) BufferedReader local49 = new BufferedReader(new StringReader(local41));
		@Pc(52) String local52 = local49.readLine();
		while (true) {
			while (true) {
				@Pc(55) String local55 = local49.readLine();
				if (local55 == null) {
					return local17 + "| " + local52;
				}
				@Pc(63) int local63 = local55.indexOf(40);
				@Pc(70) int local70 = local55.indexOf(41, local63 + 1);
				if (local63 >= 0 && local70 >= 0) {
					@Pc(84) String local84 = local55.substring(local63 + 1, local70);
					@Pc(88) int local88 = local84.indexOf(".java:");
					if (local88 >= 0) {
						local84 = local84.substring(0, local88) + local84.substring(local88 + 5);
						local17 = local17 + local84 + ' ';
						continue;
					}
					local55 = local55.substring(0, local63);
				}
				local55 = local55.trim();
				local55 = local55.substring(local55.lastIndexOf(32) + 1);
				local55 = local55.substring(local55.lastIndexOf(9) + 1);
				local17 = local17 + local55 + ' ';
			}
		}
	}
}
