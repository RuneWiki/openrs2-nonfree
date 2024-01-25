import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!nv")
public final class Class280 implements Runnable {

	@OriginalMember(owner = "loader!nv", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!nv", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!nv", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "loader!nv", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!nv", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!nv", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!nv", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "loader!nv", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!nv", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!nv", name = "m", descriptor = "I")
	private static int anInt7986 = 1;

	@OriginalMember(owner = "loader!nv", name = "o", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!nv", name = "x", descriptor = "J")
	private static volatile long aLong233 = 0L;

	@OriginalMember(owner = "loader!nv", name = "z", descriptor = "Lloader!ur;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!nv", name = "p", descriptor = "Lloader!je;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!nv", name = "t", descriptor = "Lloader!je;")
	private Class277 aClass277_3 = null;

	@OriginalMember(owner = "loader!nv", name = "q", descriptor = "Lloader!je;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!nv", name = "u", descriptor = "Z")
	private boolean aBoolean525 = false;

	@OriginalMember(owner = "loader!nv", name = "k", descriptor = "Lloader!ln;")
	private Class278 aClass278_2 = null;

	@OriginalMember(owner = "loader!nv", name = "r", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!nv", name = "v", descriptor = "Lloader!ln;")
	private Class278 aClass278_3 = null;

	@OriginalMember(owner = "loader!nv", name = "j", descriptor = "Ljava/lang/String;")
	private final String aString79;

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "I")
	private final int anInt7985;

	@OriginalMember(owner = "loader!nv", name = "l", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!nv", name = "f", descriptor = "[Lloader!je;")
	private final Class277[] aClass277Array1;

	@OriginalMember(owner = "loader!nv", name = "s", descriptor = "Lloader!e;")
	private Class275 aClass275_1;

	@OriginalMember(owner = "loader!nv", name = "A", descriptor = "Lloader!a;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "loader!nv", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lloader!je;")
	private static Class277 method6239(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		if (arg2 == 33) {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local17 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(87) String[] local87 = new String[] { "c:/rscache/", "/rscache/", aString78, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(100) int local100 = 0; local100 < local87.length; local100++) {
			@Pc(108) String local108 = local87[local100];
			if (local108.length() <= 0 || (new File(local108)).exists()) {
				try {
					return new Class277(new File(local108, local17), "rw", 10000L);
				} catch (@Pc(135) Exception local135) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method6243(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(9) File local9 = (File) aHashtable4.get(arg0);
		if (local9 != null) {
			return local9;
		}
		@Pc(48) String[] local48 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString78, "/tmp/", "" };
		@Pc(73) String[] local73 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(75) int local75 = 0; local75 < 2; local75++) {
			for (@Pc(82) int local82 = 0; local82 < local73.length; local82++) {
				for (@Pc(88) int local88 = 0; local88 < local48.length; local88++) {
					@Pc(126) String local126 = local48[local88] + local73[local82] + "/" + (arg2 == null ? "" : arg2 + "/") + arg0;
					@Pc(128) RandomAccessFile local128 = null;
					try {
						@Pc(133) File local133 = new File(local126);
						if (local75 != 0 || local133.exists()) {
							@Pc(147) String local147 = local48[local88];
							if (local75 != 1 || local147.length() <= 0 || (new File(local147)).exists()) {
								(new File(local48[local88] + local73[local82])).mkdir();
								if (arg2 != null) {
									(new File(local48[local88] + local73[local82] + "/" + arg2)).mkdir();
								}
								local128 = new RandomAccessFile(local133, "rw");
								@Pc(214) int local214 = local128.read();
								local128.seek(0L);
								local128.write(local214);
								local128.seek(0L);
								local128.close();
								aHashtable4.put(arg0, local133);
								return local133;
							}
						}
					} catch (@Pc(233) Exception local233) {
						try {
							if (local128 != null) {
								local128.close();
							}
						} catch (@Pc(242) Exception local242) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!nv", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class280(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet3 = arg0;
		this.aString79 = arg2;
		aString75 = "1.1";
		this.anInt7985 = arg1;
		aString80 = "Unknown";
		try {
			aString80 = System.getProperty("java.vendor");
			aString75 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString77 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString77 = "Unknown";
		}
		aString76 = aString77.toLowerCase();
		try {
			aString74 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString74 = "";
		}
		try {
			aString73 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString73 = "";
		}
		try {
			aString78 = System.getProperty("user.home");
			if (aString78 != null) {
				aString78 = aString78 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString78 == null) {
			aString78 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass277_2 = new Class277(method6243("random.dat", this.anInt7985, null), "rw", 25L);
		this.aClass277_1 = new Class277(this.method6265("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass277_3 = new Class277(this.method6265("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass277Array1 = new Class277[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass277Array1[local193] = new Class277(this.method6265("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass275_1 = new Class275();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass273_1 = new Class273();
		} catch (@Pc(232) Throwable local232) {
		}
		@Pc(235) ThreadGroup local235 = Thread.currentThread().getThreadGroup();
		for (@Pc(238) ThreadGroup local238 = local235.getParent(); local238 != null; local238 = local238.getParent()) {
			local235 = local238;
		}
		@Pc(250) Thread[] local250 = new Thread[1000];
		local235.enumerate(local250);
		for (@Pc(256) int local256 = 0; local256 < local250.length; local256++) {
			if (local250[local256] != null && local250[local256].getName().startsWith("AWT")) {
				local250[local256].setPriority(1);
			}
		}
		this.aBoolean525 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lloader!ln;")
	private Class278 method6238(@OriginalArg(0) Class[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class arg3) {
		return arg1 == 27 ? this.method6240(0, (byte) 90, 8, new Object[] { arg3, arg2, arg0 }, 0) : (Class278) null;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(IBILjava/lang/Object;I)Lloader!ln;")
	private Class278 method6240(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class278 local3 = new Class278();
		local3.anObject20 = arg3;
		local3.anInt7977 = arg2;
		local3.anInt7978 = arg0;
		local3.anInt7979 = arg4;
		if (arg1 <= 29) {
			return (Class278) null;
		}
		synchronized (this) {
			if (this.aClass278_3 == null) {
				this.aClass278_3 = this.aClass278_2 = local3;
			} else {
				this.aClass278_3.aClass278_1 = local3;
				this.aClass278_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lloader!ln;")
	private Class278 method6241(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg2) {
			this.aClass277_1 = null;
		}
		return this.method6240(arg1 ? 1 : 0, (byte) 57, 15, arg0, 0);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lloader!ln;")
	private Class278 method6242(@OriginalArg(1) Runnable arg0, @OriginalArg(2) int arg1) {
		return this.method6240(arg1, (byte) 43, 2, arg0, 0);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!ln;")
	private Class278 method6244(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		return arg0 == 16 ? this.method6240(0, (byte) 125, 20, arg1, 0) : (Class278) null;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(B)V")
	private void method6245(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean525 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (this.aClass277_1 != null) {
			try {
				this.aClass277_1.method6226();
			} catch (@Pc(31) IOException local31) {
			}
		}
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method6226();
			} catch (@Pc(40) IOException local40) {
			}
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(47) int local47 = 0; local47 < this.aClass277Array1.length; local47++) {
				if (this.aClass277Array1[local47] != null) {
					try {
						this.aClass277Array1[local47].method6226();
					} catch (@Pc(66) IOException local66) {
					}
				}
			}
		}
		if (this.aClass277_2 != null) {
			try {
				this.aClass277_2.method6226();
			} catch (@Pc(77) IOException local77) {
			}
		}
		if (arg0 < 64) {
			aString75 = null;
		}
	}

	@OriginalMember(owner = "loader!nv", name = "b", descriptor = "(B)Lloader!ur;")
	private Interface14 method6246(@OriginalArg(0) byte arg0) {
		if (arg0 >= -21) {
			this.method6263(null, -25);
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(IIIII)Lloader!ln;")
	private Class278 method6247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != 13056) {
			aString76 = null;
		}
		return this.method6240(arg1 + (arg4 << 16), (byte) 74, 6, null, arg3 + (arg0 << 16));
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(Ljava/awt/Component;I[IILjava/awt/Point;I)Lloader!ln;")
	private Class278 method6248(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4, @OriginalArg(5) int arg5) {
		if (arg5 != 17) {
			this.method6250(null, 61);
		}
		return this.method6240(arg3, (byte) 110, 17, new Object[] { arg0, arg2, arg4 }, arg1);
	}

	@OriginalMember(owner = "loader!nv", name = "c", descriptor = "(ILjava/lang/Class;)V")
	private void method6249(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		if (arg0 != -19779) {
			this.method6266(-101, -104, (byte) -10, null);
		}
		@Pc(23) Class[] local23 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(25) Runtime local25 = Runtime.getRuntime();
		@Pc(36) Method local36 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(46) Method local46;
		if (!aString76.startsWith("mac")) {
			local46 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local23);
			local36.invoke(local46, Boolean.TRUE);
			local46.invoke(local25, arg1, "jawt");
			local36.invoke(local46, Boolean.FALSE);
		}
		local46 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local23);
		local36.invoke(local46, Boolean.TRUE);
		if (!aString76.startsWith("win")) {
			throw new Exception();
		}
		local46.invoke(local25, arg1, this.method6265("sw3d.dll").toString());
		local36.invoke(local46, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method6250(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class278 local7 = this.method6259(0, 21, arg0, 0);
		if (arg1 != -12226) {
			this.aClass273_1 = null;
		}
		return (byte[]) local7.anObject21;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(ZLjava/lang/String;Z)Lloader!ln;")
	private Class278 method6251(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg0) {
			anInt7986 = -37;
		}
		return arg2 ? this.method6240(0, (byte) 104, 12, arg1, 0) : this.method6240(0, (byte) 35, 13, arg1, 0);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!ln;")
	private Class278 method6252(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		return arg0 == 0 ? this.method6240(0, (byte) 33, 19, arg1, 0) : (Class278) null;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lloader!ln;")
	private Class278 method6253(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return arg2 == 0 ? this.method6240(0, (byte) 103, 9, new Object[] { arg0, arg1 }, 0) : (Class278) null;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(ILjava/net/URL;)Lloader!ln;")
	private Class278 method6254(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		return arg0 == 0 ? this.method6240(0, (byte) 51, 4, arg1, 0) : (Class278) null;
	}

	@OriginalMember(owner = "loader!nv", name = "b", descriptor = "(ILjava/lang/Class;)Lloader!ln;")
	private Class278 method6255(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) {
		return arg0 == 0 ? this.method6240(0, (byte) 86, 11, arg1, 0) : (Class278) null;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(ZI)Lloader!ln;")
	private Class278 method6256(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			this.method6244(59, null);
		}
		return this.method6240(arg1, (byte) 96, 3, null, 0);
	}

	@OriginalMember(owner = "loader!nv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class278 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean525) {
						return;
					}
					if (this.aClass278_2 != null) {
						local17 = this.aClass278_2;
						this.aClass278_2 = this.aClass278_2.aClass278_1;
						if (this.aClass278_2 == null) {
							this.aClass278_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local17.anInt7977;
				if (local47 == 1) {
					if (Class279.method6237() < aLong233) {
						throw new IOException();
					}
					local17.anObject21 = new Socket(InetAddress.getByName((String) local17.anObject20), local17.anInt7978);
				} else if (local47 == 2) {
					@Pc(704) Thread local704 = new Thread((Runnable) local17.anObject20);
					local704.setDaemon(true);
					local704.start();
					local704.setPriority(local17.anInt7978);
					local17.anObject21 = local704;
				} else if (local47 == 4) {
					if (Class279.method6237() < aLong233) {
						throw new IOException();
					}
					local17.anObject21 = new DataInputStream(((URL) local17.anObject20).openStream());
				} else {
					@Pc(406) Object[] local406;
					if (local47 == 8) {
						local406 = (Object[]) local17.anObject20;
						if (((Class) local406[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject21 = ((Class) local406[0]).getDeclaredMethod((String) local406[1], (Class[]) local406[2]);
					} else if (local47 == 9) {
						local406 = (Object[]) local17.anObject20;
						if (((Class) local406[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject21 = ((Class) local406[0]).getDeclaredField((String) local406[1]);
					} else if (local47 == 18) {
						@Pc(125) Clipboard local125 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject21 = local125.getContents(null);
					} else if (local47 == 19) {
						@Pc(626) Transferable local626 = (Transferable) local17.anObject20;
						@Pc(629) Clipboard local629 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local629.setContents(local626, null);
					} else {
						@Pc(343) String local343;
						if (local47 == 3) {
							if (Class279.method6237() < aLong233) {
								throw new IOException();
							}
							local343 = (local17.anInt7978 >> 24 & 0xFF) + "." + (local17.anInt7978 >> 16 & 0xFF) + "." + (local17.anInt7978 >> 8 & 0xFF) + "." + (local17.anInt7978 & 0xFF);
							local17.anObject21 = InetAddress.getByName(local343).getHostName();
						} else if (local47 == 21) {
							if (Class279.method6237() < aLong233) {
								throw new IOException();
							}
							local17.anObject21 = InetAddress.getByName((String) local17.anObject20).getAddress();
						} else if (local47 == 5) {
							local17.anObject21 = this.aClass275_1.method6218();
						} else if (local47 == 6) {
							@Pc(541) Frame local541 = new Frame("Jagex Full Screen");
							local17.anObject21 = local541;
							local541.setResizable(false);
							this.aClass275_1.method6215(local17.anInt7978 & 0xFFFF, local17.anInt7978 >>> 16, local17.anInt7979 >> 16, local17.anInt7979 & 0xFFFF, local541);
						} else if (local47 == 7) {
							this.aClass275_1.method6216();
						} else {
							@Pc(359) int local359;
							if (local47 == 11) {
								@Pc(467) Field local467 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local467.setAccessible(true);
								@Pc(478) Vector local478 = (Vector) local467.get(((Class) local17.anObject20).getClassLoader());
								for (local359 = 0; local478.size() > local359; local359++) {
									@Pc(488) Object local488 = local478.elementAt(local359);
									@Pc(495) Method local495 = local488.getClass().getDeclaredMethod("finalize");
									local495.setAccessible(true);
									local495.invoke(local488);
									local495.setAccessible(false);
									@Pc(512) Field local512 = local488.getClass().getDeclaredField("handle");
									local512.setAccessible(true);
									local512.set(local488, Integer.valueOf(0));
									local512.setAccessible(false);
								}
								local467.setAccessible(false);
							} else {
								@Pc(202) Class277 local202;
								if (local47 == 12) {
									local202 = method6239((String) local17.anObject20, this.aString79, this.anInt7985);
									local17.anObject21 = local202;
								} else if (local47 == 13) {
									local202 = method6239((String) local17.anObject20, "", this.anInt7985);
									local17.anObject21 = local202;
								} else if (local47 == 14) {
									@Pc(217) int local217 = local17.anInt7978;
									@Pc(220) int local220 = local17.anInt7979;
									this.aClass273_1.method6209(local217, local220);
								} else if (local47 == 15) {
									@Pc(438) boolean local438 = local17.anInt7978 != 0;
									@Pc(442) Component local442 = (Component) local17.anObject20;
									this.aClass273_1.method6208(local442, local438);
								} else if (local47 == 17) {
									local406 = (Object[]) local17.anObject20;
									this.aClass273_1.method6210(local17.anInt7978, (Point) local406[2], (Component) local406[0], local17.anInt7979, (int[]) local406[1]);
								} else if (local47 == 16) {
									try {
										if (!aString76.startsWith("win")) {
											throw new Exception();
										}
										local343 = (String) local17.anObject20;
										if (!local343.startsWith("http://") && !local343.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(357) String local357 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local359 = 0; local343.length() > local359; local359++) {
											if (local357.indexOf(local343.charAt(local359)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local343 + "\"");
										local17.anObject21 = null;
									} catch (@Pc(396) Exception local396) {
										local17.anObject21 = local396;
										throw local396;
									}
								} else if (local47 == 20) {
									try {
										@Pc(254) Class[] local254 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(256) Runtime local256 = Runtime.getRuntime();
										@Pc(262) Method local262 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local254);
										local262.setAccessible(true);
										if (aString76.startsWith("win")) {
											if (aString74.startsWith("amd64") || aString74.startsWith("x86_64")) {
												local262.invoke(local256, local17.anObject20, this.method6265("jagmisc64.dll").toString());
											} else {
												local262.invoke(local256, local17.anObject20, this.method6265("jagmisc.dll").toString());
											}
										}
										local262.setAccessible(false);
									} catch (@Pc(322) Throwable local322) {
										local17.anObject21 = local322;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local17.anInt7980 = 1;
			} catch (@Pc(721) ThreadDeath local721) {
				throw local721;
			} catch (@Pc(724) Throwable local724) {
				local17.anInt7980 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!nv", name = "c", descriptor = "(I)Lloader!ln;")
	private Class278 method6257(@OriginalArg(0) int arg0) {
		if (arg0 > -65) {
			this.method6258(89, (byte) 116, null);
		}
		return this.method6240(0, (byte) 46, 18, null, 0);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(IBLjava/lang/String;)Lloader!ln;")
	private Class278 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		if (arg1 != 112) {
			this.method6260(true);
		}
		return this.method6240(arg0, (byte) 61, 1, arg2, 0);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(IIBLjava/lang/Object;I)Lloader!ln;")
	private Class278 method6259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class278 local3 = new Class278();
		synchronized (local3) {
			local3.anInt7979 = arg0;
			local3.anInt7978 = arg3;
			local3.anInt7977 = arg1;
			local3.anObject20 = arg2;
			synchronized (this) {
				if (this.aClass278_3 == null) {
					this.aClass278_3 = this.aClass278_2 = local3;
				} else {
					this.aClass278_3.aClass278_1 = local3;
					this.aClass278_3 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(63) InterruptedException local63) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(Z)Lloader!ln;")
	private Class278 method6260(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method6240(122, (byte) 37, -23, null, 53);
		}
		return this.method6240(0, (byte) 91, 5, null, 0);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(BLjava/lang/String;)Lloader!ln;")
	private Class278 method6261(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		return arg0 == -28 ? this.method6240(0, (byte) 100, 16, arg1, 0) : (Class278) null;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(I)Z")
	private boolean method6262(@OriginalArg(0) int arg0) {
		if (arg0 > -25) {
			this.aClass273_1 = null;
		}
		return this.aClass275_1 != null;
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!ln;")
	private Class278 method6263(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 7445) {
			aString74 = null;
		}
		return this.method6240(0, (byte) 33, 7, arg0, 0);
	}

	@OriginalMember(owner = "loader!nv", name = "b", descriptor = "(I)V")
	private void method6264(@OriginalArg(0) int arg0) {
		aLong233 = Class279.method6237() + 5000L;
		if (arg0 != 10000) {
			this.method6242(null, -18);
		}
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method6265(@OriginalArg(1) String arg0) {
		return method6243(arg0, this.anInt7985, this.aString79);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(IIBLjava/awt/Component;)Lloader!ln;")
	private Class278 method6266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Component arg3) {
		if (arg2 >= -118) {
			this.method6267(null, (byte) 118);
		}
		@Pc(11) Point local11 = arg3.getLocationOnScreen();
		return this.method6240(local11.x + arg0, (byte) 43, 14, null, arg1 + local11.y);
	}

	@OriginalMember(owner = "loader!nv", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!ln;")
	private Class278 method6267(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 91) {
			this.aClass275_1 = null;
		}
		return this.method6240(0, (byte) 88, 21, arg0, 0);
	}
}
