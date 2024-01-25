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

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public static int anInt10550;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	private String aString144;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method9058(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString144 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(66) String local66 = local55.readLine();
			if (local66 == null) {
				return local17 + "| " + local58;
			}
			@Pc(75) int local75 = local66.indexOf(40);
			@Pc(82) int local82 = local66.indexOf(41, local75 + 1);
			@Pc(87) String local87;
			if (local75 == -1) {
				local87 = local66;
			} else {
				local87 = local66.substring(0, local75);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local17 = local17 + local87;
			if (local75 != -1 && local82 != -1) {
				@Pc(135) int local135 = local66.indexOf(".java:", local75);
				if (local135 >= 0) {
					local17 = local17 + local66.substring(local135 + 5, local82);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method9059(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg0); local5 != -1; local5 = arg1.indexOf(arg0, arg2.length() + local5)) {
			arg1 = arg1.substring(0, local5) + arg2 + arg1.substring(local5 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method9060(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method9059("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;B)V")
	public static void method9061(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(5) String local5 = "";
			if (arg2 != null) {
				local5 = method9058(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			method9060(local5);
			local5 = method9059(":", local5, "%3a");
			local5 = method9059("@", local5, "%40");
			local5 = method9059("&", local5, "%26");
			local5 = method9059("#", local5, "%23");
			@Pc(94) URL local94 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt10550 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local5);
			@Pc(100) DataInputStream local100 = new DataInputStream(local94.openStream());
			local100.read();
			local100.close();
		} catch (@Pc(107) Exception local107) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method9062(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString144 = local8.aString144 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString144 = arg1;
	}
}
