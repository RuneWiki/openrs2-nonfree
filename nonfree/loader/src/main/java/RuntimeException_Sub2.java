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

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "I")
	public static int anInt8024;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/String;")
	private String aString85;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;B)V")
	public static void method6350(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg1 != null) {
				local6 = method6353(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg0;
			}
			method6354(local6);
			local6 = method6352(":", local6, "%3a");
			local6 = method6352("@", local6, "%40");
			local6 = method6352("&", local6, "%26");
			local6 = method6352("#", local6, "%23");
			@Pc(90) URL local90 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt8024 + "&v1=" + Class283.aString95 + "&v2=" + Class283.aString91 + "&e=" + local6);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!d;")
	private static RuntimeException_Sub2 method6351(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString85 = local8.aString85 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
	private static String method6352(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg1.indexOf(arg0); local10 != -1; local10 = arg1.indexOf(arg0, local10 + arg2.length())) {
			arg1 = arg1.substring(0, local10) + arg2 + arg1.substring(arg0.length() + local10);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6353(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(25) String local25;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(15) RuntimeException_Sub2 local15 = (RuntimeException_Sub2) arg0;
			local25 = local15.aString85 + " | ";
			arg0 = local15.aThrowable2;
		} else {
			local25 = "";
		}
		@Pc(41) StringWriter local41 = new StringWriter();
		@Pc(46) PrintWriter local46 = new PrintWriter(local41);
		arg0.printStackTrace(local46);
		local46.close();
		@Pc(54) String local54 = local41.toString();
		@Pc(62) BufferedReader local62 = new BufferedReader(new StringReader(local54));
		@Pc(65) String local65 = local62.readLine();
		while (true) {
			@Pc(68) String local68 = local62.readLine();
			if (local68 == null) {
				return local25 + "| " + local65;
			}
			@Pc(76) int local76 = local68.indexOf(40);
			@Pc(83) int local83 = local68.indexOf(41, local76 + 1);
			@Pc(90) String local90;
			if (local76 == -1) {
				local90 = local68;
			} else {
				local90 = local68.substring(0, local76);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local25 = local25 + local90;
			if (local76 != -1 && local83 != -1) {
				@Pc(137) int local137 = local68.indexOf(".java:", local76);
				if (local137 >= 0) {
					local25 = local25 + local68.substring(local137 + 5, local83);
				}
			}
			local25 = local25 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method6354(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method6352("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString85 = arg1;
	}
}
