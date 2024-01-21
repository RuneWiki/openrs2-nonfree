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
	public static int anInt4286;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	private static String method3344(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(6) String local6;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(17) RuntimeException_Sub2 local17 = (RuntimeException_Sub2) arg0;
			local6 = local17.aString7 + " | ";
			arg0 = local17.aThrowable2;
		} else {
			local6 = "";
		}
		@Pc(39) StringWriter local39 = new StringWriter();
		@Pc(44) PrintWriter local44 = new PrintWriter(local39);
		arg0.printStackTrace(local44);
		local44.close();
		@Pc(52) String local52 = local39.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			while (true) {
				@Pc(66) String local66 = local60.readLine();
				if (local66 == null) {
					return local6 + "| " + local63;
				}
				@Pc(74) int local74 = local66.indexOf(40);
				@Pc(81) int local81 = local66.indexOf(41, local74 + 1);
				if (local74 >= 0 && local81 >= 0) {
					@Pc(96) String local96 = local66.substring(local74 + 1, local81);
					@Pc(100) int local100 = local96.indexOf(".java:");
					if (local100 >= 0) {
						local96 = local96.substring(0, local100) + local96.substring(local100 + 5);
						local6 = local6 + local96 + ' ';
						continue;
					}
					local66 = local66.substring(0, local74);
				}
				local66 = local66.trim();
				local66 = local66.substring(local66.lastIndexOf(32) + 1);
				local66 = local66.substring(local66.lastIndexOf(9) + 1);
				local6 = local6 + local66 + ' ';
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;Ljava/applet/Applet;)V")
	public static void method3345(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1, @OriginalArg(3) Applet arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg1 != null) {
				local1 = method3344(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local1 = local1 + " | ";
				}
				local1 = local1 + arg0;
			}
			System.out.println("Error: " + local1);
			local1 = local1.replace(':', '.');
			local1 = local1.replace('@', '_');
			local1 = local1.replace('&', '_');
			local1 = local1.replace('#', '_');
			@Pc(88) URL local88 = new URL(arg2.getCodeBase(), "loadererror.ws?c=" + anInt4286 + "&v1=" + Class104.aString10 + "&v2=" + Class104.aString8 + "&e=" + local1);
			@Pc(94) DataInputStream local94 = new DataInputStream(local88.openStream());
			local94.read();
			local94.close();
		} catch (@Pc(109) Exception local109) {
		}
	}
}
