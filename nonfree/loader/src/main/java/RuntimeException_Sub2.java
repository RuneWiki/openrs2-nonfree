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

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	public static int anInt10514;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	private String aString161;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8927(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + method8931("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method8928(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString161 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
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
				return local17 + "| " + local58;
			}
			@Pc(69) int local69 = local61.indexOf(40);
			@Pc(76) int local76 = local61.indexOf(41, local69 + 1);
			@Pc(81) String local81;
			if (local69 == -1) {
				local81 = local61;
			} else {
				local81 = local61.substring(0, local69);
			}
			local81 = local81.trim();
			local81 = local81.substring(local81.lastIndexOf(32) + 1);
			local81 = local81.substring(local81.lastIndexOf(9) + 1);
			local17 = local17 + local81;
			if (local69 != -1 && local76 != -1) {
				@Pc(129) int local129 = local61.indexOf(".java:", local69);
				if (local129 >= 0) {
					local17 = local17 + local61.substring(local129 + 5, local76);
				}
			}
			local17 = local17 + ' ';
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;ILjava/applet/Applet;)V")
	public static void method8929(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method8928(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method8927(local1);
			local1 = method8931("%3a", local1, ":");
			local1 = method8931("%40", local1, "@");
			local1 = method8931("%26", local1, "&");
			local1 = method8931("%23", local1, "#");
			@Pc(91) URL local91 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt10514 + "&v1=" + System.getProperty("java.vendor") + "&v2=" + System.getProperty("java.version") + "&e=" + local1);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!g;")
	private static RuntimeException_Sub2 method8930(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub2 local8;
		if (arg0 instanceof RuntimeException_Sub2) {
			local8 = (RuntimeException_Sub2) arg0;
			local8.aString161 = local8.aString161 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	private static String method8931(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg1.indexOf(arg2); local10 != -1; local10 = arg1.indexOf(arg2, local10 + arg0.length())) {
			arg1 = arg1.substring(0, local10) + arg0 + arg1.substring(local10 + arg2.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString161 = arg1;
	}
}
