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
	public static int anInt10769;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString121;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/applet/Applet;I)V")
	public static void method9045(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method9048(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method9047(local1);
			local1 = method9046(local1, "%3a", ":");
			local1 = method9046(local1, "%40", "@");
			local1 = method9046(local1, "%26", "&");
			local1 = method9046(local1, "%23", "#");
			@Pc(91) URL local91 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10769 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method9046(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg0.indexOf(arg2); local10 != -1; local10 = arg0.indexOf(arg2, arg1.length() + local10)) {
			arg0 = arg0.substring(0, local10) + arg1 + arg0.substring(arg2.length() + local10);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method9047(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method9046(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method9048(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString121 + " | ";
		} else {
			local20 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(52) String local52 = local34.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local20 + "| " + local63;
			}
			@Pc(75) int local75 = local66.indexOf(40);
			@Pc(82) int local82 = local66.indexOf(41, local75 + 1);
			@Pc(92) String local92;
			if (local75 == -1) {
				local92 = local66;
			} else {
				local92 = local66.substring(0, local75);
			}
			local92 = local92.trim();
			local92 = local92.substring(local92.lastIndexOf(32) + 1);
			local92 = local92.substring(local92.lastIndexOf(9) + 1);
			local20 = local20 + local92;
			if (local75 != -1 && local82 != -1) {
				@Pc(138) int local138 = local66.indexOf(".java:", local75);
				if (local138 >= 0) {
					local20 = local20 + local66.substring(local138 + 5, local82);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!b;")
	private static RuntimeException_Sub2 method9049(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString121 = local8.aString121 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString121 = arg1;
	}
}
