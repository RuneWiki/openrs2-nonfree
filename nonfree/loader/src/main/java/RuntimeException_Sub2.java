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

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	public static int anInt3002;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method2082(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			local6 = local11.aString9 + " | ";
			arg0 = local11.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(46) String local46 = local28.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			while (true) {
				@Pc(60) String local60 = local54.readLine();
				if (local60 == null) {
					return local6 + "| " + local57;
				}
				@Pc(66) int local66 = local60.indexOf(40);
				@Pc(73) int local73 = local60.indexOf(41, local66 + 1);
				if (local66 >= 0 && local73 >= 0) {
					@Pc(88) String local88 = local60.substring(local66 + 1, local73);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local6 = local6 + local88 + ' ';
						continue;
					}
					local60 = local60.substring(0, local66);
				}
				local60 = local60.trim();
				local60 = local60.substring(local60.lastIndexOf(32) + 1);
				local60 = local60.substring(local60.lastIndexOf(9) + 1);
				local6 = local6 + local60 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/applet/Applet;ILjava/lang/String;)V")
	public static void method2084(@OriginalArg(0) Throwable arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg0 != null) {
				local6 = method2082(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg2;
			}
			System.out.println("Error: " + local6);
			local6 = local6.replace(':', '.');
			local6 = local6.replace('@', '_');
			local6 = local6.replace('&', '_');
			local6 = local6.replace('#', '_');
			@Pc(93) URL local93 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt3002 + "&v1=" + Class71.aString13 + "&v2=" + Class71.aString15 + "&e=" + local6);
			@Pc(99) DataInputStream local99 = new DataInputStream(local93.openStream());
			local99.read();
			local99.close();
		} catch (@Pc(106) Exception local106) {
		}
	}
}
