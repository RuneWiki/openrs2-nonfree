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

@OriginalClass("loader!g")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	public static int anInt6232;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/String;")
	private String aString306;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;)V")
	public static void method5261(@OriginalArg(1) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method5265(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method5264(local1);
			local1 = method5262(":", "%3a", local1);
			local1 = method5262("@", "%40", local1);
			local1 = method5262("&", "%26", local1);
			local1 = method5262("#", "%23", local1);
			@Pc(91) URL local91 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt6232 + "&v1=" + Class211.aString313 + "&v2=" + Class211.aString311 + "&e=" + local1);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method5262(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, arg1.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(local5 + arg0.length());
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method5264(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5262("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method5265(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString306 + " | ";
		} else {
			local20 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(51) String local51 = local33.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local20 + "| " + local62;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(88) String local88;
			if (local73 == -1) {
				local88 = local65;
			} else {
				local88 = local65.substring(0, local73);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local20 = local20 + local88;
			if (local73 != -1 && local80 != -1) {
				@Pc(132) int local132 = local65.indexOf(".java:", local73);
				if (local132 >= 0) {
					local20 = local20 + local65.substring(local132 + 5, local80);
				}
			}
			local20 = local20 + ' ';
		}
	}
}
