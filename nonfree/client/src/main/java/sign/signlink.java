package sign;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sign/signlink")
public final class signlink implements Runnable {

	@OriginalMember(owner = "client!sign/signlink", name = "clientversion", descriptor = "I")
	private static final int clientversion = 194;

	@OriginalMember(owner = "client!sign/signlink", name = "mainapp", descriptor = "Ljava/applet/Applet;")
	public static Applet mainapp;

	@OriginalMember(owner = "client!sign/signlink", name = "sunjava", descriptor = "Z")
	public static boolean sunjava;

	@OriginalMember(owner = "client!sign/signlink", name = "active", descriptor = "Z")
	private static boolean active;

	@OriginalMember(owner = "client!sign/signlink", name = "socketip", descriptor = "Ljava/net/InetAddress;")
	private static InetAddress socketip;

	@OriginalMember(owner = "client!sign/signlink", name = "socketreq", descriptor = "I")
	private static int socketreq;

	@OriginalMember(owner = "client!sign/signlink", name = "socket", descriptor = "Ljava/net/Socket;")
	private static Socket socket = null;

	@OriginalMember(owner = "client!sign/signlink", name = "threadreqpri", descriptor = "I")
	private static int threadreqpri = 1;

	@OriginalMember(owner = "client!sign/signlink", name = "threadreq", descriptor = "Ljava/lang/Runnable;")
	private static Runnable aRunnable1 = null;

	@OriginalMember(owner = "client!sign/signlink", name = "dnsreq", descriptor = "Ljava/lang/String;")
	private static String dnsreq = null;

	@OriginalMember(owner = "client!sign/signlink", name = "dns", descriptor = "Ljava/lang/String;")
	private static String dns = null;

	@OriginalMember(owner = "client!sign/signlink", name = "loadreq", descriptor = "Ljava/lang/String;")
	private static String loadreq = null;

	@OriginalMember(owner = "client!sign/signlink", name = "loadbuf", descriptor = "[B")
	private static byte[] loadbuf = null;

	@OriginalMember(owner = "client!sign/signlink", name = "savereq", descriptor = "Ljava/lang/String;")
	private static String savereq = null;

	@OriginalMember(owner = "client!sign/signlink", name = "savebuf", descriptor = "[B")
	private static byte[] savebuf = null;

	@OriginalMember(owner = "client!sign/signlink", name = "urlreq", descriptor = "Ljava/lang/String;")
	private static String urlreq = null;

	@OriginalMember(owner = "client!sign/signlink", name = "urlstream", descriptor = "Ljava/io/DataInputStream;")
	private static DataInputStream urlstream = null;

	@OriginalMember(owner = "client!sign/signlink", name = "midi", descriptor = "Ljava/lang/String;")
	public static String midi = null;

	@OriginalMember(owner = "client!sign/signlink", name = "jingle", descriptor = "Ljava/lang/String;")
	public static String jingle = null;

	@OriginalMember(owner = "client!sign/signlink", name = "jinglelen", descriptor = "I")
	public static int jinglelen = 3500;

	@OriginalMember(owner = "client!sign/signlink", name = "looprate", descriptor = "I")
	private static int looprate = 100;

	@OriginalMember(owner = "client!sign/signlink", name = "reporterror", descriptor = "Z")
	public static boolean reporterror = true;

	@OriginalMember(owner = "client!sign/signlink", name = "errorname", descriptor = "Ljava/lang/String;")
	public static String errorname = "";

