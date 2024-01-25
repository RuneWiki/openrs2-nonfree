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

@OriginalClass("loader!d")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public static int anInt7654;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/String;")
	private String aString75;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method6109(@OriginalArg(0) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method6110(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method6112(local1);
			local1 = method6111(local1, ":", "%3a");
			local1 = method6111(local1, "@", "%40");
			local1 = method6111(local1, "&", "%26");
			local1 = method6111(local1, "#", "%23");
			@Pc(89) URL local89 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt7654 + "&v1=" + Class279.aString82 + "&v2=" + Class279.aString84 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(102) Exception local102) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method6110(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString75 + " | ";
		} else {
			local20 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(66) BufferedReader local66 = new BufferedReader(new StringReader(local46));
		@Pc(69) String local69 = local66.readLine();
		while (true) {
			@Pc(72) String local72 = local66.readLine();
			if (local72 == null) {
				return local20 + "| " + local69;
			}
			@Pc(80) int local80 = local72.indexOf(40);
			@Pc(87) int local87 = local72.indexOf(41, local80 + 1);
			@Pc(92) String local92;
			if (local80 == -1) {
				local92 = local72;
			} else {
				local92 = local72.substring(0, local80);
			}
			local92 = local92.trim();
			local92 = local92.substring(local92.lastIndexOf(32) + 1);
			local92 = local92.substring(local92.lastIndexOf(9) + 1);
			local20 = local20 + local92;
			if (local80 != -1 && local87 != -1) {
				@Pc(140) int local140 = local72.indexOf(".java:", local80);
				if (local140 >= 0) {
					local20 = local20 + local72.substring(local140 + 5, local87);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method6111(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg1); local5 != -1; local5 = arg0.indexOf(arg1, local5 + arg2.length())) {
			arg0 = arg0.substring(0, local5) + arg2 + arg0.substring(local5 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method6112(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method6111(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!d;")
	private static RuntimeException_Sub2 method6113(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString75 = local8.aString75 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString75 = arg1;
		this.aThrowable2 = arg0;
	}
}
