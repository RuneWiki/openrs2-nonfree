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
	public static int anInt6894;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/String;")
	private String aString262;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	private static String method5723(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString262 + " | ";
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(50) String local50 = local33.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local6 + "| " + local61;
			}
			@Pc(73) int local73 = local64.indexOf(40);
			@Pc(80) int local80 = local64.indexOf(41, local73 + 1);
			@Pc(89) String local89;
			if (local73 == -1) {
				local89 = local64;
			} else {
				local89 = local64.substring(0, local73);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local6 = local6 + local89;
			if (local73 != -1 && local80 != -1) {
				@Pc(135) int local135 = local64.indexOf(".java:", local73);
				if (local135 >= 0) {
					local6 = local6 + local64.substring(local135 + 5, local80);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	private static String method5724(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg0.indexOf(arg2); local10 != -1; local10 = arg0.indexOf(arg2, arg1.length() + local10)) {
			arg0 = arg0.substring(0, local10) + arg1 + arg0.substring(local10 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method5725(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method5724(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!d;")
	private static RuntimeException_Sub2 method5726(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString262 = local5.aString262 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void method5727(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method5723(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method5725(local1);
			local1 = method5724(local1, "%3a", ":");
			local1 = method5724(local1, "%40", "@");
			local1 = method5724(local1, "%26", "&");
			local1 = method5724(local1, "%23", "#");
			@Pc(92) URL local92 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt6894 + "&v1=" + Class226.aString268 + "&v2=" + Class226.aString272 + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local92.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString262 = arg1;
		this.aThrowable2 = arg0;
	}
}
