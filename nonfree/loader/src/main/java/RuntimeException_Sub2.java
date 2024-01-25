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
	public static int anInt6411;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	private String aString311;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;Ljava/applet/Applet;)V")
	public static void method5843(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = method5845(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			method5844(local5);
			local5 = method5847("%3a", ":", local5);
			local5 = method5847("%40", "@", local5);
			local5 = method5847("%26", "&", local5);
			local5 = method5847("%23", "#", local5);
			@Pc(90) URL local90 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt6411 + "&v1=" + Class228.aString320 + "&v2=" + Class228.aString315 + "&e=" + local5);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method5844(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5847("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method5845(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString311 + " | ";
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
			@Pc(69) int local69 = local60.indexOf(40);
			@Pc(76) int local76 = local60.indexOf(41, local69 + 1);
			@Pc(81) String local81;
			if (local69 == -1) {
				local81 = local60;
			} else {
				local81 = local60.substring(0, local69);
			}
			local81 = local81.trim();
			local81 = local81.substring(local81.lastIndexOf(32) + 1);
			local81 = local81.substring(local81.lastIndexOf(9) + 1);
			local6 = local6 + local81;
			if (local69 != -1 && local76 != -1) {
				@Pc(128) int local128 = local60.indexOf(".java:", local69);
				if (local128 >= 0) {
					local6 = local6 + local60.substring(local128 + 5, local76);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method5846(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString311 = local8.aString311 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method5847(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg1); local5 != -1; local5 = arg2.indexOf(arg1, arg0.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg0 + arg2.substring(arg1.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString311 = arg1;
	}
}
