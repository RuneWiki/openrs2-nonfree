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
	public static int anInt9498;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;Ljava/applet/Applet;)V")
	public static void method7836(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method7840(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			method7838(local1);
			local1 = method7839("%3a", ":", local1);
			local1 = method7839("%40", "@", local1);
			local1 = method7839("%26", "&", local1);
			local1 = method7839("%23", "#", local1);
			@Pc(99) URL local99 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt9498 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(105) DataInputStream local105 = new DataInputStream(local99.openStream());
			local105.read();
			local105.close();
		} catch (@Pc(112) Exception local112) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method7837(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString88 = local8.aString88 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method7838(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method7839("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method7839(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg1); local5 != -1; local5 = arg2.indexOf(arg1, local5 + arg0.length())) {
			arg2 = arg2.substring(0, local5) + arg0 + arg2.substring(arg1.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method7840(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(22) String local22;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(12) RuntimeException_Sub2 local12 = (RuntimeException_Sub2) arg0;
			local22 = local12.aString88 + " | ";
			arg0 = local12.aThrowable2;
		} else {
			local22 = "";
		}
		@Pc(39) StringWriter local39 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local39);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local39.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local22 + "| " + local63;
			}
			@Pc(72) int local72 = local66.indexOf(40);
			@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
			@Pc(86) String local86;
			if (local72 == -1) {
				local86 = local66;
			} else {
				local86 = local66.substring(0, local72);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local22 = local22 + local86;
			if (local72 != -1 && local79 != -1) {
				@Pc(133) int local133 = local66.indexOf(".java:", local72);
				if (local133 >= 0) {
					local22 = local22 + local66.substring(local133 + 5, local79);
				}
			}
			local22 = local22 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString88 = arg1;
	}
}
