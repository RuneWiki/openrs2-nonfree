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

@OriginalClass("loader!f")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public static int anInt9653;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	private String aString146;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method7753(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString146 + " | ";
		} else {
			local20 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(63) String local63 = local55.readLine();
		while (true) {
			@Pc(66) String local66 = local55.readLine();
			if (local66 == null) {
				return local20 + "| " + local63;
			}
			@Pc(75) int local75 = local66.indexOf(40);
			@Pc(82) int local82 = local66.indexOf(41, local75 + 1);
			@Pc(89) String local89;
			if (local75 == -1) {
				local89 = local66;
			} else {
				local89 = local66.substring(0, local75);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local20 = local20 + local89;
			if (local75 != -1 && local82 != -1) {
				@Pc(137) int local137 = local66.indexOf(".java:", local75);
				if (local137 >= 0) {
					local20 = local20 + local66.substring(local137 + 5, local82);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method7754(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString146 = local5.aString146 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method7755(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(12) int local12 = arg2.indexOf(arg0); local12 != -1; local12 = arg2.indexOf(arg0, arg1.length() + local12)) {
			arg2 = arg2.substring(0, local12) + arg1 + arg2.substring(local12 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/applet/Applet;Ljava/lang/String;)V")
	public static void method7756(@OriginalArg(0) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method7753(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method7757(local1);
			local1 = method7755(":", "%3a", local1);
			local1 = method7755("@", "%40", local1);
			local1 = method7755("&", "%26", local1);
			local1 = method7755("#", "%23", local1);
			@Pc(96) URL local96 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt9653 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7757(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method7755("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString146 = arg1;
	}
}
