package sign;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
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
	private static final int clientversion = 234;

	@OriginalMember(owner = "client!sign/signlink", name = "uid", descriptor = "I")
	public static int anInt916;

	@OriginalMember(owner = "client!sign/signlink", name = "sunjava", descriptor = "Z")
	public static boolean sunjava;

	@OriginalMember(owner = "client!sign/signlink", name = "active", descriptor = "Z")
	private static boolean active;

	@OriginalMember(owner = "client!sign/signlink", name = "threadliveid", descriptor = "I")
	private static int anInt918;

	@OriginalMember(owner = "client!sign/signlink", name = "socketip", descriptor = "Ljava/net/InetAddress;")
	private static InetAddress socketip;

	@OriginalMember(owner = "client!sign/signlink", name = "socketreq", descriptor = "I")
	private static int socketreq;

	@OriginalMember(owner = "client!sign/signlink", name = "savelen", descriptor = "I")
	private static int anInt919;

	@OriginalMember(owner = "client!sign/signlink", name = "midiplay", descriptor = "Z")
	private static boolean aBoolean181;

	@OriginalMember(owner = "client!sign/signlink", name = "midipos", descriptor = "I")
	private static int anInt920;

	@OriginalMember(owner = "client!sign/signlink", name = "midivol", descriptor = "I")
	public static int anInt921;

	@OriginalMember(owner = "client!sign/signlink", name = "midifade", descriptor = "I")
	public static int anInt922;

	@OriginalMember(owner = "client!sign/signlink", name = "waveplay", descriptor = "Z")
	private static boolean aBoolean182;

	@OriginalMember(owner = "client!sign/signlink", name = "wavepos", descriptor = "I")
	private static int anInt923;

	@OriginalMember(owner = "client!sign/signlink", name = "wavevol", descriptor = "I")
	public static int anInt924;

	@OriginalMember(owner = "client!sign/signlink", name = "storeid", descriptor = "I")
	public static int anInt917 = 32;

	@OriginalMember(owner = "client!sign/signlink", name = "cache_dat", descriptor = "Ljava/io/RandomAccessFile;")
	public static RandomAccessFile aRandomAccessFile1 = null;

	@OriginalMember(owner = "client!sign/signlink", name = "cache_idx", descriptor = "[Ljava/io/RandomAccessFile;")
	public static RandomAccessFile[] aRandomAccessFileArray1 = new RandomAccessFile[5];

	@OriginalMember(owner = "client!sign/signlink", name = "mainapp", descriptor = "Ljava/applet/Applet;")
	public static Applet mainapp = null;

	@OriginalMember(owner = "client!sign/signlink", name = "socket", descriptor = "Ljava/net/Socket;")
	private static Socket socket = null;

	@OriginalMember(owner = "client!sign/signlink", name = "threadreqpri", descriptor = "I")
	private static int threadreqpri = 1;

	@OriginalMember(owner = "client!sign/signlink", name = "threadreq", descriptor = "Ljava/lang/Runnable;")
	private static Runnable aRunnable1 = null;

	@OriginalMember(owner = "client!sign/signlink", name = "dnsreq", descriptor = "Ljava/lang/String;")
	private static String dnsreq = null;

	@OriginalMember(owner = "client!sign/signlink", name = "dns", descriptor = "Ljava/lang/String;")
	public static String dns = null;

	@OriginalMember(owner = "client!sign/signlink", name = "urlreq", descriptor = "Ljava/lang/String;")
	private static String urlreq = null;

	@OriginalMember(owner = "client!sign/signlink", name = "urlstream", descriptor = "Ljava/io/DataInputStream;")
	private static DataInputStream urlstream = null;

	@OriginalMember(owner = "client!sign/signlink", name = "savereq", descriptor = "Ljava/lang/String;")
	private static String savereq = null;

	@OriginalMember(owner = "client!sign/signlink", name = "savebuf", descriptor = "[B")
	private static byte[] savebuf = null;

	@OriginalMember(owner = "client!sign/signlink", name = "midi", descriptor = "Ljava/lang/String;")
	public static String midi = null;

	@OriginalMember(owner = "client!sign/signlink", name = "wave", descriptor = "Ljava/lang/String;")
	private static String aString28 = null;

	@OriginalMember(owner = "client!sign/signlink", name = "reporterror", descriptor = "Z")
	public static boolean reporterror = true;

	@OriginalMember(owner = "client!sign/signlink", name = "errorname", descriptor = "Ljava/lang/String;")
	public static String errorname = "";

	@OriginalMember(owner = "client!sign/signlink", name = "startpriv", descriptor = "(Ljava/net/InetAddress;)V")
	public static void startpriv(@OriginalArg(0) InetAddress arg0) {
		anInt918 = (int) (Math.random() * 9.9999999E7D);
		if (active) {
			try {
				Thread.sleep(500L);
			} catch (@Pc(10) Exception local10) {
			}
			active = false;
		}
		socketreq = 0;
		aRunnable1 = null;
		dnsreq = null;
		savereq = null;
		urlreq = null;
		socketip = arg0;
		@Pc(31) Thread local31 = new Thread(new signlink());
		local31.setDaemon(true);
		local31.start();
		while (!active) {
			try {
				Thread.sleep(50L);
			} catch (@Pc(41) Exception local41) {
			}
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "findcachedir", descriptor = "()Ljava/lang/String;")
	private static String findcachedir() {
		@Pc(50) String[] local50 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		if (anInt917 < 32 || anInt917 > 34) {
			anInt917 = 32;
		}
		@Pc(66) String local66 = ".file_store_" + anInt917;
		for (@Pc(68) int local68 = 0; local68 < local50.length; local68++) {
			try {
				@Pc(73) String local73 = local50[local68];
				@Pc(81) File local81;
				if (local73.length() > 0) {
					local81 = new File(local73);
					if (!local81.exists()) {
						continue;
					}
				}
				local81 = new File(local73 + local66);
				if (local81.exists() || local81.mkdir()) {
					return local73 + local66 + "/";
				}
			} catch (@Pc(116) Exception local116) {
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "getuid", descriptor = "(Ljava/lang/String;)I")
	private static int getuid(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) File local11 = new File(arg0 + "uid.dat");
			if (!local11.exists() || local11.length() < 4L) {
				@Pc(34) DataOutputStream local34 = new DataOutputStream(new FileOutputStream(arg0 + "uid.dat"));
				local34.writeInt((int) (Math.random() * 9.9999999E7D));
				local34.close();
			}
		} catch (@Pc(44) Exception local44) {
		}
		try {
			@Pc(59) DataInputStream local59 = new DataInputStream(new FileInputStream(arg0 + "uid.dat"));
			@Pc(62) int local62 = local59.readInt();
			local59.close();
			return local62 + 1;
		} catch (@Pc(69) Exception local69) {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "opensocket", descriptor = "(I)Ljava/net/Socket;")
	public static synchronized Socket opensocket(@OriginalArg(0) int arg0) throws IOException {
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

	@OriginalMember(owner = "client!sign/signlink", name = "openurl", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
	public static synchronized DataInputStream openurl(@OriginalArg(0) String arg0) throws IOException {
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

	@OriginalMember(owner = "client!sign/signlink", name = "dnslookup", descriptor = "(Ljava/lang/String;)V")
	public static synchronized void dnslookup(@OriginalArg(0) String arg0) {
		dns = arg0;
		dnsreq = arg0;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "startthread", descriptor = "(Ljava/lang/Runnable;I)V")
	public static synchronized void startthread(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		threadreqpri = arg1;
		aRunnable1 = arg0;
	}

	@OriginalMember(owner = "client!sign/signlink", name = "wavesave", descriptor = "([BI)Z")
	public static synchronized boolean wavesave(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 2000000) {
			return false;
		} else if (savereq == null) {
			anInt923 = (anInt923 + 1) % 5;
			anInt919 = arg1;
			savebuf = arg0;
			aBoolean182 = true;
			savereq = "sound" + anInt923 + ".wav";
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "wavereplay", descriptor = "()Z")
	public static synchronized boolean wavereplay() {
		if (savereq == null) {
			savebuf = null;
			aBoolean182 = true;
			savereq = "sound" + anInt923 + ".wav";
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "midisave", descriptor = "([BI)V")
	public static synchronized void midisave(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 2000000 || savereq != null) {
			return;
		}
		anInt920 = (anInt920 + 1) % 5;
		anInt919 = arg1;
		savebuf = arg0;
		aBoolean181 = true;
		savereq = "jingle" + anInt920 + ".mid";
	}

	@OriginalMember(owner = "client!sign/signlink", name = "reporterror", descriptor = "(Ljava/lang/String;)V")
	public static void reporterror(@OriginalArg(0) String arg0) {
		if (!reporterror || !active) {
			return;
		}
		System.out.println("Error: " + arg0);
		try {
			@Pc(19) String local19 = arg0.replace(':', '_');
			@Pc(24) String local24 = local19.replace('@', '_');
			@Pc(29) String local29 = local24.replace('&', '_');
			@Pc(34) String local34 = local29.replace('#', '_');
			@Pc(51) DataInputStream local51 = openurl("reporterror" + 234 + ".cgi?error=" + errorname + " " + local34);
			local51.readLine();
			local51.close();
		} catch (@Pc(58) IOException local58) {
		}
	}

	@OriginalMember(owner = "client!sign/signlink", name = "<init>", descriptor = "()V")
	private signlink() {
	}

	@OriginalMember(owner = "client!sign/signlink", name = "run", descriptor = "()V")
	@Override
	public void run() {
		active = true;
		@Pc(3) String local3 = findcachedir();
		anInt916 = getuid(local3);
		try {
			@Pc(18) File local18 = new File(local3 + "main_file_cache.dat");
			if (local18.exists() && local18.length() > 52428800L) {
				local18.delete();
			}
			aRandomAccessFile1 = new RandomAccessFile(local3 + "main_file_cache.dat", "rw");
			for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
				aRandomAccessFileArray1[local44] = new RandomAccessFile(local3 + "main_file_cache.idx" + local44, "rw");
			}
		} catch (@Pc(68) Exception local68) {
			local68.printStackTrace();
		}
		@Pc(72) int local72 = anInt918;
		while (anInt918 == local72) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch (@Pc(83) Exception local83) {
					socket = null;
				}
				socketreq = 0;
			} else if (aRunnable1 != null) {
				@Pc(95) Thread local95 = new Thread(aRunnable1);
				local95.setDaemon(true);
				local95.start();
				local95.setPriority(threadreqpri);
				aRunnable1 = null;
			} else if (dnsreq != null) {
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch (@Pc(114) Exception local114) {
					dns = "unknown";
				}
				dnsreq = null;
			} else if (savereq != null) {
				if (savebuf != null) {
					try {
						@Pc(135) FileOutputStream local135 = new FileOutputStream(local3 + savereq);
						local135.write(savebuf, 0, anInt919);
						local135.close();
					} catch (@Pc(144) Exception local144) {
					}
				}
				if (aBoolean182) {
					aString28 = local3 + savereq;
					aBoolean182 = false;
				}
				if (aBoolean181) {
					midi = local3 + savereq;
					aBoolean181 = false;
				}
				savereq = null;
			} else if (urlreq != null) {
				try {
					urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
				} catch (@Pc(189) Exception local189) {
					urlstream = null;
				}
				urlreq = null;
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(197) Exception local197) {
			}
		}
	}
}
