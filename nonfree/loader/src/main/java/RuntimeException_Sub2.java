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

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public static int anInt7042;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	private String aString74;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method5900(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString74 = local5.aString74 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method5901(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString74 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(60) String local60 = local54.readLine();
			if (local60 == null) {
				return local6 + "| " + local57;
			}
			@Pc(68) int local68 = local60.indexOf(40);
			@Pc(75) int local75 = local60.indexOf(41, local68 + 1);
			@Pc(85) String local85;
			if (local68 == -1) {
				local85 = local60;
			} else {
				local85 = local60.substring(0, local68);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local6 = local6 + local85;
			if (local68 != -1 && local75 != -1) {
				@Pc(131) int local131 = local60.indexOf(".java:", local68);
				if (local131 >= 0) {
					local6 = local6 + local60.substring(local131 + 5, local75);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method5902(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method5904("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/applet/Applet;Ljava/lang/String;)V")
	public static void method5903(@OriginalArg(0) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method5901(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method5902(local1);
			local1 = method5904("%3a", local1, ":");
			local1 = method5904("%40", local1, "@");
			local1 = method5904("%26", local1, "&");
			local1 = method5904("%23", local1, "#");
			@Pc(84) URL local84 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt7042 + "&v1=" + Class231.aString80 + "&v2=" + Class231.aString79 + "&e=" + local1);
			@Pc(90) DataInputStream local90 = new DataInputStream(local84.openStream());
			local90.read();
			local90.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method5904(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg2); local5 != -1; local5 = arg1.indexOf(arg2, arg0.length() + local5)) {
			arg1 = arg1.substring(0, local5) + arg0 + arg1.substring(local5 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString74 = arg1;
		this.aThrowable2 = arg0;
	}
}
