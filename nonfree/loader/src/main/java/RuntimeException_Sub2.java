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
	public static int anInt4292;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method3214(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			arg0 = local11.aThrowable2;
			local6 = local11.aString6 + " | ";
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
				@Pc(61) int local61 = local55.indexOf(40);
				@Pc(68) int local68 = local55.indexOf(41, local61 + 1);
				if (local61 >= 0 && local68 >= 0) {
					@Pc(82) String local82 = local55.substring(local61 + 1, local68);
					@Pc(86) int local86 = local82.indexOf(".java:");
					if (local86 >= 0) {
						local82 = local82.substring(0, local86) + local82.substring(local86 + 5);
						local6 = local6 + local82 + ' ';
						continue;
					}
					local55 = local55.substring(0, local61);
				}
				local55 = local55.trim();
				local55 = local55.substring(local55.lastIndexOf(32) + 1);
				local55 = local55.substring(local55.lastIndexOf(9) + 1);
				local6 = local6 + local55 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/applet/Applet;ILjava/lang/String;)V")
	public static void method3215(@OriginalArg(0) Throwable arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method3214(arg0);
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
			@Pc(99) URL local99 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt4292 + "&v1=" + Class93.aString7 + "&v2=" + Class93.aString9 + "&e=" + local1);
			@Pc(105) DataInputStream local105 = new DataInputStream(local99.openStream());
			local105.read();
			local105.close();
		} catch (@Pc(112) Exception local112) {
		}
	}
}
