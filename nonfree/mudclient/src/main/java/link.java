import java.applet.Applet;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("mudclient!link")
public final class link {

	@OriginalMember(owner = "mudclient!link", name = "mainapp", descriptor = "Ljava/applet/Applet;")
	public static Applet mainapp;

	@OriginalMember(owner = "mudclient!link", name = "uid", descriptor = "I")
	public static int uid;

	@OriginalMember(owner = "mudclient!link", name = "socketport", descriptor = "I")
	private static int socketport;

	@OriginalMember(owner = "mudclient!link", name = "s", descriptor = "Ljava/net/Socket;")
	private static Socket s;

	@OriginalMember(owner = "mudclient!link", name = "host", descriptor = "Ljava/lang/String;")
	private static String host;

	@OriginalMember(owner = "mudclient!link", name = "numfile", descriptor = "I")
	private static int numfile;

	@OriginalMember(owner = "mudclient!link", name = "runme", descriptor = "Ljava/lang/Runnable;")
	private static Runnable runme = null;

	@OriginalMember(owner = "mudclient!link", name = "iplookup", descriptor = "Ljava/lang/String;")
	private static String iplookup = null;

	@OriginalMember(owner = "mudclient!link", name = "name", descriptor = "[Ljava/lang/String;")
	private static String[] name = new String[50];

	@OriginalMember(owner = "mudclient!link", name = "buf", descriptor = "[[B")
	private static byte[][] buf = new byte[50][];

	@OriginalMember(owner = "mudclient!link", name = "putjag", descriptor = "(Ljava/lang/String;[B)V")
	private static void putjag(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		name[numfile] = arg0;
		buf[numfile] = arg1;
		numfile++;
	}

	@OriginalMember(owner = "mudclient!link", name = "getjag", descriptor = "(Ljava/lang/String;)[B")
	public static byte[] getjag(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < numfile; local1++) {
			if (name[local1].equals(arg0)) {
				return buf[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "mudclient!link", name = "opensocket", descriptor = "(I)Ljava/net/Socket;")
	public static Socket opensocket(@OriginalArg(0) int arg0) {
		socketport = arg0;
		while (socketport != 0) {
			try {
				Thread.sleep(100L);
			} catch (@Pc(7) Exception local7) {
			}
		}
		return s;
	}

	@OriginalMember(owner = "mudclient!link", name = "startthread", descriptor = "(Ljava/lang/Runnable;)V")
	public static void startthread(@OriginalArg(0) Runnable arg0) {
		runme = arg0;
		while (runme != null) {
			try {
				Thread.sleep(100L);
			} catch (@Pc(7) Exception local7) {
			}
		}
	}

	@OriginalMember(owner = "mudclient!link", name = "gethostname", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String gethostname(@OriginalArg(0) String arg0) {
		iplookup = arg0;
		while (iplookup != null) {
			try {
				Thread.sleep(100L);
			} catch (@Pc(7) Exception local7) {
			}
		}
		return host;
	}

	@OriginalMember(owner = "mudclient!link", name = "<init>", descriptor = "()V")
	private link() {
	}
}
