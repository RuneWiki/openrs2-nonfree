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
	public static int anInt4025;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;B)V")
	public static void method2928(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Throwable arg2) {
		try {
			@Pc(9) String local9 = "";
			if (arg2 != null) {
				local9 = method2929(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local9 = local9 + " | ";
				}
				local9 = local9 + arg0;
			}
			System.out.println("Error: " + local9);
			local9 = local9.replace(':', '.');
			local9 = local9.replace('@', '_');
			local9 = local9.replace('&', '_');
			local9 = local9.replace('#', '_');
			@Pc(96) URL local96 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt4025 + "&v1=" + Class94.aString7 + "&v2=" + Class94.aString9 + "&e=" + local9);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method2929(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(11) RuntimeException_Sub2 local11 = (RuntimeException_Sub2) arg0;
			arg0 = local11.aThrowable2;
			local6 = local11.aString6 + " | ";
		} else {
			local6 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local28);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local28.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
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
					@Pc(97) String local97 = local66.substring(local72 + 1, local79);
					@Pc(101) int local101 = local97.indexOf(".java:");
					if (local101 >= 0) {
						local97 = local97.substring(0, local101) + local97.substring(local101 + 5);
						local6 = local6 + local97 + ' ';
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
