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
	public static int anInt2765;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	private static String method1864(@OriginalArg(0) Throwable arg0) throws IOException {
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
				@Pc(63) int local63 = local55.indexOf(40);
				@Pc(70) int local70 = local55.indexOf(41, local63 + 1);
				if (local63 >= 0 && local70 >= 0) {
					@Pc(82) String local82 = local55.substring(local63 + 1, local70);
					@Pc(86) int local86 = local82.indexOf(".java:");
					if (local86 >= 0) {
						local82 = local82.substring(0, local86) + local82.substring(local86 + 5);
						local20 = local20 + local82 + ' ';
						continue;
					}
					local55 = local55.substring(0, local63);
				}
				local55 = local55.trim();
				local55 = local55.substring(local55.lastIndexOf(32) + 1);
				local55 = local55.substring(local55.lastIndexOf(9) + 1);
				local20 = local20 + local55 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/applet/Applet;Ljava/lang/String;)V")
	public static void method1865(@OriginalArg(1) Throwable arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(9) String local9 = "";
			if (arg0 != null) {
				local9 = method1864(arg0);
			}
			if (arg2 != null) {
				if (arg0 != null) {
					local9 = local9 + " | ";
				}
				local9 = local9 + arg2;
			}
			System.out.println("Error: " + local9);
			local9 = local9.replace(':', '.');
			local9 = local9.replace('@', '_');
			local9 = local9.replace('&', '_');
			local9 = local9.replace('#', '_');
			@Pc(96) URL local96 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt2765 + "&v1=" + Class69.aString11 + "&v2=" + Class69.aString14 + "&e=" + local9);
			@Pc(102) DataInputStream local102 = new DataInputStream(local96.openStream());
			local102.read();
			local102.close();
		} catch (@Pc(109) Exception local109) {
		}
	}
}
