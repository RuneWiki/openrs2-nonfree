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
	public static int anInt9415;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	private String aString216;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method7823(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method7824("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method7824(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg2); local9 != -1; local9 = arg1.indexOf(arg2, arg0.length() + local9)) {
			arg1 = arg1.substring(0, local9) + arg0 + arg1.substring(local9 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method7825(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString216 + " | ";
		} else {
			local6 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local6 + "| " + local64;
			}
			@Pc(75) int local75 = local67.indexOf(40);
			@Pc(82) int local82 = local67.indexOf(41, local75 + 1);
			@Pc(87) String local87;
			if (local75 == -1) {
				local87 = local67;
			} else {
				local87 = local67.substring(0, local75);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local6 = local6 + local87;
			if (local75 != -1 && local82 != -1) {
				@Pc(135) int local135 = local67.indexOf(".java:", local75);
				if (local135 >= 0) {
					local6 = local6 + local67.substring(local135 + 5, local82);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method7826(@OriginalArg(0) Applet arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg1 != null) {
				local6 = method7825(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg2;
			}
			method7823(local6);
			local6 = method7824("%3a", local6, ":");
			local6 = method7824("%40", local6, "@");
			local6 = method7824("%26", local6, "&");
			local6 = method7824("%23", local6, "#");
			@Pc(96) URL local96 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt9415 + "&v1=" + Class328.aString223 + "&v2=" + Class328.aString228 + "&e=" + local6);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method7827(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString216 = local8.aString216 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString216 = arg1;
	}
}
