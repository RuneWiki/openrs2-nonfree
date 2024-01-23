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
	public static int anInt5878;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/String;")
	private String aString204;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method4730(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method4733(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method4732(local1);
			local1 = method4731(local1, ":", "%3a");
			local1 = method4731(local1, "@", "%40");
			local1 = method4731(local1, "&", "%26");
			local1 = method4731(local1, "#", "%23");
			@Pc(89) URL local89 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt5878 + "&v1=" + Class196.aString213 + "&v2=" + Class196.aString212 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(102) Exception local102) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method4731(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(12) int local12 = arg0.indexOf(arg1); local12 != -1; local12 = arg0.indexOf(arg1, local12 + arg2.length())) {
			arg0 = arg0.substring(0, local12) + arg2 + arg0.substring(arg1.length() + local12);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private static void method4732(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method4731(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method4733(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString204 + " | ";
		} else {
			local6 = "";
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
				return local6 + "| " + local62;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(87) String local87;
			if (local73 == -1) {
				local87 = local65;
			} else {
				local87 = local65.substring(0, local73);
			}
			local87 = local87.trim();
			local87 = local87.substring(local87.lastIndexOf(32) + 1);
			local87 = local87.substring(local87.lastIndexOf(9) + 1);
			local6 = local6 + local87;
			if (local73 != -1 && local80 != -1) {
				@Pc(137) int local137 = local65.indexOf(".java:", local73);
				if (local137 >= 0) {
					local6 = local6 + local65.substring(local137 + 5, local80);
				}
			}
			local6 = local6 + ' ';
		}
	}
}
