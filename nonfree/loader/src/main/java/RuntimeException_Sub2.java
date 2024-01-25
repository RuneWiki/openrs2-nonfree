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

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "I")
	public static int anInt10845;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	private String aString152;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method9339(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString152 = local8.aString152 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	private static String method9340(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString152 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local47));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local17 + "| " + local62;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(86) String local86;
			if (local73 == -1) {
				local86 = local65;
			} else {
				local86 = local65.substring(0, local73);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local17 = local17 + local86;
			if (local73 != -1 && local80 != -1) {
				@Pc(132) int local132 = local65.indexOf(".java:", local73);
				if (local132 >= 0) {
					local17 = local17 + local65.substring(local132 + 5, local80);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Throwable;Ljava/applet/Applet;)V")
	public static void method9341(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method9340(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method9343(local1);
			local1 = method9342("%3a", ":", local1);
			local1 = method9342("%40", "@", local1);
			local1 = method9342("%26", "&", local1);
			local1 = method9342("%23", "#", local1);
			@Pc(86) URL local86 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10845 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(92) DataInputStream local92 = new DataInputStream(local86.openStream());
			local92.read();
			local92.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method9342(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg1); local5 != -1; local5 = arg2.indexOf(arg1, local5 + arg0.length())) {
			arg2 = arg2.substring(0, local5) + arg0 + arg2.substring(arg1.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method9343(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method9342("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString152 = arg1;
	}
}
