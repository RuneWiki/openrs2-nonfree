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

@OriginalClass("loader!c")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "I")
	public static int anInt7057;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	private String aString67;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method6088(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg2); local9 != -1; local9 = arg1.indexOf(arg2, arg0.length() + local9)) {
			arg1 = arg1.substring(0, local9) + arg0 + arg1.substring(arg2.length() + local9);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	private static RuntimeException_Sub2 method6089(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString67 = local5.aString67 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method6090(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString67 + " | ";
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
			@Pc(68) String local68 = local54.readLine();
			if (local68 == null) {
				return local6 + "| " + local57;
			}
			@Pc(77) int local77 = local68.indexOf(40);
			@Pc(84) int local84 = local68.indexOf(41, local77 + 1);
			@Pc(89) String local89;
			if (local77 == -1) {
				local89 = local68;
			} else {
				local89 = local68.substring(0, local77);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local6 = local6 + local89;
			if (local77 != -1 && local84 != -1) {
				@Pc(137) int local137 = local68.indexOf(".java:", local77);
				if (local137 >= 0) {
					local6 = local6 + local68.substring(local137 + 5, local84);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6091(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6088("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method6092(@OriginalArg(0) Applet arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method6090(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method6091(local1);
			local1 = method6088("%3a", local1, ":");
			local1 = method6088("%40", local1, "@");
			local1 = method6088("%26", local1, "&");
			local1 = method6088("%23", local1, "#");
			@Pc(93) URL local93 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt7057 + "&v1=" + Class228.aString73 + "&v2=" + Class228.aString70 + "&e=" + local1);
			@Pc(99) DataInputStream local99 = new DataInputStream(local93.openStream());
			local99.read();
			local99.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString67 = arg1;
	}
}
