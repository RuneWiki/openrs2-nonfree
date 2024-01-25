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

@OriginalClass("loader!h")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "I")
	public static int anInt11101;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/lang/String;")
	private String aString133;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method9264(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString133 = local5.aString133 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method9265(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString133 + " | ";
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
			@Pc(68) int local68 = local61.indexOf(40);
			@Pc(75) int local75 = local61.indexOf(41, local68 + 1);
			@Pc(81) String local81;
			if (local68 == -1) {
				local81 = local61;
			} else {
				local81 = local61.substring(0, local68);
			}
			local81 = local81.trim();
			local81 = local81.substring(local81.lastIndexOf(32) + 1);
			local81 = local81.substring(local81.lastIndexOf(9) + 1);
			local17 = local17 + local81;
			if (local68 != -1 && local75 != -1) {
				@Pc(128) int local128 = local61.indexOf(".java:", local68);
				if (local128 >= 0) {
					local17 = local17 + local61.substring(local128 + 5, local75);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method9266(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method9267(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method9267(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, local5 + arg1.length())) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(local5 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method9268(@OriginalArg(0) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method9265(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method9266(local1);
			local1 = method9267(local1, "%3a", ":");
			local1 = method9267(local1, "%40", "@");
			local1 = method9267(local1, "%26", "&");
			local1 = method9267(local1, "%23", "#");
			@Pc(98) URL local98 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt11101 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(104) DataInputStream local104 = new DataInputStream(local98.openStream());
			local104.read();
			local104.close();
		} catch (@Pc(111) Exception local111) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString133 = arg1;
		this.aThrowable2 = arg0;
	}
}
