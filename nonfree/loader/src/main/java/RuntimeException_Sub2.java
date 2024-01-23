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
	public static int anInt6320;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/String;")
	private String aString453;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;)V")
	public static void method4783(@OriginalArg(1) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method4786(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method4787(local1);
			local1 = method4785(":", "%3a", local1);
			local1 = method4785("@", "%40", local1);
			local1 = method4785("&", "%26", local1);
			local1 = method4785("#", "%23", local1);
			@Pc(84) URL local84 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt6320 + "&v1=" + Class202.aString465 + "&v2=" + Class202.aString463 + "&e=" + local1);
			@Pc(94) DataInputStream local94 = new DataInputStream(local84.openStream());
			local94.read();
			local94.close();
		} catch (@Pc(101) Exception local101) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4785(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, arg1.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(local5 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method4786(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString453 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(51) String local51 = local33.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local6 + "| " + local62;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(85) String local85;
			if (local73 == -1) {
				local85 = local65;
			} else {
				local85 = local65.substring(0, local73);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local6 = local6 + local85;
			if (local73 != -1 && local80 != -1) {
				@Pc(134) int local134 = local65.indexOf(".java:", local73);
				if (local134 >= 0) {
					local6 = local6 + local65.substring(local134 + 5, local80);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method4787(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method4785("%0a", "\n", arg0));
	}
}
