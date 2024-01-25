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
	public static int anInt9658;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	private String aString123;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method7897(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString123 = local5.aString123 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method7898(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString123 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(46) StringWriter local46 = new StringWriter();
		@Pc(51) PrintWriter local51 = new PrintWriter(local46);
		arg0.printStackTrace(local51);
		local51.close();
		@Pc(59) String local59 = local46.toString();
		@Pc(67) BufferedReader local67 = new BufferedReader(new StringReader(local59));
		@Pc(70) String local70 = local67.readLine();
		while (true) {
			@Pc(73) String local73 = local67.readLine();
			if (local73 == null) {
				return local17 + "| " + local70;
			}
			@Pc(81) int local81 = local73.indexOf(40);
			@Pc(88) int local88 = local73.indexOf(41, local81 + 1);
			@Pc(95) String local95;
			if (local81 == -1) {
				local95 = local73;
			} else {
				local95 = local73.substring(0, local81);
			}
			local95 = local95.trim();
			local95 = local95.substring(local95.lastIndexOf(32) + 1);
			local95 = local95.substring(local95.lastIndexOf(9) + 1);
			local17 = local17 + local95;
			if (local81 != -1 && local88 != -1) {
				@Pc(142) int local142 = local73.indexOf(".java:", local81);
				if (local142 >= 0) {
					local17 = local17 + local73.substring(local142 + 5, local88);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;)V")
	public static void method7899(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method7898(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method7901(local1);
			local1 = method7900(local1, "%3a", ":");
			local1 = method7900(local1, "%40", "@");
			local1 = method7900(local1, "%26", "&");
			local1 = method7900(local1, "%23", "#");
			@Pc(95) URL local95 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt9658 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(101) DataInputStream local101 = new DataInputStream(local95.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method7900(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(11) int local11 = arg0.indexOf(arg2); local11 != -1; local11 = arg0.indexOf(arg2, local11 + arg1.length())) {
			arg0 = arg0.substring(0, local11) + arg1 + arg0.substring(arg2.length() + local11);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private static void method7901(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method7900(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString123 = arg1;
		this.aThrowable2 = arg0;
	}
}
