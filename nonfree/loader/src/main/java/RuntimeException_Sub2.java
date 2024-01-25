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

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public static int anInt7276;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	private String aString72;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6001(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method6002("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method6002(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg2); local14 != -1; local14 = arg1.indexOf(arg2, local14 + arg0.length())) {
			arg1 = arg1.substring(0, local14) + arg0 + arg1.substring(arg2.length() + local14);
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method6003(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString72 = local8.aString72 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method6004(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method6005(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method6001(local1);
			local1 = method6002("%3a", local1, ":");
			local1 = method6002("%40", local1, "@");
			local1 = method6002("%26", local1, "&");
			local1 = method6002("%23", local1, "#");
			@Pc(85) URL local85 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt7276 + "&v1=" + Class272.aString76 + "&v2=" + Class272.aString79 + "&e=" + local1);
			@Pc(96) DataInputStream local96 = new DataInputStream(local85.openStream());
			local96.read();
			local96.close();
		} catch (@Pc(103) Exception local103) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method6005(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			local6 = local16.aString72 + " | ";
			arg0 = local16.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local46));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			@Pc(65) String local65 = local59.readLine();
			if (local65 == null) {
				return local6 + "| " + local62;
			}
			@Pc(72) int local72 = local65.indexOf(40);
			@Pc(79) int local79 = local65.indexOf(41, local72 + 1);
			@Pc(86) String local86;
			if (local72 == -1) {
				local86 = local65;
			} else {
				local86 = local65.substring(0, local72);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local6 = local6 + local86;
			if (local72 != -1 && local79 != -1) {
				@Pc(135) int local135 = local65.indexOf(".java:", local72);
				if (local135 >= 0) {
					local6 = local6 + local65.substring(local135 + 5, local79);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString72 = arg1;
		this.aThrowable2 = arg0;
	}
}
