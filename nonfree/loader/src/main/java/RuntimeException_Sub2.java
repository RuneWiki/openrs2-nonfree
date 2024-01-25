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

@OriginalClass("loader!h")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "I")
	public static int anInt6631;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/Throwable;")
	private final Throwable aThrowable2;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method5691(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(11) String local11;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(21) RuntimeException_Sub2 local21 = (RuntimeException_Sub2) arg0;
			local11 = local21.aString71 + " | ";
			arg0 = local21.aThrowable2;
		} else {
			local11 = "";
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
				return local11 + "| " + local62;
			}
			@Pc(73) int local73 = local65.indexOf(40);
			@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
			@Pc(90) String local90;
			if (local73 == -1) {
				local90 = local65;
			} else {
				local90 = local65.substring(0, local73);
			}
			local90 = local90.trim();
			local90 = local90.substring(local90.lastIndexOf(32) + 1);
			local90 = local90.substring(local90.lastIndexOf(9) + 1);
			local11 = local11 + local90;
			if (local73 != -1 && local80 != -1) {
				@Pc(135) int local135 = local65.indexOf(".java:", local73);
				if (local135 >= 0) {
					local11 = local11 + local65.substring(local135 + 5, local80);
				}
			}
			local11 = local11 + ' ';
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;I)V")
	public static void method5692(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method5691(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			method5694(local1);
			local1 = method5695(local1, ":", "%3a");
			local1 = method5695(local1, "@", "%40");
			local1 = method5695(local1, "&", "%26");
			local1 = method5695(local1, "#", "%23");
			@Pc(89) URL local89 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt6631 + "&v1=" + Class258.aString79 + "&v2=" + Class258.aString78 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(107) Exception local107) {
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lloader!h;")
	private static RuntimeException_Sub2 method5693(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(5) RuntimeException_Sub2 local5;
		if (arg0 instanceof RuntimeException_Sub2) {
			local5 = (RuntimeException_Sub2) arg0;
			local5.aString71 = local5.aString71 + ' ' + arg1;
		} else {
			local5 = new RuntimeException_Sub2(arg0, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(BLjava/lang/String;)V")
	private static void method5694(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + method5695(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	private static String method5695(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(10) int local10 = arg0.indexOf(arg1); local10 != -1; local10 = arg0.indexOf(arg1, arg2.length() + local10)) {
			arg0 = arg0.substring(0, local10) + arg2 + arg0.substring(local10 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	private RuntimeException_Sub2(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString71 = arg1;
		this.aThrowable2 = arg0;
	}
}
