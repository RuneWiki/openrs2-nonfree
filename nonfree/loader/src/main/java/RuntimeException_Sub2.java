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

@OriginalClass("loader!b")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	public static int anInt7798;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	private String aString89;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!b;")
	private static RuntimeException_Sub2 method6010(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString89 = local8.aString89 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6011(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6014(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/applet/Applet;Ljava/lang/String;)V")
	public static void method6012(@OriginalArg(0) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method6013(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method6011(local1);
			local1 = method6014(local1, "%3a", ":");
			local1 = method6014(local1, "%40", "@");
			local1 = method6014(local1, "%26", "&");
			local1 = method6014(local1, "%23", "#");
			@Pc(89) URL local89 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt7798 + "&v1=" + Class269.aString93 + "&v2=" + Class269.aString91 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(102) Exception local102) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	private static String method6013(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString89 + " | ";
		} else {
			local6 = "";
		}
		@Pc(43) StringWriter local43 = new StringWriter();
		@Pc(48) PrintWriter local48 = new PrintWriter(local43);
		arg0.printStackTrace(local48);
		local48.close();
		@Pc(56) String local56 = local43.toString();
		@Pc(64) BufferedReader local64 = new BufferedReader(new StringReader(local56));
		@Pc(67) String local67 = local64.readLine();
		while (true) {
			@Pc(70) String local70 = local64.readLine();
			if (local70 == null) {
				return local6 + "| " + local67;
			}
			@Pc(78) int local78 = local70.indexOf(40);
			@Pc(85) int local85 = local70.indexOf(41, local78 + 1);
			@Pc(93) String local93;
			if (local78 == -1) {
				local93 = local70;
			} else {
				local93 = local70.substring(0, local78);
			}
			local93 = local93.trim();
			local93 = local93.substring(local93.lastIndexOf(32) + 1);
			local93 = local93.substring(local93.lastIndexOf(9) + 1);
			local6 = local6 + local93;
			if (local78 != -1 && local85 != -1) {
				@Pc(138) int local138 = local70.indexOf(".java:", local78);
				if (local138 >= 0) {
					local6 = local6 + local70.substring(local138 + 5, local85);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method6014(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(13) int local13 = arg0.indexOf(arg2); local13 != -1; local13 = arg0.indexOf(arg2, local13 + arg1.length())) {
			arg0 = arg0.substring(0, local13) + arg1 + arg0.substring(arg2.length() + local13);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString89 = arg1;
	}
}
