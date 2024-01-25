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
	public static int anInt10303;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	private String aString124;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8613(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString124 + " | ";
			arg0 = local17.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(56) String local56 = local34.toString();
		@Pc(64) BufferedReader local64 = new BufferedReader(new StringReader(local56));
		@Pc(67) String local67 = local64.readLine();
		while (true) {
			@Pc(70) String local70 = local64.readLine();
			if (local70 == null) {
				return local6 + "| " + local67;
			}
			@Pc(78) int local78 = local70.indexOf(40);
			@Pc(85) int local85 = local70.indexOf(41, local78 + 1);
			@Pc(91) String local91;
			if (local78 == -1) {
				local91 = local70;
			} else {
				local91 = local70.substring(0, local78);
			}
			local91 = local91.trim();
			local91 = local91.substring(local91.lastIndexOf(32) + 1);
			local91 = local91.substring(local91.lastIndexOf(9) + 1);
			local6 = local6 + local91;
			if (local78 != -1 && local85 != -1) {
				@Pc(138) int local138 = local70.indexOf(".java:", local78);
				if (local138 >= 0) {
					local6 = local6 + local70.substring(local138 + 5, local85);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8614(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method8616("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method8615(@OriginalArg(0) Throwable arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method8613(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method8614(local1);
			local1 = method8616("%3a", local1, ":");
			local1 = method8616("%40", local1, "@");
			local1 = method8616("%26", local1, "&");
			local1 = method8616("%23", local1, "#");
			@Pc(96) URL local96 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt10303 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8616(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg2); local5 != -1; local5 = arg1.indexOf(arg2, local5 + arg0.length())) {
			arg1 = arg1.substring(0, local5) + arg0 + arg1.substring(arg2.length() + local5);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method8617(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString124 = local5.aString124 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString124 = arg1;
		this.aThrowable2 = arg0;
	}
}
