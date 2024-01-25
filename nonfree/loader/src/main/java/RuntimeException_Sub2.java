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

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "I")
	public static int anInt9174;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/String;")
	private String aString91;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method7588(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString91 = local5.aString91 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method7589(@OriginalArg(0) Applet arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method7590(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method7591(local1);
			local1 = method7592("%3a", ":", local1);
			local1 = method7592("%40", "@", local1);
			local1 = method7592("%26", "&", local1);
			local1 = method7592("%23", "#", local1);
			@Pc(86) URL local86 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt9174 + "&v1=" + Class325.aString87 + "&v2=" + Class325.aString83 + "&e=" + local1);
			@Pc(92) DataInputStream local92 = new DataInputStream(local86.openStream());
			local92.read();
			local92.close();
		} catch (@Pc(108) Exception local108) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method7590(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(26) String local26;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(13) RuntimeException_Sub2 local13 = (RuntimeException_Sub2) arg0;
			arg0 = local13.aThrowable2;
			local26 = local13.aString91 + " | ";
		} else {
			local26 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local26 + "| " + local58;
			}
			@Pc(68) int local68 = local61.indexOf(40);
			@Pc(75) int local75 = local61.indexOf(41, local68 + 1);
			@Pc(80) String local80;
			if (local68 == -1) {
				local80 = local61;
			} else {
				local80 = local61.substring(0, local68);
			}
			local80 = local80.trim();
			local80 = local80.substring(local80.lastIndexOf(32) + 1);
			local80 = local80.substring(local80.lastIndexOf(9) + 1);
			local26 = local26 + local80;
			if (local68 != -1 && local75 != -1) {
				@Pc(129) int local129 = local61.indexOf(".java:", local68);
				if (local129 >= 0) {
					local26 = local26 + local61.substring(local129 + 5, local75);
				}
			}
			local26 = local26 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private static void method7591(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method7592("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method7592(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg1); local5 != -1; local5 = arg2.indexOf(arg1, arg0.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg0 + arg2.substring(arg1.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString91 = arg1;
		this.aThrowable2 = arg0;
	}
}
