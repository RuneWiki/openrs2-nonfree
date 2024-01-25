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

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public static int anInt11220;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	private String aString127;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(ILjava/lang/String;)V")
	private static void method9524(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method9528("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method9525(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString127 + " | ";
		} else {
			local20 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			@Pc(61) String local61 = local55.readLine();
			if (local61 == null) {
				return local20 + "| " + local58;
			}
			@Pc(70) int local70 = local61.indexOf(40);
			@Pc(77) int local77 = local61.indexOf(41, local70 + 1);
			@Pc(82) String local82;
			if (local70 == -1) {
				local82 = local61;
			} else {
				local82 = local61.substring(0, local70);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local20 = local20 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(129) int local129 = local61.indexOf(".java:", local70);
				if (local129 >= 0) {
					local20 = local20 + local61.substring(local129 + 5, local77);
				}
			}
			local20 = local20 + ' ';
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!f;")
	private static RuntimeException_Sub2 method9526(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString127 = local5.aString127 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method9527(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method9525(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method9524(local1);
			local1 = method9528("%3a", ":", local1);
			local1 = method9528("%40", "@", local1);
			local1 = method9528("%26", "&", local1);
			local1 = method9528("%23", "#", local1);
			@Pc(89) URL local89 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt11220 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(113) Exception local113) {
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	private static String method9528(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(10) int local10 = arg2.indexOf(arg1); local10 != -1; local10 = arg2.indexOf(arg1, local10 + arg0.length())) {
			arg2 = arg2.substring(0, local10) + arg0 + arg2.substring(arg1.length() + local10);
		}
		return arg2;
	}

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString127 = arg1;
	}
}
