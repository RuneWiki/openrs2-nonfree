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

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public static int anInt10899;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString123;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method9057(@OriginalArg(1) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(4) String local4 = "";
			if (arg0 != null) {
				local4 = method9059(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local4 = local4 + " | ";
				}
				local4 = local4 + arg2;
			}
			method9061(local4);
			local4 = method9058(local4, "%3a", ":");
			local4 = method9058(local4, "%40", "@");
			local4 = method9058(local4, "%26", "&");
			local4 = method9058(local4, "%23", "#");
			@Pc(91) URL local91 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt10899 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local4);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method9058(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, local5 + arg1.length())) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(arg2.length() + local5);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method9059(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(32) String local32;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(19) RuntimeException_Sub2 local19 = (RuntimeException_Sub2) arg0;
			arg0 = local19.aThrowable2;
			local32 = local19.aString123 + " | ";
		} else {
			local32 = "";
		}
		@Pc(46) StringWriter local46 = new StringWriter();
		@Pc(51) PrintWriter local51 = new PrintWriter(local46);
		arg0.printStackTrace(local51);
		local51.close();
		@Pc(59) String local59 = local46.toString();
		@Pc(67) BufferedReader local67 = new BufferedReader(new StringReader(local59));
		@Pc(70) String local70 = local67.readLine();
		while (true) {
			@Pc(73) String local73 = local67.readLine();
			if (local73 == null) {
				return local32 + "| " + local70;
			}
			@Pc(80) int local80 = local73.indexOf(40);
			@Pc(87) int local87 = local73.indexOf(41, local80 + 1);
			@Pc(93) String local93;
			if (local80 == -1) {
				local93 = local73;
			} else {
				local93 = local73.substring(0, local80);
			}
			local93 = local93.trim();
			local93 = local93.substring(local93.lastIndexOf(32) + 1);
			local93 = local93.substring(local93.lastIndexOf(9) + 1);
			local32 = local32 + local93;
			if (local80 != -1 && local87 != -1) {
				@Pc(139) int local139 = local73.indexOf(".java:", local80);
				if (local139 >= 0) {
					local32 = local32 + local73.substring(local139 + 5, local87);
				}
			}
			local32 = local32 + ' ';
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!b;")
	private static RuntimeException_Sub2 method9060(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString123 = local8.aString123 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method9061(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method9058(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString123 = arg1;
	}
}
