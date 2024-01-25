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
	public static int anInt6801;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString277;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private static void method5870(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method5871("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	private static String method5871(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg0); local5 != -1; local5 = arg1.indexOf(arg0, local5 + arg2.length())) {
			arg1 = arg1.substring(0, local5) + arg2 + arg1.substring(arg0.length() + local5);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method5872(@OriginalArg(1) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method5873(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method5870(local1);
			local1 = method5871(":", local1, "%3a");
			local1 = method5871("@", local1, "%40");
			local1 = method5871("&", local1, "%26");
			local1 = method5871("#", local1, "%23");
			@Pc(86) URL local86 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt6801 + "&v1=" + Class228.aString282 + "&v2=" + Class228.aString285 + "&e=" + local1);
			@Pc(92) DataInputStream local92 = new DataInputStream(local86.openStream());
			local92.read();
			local92.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method5873(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString277 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local46));
		@Pc(66) String local66 = local63.readLine();
		while (true) {
			@Pc(69) String local69 = local63.readLine();
			if (local69 == null) {
				return local17 + "| " + local66;
			}
			@Pc(75) int local75 = local69.indexOf(40);
			@Pc(82) int local82 = local69.indexOf(41, local75 + 1);
			@Pc(87) String local87;
			if (local75 == -1) {
				local87 = local69;
			} else {
				local87 = local69.substring(0, local75);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local17 = local17 + local87;
			if (local75 != -1 && local82 != -1) {
				@Pc(138) int local138 = local69.indexOf(".java:", local75);
				if (local138 >= 0) {
					local17 = local17 + local69.substring(local138 + 5, local82);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method5874(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString277 = local8.aString277 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString277 = arg1;
	}
}
