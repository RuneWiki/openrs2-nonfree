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

@OriginalClass("loader!ul")
public final class Class283 implements Runnable {

	@OriginalMember(owner = "loader!ul", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString88;

	@OriginalMember(owner = "loader!ul", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString89;

	@OriginalMember(owner = "loader!ul", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString90;

	@OriginalMember(owner = "loader!ul", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString91;

	@OriginalMember(owner = "loader!ul", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString92;

	@OriginalMember(owner = "loader!ul", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString94;

	@OriginalMember(owner = "loader!ul", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString95;

	@OriginalMember(owner = "loader!ul", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ul", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ul", name = "g", descriptor = "I")
	private static final int anInt8035 = 1;

	@OriginalMember(owner = "loader!ul", name = "e", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!ul", name = "y", descriptor = "J")
	private static volatile long aLong233 = 0L;

	@OriginalMember(owner = "loader!ul", name = "A", descriptor = "Lloader!mt;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "loader!ul", name = "t", descriptor = "Lloader!kr;")
	private Class282 aClass282_1 = null;

	@OriginalMember(owner = "loader!ul", name = "k", descriptor = "Lloader!kr;")
	private Class282 aClass282_3 = null;

	@OriginalMember(owner = "loader!ul", name = "l", descriptor = "Z")
	private boolean aBoolean594 = false;

	@OriginalMember(owner = "loader!ul", name = "h", descriptor = "Lloader!gm;")
	private Class279 aClass279_3 = null;

	@OriginalMember(owner = "loader!ul", name = "s", descriptor = "Lloader!gm;")
	private Class279 aClass279_2 = null;

	@OriginalMember(owner = "loader!ul", name = "b", descriptor = "Lloader!kr;")
	private Class282 aClass282_2 = null;

	@OriginalMember(owner = "loader!ul", name = "v", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!ul", name = "o", descriptor = "I")
	private final int anInt8034;

	@OriginalMember(owner = "loader!ul", name = "q", descriptor = "Ljava/lang/String;")
	private String aString93;

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ul", name = "p", descriptor = "[Lloader!kr;")
	private final Class282[] aClass282Array1;

	@OriginalMember(owner = "loader!ul", name = "f", descriptor = "Lloader!b;")
	private Class277 aClass277_1;

	@OriginalMember(owner = "loader!ul", name = "z", descriptor = "Lloader!a;")
	private Class276 aClass276_1;

	@OriginalMember(owner = "loader!ul", name = "u", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
	private static File method6403(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg1);
		if (local4 != null) {
			return local4;
		}
		@Pc(54) String[] local54 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString88, "/tmp/", "" };
		@Pc(79) String[] local79 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(86) int local86 = 0; local86 < local79.length; local86++) {
				for (@Pc(96) int local96 = 0; local96 < local54.length; local96++) {
					@Pc(130) String local130 = local54[local96] + local79[local86] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
					@Pc(132) RandomAccessFile local132 = null;
					try {
						@Pc(137) File local137 = new File(local130);
						if (local81 != 0 || local137.exists()) {
							@Pc(149) String local149 = local54[local96];
							if (local81 != 1 || local149.length() <= 0 || (new File(local149)).exists()) {
								(new File(local54[local96] + local79[local86])).mkdir();
								if (arg2 != null) {
									(new File(local54[local96] + local79[local86] + "/" + arg2)).mkdir();
								}
								local132 = new RandomAccessFile(local137, "rw");
								@Pc(216) int local216 = local132.read();
								local132.seek(0L);
								local132.write(local216);
								local132.seek(0L);
								local132.close();
								aHashtable4.put(arg1, local137);
								return local137;
							}
						}
					} catch (@Pc(235) Exception local235) {
						try {
							if (local132 != null) {
								local132.close();
							}
						} catch (@Pc(243) Exception local243) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lloader!kr;")
	private static Class282 method6404(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(25) String local25;
		if (arg2 == 33) {
			local25 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local25 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local25 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(97) String[] local97 = new String[] { "c:/rscache/", "/rscache/", aString88, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(99) int local99 = 0; local99 < local97.length; local99++) {
			@Pc(107) String local107 = local97[local99];
			if (local107.length() <= 0 || (new File(local107)).exists()) {
				try {
					return new Class282(new File(local107, local25), "rw", 10000L);
				} catch (@Pc(134) Exception local134) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ul", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class283(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt8034 = arg1;
		this.aString93 = arg2;
		aString91 = "1.1";
		this.anApplet3 = arg0;
		aString95 = "Unknown";
		try {
			aString95 = System.getProperty("java.vendor");
			aString91 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString94 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString94 = "Unknown";
		}
		aString90 = aString94.toLowerCase();
		try {
			aString92 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString92 = "";
		}
		try {
			aString89 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString89 = "";
		}
		try {
			aString88 = System.getProperty("user.home");
			if (aString88 != null) {
				aString88 = aString88 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString88 == null) {
			aString88 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(97) Throwable local97) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass282_2 = new Class282(method6403(this.anInt8034, "random.dat", null), "rw", 25L);
		this.aClass282_1 = new Class282(this.method6388("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass282_3 = new Class282(this.method6388("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass282Array1 = new Class282[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass282Array1[local192] = new Class282(this.method6388("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass277_1 = new Class277();
		} catch (@Pc(228) Throwable local228) {
		}
		try {
			this.aClass276_1 = new Class276();
		} catch (@Pc(235) Throwable local235) {
		}
		@Pc(238) ThreadGroup local238 = Thread.currentThread().getThreadGroup();
		for (@Pc(241) ThreadGroup local241 = local238.getParent(); local241 != null; local241 = local241.getParent()) {
			local238 = local241;
		}
		@Pc(252) Thread[] local252 = new Thread[1000];
		local238.enumerate(local252);
		for (@Pc(258) int local258 = 0; local258 < local252.length; local258++) {
			if (local252[local258] != null && local252[local258].getName().startsWith("AWT")) {
				local252[local258].setPriority(1);
			}
		}
		this.aBoolean594 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!ul", name = "b", descriptor = "(I)Z")
	private boolean method6379() {
		return this.aClass277_1 != null;
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Ljava/awt/Component;IBLjava/awt/Point;[II)Lloader!gm;")
	private Class279 method6380(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) Point arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (arg2 != 2) {
			this.method6393(null, 12, 71, -127);
		}
		return this.method6393(new Object[] { arg0, arg4, arg3 }, arg1, 17, arg5);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(IBLjava/awt/Component;I)Lloader!gm;")
	private Class279 method6381(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (arg1 == 35) {
			@Pc(8) Point local8 = arg2.getLocationOnScreen();
			return this.method6393(null, local8.x + arg0, 14, local8.y + arg3);
		} else {
			return (Class279) null;
		}
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(IIIII)Lloader!gm;")
	private Class279 method6382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != -1732491344) {
			this.method6388(null);
		}
		return this.method6393(null, arg0 + (arg4 << 16), 6, (arg3 << 16) + arg1);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Z)V")
	private void method6383(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (arg0) {
				return;
			}
			this.aBoolean594 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass282_1 != null) {
			try {
				this.aClass282_1.method6366();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass282_3 != null) {
			try {
				this.aClass282_3.method6366();
			} catch (@Pc(47) IOException local47) {
			}
		}
		if (this.aClass282Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass282Array1.length; local53++) {
				if (this.aClass282Array1[local53] != null) {
					try {
						this.aClass282Array1[local53].method6366();
					} catch (@Pc(75) IOException local75) {
					}
				}
			}
		}
		if (this.aClass282_2 != null) {
			try {
				this.aClass282_2.method6366();
			} catch (@Pc(87) IOException local87) {
			}
		}
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lloader!gm;")
	private Class279 method6384(@OriginalArg(0) byte arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		if (arg0 <= 78) {
			this.method6390(91, null);
		}
		return this.method6393(new Object[] { arg1, arg2 }, 0, 9, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "c", descriptor = "(I)Lloader!gm;")
	private Class279 method6385() {
		return this.method6393(null, 0, 18, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "b", descriptor = "(Ljava/lang/String;I)Lloader!gm;")
	private Class279 method6386(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method6400(91, 39, false, 17, null);
		}
		return this.method6393(arg0, 0, 21, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!gm;")
	private Class279 method6387(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 124) {
			aString92 = null;
		}
		return this.method6393(arg0, 0, 4, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method6388(@OriginalArg(0) String arg0) {
		return method6403(this.anInt8034, arg0, this.aString93);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(I)Lloader!mt;")
	private Interface15 method6389(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			aString94 = null;
		}
		return this.anInterface15_1;
	}

	@OriginalMember(owner = "loader!ul", name = "b", descriptor = "(ILjava/lang/String;)Lloader!gm;")
	private Class279 method6390(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == 16 ? this.method6393(arg1, 0, 16, 0) : (Class279) null;
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(IB)Lloader!gm;")
	private Class279 method6391(@OriginalArg(0) int arg0) {
		return this.method6393(null, arg0, 3, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lloader!gm;")
	private Class279 method6392(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Class[] arg2) {
		return this.method6393(new Object[] { arg1, arg0, arg2 }, 0, 8, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Lloader!gm;")
	private Class279 method6393(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class279 local3 = new Class279();
		local3.anInt8027 = arg1;
		local3.anInt8028 = arg3;
		local3.anInt8029 = arg2;
		local3.anObject12 = arg0;
		synchronized (this) {
			if (this.aClass279_3 == null) {
				this.aClass279_3 = this.aClass279_2 = local3;
			} else {
				this.aClass279_3.aClass279_1 = local3;
				this.aClass279_3 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(ZLjava/awt/Frame;)Lloader!gm;")
	private Class279 method6394(@OriginalArg(0) boolean arg0, @OriginalArg(1) Frame arg1) {
		if (arg0) {
			this.method6387(null, 58);
		}
		return this.method6393(arg1, 0, 7, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(ZLjava/lang/String;Z)Lloader!gm;")
	private Class279 method6395(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg0) {
			this.method6408(9);
		}
		return arg2 ? this.method6393(arg1, 0, 12, 0) : this.method6393(arg1, 0, 13, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(BLjava/lang/Class;)V")
	private void method6396(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString90.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg0, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local36, Boolean.TRUE);
		if (!aString90.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg0, this.method6388("sw3d.dll").toString());
		local25.invoke(local36, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(BLjava/awt/Component;Z)Lloader!gm;")
	private Class279 method6397(@OriginalArg(0) byte arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		return arg0 >= -115 ? (Class279) null : this.method6393(arg1, arg2 ? 1 : 0, 15, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(ILjava/lang/String;)[B")
	private byte[] method6398(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -30326) {
			this.aClass279_3 = null;
		}
		@Pc(14) Class279 local14 = this.method6400(0, 21, false, 0, arg1);
		return (byte[]) local14.anObject11;
	}

	@OriginalMember(owner = "loader!ul", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class279 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean594) {
						return;
					}
					if (this.aClass279_2 != null) {
						local16 = this.aClass279_2;
						this.aClass279_2 = this.aClass279_2.aClass279_1;
						if (this.aClass279_2 == null) {
							this.aClass279_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local16.anInt8029;
				if (local44 == 1) {
					if (aLong233 > Class281.method6360()) {
						throw new IOException();
					}
					local16.anObject11 = new Socket(InetAddress.getByName((String) local16.anObject12), local16.anInt8027);
				} else if (local44 == 2) {
					@Pc(61) Thread local61 = new Thread((Runnable) local16.anObject12);
					local61.setDaemon(true);
					local61.start();
					local61.setPriority(local16.anInt8027);
					local16.anObject11 = local61;
				} else if (local44 == 4) {
					if (aLong233 > Class281.method6360()) {
						throw new IOException();
					}
					local16.anObject11 = new DataInputStream(((URL) local16.anObject12).openStream());
				} else {
					@Pc(92) Object[] local92;
					if (local44 == 8) {
						local92 = (Object[]) local16.anObject12;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local92[0]).getDeclaredMethod((String) local92[1], (Class[]) local92[2]);
					} else if (local44 == 9) {
						local92 = (Object[]) local16.anObject12;
						if (((Class) local92[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local92[0]).getDeclaredField((String) local92[1]);
					} else if (local44 == 18) {
						@Pc(124) Clipboard local124 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject11 = local124.getContents(null);
					} else if (local44 == 19) {
						@Pc(625) Transferable local625 = (Transferable) local16.anObject12;
						@Pc(628) Clipboard local628 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local628.setContents(local625, null);
					} else {
						@Pc(186) String local186;
						if (local44 == 3) {
							if (Class281.method6360() < aLong233) {
								throw new IOException();
							}
							local186 = (local16.anInt8027 >> 24 & 0xFF) + "." + (local16.anInt8027 >> 16 & 0xFF) + "." + (local16.anInt8027 >> 8 & 0xFF) + "." + (local16.anInt8027 & 0xFF);
							local16.anObject11 = InetAddress.getByName(local186).getHostName();
						} else if (local44 == 21) {
							if (aLong233 > Class281.method6360()) {
								throw new IOException();
							}
							local16.anObject11 = InetAddress.getByName((String) local16.anObject12).getAddress();
						} else if (local44 == 5) {
							local16.anObject11 = this.aClass277_1.method6346();
						} else if (local44 == 6) {
							@Pc(593) Frame local593 = new Frame("Jagex Full Screen");
							local16.anObject11 = local593;
							local593.setResizable(false);
							this.aClass277_1.method6348(local593, local16.anInt8027 & 0xFFFF, local16.anInt8028 & 0xFFFF, local16.anInt8028 >> 16, local16.anInt8027 >>> 16);
						} else if (local44 == 7) {
							this.aClass277_1.method6347();
						} else {
							@Pc(258) int local258;
							if (local44 == 11) {
								@Pc(245) Field local245 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local245.setAccessible(true);
								@Pc(256) Vector local256 = (Vector) local245.get(((Class) local16.anObject12).getClassLoader());
								for (local258 = 0; local256.size() > local258; local258++) {
									@Pc(266) Object local266 = local256.elementAt(local258);
									@Pc(273) Method local273 = local266.getClass().getDeclaredMethod("finalize");
									local273.setAccessible(true);
									local273.invoke(local266);
									local273.setAccessible(false);
									@Pc(290) Field local290 = local266.getClass().getDeclaredField("handle");
									local290.setAccessible(true);
									local290.set(local266, Integer.valueOf(0));
									local290.setAccessible(false);
								}
								local245.setAccessible(false);
							} else {
								@Pc(565) Class282 local565;
								if (local44 == 12) {
									local565 = method6404((String) local16.anObject12, this.aString93, this.anInt8034);
									local16.anObject11 = local565;
								} else if (local44 == 13) {
									local565 = method6404((String) local16.anObject12, "", this.anInt8034);
									local16.anObject11 = local565;
								} else if (local44 == 14) {
									@Pc(321) int local321 = local16.anInt8027;
									@Pc(324) int local324 = local16.anInt8028;
									this.aClass276_1.method6344(local324, local321);
								} else if (local44 == 15) {
									@Pc(346) boolean local346 = local16.anInt8027 != 0;
									@Pc(350) Component local350 = (Component) local16.anObject12;
									this.aClass276_1.method6343(local346, local350);
								} else if (local44 == 17) {
									local92 = (Object[]) local16.anObject12;
									this.aClass276_1.method6345(local16.anInt8028, local16.anInt8027, (Component) local92[0], (Point) local92[2], (int[]) local92[1]);
								} else if (local44 == 16) {
									try {
										if (!aString90.startsWith("win")) {
											throw new Exception();
										}
										local186 = (String) local16.anObject12;
										if (!local186.startsWith("http://") && !local186.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(417) String local417 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local258 = 0; local186.length() > local258; local258++) {
											if (local417.indexOf(local186.charAt(local258)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local186 + "\"");
										local16.anObject11 = null;
									} catch (@Pc(459) Exception local459) {
										local16.anObject11 = local459;
										throw local459;
									}
								} else if (local44 == 20) {
									try {
										@Pc(480) Class[] local480 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(482) Runtime local482 = Runtime.getRuntime();
										@Pc(488) Method local488 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local480);
										local488.setAccessible(true);
										if (aString90.startsWith("win")) {
											if (aString92.startsWith("amd64") || aString92.startsWith("x86_64")) {
												local488.invoke(local482, local16.anObject12, this.method6388("jagmisc64.dll").toString());
											} else {
												local488.invoke(local482, local16.anObject12, this.method6388("jagmisc.dll").toString());
											}
										}
										local488.setAccessible(false);
									} catch (@Pc(547) Throwable local547) {
										local16.anObject11 = local547;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local16.anInt8026 = 1;
			} catch (@Pc(716) ThreadDeath local716) {
				throw local716;
			} catch (@Pc(719) Throwable local719) {
				local16.anInt8026 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(B)Lloader!gm;")
	private Class279 method6399(@OriginalArg(0) byte arg0) {
		return arg0 > -53 ? (Class279) null : this.method6393(null, 0, 5, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(IIZILjava/lang/Object;)Lloader!gm;")
	private Class279 method6400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class279 local3 = new Class279();
		synchronized (local3) {
			local3.anObject12 = arg4;
			local3.anInt8029 = arg1;
			local3.anInt8028 = arg0;
			local3.anInt8027 = arg3;
			synchronized (this) {
				if (this.aClass279_3 == null) {
					this.aClass279_3 = this.aClass279_2 = local3;
				} else {
					this.aClass279_3.aClass279_1 = local3;
					this.aClass279_3 = local3;
				}
				this.notify();
			}
			try {
				if (arg2) {
					this.aString93 = null;
				}
				local3.wait();
			} catch (@Pc(61) InterruptedException local61) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!gm;")
	private Class279 method6401(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > -18) {
			this.run();
		}
		return this.method6393(arg0, arg1, 1, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!gm;")
	private Class279 method6402(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == 0 ? this.method6393(arg0, 0, 11, 0) : (Class279) null;
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lloader!gm;")
	private Class279 method6405(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != 24305) {
			this.aThread6 = null;
		}
		return this.method6393(arg0, arg2, 2, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "b", descriptor = "(Ljava/lang/Class;I)Lloader!gm;")
	private Class279 method6406(@OriginalArg(0) Class arg0) {
		return this.method6393(arg0, 0, 20, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lloader!gm;")
	private Class279 method6407(@OriginalArg(0) byte arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != -37) {
			this.method6407((byte) -73, null);
		}
		return this.method6393(arg1, 0, 19, 0);
	}

	@OriginalMember(owner = "loader!ul", name = "d", descriptor = "(I)V")
	private void method6408(@OriginalArg(0) int arg0) {
		if (arg0 == 1791807024) {
			aLong233 = Class281.method6360() + 5000L;
		}
	}
}
