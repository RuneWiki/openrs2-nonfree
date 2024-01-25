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
	public static int anInt7550;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	private String aString80;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!d;")
	private static RuntimeException_Sub2 method5975(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString80 = local5.aString80 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5976(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method5978("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method5977(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			local6 = local11.aString80 + " | ";
			arg0 = local11.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(47) String local47 = local28.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local6 + "| " + local58;
			}
			@Pc(70) int local70 = local61.indexOf(40);
			@Pc(77) int local77 = local61.indexOf(41, local70 + 1);
			@Pc(86) String local86;
			if (local70 == -1) {
				local86 = local61;
			} else {
				local86 = local61.substring(0, local70);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local6 = local6 + local86;
			if (local70 != -1 && local77 != -1) {
				@Pc(131) int local131 = local61.indexOf(".java:", local70);
				if (local131 >= 0) {
					local6 = local6 + local61.substring(local131 + 5, local77);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method5978(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, arg1.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(arg0.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;)V")
	public static void method5979(@OriginalArg(1) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method5977(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method5976(local1);
			local1 = method5978(":", "%3a", local1);
			local1 = method5978("@", "%40", local1);
			local1 = method5978("&", "%26", local1);
			local1 = method5978("#", "%23", local1);
			@Pc(90) URL local90 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt7550 + "&v1=" + Class276.aString84 + "&v2=" + Class276.aString83 + "&e=" + local1);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString80 = arg1;
	}
}
