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

@OriginalClass("loader!a")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public static int anInt10833;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString157;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method9181(@OriginalArg(1) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method9184(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method9185(local1);
			local1 = method9182(local1, "%3a", ":");
			local1 = method9182(local1, "%40", "@");
			local1 = method9182(local1, "%26", "&");
			local1 = method9182(local1, "%23", "#");
			@Pc(95) URL local95 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt10833 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(101) DataInputStream local101 = new DataInputStream(local95.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method9182(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg0.indexOf(arg2); local10 != -1; local10 = arg0.indexOf(arg2, arg1.length() + local10)) {
			arg0 = arg0.substring(0, local10) + arg1 + arg0.substring(local10 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method9183(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString157 = local8.aString157 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method9184(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString157 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
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
				return local17 + "| " + local58;
			}
			@Pc(67) int local67 = local61.indexOf(40);
			@Pc(74) int local74 = local61.indexOf(41, local67 + 1);
			@Pc(82) String local82;
			if (local67 == -1) {
				local82 = local61;
			} else {
				local82 = local61.substring(0, local67);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local17 = local17 + local82;
			if (local67 != -1 && local74 != -1) {
				@Pc(129) int local129 = local61.indexOf(".java:", local67);
				if (local129 >= 0) {
					local17 = local17 + local61.substring(local129 + 5, local74);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method9185(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method9182(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString157 = arg1;
	}
}
