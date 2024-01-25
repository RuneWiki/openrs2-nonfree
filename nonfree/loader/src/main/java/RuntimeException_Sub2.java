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

@OriginalClass("loader!e")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public static int anInt10301;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	private String aString117;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method8408(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method8410(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method8411(local1);
			local1 = method8409(":", local1, "%3a");
			local1 = method8409("@", local1, "%40");
			local1 = method8409("&", local1, "%26");
			local1 = method8409("#", local1, "%23");
			@Pc(89) URL local89 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt10301 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(102) DataInputStream local102 = new DataInputStream(local89.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8409(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg1.indexOf(arg0); local13 != -1; local13 = arg1.indexOf(arg0, local13 + arg2.length())) {
			arg1 = arg1.substring(0, local13) + arg2 + arg1.substring(local13 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method8410(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString117 + " | ";
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
			@Pc(68) String local68 = local55.readLine();
			if (local68 == null) {
				return local6 + "| " + local58;
			}
			@Pc(77) int local77 = local68.indexOf(40);
			@Pc(84) int local84 = local68.indexOf(41, local77 + 1);
			@Pc(90) String local90;
			if (local77 == -1) {
				local90 = local68;
			} else {
				local90 = local68.substring(0, local77);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local6 = local6 + local90;
			if (local77 != -1 && local84 != -1) {
				@Pc(137) int local137 = local68.indexOf(".java:", local77);
				if (local137 >= 0) {
					local6 = local6 + local68.substring(local137 + 5, local84);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method8411(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method8409("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method8412(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString117 = local8.aString117 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString117 = arg1;
		this.aThrowable2 = arg0;
	}
}
