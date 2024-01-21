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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public static int anInt4471;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method3320(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			local6 = local11.aString7 + " | ";
			arg0 = local11.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local6 + "| " + local58;
				}
				@Pc(69) int local69 = local61.indexOf(40);
				@Pc(76) int local76 = local61.indexOf(41, local69 + 1);
				if (local69 >= 0 && local76 >= 0) {
					@Pc(94) String local94 = local61.substring(local69 + 1, local76);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local6 = local6 + local94 + ' ';
						continue;
					}
					local61 = local61.substring(0, local69);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local6 = local6 + local61 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method3322(@OriginalArg(0) Throwable arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method3320(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(92) URL local92 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt4471 + "&v1=" + Class101.aString9 + "&v2=" + Class101.aString10 + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local92.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}
}
