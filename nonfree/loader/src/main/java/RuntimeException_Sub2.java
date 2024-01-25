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

@OriginalClass("loader!a")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public static int anInt10346;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString269;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private static void method8186(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method8187(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8187(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg1); local14 != -1; local14 = arg0.indexOf(arg1, local14 + arg2.length())) {
			arg0 = arg0.substring(0, local14) + arg2 + arg0.substring(arg1.length() + local14);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8188(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString269 + " | ";
			arg0 = local17.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(50) PrintWriter local50 = new PrintWriter(local34);
		arg0.printStackTrace(local50);
		local50.close();
		@Pc(58) String local58 = local34.toString();
		@Pc(66) BufferedReader local66 = new BufferedReader(new StringReader(local58));
		@Pc(69) String local69 = local66.readLine();
		while (true) {
			@Pc(72) String local72 = local66.readLine();
			if (local72 == null) {
				return local6 + "| " + local69;
			}
			@Pc(78) int local78 = local72.indexOf(40);
			@Pc(85) int local85 = local72.indexOf(41, local78 + 1);
			@Pc(95) String local95;
			if (local78 == -1) {
				local95 = local72;
			} else {
				local95 = local72.substring(0, local78);
			}
			local95 = local95.trim();
			local95 = local95.substring(local95.lastIndexOf(32) + 1);
			local95 = local95.substring(local95.lastIndexOf(9) + 1);
			local6 = local6 + local95;
			if (local78 != -1 && local85 != -1) {
				@Pc(138) int local138 = local72.indexOf(".java:", local78);
				if (local138 >= 0) {
					local6 = local6 + local72.substring(local138 + 5, local85);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method8189(@OriginalArg(0) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method8188(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method8186(local1);
			local1 = method8187(local1, ":", "%3a");
			local1 = method8187(local1, "@", "%40");
			local1 = method8187(local1, "&", "%26");
			local1 = method8187(local1, "#", "%23");
			@Pc(95) URL local95 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt10346 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(101) DataInputStream local101 = new DataInputStream(local95.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method8190(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString269 = local8.aString269 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString269 = arg1;
	}
}
