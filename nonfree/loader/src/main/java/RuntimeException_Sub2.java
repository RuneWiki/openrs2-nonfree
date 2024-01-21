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

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	public static int anInt3272;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method2268(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method2269(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg1;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(96) URL local96 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt3272 + "&v1=" + Class85.aString7 + "&v2=" + Class85.aString8 + "&e=" + local1);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method2269(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(22) String local22;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(12) RuntimeException_Sub2 local12 = (RuntimeException_Sub2) arg0;
			local22 = local12.aString6 + " | ";
			arg0 = local12.aThrowable2;
		} else {
			local22 = "";
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
					return local22 + "| " + local57;
				}
				@Pc(68) int local68 = local60.indexOf(40);
				@Pc(75) int local75 = local60.indexOf(41, local68 + 1);
				if (local68 >= 0 && local75 >= 0) {
					@Pc(88) String local88 = local60.substring(local68 + 1, local75);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local22 = local22 + local88 + ' ';
						continue;
					}
					local60 = local60.substring(0, local68);
				}
				local60 = local60.trim();
				local60 = local60.substring(local60.lastIndexOf(32) + 1);
				local60 = local60.substring(local60.lastIndexOf(9) + 1);
				local22 = local22 + local60 + ' ';
			}
		}
	}
}
