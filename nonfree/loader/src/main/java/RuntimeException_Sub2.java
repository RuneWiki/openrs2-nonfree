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
	public static int anInt6815;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;ILjava/applet/Applet;)V")
	public static void method5698(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = method5702(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			method5699(local5);
			local5 = method5701(local5, ":", "%3a");
			local5 = method5701(local5, "@", "%40");
			local5 = method5701(local5, "&", "%26");
			local5 = method5701(local5, "#", "%23");
			@Pc(87) URL local87 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt6815 + "&v1=" + Class224.aString79 + "&v2=" + Class224.aString74 + "&e=" + local5);
			@Pc(93) DataInputStream local93 = new DataInputStream(local87.openStream());
			local93.read();
			local93.close();
		} catch (@Pc(100) Exception local100) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private static void method5699(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5701(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method5700(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString71 = local8.aString71 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method5701(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(12) int local12 = arg0.indexOf(arg1); local12 != -1; local12 = arg0.indexOf(arg1, arg2.length() + local12)) {
			arg0 = arg0.substring(0, local12) + arg2 + arg0.substring(local12 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method5702(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(25) String local25;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(12) RuntimeException_Sub2 local12 = (RuntimeException_Sub2) arg0;
			arg0 = local12.aThrowable2;
			local25 = local12.aString71 + " | ";
		} else {
			local25 = "";
		}
		@Pc(38) StringWriter local38 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local38);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local38.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local25 + "| " + local62;
			}
			@Pc(71) int local71 = local65.indexOf(40);
			@Pc(78) int local78 = local65.indexOf(41, local71 + 1);
			@Pc(86) String local86;
			if (local71 == -1) {
				local86 = local65;
			} else {
				local86 = local65.substring(0, local71);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local25 = local25 + local86;
			if (local71 != -1 && local78 != -1) {
				@Pc(132) int local132 = local65.indexOf(".java:", local71);
				if (local132 >= 0) {
					local25 = local25 + local65.substring(local132 + 5, local78);
				}
			}
			local25 = local25 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString71 = arg1;
		this.aThrowable2 = arg0;
	}
}
