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
	public static int anInt2698;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1677(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(3) String local3 = "";
			if (arg2 != null) {
				local3 = method1678(arg2);
			}
			if (arg1 != null) {
				if (arg2 != null) {
					local3 = local3 + " | ";
				}
				local3 = local3 + arg1;
			}
			System.out.println("Error: " + local3);
			local3 = local3.replace(':', '.');
			local3 = local3.replace('@', '_');
			local3 = local3.replace('&', '_');
			local3 = local3.replace('#', '_');
			@Pc(93) URL local93 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt2698 + "&v1=" + Class68.aString14 + "&v2=" + Class68.aString15 + "&e=" + local3);
			@Pc(99) DataInputStream local99 = new DataInputStream(local93.openStream());
			local99.read();
			local99.close();
		} catch (@Pc(111) Exception local111) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	private static String method1678(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			local6 = local11.aString9 + " | ";
			arg0 = local11.aThrowable2;
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
			while (true) {
				@Pc(60) String local60 = local54.readLine();
				if (local60 == null) {
					return local6 + "| " + local57;
				}
				@Pc(68) int local68 = local60.indexOf(40);
				@Pc(75) int local75 = local60.indexOf(41, local68 + 1);
				if (local68 >= 0 && local75 >= 0) {
					@Pc(89) String local89 = local60.substring(local68 + 1, local75);
					@Pc(93) int local93 = local89.indexOf(".java:");
					if (local93 >= 0) {
						local89 = local89.substring(0, local93) + local89.substring(local93 + 5);
						local6 = local6 + local89 + ' ';
						continue;
					}
					local60 = local60.substring(0, local68);
				}
				local60 = local60.trim();
				local60 = local60.substring(local60.lastIndexOf(32) + 1);
				local60 = local60.substring(local60.lastIndexOf(9) + 1);
				local6 = local6 + local60 + ' ';
			}
		}
	}
}
