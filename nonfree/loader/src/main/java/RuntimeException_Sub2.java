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

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public static int anInt6091;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	private String aString209;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4775(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, arg1.length() + local5)) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(local5 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method4776(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString209 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
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
				return local6 + "| " + local62;
			}
			@Pc(74) int local74 = local65.indexOf(40);
			@Pc(81) int local81 = local65.indexOf(41, local74 + 1);
			@Pc(89) String local89;
			if (local74 == -1) {
				local89 = local65;
			} else {
				local89 = local65.substring(0, local74);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local6 = local6 + local89;
			if (local74 != -1 && local81 != -1) {
				@Pc(134) int local134 = local65.indexOf(".java:", local74);
				if (local134 >= 0) {
					local6 = local6 + local65.substring(local134 + 5, local81);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method4777(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method4776(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method4778(local1);
			local1 = method4775(local1, "%3a", ":");
			local1 = method4775(local1, "%40", "@");
			local1 = method4775(local1, "%26", "&");
			local1 = method4775(local1, "%23", "#");
			@Pc(89) URL local89 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt6091 + "&v1=" + Class200.aString213 + "&v2=" + Class200.aString216 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(102) Exception local102) {
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method4778(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method4775(arg0, "\n", "%0a"));
	}
}
