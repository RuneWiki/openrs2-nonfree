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

@OriginalClass("loader!a")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "I")
	public static int anInt4611;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method3023(@OriginalArg(0) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method3024(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(92) URL local92 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt4611 + "&v1=" + Class92.aString9 + "&v2=" + Class92.aString8 + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local92.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method3024(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString6 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(46) String local46 = local28.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			while (true) {
				@Pc(60) String local60 = local54.readLine();
				if (local60 == null) {
					return local20 + "| " + local57;
				}
				@Pc(68) int local68 = local60.indexOf(40);
				@Pc(75) int local75 = local60.indexOf(41, local68 + 1);
				if (local68 >= 0 && local75 >= 0) {
					@Pc(87) String local87 = local60.substring(local68 + 1, local75);
					@Pc(91) int local91 = local87.indexOf(".java:");
					if (local91 >= 0) {
						local87 = local87.substring(0, local91) + local87.substring(local91 + 5);
						local20 = local20 + local87 + ' ';
						continue;
					}
					local60 = local60.substring(0, local68);
				}
				local60 = local60.trim();
				local60 = local60.substring(local60.lastIndexOf(32) + 1);
				local60 = local60.substring(local60.lastIndexOf(9) + 1);
				local20 = local20 + local60 + ' ';
			}
		}
	}
}
