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

@OriginalClass("loader!a")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public static int anInt3172;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method2028(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			local17 = local7.aString6 + " | ";
			arg0 = local7.aThrowable2;
		} else {
			local17 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local28);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local28.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			while (true) {
				@Pc(60) String local60 = local54.readLine();
				if (local60 == null) {
					return local17 + "| " + local57;
				}
				@Pc(66) int local66 = local60.indexOf(40);
				@Pc(73) int local73 = local60.indexOf(41, local66 + 1);
				if (local66 >= 0 && local73 >= 0) {
					@Pc(91) String local91 = local60.substring(local66 + 1, local73);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local17 = local17 + local91 + ' ';
						continue;
					}
					local60 = local60.substring(0, local66);
				}
				local60 = local60.trim();
				local60 = local60.substring(local60.lastIndexOf(32) + 1);
				local60 = local60.substring(local60.lastIndexOf(9) + 1);
				local17 = local17 + local60 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;BLjava/applet/Applet;)V")
	public static void method2030(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method2028(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(86) URL local86 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt3172 + "&v1=" + Class86.aString9 + "&v2=" + Class86.aString7 + "&e=" + local1);
			@Pc(92) DataInputStream local92 = new DataInputStream(local86.openStream());
			local92.read();
			local92.close();
		} catch (@Pc(107) Exception local107) {
		}
	}
}
