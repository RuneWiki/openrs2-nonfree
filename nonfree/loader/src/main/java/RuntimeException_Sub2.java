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
	public static int anInt10390;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/lang/String;")
	private String aString123;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method8661(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString123 = local5.aString123 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;I)V")
	public static void method8662(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method8665(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method8663(local1);
			local1 = method8664("%3a", local1, ":");
			local1 = method8664("%40", local1, "@");
			local1 = method8664("%26", local1, "&");
			local1 = method8664("%23", local1, "#");
			@Pc(98) URL local98 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10390 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(104) DataInputStream local104 = new DataInputStream(local98.openStream());
			local104.read();
			local104.close();
		} catch (@Pc(111) Exception local111) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private static void method8663(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method8664("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8664(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg2); local5 != -1; local5 = arg1.indexOf(arg2, local5 + arg0.length())) {
			arg1 = arg1.substring(0, local5) + arg0 + arg1.substring(local5 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8665(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString123 + " | ";
			arg0 = local17.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(59) String local59 = local34.toString();
		@Pc(67) BufferedReader local67 = new BufferedReader(new StringReader(local59));
		@Pc(70) String local70 = local67.readLine();
		while (true) {
			@Pc(73) String local73 = local67.readLine();
			if (local73 == null) {
				return local6 + "| " + local70;
			}
			@Pc(79) int local79 = local73.indexOf(40);
			@Pc(86) int local86 = local73.indexOf(41, local79 + 1);
			@Pc(96) String local96;
			if (local79 == -1) {
				local96 = local73;
			} else {
				local96 = local73.substring(0, local79);
			}
			local96 = local96.trim();
			local96 = local96.substring(local96.lastIndexOf(32) + 1);
			local96 = local96.substring(local96.lastIndexOf(9) + 1);
			local6 = local6 + local96;
			if (local79 != -1 && local86 != -1) {
				@Pc(141) int local141 = local73.indexOf(".java:", local79);
				if (local141 >= 0) {
					local6 = local6 + local73.substring(local141 + 5, local86);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString123 = arg1;
		this.aThrowable2 = arg0;
	}
}
