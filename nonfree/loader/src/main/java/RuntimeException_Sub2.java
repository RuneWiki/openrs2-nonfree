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
	public static int anInt7837;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	private String aString79;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	private static String method6376(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, arg1.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(local5 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/applet/Applet;I)V")
	public static void method6377(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method6378(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method6380(local1);
			local1 = method6376(":", "%3a", local1);
			local1 = method6376("@", "%40", local1);
			local1 = method6376("&", "%26", local1);
			local1 = method6376("#", "%23", local1);
			@Pc(89) URL local89 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt7837 + "&v1=" + Class276.aString77 + "&v2=" + Class276.aString71 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(102) Exception local102) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6378(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString79 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local41));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local20 + "| " + local58;
			}
			@Pc(70) int local70 = local61.indexOf(40);
			@Pc(77) int local77 = local61.indexOf(41, local70 + 1);
			@Pc(87) String local87;
			if (local70 == -1) {
				local87 = local61;
			} else {
				local87 = local61.substring(0, local70);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local20 = local20 + local87;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local61.indexOf(".java:", local70);
				if (local130 >= 0) {
					local20 = local20 + local61.substring(local130 + 5, local77);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method6379(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString79 = local5.aString79 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private static void method6380(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6376("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString79 = arg1;
		this.aThrowable2 = arg0;
	}
}
