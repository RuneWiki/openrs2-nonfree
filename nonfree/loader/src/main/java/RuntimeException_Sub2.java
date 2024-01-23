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

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public static int anInt5567;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	private String aString196;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/lang/String;Ljava/applet/Applet;)V")
	public static void method4704(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method4707(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method4705(local1);
			local1 = method4706(local1, "%3a", ":");
			local1 = method4706(local1, "%40", "@");
			local1 = method4706(local1, "%26", "&");
			local1 = method4706(local1, "%23", "#");
			@Pc(96) URL local96 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt5567 + "&v1=" + Class211.aString208 + "&v2=" + Class211.aString207 + "&e=" + local1);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4705(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method4706(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4706(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, local5 + arg1.length())) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(arg2.length() + local5);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method4707(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			arg0 = local11.aThrowable2;
			local6 = local11.aString196 + " | ";
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local41));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local6 + "| " + local58;
			}
			@Pc(68) int local68 = local61.indexOf(40);
			@Pc(75) int local75 = local61.indexOf(41, local68 + 1);
			@Pc(83) String local83;
			if (local68 == -1) {
				local83 = local61;
			} else {
				local83 = local61.substring(0, local68);
			}
			local83 = local83.trim();
			local83 = local83.substring(local83.lastIndexOf(32) + 1);
			local83 = local83.substring(local83.lastIndexOf(9) + 1);
			local6 = local6 + local83;
			if (local68 != -1 && local75 != -1) {
				@Pc(127) int local127 = local61.indexOf(".java:", local68);
				if (local127 >= 0) {
					local6 = local6 + local61.substring(local127 + 5, local75);
				}
			}
			local6 = local6 + ' ';
		}
	}
}
