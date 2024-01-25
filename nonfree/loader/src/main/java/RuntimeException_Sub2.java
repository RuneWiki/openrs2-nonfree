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
	public static int anInt9671;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	private String aString116;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method7888(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString116 = local5.aString116 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method7889(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(12) int local12 = arg0.indexOf(arg1); local12 != -1; local12 = arg0.indexOf(arg1, arg2.length() + local12)) {
			arg0 = arg0.substring(0, local12) + arg2 + arg0.substring(local12 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private static void method7890(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method7889(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method7891(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			arg0 = local17.aThrowable2;
			local6 = local17.aString116 + " | ";
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(58) String local58 = local34.toString();
		@Pc(66) BufferedReader local66 = new BufferedReader(new StringReader(local58));
		@Pc(69) String local69 = local66.readLine();
		while (true) {
			@Pc(72) String local72 = local66.readLine();
			if (local72 == null) {
				return local6 + "| " + local69;
			}
			@Pc(81) int local81 = local72.indexOf(40);
			@Pc(88) int local88 = local72.indexOf(41, local81 + 1);
			@Pc(93) String local93;
			if (local81 == -1) {
				local93 = local72;
			} else {
				local93 = local72.substring(0, local81);
			}
			local93 = local93.trim();
			local93 = local93.substring(local93.lastIndexOf(32) + 1);
			local93 = local93.substring(local93.lastIndexOf(9) + 1);
			local6 = local6 + local93;
			if (local81 != -1 && local88 != -1) {
				@Pc(142) int local142 = local72.indexOf(".java:", local81);
				if (local142 >= 0) {
					local6 = local6 + local72.substring(local142 + 5, local88);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;B)V")
	public static void method7892(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method7891(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method7890(local1);
			local1 = method7889(local1, ":", "%3a");
			local1 = method7889(local1, "@", "%40");
			local1 = method7889(local1, "&", "%26");
			local1 = method7889(local1, "#", "%23");
			@Pc(89) URL local89 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt9671 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(100) DataInputStream local100 = new DataInputStream(local89.openStream());
			local100.read();
			local100.close();
		} catch (@Pc(107) Exception local107) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString116 = arg1;
	}
}
