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

@OriginalClass("loader!b")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public static int anInt10302;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString109;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method8685(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			arg0 = local17.aThrowable2;
			local6 = local17.aString109 + " | ";
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local34);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local34.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			@Pc(66) String local66 = local60.readLine();
			if (local66 == null) {
				return local6 + "| " + local63;
			}
			@Pc(74) int local74 = local66.indexOf(40);
			@Pc(81) int local81 = local66.indexOf(41, local74 + 1);
			@Pc(89) String local89;
			if (local74 == -1) {
				local89 = local66;
			} else {
				local89 = local66.substring(0, local74);
			}
			local89 = local89.trim();
			local89 = local89.substring(local89.lastIndexOf(32) + 1);
			local89 = local89.substring(local89.lastIndexOf(9) + 1);
			local6 = local6 + local89;
			if (local74 != -1 && local81 != -1) {
				@Pc(133) int local133 = local66.indexOf(".java:", local74);
				if (local133 >= 0) {
					local6 = local6 + local66.substring(local133 + 5, local81);
				}
			}
			local6 = local6 + ' ';
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!b;")
	private static RuntimeException_Sub2 method8686(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString109 = local8.aString109 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/applet/Applet;I)V")
	public static void method8687(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(2) Applet arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg1 != null) {
				local6 = method8685(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg0;
			}
			method8689(local6);
			local6 = method8688(local6, ":", "%3a");
			local6 = method8688(local6, "@", "%40");
			local6 = method8688(local6, "&", "%26");
			local6 = method8688(local6, "#", "%23");
			@Pc(94) URL local94 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10302 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local6);
			@Pc(100) DataInputStream local100 = new DataInputStream(local94.openStream());
			local100.read();
			local100.close();
		} catch (@Pc(107) Exception local107) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8688(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(11) int local11 = arg0.indexOf(arg1); local11 != -1; local11 = arg0.indexOf(arg1, arg2.length() + local11)) {
			arg0 = arg0.substring(0, local11) + arg2 + arg0.substring(arg1.length() + local11);
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8689(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method8688(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString109 = arg1;
		this.aThrowable2 = arg0;
	}
}
