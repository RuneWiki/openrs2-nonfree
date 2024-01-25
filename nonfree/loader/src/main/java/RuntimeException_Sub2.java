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

@OriginalClass("loader!b")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public static int anInt10899;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString130;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method9386(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg2); local5 != -1; local5 = arg1.indexOf(arg2, arg0.length() + local5)) {
			arg1 = arg1.substring(0, local5) + arg0 + arg1.substring(local5 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method9387(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString130 + " | ";
			arg0 = local17.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(72) String local72 = local55.readLine();
			if (local72 == null) {
				return local6 + "| " + local58;
			}
			@Pc(78) int local78 = local72.indexOf(40);
			@Pc(85) int local85 = local72.indexOf(41, local78 + 1);
			@Pc(92) String local92;
			if (local78 == -1) {
				local92 = local72;
			} else {
				local92 = local72.substring(0, local78);
			}
			local92 = local92.trim();
			local92 = local92.substring(local92.lastIndexOf(32) + 1);
			local92 = local92.substring(local92.lastIndexOf(9) + 1);
			local6 = local6 + local92;
			if (local78 != -1 && local85 != -1) {
				@Pc(140) int local140 = local72.indexOf(".java:", local78);
				if (local140 >= 0) {
					local6 = local6 + local72.substring(local140 + 5, local85);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!b;")
	private static RuntimeException_Sub2 method9388(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString130 = local8.aString130 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;ILjava/applet/Applet;)V")
	public static void method9389(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = method9387(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			method9390(local5);
			local5 = method9386("%3a", local5, ":");
			local5 = method9386("%40", local5, "@");
			local5 = method9386("%26", local5, "&");
			local5 = method9386("%23", local5, "#");
			@Pc(91) URL local91 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10899 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local5);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method9390(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method9386("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString130 = arg1;
	}
}
