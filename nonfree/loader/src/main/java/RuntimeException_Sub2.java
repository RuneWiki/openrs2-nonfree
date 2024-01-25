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

@OriginalClass("loader!g")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	public static int anInt10469;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	private String aString148;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8451(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg1); local5 != -1; local5 = arg2.indexOf(arg1, local5 + arg0.length())) {
			arg2 = arg2.substring(0, local5) + arg0 + arg2.substring(local5 + arg1.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private static void method8452(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method8451("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!g;")
	private static RuntimeException_Sub2 method8453(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString148 = local8.aString148 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method8454(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method8455(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method8452(local1);
			local1 = method8451("%3a", ":", local1);
			local1 = method8451("%40", "@", local1);
			local1 = method8451("%26", "&", local1);
			local1 = method8451("%23", "#", local1);
			@Pc(93) URL local93 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10469 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(99) DataInputStream local99 = new DataInputStream(local93.openStream());
			local99.read();
			local99.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8455(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString148 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(67) String local67 = local55.readLine();
			if (local67 == null) {
				return local17 + "| " + local58;
			}
			@Pc(75) int local75 = local67.indexOf(40);
			@Pc(82) int local82 = local67.indexOf(41, local75 + 1);
			@Pc(89) String local89;
			if (local75 == -1) {
				local89 = local67;
			} else {
				local89 = local67.substring(0, local75);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local17 = local17 + local89;
			if (local75 != -1 && local82 != -1) {
				@Pc(137) int local137 = local67.indexOf(".java:", local75);
				if (local137 >= 0) {
					local17 = local17 + local67.substring(local137 + 5, local82);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString148 = arg1;
		this.aThrowable2 = arg0;
	}
}
