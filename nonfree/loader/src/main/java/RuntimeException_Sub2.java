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

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	public static int anInt5637;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString221;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method4685(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method4689(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method4686(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString221 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local28);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local28.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local20 + "| " + local58;
			}
			@Pc(69) int local69 = local61.indexOf(40);
			@Pc(76) int local76 = local61.indexOf(41, local69 + 1);
			@Pc(84) String local84;
			if (local69 == -1) {
				local84 = local61;
			} else {
				local84 = local61.substring(0, local69);
			}
			local84 = local84.trim();
			local84 = local84.substring(local84.lastIndexOf(32) + 1);
			local84 = local84.substring(local84.lastIndexOf(9) + 1);
			local20 = local20 + local84;
			if (local69 != -1 && local76 != -1) {
				@Pc(128) int local128 = local61.indexOf(".java:", local69);
				if (local128 >= 0) {
					local20 = local20 + local61.substring(local128 + 5, local76);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;BLjava/applet/Applet;)V")
	public static void method4687(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method4686(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method4685(local1);
			local1 = method4689(local1, "%3a", ":");
			local1 = method4689(local1, "%40", "@");
			local1 = method4689(local1, "%26", "&");
			local1 = method4689(local1, "%23", "#");
			@Pc(98) URL local98 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt5637 + "&v1=" + Class201.aString231 + "&v2=" + Class201.aString228 + "&e=" + local1);
			@Pc(104) DataInputStream local104 = new DataInputStream(local98.openStream());
			local104.read();
			local104.close();
		} catch (@Pc(111) Exception local111) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method4689(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, local5 + arg1.length())) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(local5 + arg2.length());
		}
		return arg0;
	}
}
