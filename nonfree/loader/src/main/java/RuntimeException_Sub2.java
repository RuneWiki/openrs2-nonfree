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

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	public static int anInt10641;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	private String aString130;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method9014(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg2); local5 != -1; local5 = arg1.indexOf(arg2, arg0.length() + local5)) {
			arg1 = arg1.substring(0, local5) + arg0 + arg1.substring(local5 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method9015(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method9017(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method9018(local1);
			local1 = method9014("%3a", local1, ":");
			local1 = method9014("%40", local1, "@");
			local1 = method9014("%26", local1, "&");
			local1 = method9014("%23", local1, "#");
			@Pc(99) URL local99 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt10641 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(105) DataInputStream local105 = new DataInputStream(local99.openStream());
			local105.read();
			local105.close();
		} catch (@Pc(112) Exception local112) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!g;")
	private static RuntimeException_Sub2 method9016(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString130 = local8.aString130 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method9017(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			arg0 = local17.aThrowable2;
			local6 = local17.aString130 + " | ";
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
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local6 + "| " + local58;
			}
			@Pc(68) int local68 = local61.indexOf(40);
			@Pc(75) int local75 = local61.indexOf(41, local68 + 1);
			@Pc(83) String local83;
			if (local68 == -1) {
				local83 = local61;
			} else {
				local83 = local61.substring(0, local68);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local6 = local6 + local83;
			if (local68 != -1 && local75 != -1) {
				@Pc(128) int local128 = local61.indexOf(".java:", local68);
				if (local128 >= 0) {
					local6 = local6 + local61.substring(local128 + 5, local75);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method9018(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method9014("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString130 = arg1;
	}
}
