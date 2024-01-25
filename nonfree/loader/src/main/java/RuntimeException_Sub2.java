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

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "I")
	public static int anInt6855;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method6066(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString69 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local46));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local6 + "| " + local62;
			}
			@Pc(74) int local74 = local65.indexOf(40);
			@Pc(81) int local81 = local65.indexOf(41, local74 + 1);
			@Pc(89) String local89;
			if (local74 == -1) {
				local89 = local65;
			} else {
				local89 = local65.substring(0, local74);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local6 = local6 + local89;
			if (local74 != -1 && local81 != -1) {
				@Pc(133) int local133 = local65.indexOf(".java:", local74);
				if (local133 >= 0) {
					local6 = local6 + local65.substring(local133 + 5, local81);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method6067(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString69 = local8.aString69 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;B)V")
	public static void method6068(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method6066(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method6069(local1);
			local1 = method6070("%3a", local1, ":");
			local1 = method6070("%40", local1, "@");
			local1 = method6070("%26", local1, "&");
			local1 = method6070("%23", local1, "#");
			@Pc(97) URL local97 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt6855 + "&v1=" + Class224.aString76 + "&v2=" + Class224.aString73 + "&e=" + local1);
			@Pc(103) DataInputStream local103 = new DataInputStream(local97.openStream());
			local103.read();
			local103.close();
		} catch (@Pc(110) Exception local110) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method6069(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method6070("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6070(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg2); local5 != -1; local5 = arg1.indexOf(arg2, local5 + arg0.length())) {
			arg1 = arg1.substring(0, local5) + arg0 + arg1.substring(local5 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString69 = arg1;
		this.aThrowable2 = arg0;
	}
}
