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

@OriginalClass("loader!b")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "I")
	public static int anInt4169;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method3065(@OriginalArg(1) Throwable arg0) throws IOException {
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
		@Pc(41) String local41 = local28.toString();
		@Pc(49) BufferedReader local49 = new BufferedReader(new StringReader(local41));
		@Pc(52) String local52 = local49.readLine();
		while (true) {
			while (true) {
				@Pc(55) String local55 = local49.readLine();
				if (local55 == null) {
					return local20 + "| " + local52;
				}
				@Pc(62) int local62 = local55.indexOf(40);
				@Pc(69) int local69 = local55.indexOf(41, local62 + 1);
				if (local62 >= 0 && local69 >= 0) {
					@Pc(87) String local87 = local55.substring(local62 + 1, local69);
					@Pc(91) int local91 = local87.indexOf(".java:");
					if (local91 >= 0) {
						local87 = local87.substring(0, local91) + local87.substring(local91 + 5);
						local20 = local20 + local87 + ' ';
						continue;
					}
					local55 = local55.substring(0, local62);
				}
				local55 = local55.trim();
				local55 = local55.substring(local55.lastIndexOf(32) + 1);
				local55 = local55.substring(local55.lastIndexOf(9) + 1);
				local20 = local20 + local55 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;B)V")
	public static void method3067(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method3065(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(92) URL local92 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt4169 + "&v1=" + Class95.aString7 + "&v2=" + Class95.aString8 + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local92.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}
}
