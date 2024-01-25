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
	public static int anInt7145;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method6145(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString65 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(58) String local58 = local33.toString();
		@Pc(66) BufferedReader local66 = new BufferedReader(new StringReader(local58));
		@Pc(69) String local69 = local66.readLine();
		while (true) {
			@Pc(72) String local72 = local66.readLine();
			if (local72 == null) {
				return local6 + "| " + local69;
			}
			@Pc(78) int local78 = local72.indexOf(40);
			@Pc(85) int local85 = local72.indexOf(41, local78 + 1);
			@Pc(91) String local91;
			if (local78 == -1) {
				local91 = local72;
			} else {
				local91 = local72.substring(0, local78);
			}
			local91 = local91.trim();
			local91 = local91.substring(local91.lastIndexOf(32) + 1);
			local91 = local91.substring(local91.lastIndexOf(9) + 1);
			local6 = local6 + local91;
			if (local78 != -1 && local85 != -1) {
				@Pc(139) int local139 = local72.indexOf(".java:", local78);
				if (local139 >= 0) {
					local6 = local6 + local72.substring(local139 + 5, local85);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private static void method6146(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method6149(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;Ljava/applet/Applet;)V")
	public static void method6147(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(9) String local9 = "";
			if (arg0 != null) {
				local9 = method6145(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local9 = local9 + " | ";
				}
				local9 = local9 + arg1;
			}
			method6146(local9);
			local9 = method6149(local9, "%3a", ":");
			local9 = method6149(local9, "%40", "@");
			local9 = method6149(local9, "%26", "&");
			local9 = method6149(local9, "%23", "#");
			@Pc(93) URL local93 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt7145 + "&v1=" + Class258.aString69 + "&v2=" + Class258.aString75 + "&e=" + local9);
			@Pc(99) DataInputStream local99 = new DataInputStream(local93.openStream());
			local99.read();
			local99.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	private static RuntimeException_Sub2 method6148(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString65 = local5.aString65 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6149(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg0.indexOf(arg2); local10 != -1; local10 = arg0.indexOf(arg2, arg1.length() + local10)) {
			arg0 = arg0.substring(0, local10) + arg1 + arg0.substring(local10 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString65 = arg1;
	}
}
