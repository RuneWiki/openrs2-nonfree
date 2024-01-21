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
	public static int anInt2978;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method2013(@OriginalArg(0) Throwable arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method2015(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(86) URL local86 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt2978 + "&v1=" + Class87.aString7 + "&v2=" + Class87.aString8 + "&e=" + local1);
			@Pc(92) DataInputStream local92 = new DataInputStream(local86.openStream());
			local92.read();
			local92.close();
		} catch (@Pc(99) Exception local99) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method2015(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			local6 = local11.aString6 + " | ";
			arg0 = local11.aThrowable2;
		} else {
			local6 = "";
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
					return local6 + "| " + local52;
				}
				@Pc(63) int local63 = local55.indexOf(40);
				@Pc(70) int local70 = local55.indexOf(41, local63 + 1);
				if (local63 >= 0 && local70 >= 0) {
					@Pc(84) String local84 = local55.substring(local63 + 1, local70);
					@Pc(88) int local88 = local84.indexOf(".java:");
					if (local88 >= 0) {
						local84 = local84.substring(0, local88) + local84.substring(local88 + 5);
						local6 = local6 + local84 + ' ';
						continue;
					}
					local55 = local55.substring(0, local63);
				}
				local55 = local55.trim();
				local55 = local55.substring(local55.lastIndexOf(32) + 1);
				local55 = local55.substring(local55.lastIndexOf(9) + 1);
				local6 = local6 + local55 + ' ';
			}
		}
	}
}
