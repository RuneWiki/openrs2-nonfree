package sign;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public final class signlink implements Runnable {

	static final int clientversion = 225;

	public static int anInt756;

	public static Applet mainapp;

	public static boolean sunjava;

	private static boolean active;

	private static int anInt757;

	private static InetAddress socketip;

	private static int socketreq;

	private static Socket socket = null;

	private static int threadreqpri = 1;

	private static Runnable aRunnable1 = null;

	private static String dnsreq = null;

	public static String dns = null;

	private static String loadreq = null;

	private static byte[] loadbuf = null;

	private static int anInt758;

	private static String savereq = null;

	private static byte[] savebuf = null;

	private static String urlreq = null;

	private static DataInputStream urlstream = null;

	private static int looprate = 50;

	private static boolean aBoolean147;

	private static int anInt759;

	public static String midi = null;

	public static int anInt760;

	public static int anInt761;

	private static boolean aBoolean148;

	private static int anInt762;

	public static String aString26 = null;

	public static int anInt763;

	public static boolean reporterror = true;

	public static String errorname = "";

	public static final void startpriv(InetAddress arg0) {
		anInt757 = (int) (Math.random() * 9.9999999E7D);
		if (active) {
			try {
				Thread.sleep(500L);
			} catch (Exception var3) {
			}
			active = false;
		}
		socketreq = 0;
		aRunnable1 = null;
		dnsreq = null;
		loadreq = null;
		savereq = null;
		urlreq = null;
		socketip = arg0;
		Thread var1 = new Thread(new signlink());
		var1.setDaemon(true);
		var1.start();
		while (!active) {
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}
	}

	public final void run() {
		active = true;
		String var1 = findcachedir();
		anInt756 = getuid(var1);
		int var2 = anInt757;
		while (anInt757 == var2) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch (Exception var6) {
					socket = null;
				}
				socketreq = 0;
			} else if (aRunnable1 != null) {
				Thread var3 = new Thread(aRunnable1);
				var3.setDaemon(true);
				var3.start();
				var3.setPriority(threadreqpri);
				aRunnable1 = null;
			} else if (dnsreq != null) {
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch (Exception var11) {
					dns = "unknown";
				}
				dnsreq = null;
			} else if (loadreq != null) {
				loadbuf = null;
				try {
					File var12 = new File(var1 + loadreq);
					if (var12.exists()) {
						int var4 = (int) var12.length();
						loadbuf = new byte[var4];
						DataInputStream var5 = new DataInputStream(new FileInputStream(var1 + loadreq));
						var5.readFully(loadbuf, 0, var4);
						var5.close();
					}
				} catch (Exception var10) {
				}
				loadreq = null;
			} else if (savereq != null) {
				if (savebuf != null) {
					try {
						FileOutputStream var13 = new FileOutputStream(var1 + savereq);
						var13.write(savebuf, 0, anInt758);
						var13.close();
					} catch (Exception var9) {
					}
				}
				if (aBoolean148) {
					aString26 = var1 + savereq;
					aBoolean148 = false;
				}
				if (aBoolean147) {
					midi = var1 + savereq;
					aBoolean147 = false;
				}
				savereq = null;
			} else if (urlreq != null) {
				try {
					urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
				} catch (Exception var8) {
					urlstream = null;
				}
				urlreq = null;
			}
			try {
				Thread.sleep((long) looprate);
			} catch (Exception var7) {
			}
		}
	}

	public static final String findcachedir() {
		String[] var0 = new String[] { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
		String var1 = ".file_store_32";
		for (int var2 = 0; var2 < var0.length; ++var2) {
			try {
				String var3 = var0[var2];
				File var4;
				if (var3.length() > 0) {
					var4 = new File(var3);
					if (!var4.exists()) {
						continue;
					}
				}
				var4 = new File(var3 + var1);
				if (var4.exists() || var4.mkdir()) {
					return var3 + var1 + "/";
				}
			} catch (Exception var5) {
			}
		}
		return null;
	}

	private static final int getuid(String arg0) {
		try {
			File var1 = new File(arg0 + "uid.dat");
			if (!var1.exists() || var1.length() < 4L) {
				DataOutputStream var2 = new DataOutputStream(new FileOutputStream(arg0 + "uid.dat"));
				var2.writeInt((int) (Math.random() * 9.9999999E7D));
				var2.close();
			}
		} catch (Exception var4) {
		}
		try {
			DataInputStream var5 = new DataInputStream(new FileInputStream(arg0 + "uid.dat"));
			int var6 = var5.readInt();
			var5.close();
			return var6 + 1;
		} catch (Exception var3) {
			return 0;
		}
	}

	public static final long gethash(String arg0) {
		String var5 = arg0.trim();
		long var1 = 0L;
		for (int var3 = 0; var3 < var5.length() && var3 < 12; ++var3) {
			char var4 = var5.charAt(var3);
			var1 *= 37L;
			if (var4 >= 'A' && var4 <= 'Z') {
				var1 += (long) (1 + var4 - 65);
			} else if (var4 >= 'a' && var4 <= 'z') {
				var1 += (long) (1 + var4 - 97);
			} else if (var4 >= '0' && var4 <= '9') {
				var1 += (long) (27 + var4 - 48);
			}
		}
		return var1;
	}

	public static final void looprate(int arg0) {
		looprate = arg0;
	}

	public static final synchronized byte[] cacheload(String arg0) {
		if (!active) {
			return null;
		} else {
			loadreq = String.valueOf(gethash(arg0));
			while (loadreq != null) {
				try {
					Thread.sleep(1L);
				} catch (Exception var1) {
				}
			}
			return loadbuf;
		}
	}

	public static final synchronized void cachesave(String arg0, byte[] arg1) {
		if (active) {
			if (arg1.length <= 2000000) {
				while (savereq != null) {
					try {
						Thread.sleep(1L);
					} catch (Exception var3) {
					}
				}
				anInt758 = arg1.length;
				savebuf = arg1;
				savereq = String.valueOf(gethash(arg0));
				while (savereq != null) {
					try {
						Thread.sleep(1L);
					} catch (Exception var2) {
					}
				}
			}
		}
	}

	public static final synchronized Socket opensocket(int arg0) throws IOException {
		socketreq = arg0;
		while (socketreq != 0) {
			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}
		if (socket == null) {
			throw new IOException("could not open socket");
		} else {
			return socket;
		}
	}

	public static final synchronized DataInputStream openurl(String arg0) throws IOException {
		urlreq = arg0;
		while (urlreq != null) {
			try {
				Thread.sleep(50L);
			} catch (Exception var1) {
			}
		}
		if (urlstream == null) {
			throw new IOException("could not open: " + arg0);
		} else {
			return urlstream;
		}
	}

	public static final synchronized void dnslookup(String arg0) {
		dns = arg0;
		dnsreq = arg0;
	}

	public static final synchronized void startthread(Runnable arg0, int arg1) {
		threadreqpri = arg1;
		aRunnable1 = arg0;
	}

	public static final synchronized boolean wavesave(byte[] arg0, int arg1) {
		if (arg1 > 2000000) {
			return false;
		} else if (savereq != null) {
			return false;
		} else {
			anInt762 = (anInt762 + 1) % 5;
			anInt758 = arg1;
			savebuf = arg0;
			aBoolean148 = true;
			savereq = "sound" + anInt762 + ".wav";
			return true;
		}
	}

	public static final synchronized boolean wavereplay() {
		if (savereq != null) {
			return false;
		} else {
			savebuf = null;
			aBoolean148 = true;
			savereq = "sound" + anInt762 + ".wav";
			return true;
		}
	}

	public static final synchronized void midisave(byte[] arg0, int arg1) {
		if (arg1 <= 2000000) {
			if (savereq == null) {
				anInt759 = (anInt759 + 1) % 5;
				anInt758 = arg1;
				savebuf = arg0;
				aBoolean147 = true;
				savereq = "jingle" + anInt759 + ".mid";
			}
		}
	}

	public static final void reporterror(String arg0) {
		if (reporterror) {
			if (active) {
				System.out.println("Error: " + arg0);
				try {
					String var3 = arg0.replace('@', '_');
					String var4 = var3.replace('&', '_');
					String var5 = var4.replace('#', '_');
					DataInputStream var1 = openurl("reporterror" + 225 + ".cgi?error=" + errorname + " " + var5);
					var1.readLine();
					var1.close();
				} catch (IOException var2) {
				}
			}
		}
	}
}
