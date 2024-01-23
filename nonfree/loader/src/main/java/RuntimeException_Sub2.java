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

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public static int anInt4497;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;Z)V")
	public static void method3548(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method3549(arg1);
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
			@Pc(87) URL local87 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt4497 + "&v1=" + Class132.aString17 + "&v2=" + Class132.aString21 + "&e=" + local1);
			@Pc(93) DataInputStream local93 = new DataInputStream(local87.openStream());
			local93.read();
			local93.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method3549(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(23) String local23;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(13) RuntimeException_Sub2 local13 = (RuntimeException_Sub2) arg0;
			local23 = local13.aString11 + " | ";
			arg0 = local13.aThrowable2;
		} else {
			local23 = "";
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
					return local23 + "| " + local58;
				}
				@Pc(68) int local68 = local61.indexOf(40);
				@Pc(75) int local75 = local61.indexOf(41, local68 + 1);
				if (local68 >= 0 && local75 >= 0) {
					@Pc(87) String local87 = local61.substring(local68 + 1, local75);
					@Pc(91) int local91 = local87.indexOf(".java:");
					if (local91 >= 0) {
						local87 = local87.substring(0, local91) + local87.substring(local91 + 5);
						local23 = local23 + local87 + ' ';
						continue;
					}
					local61 = local61.substring(0, local68);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local23 = local23 + local61 + ' ';
			}
		}
	}
}
