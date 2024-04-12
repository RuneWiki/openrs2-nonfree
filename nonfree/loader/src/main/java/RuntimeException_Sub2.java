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
	public static int anInt2607;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/applet/Applet;BLjava/lang/String;)V", line = 26)
	public static void method1749(@OriginalArg(0) Throwable arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) String arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method1750(arg0);
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
			@Pc(94) URL local94 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt2607 + "&v1=" + Class66.aString10 + "&v2=" + Class66.aString12 + "&e=" + local1);
			@Pc(100) DataInputStream local100 = new DataInputStream(local94.openStream());
			local100.read();
			local100.close();
		} catch (@Pc(107) Exception local107) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 66)
	private static String method1750(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(20) String local20;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(7) RuntimeException_Sub2 local7 = (RuntimeException_Sub2) arg0;
			arg0 = local7.aThrowable2;
			local20 = local7.aString8 + " | ";
		} else {
			local20 = "";
		}
		@Pc(28) StringWriter local28 = new StringWriter();
		@Pc(33) PrintWriter local33 = new PrintWriter(local28);
		arg0.printStackTrace(local33);
		local33.close();
		@Pc(47) String local47 = local28.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(61) String local61 = local55.readLine();
				if (local61 == null) {
					return local20 + "| " + local58;
				}
				@Pc(69) int local69 = local61.indexOf(40);
				@Pc(76) int local76 = local61.indexOf(41, local69 + 1);
				if (local69 >= 0 && local76 >= 0) {
					@Pc(95) String local95 = local61.substring(local69 + 1, local76);
					@Pc(99) int local99 = local95.indexOf(".java:");
					if (local99 >= 0) {
						local95 = local95.substring(0, local99) + local95.substring(local99 + 5);
						local20 = local20 + local95 + ' ';
						continue;
					}
					local61 = local61.substring(0, local69);
				}
				local61 = local61.trim();
				local61 = local61.substring(local61.lastIndexOf(32) + 1);
				local61 = local61.substring(local61.lastIndexOf(9) + 1);
				local20 = local20 + local61 + ' ';
			}
		}
	}
}
