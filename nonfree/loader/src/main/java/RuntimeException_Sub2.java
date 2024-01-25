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

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "I")
	public static int anInt9779;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/String;")
	private String aString104;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	private static RuntimeException_Sub2 method7959(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString104 = local5.aString104 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7960(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method7963(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method7961(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(14) String local14;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(25) RuntimeException_Sub2 local25 = (RuntimeException_Sub2) arg0;
			arg0 = local25.aThrowable2;
			local14 = local25.aString104 + " | ";
		} else {
			local14 = "";
		}
		@Pc(42) StringWriter local42 = new StringWriter();
		@Pc(47) PrintWriter local47 = new PrintWriter(local42);
		arg0.printStackTrace(local47);
		local47.close();
		@Pc(55) String local55 = local42.toString();
		@Pc(63) BufferedReader local63 = new BufferedReader(new StringReader(local55));
		@Pc(66) String local66 = local63.readLine();
		while (true) {
			@Pc(69) String local69 = local63.readLine();
			if (local69 == null) {
				return local14 + "| " + local66;
			}
			@Pc(76) int local76 = local69.indexOf(40);
			@Pc(83) int local83 = local69.indexOf(41, local76 + 1);
			@Pc(92) String local92;
			if (local76 == -1) {
				local92 = local69;
			} else {
				local92 = local69.substring(0, local76);
			}
			local92 = local92.trim();
			local92 = local92.substring(local92.lastIndexOf(32) + 1);
			local92 = local92.substring(local92.lastIndexOf(9) + 1);
			local14 = local14 + local92;
			if (local76 != -1 && local83 != -1) {
				@Pc(137) int local137 = local69.indexOf(".java:", local76);
				if (local137 >= 0) {
					local14 = local14 + local69.substring(local137 + 5, local83);
				}
			}
			local14 = local14 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;)V")
	public static void method7962(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method7961(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method7960(local1);
			local1 = method7963(local1, ":", "%3a");
			local1 = method7963(local1, "@", "%40");
			local1 = method7963(local1, "&", "%26");
			local1 = method7963(local1, "#", "%23");
			@Pc(93) URL local93 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt9779 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(99) DataInputStream local99 = new DataInputStream(local93.openStream());
			local99.read();
			local99.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method7963(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg0.indexOf(arg1); local10 != -1; local10 = arg0.indexOf(arg1, local10 + arg2.length())) {
			arg0 = arg0.substring(0, local10) + arg2 + arg0.substring(arg1.length() + local10);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString104 = arg1;
	}
}
