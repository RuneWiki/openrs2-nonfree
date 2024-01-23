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

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	public static int anInt5740;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	private String aString214;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	private static String method4666(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(13) int local13 = arg1.indexOf(arg0); local13 != -1; local13 = arg1.indexOf(arg0, arg2.length() + local13)) {
			arg1 = arg1.substring(0, local13) + arg2 + arg1.substring(arg0.length() + local13);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method4668(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg2 != null) {
				local6 = method4669(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg0;
			}
			method4670(local6);
			local6 = method4666(":", local6, "%3a");
			local6 = method4666("@", local6, "%40");
			local6 = method4666("&", local6, "%26");
			local6 = method4666("#", local6, "%23");
			@Pc(91) URL local91 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt5740 + "&v1=" + Class206.aString210 + "&v2=" + Class206.aString211 + "&e=" + local6);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method4669(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(32) String local32;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(19) RuntimeException_Sub2 local19 = (RuntimeException_Sub2) arg0;
			arg0 = local19.aThrowable2;
			local32 = local19.aString214 + " | ";
		} else {
			local32 = "";
		}
		@Pc(45) StringWriter local45 = new StringWriter();
		@Pc(50) PrintWriter local50 = new PrintWriter(local45);
		arg0.printStackTrace(local50);
		local50.close();
		@Pc(58) String local58 = local45.toString();
		@Pc(66) BufferedReader local66 = new BufferedReader(new StringReader(local58));
		@Pc(69) String local69 = local66.readLine();
		while (true) {
			@Pc(72) String local72 = local66.readLine();
			if (local72 == null) {
				return local32 + "| " + local69;
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
			local32 = local32 + local91;
			if (local78 != -1 && local85 != -1) {
				@Pc(141) int local141 = local72.indexOf(".java:", local78);
				if (local141 >= 0) {
					local32 = local32 + local72.substring(local141 + 5, local85);
				}
			}
			local32 = local32 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method4670(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method4666("%0a", arg0, "\n"));
	}
}
