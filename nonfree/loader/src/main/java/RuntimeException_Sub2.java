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

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "I")
	public static int anInt6103;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	private String aString379;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method4875(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString379 + " | ";
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(60) String local60 = local54.readLine();
			if (local60 == null) {
				return local6 + "| " + local57;
			}
			@Pc(67) int local67 = local60.indexOf(40);
			@Pc(74) int local74 = local60.indexOf(41, local67 + 1);
			@Pc(80) String local80;
			if (local67 == -1) {
				local80 = local60;
			} else {
				local80 = local60.substring(0, local67);
			}
			local80 = local80.trim();
			local80 = local80.substring(local80.lastIndexOf(32) + 1);
			local80 = local80.substring(local80.lastIndexOf(9) + 1);
			local6 = local6 + local80;
			if (local67 != -1 && local74 != -1) {
				@Pc(129) int local129 = local60.indexOf(".java:", local67);
				if (local129 >= 0) {
					local6 = local6 + local60.substring(local129 + 5, local74);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method4876(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg0.indexOf(arg2); local5 != -1; local5 = arg0.indexOf(arg2, local5 + arg1.length())) {
			arg0 = arg0.substring(0, local5) + arg1 + arg0.substring(local5 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4877(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method4876(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/applet/Applet;Ljava/lang/String;)V")
	public static void method4878(@OriginalArg(0) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method4875(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			method4877(local1);
			local1 = method4876(local1, "%3a", ":");
			local1 = method4876(local1, "%40", "@");
			local1 = method4876(local1, "%26", "&");
			local1 = method4876(local1, "%23", "#");
			@Pc(90) URL local90 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt6103 + "&v1=" + Class200.aString384 + "&v2=" + Class200.aString385 + "&e=" + local1);
			@Pc(96) DataInputStream local96 = new DataInputStream(local90.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}
}
