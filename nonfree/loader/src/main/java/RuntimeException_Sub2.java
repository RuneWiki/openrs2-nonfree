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

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	public static int anInt10501;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	private String aString126;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method8928(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg0); local5 != -1; local5 = arg1.indexOf(arg0, arg2.length() + local5)) {
			arg1 = arg1.substring(0, local5) + arg2 + arg1.substring(local5 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void method8929(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method8931(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method8932(local1);
			local1 = method8928(":", local1, "%3a");
			local1 = method8928("@", local1, "%40");
			local1 = method8928("&", local1, "%26");
			local1 = method8928("#", local1, "%23");
			@Pc(92) URL local92 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10501 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local92.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method8930(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString126 = local8.aString126 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8931(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			arg0 = local17.aThrowable2;
			local6 = local17.aString126 + " | ";
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local47));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local6 + "| " + local63;
			}
			@Pc(73) int local73 = local66.indexOf(40);
			@Pc(80) int local80 = local66.indexOf(41, local73 + 1);
			@Pc(85) String local85;
			if (local73 == -1) {
				local85 = local66;
			} else {
				local85 = local66.substring(0, local73);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local6 = local6 + local85;
			if (local73 != -1 && local80 != -1) {
				@Pc(135) int local135 = local66.indexOf(".java:", local73);
				if (local135 >= 0) {
					local6 = local6 + local66.substring(local135 + 5, local80);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method8932(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method8928("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString126 = arg1;
	}
}
