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
	public static int anInt11315;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/String;")
	private String aString137;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	private static String method9453(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(5) int local5 = arg1.indexOf(arg0); local5 != -1; local5 = arg1.indexOf(arg0, local5 + arg2.length())) {
			arg1 = arg1.substring(0, local5) + arg2 + arg1.substring(arg0.length() + local5);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method9454(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method9453("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method9455(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString137 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(38) StringWriter local38 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local38);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local38.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local17 + "| " + local62;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(85) String local85;
			if (local73 == -1) {
				local85 = local65;
			} else {
				local85 = local65.substring(0, local73);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local17 = local17 + local85;
			if (local73 != -1 && local80 != -1) {
				@Pc(133) int local133 = local65.indexOf(".java:", local73);
				if (local133 >= 0) {
					local17 = local17 + local65.substring(local133 + 5, local80);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;)V")
	public static void method9456(@OriginalArg(1) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method9455(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method9454(local1);
			local1 = method9453(":", local1, "%3a");
			local1 = method9453("@", local1, "%40");
			local1 = method9453("&", local1, "%26");
			local1 = method9453("#", local1, "%23");
			@Pc(89) URL local89 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt11315 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(106) Exception local106) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!c;")
	private static RuntimeException_Sub2 method9457(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString137 = local8.aString137 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString137 = arg1;
		this.aThrowable2 = arg0;
	}
}