	@OriginalMember(owner = "client!sign/signlink", name = "startpriv", descriptor = "(Ljava/net/InetAddress;)V")
	public static void startpriv(@OriginalArg(0) InetAddress arg0) {
		if (!active) {
			socketip = arg0;
			@Pc(11) Thread local11 = new Thread(new signlink());
			local11.setDaemon(true);
			local11.start();
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "findcachedir", descriptor = "()Ljava/lang/String;")
	private static String findcachedir() {
		@Pc(50) String[] local50 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		@Pc(52) String local52 = ".file_store_32";
		for (@Pc(54) int local54 = 0; local54 < local50.length; local54++) {
			try {
				@Pc(59) String local59 = local50[local54];
				@Pc(67) File local67;
				if (local59.length() > 0) {
					local67 = new File(local59);
					if (!local67.exists()) {
						continue;
					}
				}
				local67 = new File(local59 + local52);
				if (local67.exists() || local67.mkdir()) {
					return local59 + local52 + "/";
				}
			} catch (@Pc(102) Exception local102) {
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "gethash", descriptor = "(Ljava/lang/String;)J")
	private static long gethash(@OriginalArg(0) String arg0) {
		@Pc(2) String local2 = arg0.trim();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2.length() && local6 < 12; local6++) {
			@Pc(11) char local11 = local2.charAt(local6);
			local4 *= 37L;
			if (local11 >= 'A' && local11 <= 'Z') {
				local4 += local11 + 1 - 65;
			} else if (local11 >= 'a' && local11 <= 'z') {
				local4 += local11 + 1 - 97;
			} else if (local11 >= '0' && local11 <= '9') {
				local4 += local11 + 27 - 48;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "looprate", descriptor = "(I)V")
	public static void looprate(@OriginalArg(0) int arg0) {
		looprate = arg0;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "cacheload", descriptor = "(Ljava/lang/String;)[B")
	public static byte[] cacheload(@OriginalArg(0) String arg0) {
		if (!active) {
			return null;
		} else if (loadreq == null) {
			loadreq = String.valueOf(gethash(arg0));
			while (loadreq != null) {
				try {
					Thread.sleep(1L);
				} catch (@Pc(16) Exception local16) {
				}
			}
			return loadbuf;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "cachesave", descriptor = "(Ljava/lang/String;[B)V")
	public static void cachesave(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		if (!active || (savereq != null || arg1.length > 2000000)) {
			return;
		}
		savebuf = arg1;
		savereq = String.valueOf(gethash(arg0));
		while (savereq != null) {
			try {
				Thread.sleep(1L);
			} catch (@Pc(21) Exception local21) {
			}
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "opensocket", descriptor = "(I)Ljava/net/Socket;")
	public static Socket opensocket(@OriginalArg(0) int arg0) throws IOException {
		socketreq = arg0;
		while (socketreq != 0) {
			try {
				Thread.sleep(50L);
			} catch (@Pc(6) Exception local6) {
			}
		}
		if (socket == null) {
			throw new IOException("could not open socket");
		}
		return socket;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "dnslookup", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	private static String dnslookup(@OriginalArg(0) String arg0) {
		return "unknown";
	}

	@OriginalMember(owner = "client!sign/signlink", name = "startthread", descriptor = "(Ljava/lang/Runnable;I)V")
	public static void startthread(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		threadreqpri = arg1;
		aRunnable1 = arg0;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "openurl", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public static DataInputStream openurl(@OriginalArg(0) String arg0) throws IOException {
		urlreq = arg0;
		while (urlreq != null) {
			try {
				Thread.sleep(50L);
			} catch (@Pc(6) Exception local6) {
			}
		}
		if (urlstream == null) {
			throw new IOException("could not open: " + arg0);
		}
		return urlstream;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "reporterror", descriptor = "(Ljava/lang/String;)V")
	public static void reporterror(@OriginalArg(0) String arg0) {
		if (!reporterror) {
			return;
		}
		System.out.println("Error: " + arg0);
		try {
			@Pc(16) String local16 = arg0.replace('@', '_');
			@Pc(21) String local21 = local16.replace('&', '_');
			@Pc(26) String local26 = local21.replace('#', '_');
			@Pc(43) DataInputStream local43 = openurl("reporterror" + 194 + ".cgi?error=" + errorname + " " + local26);
			local43.readLine();
			local43.close();
		} catch (@Pc(50) IOException local50) {
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "<init>", descriptor = "()V")
	private signlink() {
	}

	@OriginalMember(owner = "client!sign/signlink", name = "run", descriptor = "()V")
	@Override
	public void run() {
		if (active) {
			return;
		}
		active = true;
		@Pc(6) String local6 = findcachedir();
		while (true) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch (@Pc(16) Exception local16) {
					socket = null;
				}
				socketreq = 0;
			}
			if (aRunnable1 != null) {
				@Pc(27) Thread local27 = new Thread(aRunnable1);
				local27.setDaemon(true);
				local27.start();
				local27.setPriority(threadreqpri);
				aRunnable1 = null;
			}
			if (dnsreq != null) {
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch (@Pc(45) Exception local45) {
					dns = "unknown";
				}
				dnsreq = null;
			}
			if (loadreq != null) {
				loadbuf = null;
				try {
					@Pc(65) File local65 = new File(local6 + loadreq);
					if (local65.exists()) {
						@Pc(72) int local72 = (int) local65.length();
						loadbuf = new byte[local72];
						@Pc(90) DataInputStream local90 = new DataInputStream(new FileInputStream(local6 + loadreq));
						local90.readFully(loadbuf, 0, local72);
						local90.close();
					}
				} catch (@Pc(99) Exception local99) {
				}
				loadreq = null;
			}
			if (savereq != null) {
				try {
					@Pc(115) FileOutputStream local115 = new FileOutputStream(local6 + savereq);
					local115.write(savebuf, 0, savebuf.length);
					local115.close();
				} catch (@Pc(125) Exception local125) {
				}
				savereq = null;
			}
			if (urlreq != null) {
				try {
					urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
				} catch (@Pc(142) Exception local142) {
					urlstream = null;
				}
				urlreq = null;
			}
			try {
				Thread.sleep((long) looprate);
			} catch (@Pc(151) Exception local151) {
			}
		}
	}
}
