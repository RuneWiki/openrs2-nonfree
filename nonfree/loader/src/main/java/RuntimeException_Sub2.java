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

@OriginalClass("loader!d")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "I")
	public static int anInt5951;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/String;")
	private String aString195;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;BLjava/lang/Throwable;)V")
	public static void method4678(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method4679(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method4680(local1);
			local1 = method4681(":", local1, "%3a");
			local1 = method4681("@", local1, "%40");
			local1 = method4681("&", local1, "%26");
			local1 = method4681("#", local1, "%23");
			@Pc(85) URL local85 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt5951 + "&v1=" + Class202.aString205 + "&v2=" + Class202.aString206 + "&e=" + local1);
			@Pc(91) DataInputStream local91 = new DataInputStream(local85.openStream());
			local91.read();
			local91.close();
		} catch (@Pc(98) Exception local98) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method4679(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(26) String local26;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(13) RuntimeException_Sub2 local13 = (RuntimeException_Sub2) arg0;
			arg0 = local13.aThrowable2;
			local26 = local13.aString195 + " | ";
		} else {
			local26 = "";
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
				return local26 + "| " + local58;
			}
			@Pc(69) int local69 = local61.indexOf(40);
			@Pc(76) int local76 = local61.indexOf(41, local69 + 1);
			@Pc(85) String local85;
			if (local69 == -1) {
				local85 = local61;
			} else {
				local85 = local61.substring(0, local69);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local26 = local26 + local85;
			if (local69 != -1 && local76 != -1) {
				@Pc(132) int local132 = local61.indexOf(".java:", local69);
				if (local132 >= 0) {
					local26 = local26 + local61.substring(local132 + 5, local76);
				}
			}
			local26 = local26 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method4680(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method4681("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4681(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg0); local5 != -1; local5 = arg1.indexOf(arg0, local5 + arg2.length())) {
			arg1 = arg1.substring(0, local5) + arg2 + arg1.substring(arg0.length() + local5);
		}
		return arg1;
	}
}
