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

@OriginalClass("loader!e")
public final class RuntimeException_Sub2 extends RuntimeException {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "I")
	public static int anInt4924;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "Ljava/lang/Throwable;")
	private Throwable aThrowable2;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;Ljava/lang/Throwable;)V")
	public static void method3993(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Throwable arg2) {
		try {
			@Pc(1) String local1 = "";
			if (arg2 != null) {
				local1 = method3994(arg2);
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
			@Pc(97) URL local97 = new URL(arg1.getCodeBase(), "loadererror.ws?c=" + anInt4924 + "&v1=" + Class119.aString16 + "&v2=" + Class119.aString14 + "&e=" + local1);
			@Pc(103) DataInputStream local103 = new DataInputStream(local97.openStream());
			local103.read();
			local103.close();
		} catch (@Pc(110) Exception local110) {
		}
	}

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	private static String method3994(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(22) String local22;
		if (arg0 instanceof RuntimeException_Sub2) {
			@Pc(12) RuntimeException_Sub2 local12 = (RuntimeException_Sub2) arg0;
			local22 = local12.aString12 + " | ";
			arg0 = local12.aThrowable2;
		} else {
			local22 = "";
		}
		@Pc(38) StringWriter local38 = new StringWriter();
		@Pc(43) PrintWriter local43 = new PrintWriter(local38);
		arg0.printStackTrace(local43);
		local43.close();
		@Pc(51) String local51 = local38.toString();
		@Pc(59) BufferedReader local59 = new BufferedReader(new StringReader(local51));
		@Pc(62) String local62 = local59.readLine();
		while (true) {
			while (true) {
				@Pc(65) String local65 = local59.readLine();
				if (local65 == null) {
					return local22 + "| " + local62;
				}
				@Pc(73) int local73 = local65.indexOf(40);
				@Pc(80) int local80 = local65.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(94) String local94 = local65.substring(local73 + 1, local80);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local22 = local22 + local94 + ' ';
						continue;
					}
					local65 = local65.substring(0, local73);
				}
				local65 = local65.trim();
				local65 = local65.substring(local65.lastIndexOf(32) + 1);
				local65 = local65.substring(local65.lastIndexOf(9) + 1);
				local22 = local22 + local65 + ' ';
			}
		}
	}
}
