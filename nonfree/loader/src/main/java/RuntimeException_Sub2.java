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
	public static int anInt2904;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method1950(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(6) String local6 = "";
			if (arg2 != null) {
				local6 = method1952(arg2);
			}
			if (arg0 != null) {
				if (arg2 != null) {
					local6 = local6 + " | ";
				}
				local6 = local6 + arg0;
			}
			System.out.println("Error: " + local6);
			local6 = local6.replace(':', '.');
			local6 = local6.replace('@', '_');
			local6 = local6.replace('&', '_');
			local6 = local6.replace('#', '_');
			@Pc(94) URL local94 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt2904 + "&v1=" + Class84.aString7 + "&v2=" + Class84.aString9 + "&e=" + local6);
			@Pc(100) DataInputStream local100 = new DataInputStream(local94.openStream());
			local100.read();
			local100.close();
		} catch (@Pc(107) Exception local107) {
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	private static String method1952(@OriginalArg(1) Throwable arg0) throws IOException {
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
		@Pc(52) String local52 = local28.toString();
		@Pc(60) BufferedReader local60 = new BufferedReader(new StringReader(local52));
		@Pc(63) String local63 = local60.readLine();
		while (true) {
			while (true) {
				@Pc(66) String local66 = local60.readLine();
				if (local66 == null) {
					return local6 + "| " + local63;
				}
				@Pc(75) int local75 = local66.indexOf(40);
				@Pc(82) int local82 = local66.indexOf(41, local75 + 1);
				if (local75 >= 0 && local82 >= 0) {
					@Pc(99) String local99 = local66.substring(local75 + 1, local82);
					@Pc(103) int local103 = local99.indexOf(".java:");
					if (local103 >= 0) {
						local99 = local99.substring(0, local103) + local99.substring(local103 + 5);
						local6 = local6 + local99 + ' ';
						continue;
					}
					local66 = local66.substring(0, local75);
				}
				local66 = local66.trim();
				local66 = local66.substring(local66.lastIndexOf(32) + 1);
				local66 = local66.substring(local66.lastIndexOf(9) + 1);
				local6 = local6 + local66 + ' ';
			}
		}
	}
}
