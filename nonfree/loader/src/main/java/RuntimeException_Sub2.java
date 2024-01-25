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
	public static int anInt9844;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString100;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;")
	private static String method8047(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg1); local5 != -1; local5 = arg0.indexOf(arg1, arg2.length() + local5)) {
			arg0 = arg0.substring(0, local5) + arg2 + arg0.substring(arg1.length() + local5);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!a;")
	private static RuntimeException_Sub2 method8048(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString100 = local8.aString100 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private static void method8049(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method8047(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method8050(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method8051(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method8049(local1);
			local1 = method8047(local1, ":", "%3a");
			local1 = method8047(local1, "@", "%40");
			local1 = method8047(local1, "&", "%26");
			local1 = method8047(local1, "#", "%23");
			@Pc(92) URL local92 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt9844 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(98) DataInputStream local98 = new DataInputStream(local92.openStream());
			local98.read();
			local98.close();
		} catch (@Pc(105) Exception local105) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method8051(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString100 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local47));
		@Pc(66) String local66 = local63.readLine();
		while (true) {
			@Pc(69) String local69 = local63.readLine();
			if (local69 == null) {
				return local17 + "| " + local66;
			}
			@Pc(75) int local75 = local69.indexOf(40);
			@Pc(82) int local82 = local69.indexOf(41, local75 + 1);
			@Pc(88) String local88;
			if (local75 == -1) {
				local88 = local69;
			} else {
				local88 = local69.substring(0, local75);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local17 = local17 + local88;
			if (local75 != -1 && local82 != -1) {
				@Pc(137) int local137 = local69.indexOf(".java:", local75);
				if (local137 >= 0) {
					local17 = local17 + local69.substring(local137 + 5, local82);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString100 = arg1;
	}
}
