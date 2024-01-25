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

@OriginalClass("loader!f")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public static int anInt9659;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	private String aString114;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;")
	private static String method8009(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(16) int local16 = arg0.indexOf(arg1); local16 != -1; local16 = arg0.indexOf(arg1, local16 + arg2.length())) {
			arg0 = arg0.substring(0, local16) + arg2 + arg0.substring(arg1.length() + local16);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8010(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString114 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(42) StringWriter local42 = new StringWriter();
		@Pc(47) PrintWriter local47 = new PrintWriter(local42);
		arg0.printStackTrace(local47);
		local47.close();
		@Pc(55) String local55 = local42.toString();
		@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local55));
		@Pc(66) String local66 = local63.readLine();
		while (true) {
			@Pc(69) String local69 = local63.readLine();
			if (local69 == null) {
				return local17 + "| " + local66;
			}
			@Pc(77) int local77 = local69.indexOf(40);
			@Pc(84) int local84 = local69.indexOf(41, local77 + 1);
			@Pc(89) String local89;
			if (local77 == -1) {
				local89 = local69;
			} else {
				local89 = local69.substring(0, local77);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local17 = local17 + local89;
			if (local77 != -1 && local84 != -1) {
				@Pc(135) int local135 = local69.indexOf(".java:", local77);
				if (local135 >= 0) {
					local17 = local17 + local69.substring(local135 + 5, local84);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method8011(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString114 = local8.aString114 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method8012(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method8010(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method8013(local1);
			local1 = method8009(local1, ":", "%3a");
			local1 = method8009(local1, "@", "%40");
			local1 = method8009(local1, "&", "%26");
			local1 = method8009(local1, "#", "%23");
			@Pc(88) URL local88 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt9659 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(94) DataInputStream local94 = new DataInputStream(local88.openStream());
			local94.read();
			local94.close();
		} catch (@Pc(101) Exception local101) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method8013(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method8009(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString114 = arg1;
	}
}
