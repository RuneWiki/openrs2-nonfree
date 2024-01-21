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
	public static int anInt4518;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/Throwable;Ljava/lang/String;)V")
	public static void method3425(@OriginalArg(1) Applet arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method3426(arg1);
			}
			if (arg2 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg2;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(95) URL local95 = new URL(arg0.getCodeBase(), "loadererror.ws?c=" + anInt4518 + "&v1=" + Class101.aString10 + "&v2=" + Class101.aString8 + "&e=" + local1);
			@Pc(101) DataInputStream local101 = new DataInputStream(local95.openStream());
			local101.read();
			local101.close();
		} catch (@Pc(108) Exception local108) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method3426(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			arg0 = local17.aThrowable2;
			local6 = local17.aString7 + " | ";
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local47));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			while (true) {
				@Pc(66) String local66 = local60.readLine();
				if (local66 == null) {
					return local6 + "| " + local63;
				}
				@Pc(72) int local72 = local66.indexOf(40);
				@Pc(79) int local79 = local66.indexOf(41, local72 + 1);
				if (local72 >= 0 && local79 >= 0) {
					@Pc(92) String local92 = local66.substring(local72 + 1, local79);
					@Pc(96) int local96 = local92.indexOf(".java:");
					if (local96 >= 0) {
						local92 = local92.substring(0, local96) + local92.substring(local96 + 5);
						local6 = local6 + local92 + ' ';
						continue;
					}
					local66 = local66.substring(0, local72);
				}
				local66 = local66.trim();
				local66 = local66.substring(local66.lastIndexOf(32) + 1);
				local66 = local66.substring(local66.lastIndexOf(9) + 1);
				local6 = local6 + local66 + ' ';
			}
		}
	}
}
