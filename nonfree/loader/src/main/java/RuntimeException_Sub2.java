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
	public static int anInt4745;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method3533(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(28) String local28;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(18) RuntimeException_Sub2 local18 = (RuntimeException_Sub2) arg0;
			local28 = local18.aString7 + " | ";
			arg0 = local18.aThrowable2;
		} else {
			local28 = "";
		}
		@Pc(45) StringWriter local45 = new StringWriter();
		@Pc(50) PrintWriter local50 = new PrintWriter(local45);
		arg0.printStackTrace(local50);
		local50.close();
		@Pc(58) String local58 = local45.toString();
		@Pc(66) BufferedReader local66 = new BufferedReader(new StringReader(local58));
		@Pc(69) String local69 = local66.readLine();
		while (true) {
			while (true) {
				@Pc(72) String local72 = local66.readLine();
				if (local72 == null) {
					return local28 + "| " + local69;
				}
				@Pc(79) int local79 = local72.indexOf(40);
				@Pc(86) int local86 = local72.indexOf(41, local79 + 1);
				if (local79 >= 0 && local86 >= 0) {
					@Pc(103) String local103 = local72.substring(local79 + 1, local86);
					@Pc(107) int local107 = local103.indexOf(".java:");
					if (local107 >= 0) {
						local103 = local103.substring(0, local107) + local103.substring(local107 + 5);
						local28 = local28 + local103 + ' ';
						continue;
					}
					local72 = local72.substring(0, local79);
				}
				local72 = local72.trim();
				local72 = local72.substring(local72.lastIndexOf(32) + 1);
				local72 = local72.substring(local72.lastIndexOf(9) + 1);
				local28 = local28 + local72 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/applet/Applet;)V")
	public static void method3534(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg0 != null) {
				local1 = method3533(arg0);
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
			@Pc(91) URL local91 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt4745 + "&v1=" + Class111.aString8 + "&v2=" + Class111.aString10 + "&e=" + local1);
			@Pc(97) DataInputStream local97 = new DataInputStream(local91.openStream());
			local97.read();
			local97.close();
		} catch (@Pc(104) Exception local104) {
		}
	}
}
