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

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public static int anInt7553;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	private String aString79;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method6081(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method6085(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method6083(local1);
			local1 = method6082(local1, ":", "%3a");
			local1 = method6082(local1, "@", "%40");
			local1 = method6082(local1, "&", "%26");
			local1 = method6082(local1, "#", "%23");
			@Pc(85) URL local85 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt7553 + "&v1=" + Class276.aString87 + "&v2=" + Class276.aString81 + "&e=" + local1);
			@Pc(91) DataInputStream local91 = new DataInputStream(local85.openStream());
			local91.read();
			local91.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
	private static String method6082(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg1); local5 != -1; local5 = arg0.indexOf(arg1, local5 + arg2.length())) {
			arg0 = arg0.substring(0, local5) + arg2 + arg0.substring(local5 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method6083(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6082(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!e;")
	private static RuntimeException_Sub2 method6084(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString79 = local5.aString79 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method6085(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(25) RuntimeException_Sub2 local25 = (RuntimeException_Sub2) arg0;
			arg0 = local25.aThrowable2;
			local15 = local25.aString79 + " | ";
		} else {
			local15 = "";
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
				return local15 + "| " + local66;
			}
			@Pc(76) int local76 = local69.indexOf(40);
			@Pc(83) int local83 = local69.indexOf(41, local76 + 1);
			@Pc(88) String local88;
			if (local76 == -1) {
				local88 = local69;
			} else {
				local88 = local69.substring(0, local76);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local15 = local15 + local88;
			if (local76 != -1 && local83 != -1) {
				@Pc(136) int local136 = local69.indexOf(".java:", local76);
				if (local136 >= 0) {
					local15 = local15 + local69.substring(local136 + 5, local83);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString79 = arg1;
	}
}
