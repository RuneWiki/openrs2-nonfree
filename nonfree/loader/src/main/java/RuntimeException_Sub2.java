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

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "I")
	public static int anInt5928;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	private String aString195;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/applet/Applet;Ljava/lang/String;)V")
	public static void method4860(@OriginalArg(0) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method4864(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method4862(local1);
			local1 = method4863("%3a", local1, ":");
			local1 = method4863("%40", local1, "@");
			local1 = method4863("%26", local1, "&");
			local1 = method4863("%23", local1, "#");
			@Pc(87) URL local87 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt5928 + "&v1=" + Class208.aString200 + "&v2=" + Class208.aString203 + "&e=" + local1);
			@Pc(93) DataInputStream local93 = new DataInputStream(local87.openStream());
			local93.read();
			local93.close();
		} catch (@Pc(100) Exception local100) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method4862(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method4863("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4863(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg1.indexOf(arg2); local13 != -1; local13 = arg1.indexOf(arg2, local13 + arg0.length())) {
			arg1 = arg1.substring(0, local13) + arg0 + arg1.substring(local13 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method4864(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			arg0 = local11.aThrowable2;
			local6 = local11.aString195 + " | ";
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local28);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local28.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(60) String local60 = local54.readLine();
			if (local60 == null) {
				return local6 + "| " + local57;
			}
			@Pc(69) int local69 = local60.indexOf(40);
			@Pc(76) int local76 = local60.indexOf(41, local69 + 1);
			@Pc(82) String local82;
			if (local69 == -1) {
				local82 = local60;
			} else {
				local82 = local60.substring(0, local69);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local6 = local6 + local82;
			if (local69 != -1 && local76 != -1) {
				@Pc(131) int local131 = local60.indexOf(".java:", local69);
				if (local131 >= 0) {
					local6 = local6 + local60.substring(local131 + 5, local76);
				}
			}
			local6 = local6 + ' ';
		}
	}
}
