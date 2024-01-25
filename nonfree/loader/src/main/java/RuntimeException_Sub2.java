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

@OriginalClass("loader!e")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "I")
	public static int anInt7854;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6116(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString71 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
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
				return local17 + "| " + local57;
			}
			@Pc(67) int local67 = local60.indexOf(40);
			@Pc(74) int local74 = local60.indexOf(41, local67 + 1);
			@Pc(79) String local79;
			if (local67 == -1) {
				local79 = local60;
			} else {
				local79 = local60.substring(0, local67);
			}
			local79 = local79.trim();
			local79 = local79.substring(local79.lastIndexOf(32) + 1);
			local79 = local79.substring(local79.lastIndexOf(9) + 1);
			local17 = local17 + local79;
			if (local67 != -1 && local74 != -1) {
				@Pc(127) int local127 = local60.indexOf(".java:", local67);
				if (local127 >= 0) {
					local17 = local17 + local60.substring(local127 + 5, local74);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method6117(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method6120(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method6118(@OriginalArg(0) Throwable arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg0 != null) {
				local6 = method6116(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg2;
			}
			method6117(local6);
			local6 = method6120(local6, "%3a", ":");
			local6 = method6120(local6, "%40", "@");
			local6 = method6120(local6, "%26", "&");
			local6 = method6120(local6, "%23", "#");
			@Pc(91) URL local91 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt7854 + "&v1=" + Class275.aString77 + "&v2=" + Class275.aString81 + "&e=" + local6);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method6119(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString71 = local5.aString71 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6120(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(17) int local17 = arg0.indexOf(arg2); local17 != -1; local17 = arg0.indexOf(arg2, arg1.length() + local17)) {
			arg0 = arg0.substring(0, local17) + arg1 + arg0.substring(local17 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString71 = arg1;
	}
}
