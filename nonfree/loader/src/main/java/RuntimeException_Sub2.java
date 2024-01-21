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
	public static int anInt3336;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method2206(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString8 + " | ";
		} else {
			local20 = "";
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
				@Pc(61) String local61 = local49.readLine();
				if (local61 == null) {
					return local20 + "| " + local52;
				}
				@Pc(68) int local68 = local61.indexOf(40);
				@Pc(75) int local75 = local61.indexOf(41, local68 + 1);
				if (local68 >= 0 && local75 >= 0) {
					@Pc(92) String local92 = local61.substring(local68 + 1, local75);
					@Pc(96) int local96 = local92.indexOf(".java:");
					if (local96 >= 0) {
						local92 = local92.substring(0, local96) + local92.substring(local96 + 5);
						local20 = local20 + local92 + ' ';
						continue;
					}
					local61 = local61.substring(0, local68);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local20 = local20 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Throwable;Ljava/applet/Applet;)V")
	public static void method2207(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method2206(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(89) URL local89 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt3336 + "&v1=" + Class80.aString6 + "&v2=" + Class80.aString5 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(106) Exception local106) {
		}
	}
}
