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

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "I")
	public static int anInt6791;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	private String aString68;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method5745(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5749(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method5746(@OriginalArg(0) Applet arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method5748(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method5745(local1);
			local1 = method5749(local1, "%3a", ":");
			local1 = method5749(local1, "%40", "@");
			local1 = method5749(local1, "%26", "&");
			local1 = method5749(local1, "%23", "#");
			@Pc(97) URL local97 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt6791 + "&v1=" + Class224.aString71 + "&v2=" + Class224.aString76 + "&e=" + local1);
			@Pc(103) DataInputStream local103 = new DataInputStream(local97.openStream());
			local103.read();
			local103.close();
		} catch (@Pc(110) Exception local110) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method5747(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString68 = local5.aString68 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method5748(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString68 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(66) BufferedReader local66 = new BufferedReader(new StringReader(local46));
		@Pc(69) String local69 = local66.readLine();
		while (true) {
			@Pc(72) String local72 = local66.readLine();
			if (local72 == null) {
				return local6 + "| " + local69;
			}
			@Pc(81) int local81 = local72.indexOf(40);
			@Pc(88) int local88 = local72.indexOf(41, local81 + 1);
			@Pc(94) String local94;
			if (local81 == -1) {
				local94 = local72;
			} else {
				local94 = local72.substring(0, local81);
			}
			local94 = local94.trim();
			local94 = local94.substring(local94.lastIndexOf(32) + 1);
			local94 = local94.substring(local94.lastIndexOf(9) + 1);
			local6 = local6 + local94;
			if (local81 != -1 && local88 != -1) {
				@Pc(140) int local140 = local72.indexOf(".java:", local81);
				if (local140 >= 0) {
					local6 = local6 + local72.substring(local140 + 5, local88);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method5749(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(11) int local11 = arg0.indexOf(arg2); local11 != -1; local11 = arg0.indexOf(arg2, arg1.length() + local11)) {
			arg0 = arg0.substring(0, local11) + arg1 + arg0.substring(local11 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString68 = arg1;
		this.aThrowable2 = arg0;
	}
}
