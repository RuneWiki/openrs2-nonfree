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

@OriginalClass("loader!h")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "I")
	public static int anInt7695;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6095(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6099("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;I)V")
	public static void method6096(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method6097(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method6095(local1);
			local1 = method6099(":", "%3a", local1);
			local1 = method6099("@", "%40", local1);
			local1 = method6099("&", "%26", local1);
			local1 = method6099("#", "%23", local1);
			@Pc(87) URL local87 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt7695 + "&v1=" + Class275.aString73 + "&v2=" + Class275.aString74 + "&e=" + local1);
			@Pc(93) DataInputStream local93 = new DataInputStream(local87.openStream());
			local93.read();
			local93.close();
		} catch (@Pc(100) Exception local100) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6097(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString69 + " | ";
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(60) String local60 = local54.readLine();
			if (local60 == null) {
				return local6 + "| " + local57;
			}
			@Pc(68) int local68 = local60.indexOf(40);
			@Pc(75) int local75 = local60.indexOf(41, local68 + 1);
			@Pc(85) String local85;
			if (local68 == -1) {
				local85 = local60;
			} else {
				local85 = local60.substring(0, local68);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local6 = local6 + local85;
			if (local68 != -1 && local75 != -1) {
				@Pc(128) int local128 = local60.indexOf(".java:", local68);
				if (local128 >= 0) {
					local6 = local6 + local60.substring(local128 + 5, local75);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method6098(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString69 = local8.aString69 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6099(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, local5 + arg1.length())) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(local5 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString69 = arg1;
	}
}
