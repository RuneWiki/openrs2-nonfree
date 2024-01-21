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

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "I")
	public static int anInt4309;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method3284(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			arg0 = local17.aThrowable2;
			local6 = local17.aString10 + " | ";
		} else {
			local6 = "";
		}
		@Pc(34) StringWriter local34 = new StringWriter();
		@Pc(39) PrintWriter local39 = new PrintWriter(local34);
		arg0.printStackTrace(local39);
		local39.close();
		@Pc(47) String local47 = local34.toString();
		@Pc(55) BufferedReader local55 = new BufferedReader(new StringReader(local47));
		@Pc(58) String local58 = local55.readLine();
		while (true) {
			while (true) {
				@Pc(66) String local66 = local55.readLine();
				if (local66 == null) {
					return local6 + "| " + local58;
				}
				@Pc(73) int local73 = local66.indexOf(40);
				@Pc(80) int local80 = local66.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(95) String local95 = local66.substring(local73 + 1, local80);
					@Pc(99) int local99 = local95.indexOf(".java:");
					if (local99 >= 0) {
						local95 = local95.substring(0, local99) + local95.substring(local99 + 5);
						local6 = local6 + local95 + ' ';
						continue;
					}
					local66 = local66.substring(0, local73);
				}
				local66 = local66.trim();
				local66 = local66.substring(local66.lastIndexOf(32) + 1);
				local66 = local66.substring(local66.lastIndexOf(9) + 1);
				local6 = local6 + local66 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method3285(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method3284(arg2);
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
			@Pc(89) URL local89 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt4309 + "&v1=" + Class107.aString8 + "&v2=" + Class107.aString9 + "&e=" + local1);
			@Pc(95) DataInputStream local95 = new DataInputStream(local89.openStream());
			local95.read();
			local95.close();
		} catch (@Pc(102) Exception local102) {
		}
	}
}
