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

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "I")
	public static int anInt2861;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method1881(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString9 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(41) String local41 = local28.toString();
		@Pc(49) BufferedReader local49 = new BufferedReader(new StringReader(local41));
		@Pc(52) String local52 = local49.readLine();
		while (true) {
			while (true) {
				@Pc(55) String local55 = local49.readLine();
				if (local55 == null) {
					return local20 + "| " + local52;
				}
				@Pc(64) int local64 = local55.indexOf(40);
				@Pc(71) int local71 = local55.indexOf(41, local64 + 1);
				if (local64 >= 0 && local71 >= 0) {
					@Pc(88) String local88 = local55.substring(local64 + 1, local71);
					@Pc(92) int local92 = local88.indexOf(".java:");
					if (local92 >= 0) {
						local88 = local88.substring(0, local92) + local88.substring(local92 + 5);
						local20 = local20 + local88 + ' ';
						continue;
					}
					local55 = local55.substring(0, local64);
				}
				local55 = local55.trim();
				local55 = local55.substring(local55.lastIndexOf(32) + 1);
				local55 = local55.substring(local55.lastIndexOf(9) + 1);
				local20 = local20 + local55 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method1882(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method1881(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(89) URL local89 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt2861 + "&v1=" + Class68.aString10 + "&v2=" + Class68.aString14 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(102) Exception local102) {
		}
	}
}
