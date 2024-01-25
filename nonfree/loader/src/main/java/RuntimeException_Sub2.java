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
	public static int anInt6825;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5715(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method5719("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!g;")
	private static RuntimeException_Sub2 method5716(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString69 = local8.aString69 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method5717(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(16) RuntimeException_Sub2 local16 = (RuntimeException_Sub2) arg0;
			arg0 = local16.aThrowable2;
			local6 = local16.aString69 + " | ";
		} else {
			local6 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			@Pc(67) String local67 = local61.readLine();
			if (local67 == null) {
				return local6 + "| " + local64;
			}
			@Pc(76) int local76 = local67.indexOf(40);
			@Pc(83) int local83 = local67.indexOf(41, local76 + 1);
			@Pc(88) String local88;
			if (local76 == -1) {
				local88 = local67;
			} else {
				local88 = local67.substring(0, local76);
			}
			local88 = local88.trim();
			local88 = local88.substring(local88.lastIndexOf(32) + 1);
			local88 = local88.substring(local88.lastIndexOf(9) + 1);
			local6 = local6 + local88;
			if (local76 != -1 && local83 != -1) {
				@Pc(135) int local135 = local67.indexOf(".java:", local76);
				if (local135 >= 0) {
					local6 = local6 + local67.substring(local135 + 5, local83);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;I)V")
	public static void method5718(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method5717(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method5715(local1);
			local1 = method5719(":", "%3a", local1);
			local1 = method5719("@", "%40", local1);
			local1 = method5719("&", "%26", local1);
			local1 = method5719("#", "%23", local1);
			@Pc(95) URL local95 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt6825 + "&v1=" + Class223.aString77 + "&v2=" + Class223.aString76 + "&e=" + local1);
			@Pc(101) DataInputStream local101 = new DataInputStream(local95.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method5719(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(5) int local5 = arg2.indexOf(arg0); local5 != -1; local5 = arg2.indexOf(arg0, arg1.length() + local5)) {
			arg2 = arg2.substring(0, local5) + arg1 + arg2.substring(arg0.length() + local5);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString69 = arg1;
	}
}
