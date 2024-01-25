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

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public static int anInt11225;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	private String aString120;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method9326(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString120 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local47));
		@Pc(66) String local66 = local63.readLine();
		while (true) {
			@Pc(69) String local69 = local63.readLine();
			if (local69 == null) {
				return local17 + "| " + local66;
			}
			@Pc(78) int local78 = local69.indexOf(40);
			@Pc(85) int local85 = local69.indexOf(41, local78 + 1);
			@Pc(90) String local90;
			if (local78 == -1) {
				local90 = local69;
			} else {
				local90 = local69.substring(0, local78);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local17 = local17 + local90;
			if (local78 != -1 && local85 != -1) {
				@Pc(138) int local138 = local69.indexOf(".java:", local78);
				if (local138 >= 0) {
					local17 = local17 + local69.substring(local138 + 5, local85);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method9327(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg1); local5 != -1; local5 = arg0.indexOf(arg1, local5 + arg2.length())) {
			arg0 = arg0.substring(0, local5) + arg2 + arg0.substring(local5 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method9328(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method9327(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;B)V")
	public static void method9329(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg2 != null) {
				local6 = method9326(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg0;
			}
			method9328(local6);
			local6 = method9327(local6, ":", "%3a");
			local6 = method9327(local6, "@", "%40");
			local6 = method9327(local6, "&", "%26");
			local6 = method9327(local6, "#", "%23");
			@Pc(93) URL local93 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt11225 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local6);
			@Pc(99) DataInputStream local99 = new DataInputStream(local93.openStream());
			local99.read();
			local99.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method9330(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString120 = local5.aString120 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString120 = arg1;
		this.aThrowable2 = arg0;
	}
}
