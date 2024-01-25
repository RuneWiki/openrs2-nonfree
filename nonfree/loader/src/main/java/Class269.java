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

@OriginalClass("loader!ci")
public final class Class269 implements Runnable {

	@OriginalMember(owner = "loader!ci", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString90;

	@OriginalMember(owner = "loader!ci", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString91;

	@OriginalMember(owner = "loader!ci", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString92;

	@OriginalMember(owner = "loader!ci", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString93;

	@OriginalMember(owner = "loader!ci", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString94;

	@OriginalMember(owner = "loader!ci", name = "z", descriptor = "Ljava/lang/String;")
	private static String aString96;

	@OriginalMember(owner = "loader!ci", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString97;

	@OriginalMember(owner = "loader!ci", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ci", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ci", name = "v", descriptor = "I")
	private static final int anInt7801 = 1;

	@OriginalMember(owner = "loader!ci", name = "d", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable3 = new Hashtable(16);

	@OriginalMember(owner = "loader!ci", name = "x", descriptor = "J")
	private static volatile long aLong238 = 0L;

	@OriginalMember(owner = "loader!ci", name = "g", descriptor = "Lloader!ql;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ci", name = "i", descriptor = "Lloader!mg;")
	private Class276 aClass276_1 = null;

	@OriginalMember(owner = "loader!ci", name = "j", descriptor = "Lloader!hi;")
	private Class275 aClass275_2 = null;

	@OriginalMember(owner = "loader!ci", name = "q", descriptor = "Lloader!hi;")
	private Class275 aClass275_1 = null;

	@OriginalMember(owner = "loader!ci", name = "p", descriptor = "Z")
	private boolean aBoolean661 = false;

	@OriginalMember(owner = "loader!ci", name = "A", descriptor = "Lloader!mg;")
	private Class276 aClass276_2 = null;

	@OriginalMember(owner = "loader!ci", name = "e", descriptor = "Lloader!hi;")
	private Class275 aClass275_3 = null;

	@OriginalMember(owner = "loader!ci", name = "n", descriptor = "Ljava/lang/String;")
	private final String aString95;

	@OriginalMember(owner = "loader!ci", name = "u", descriptor = "I")
	private final int anInt7800;

	@OriginalMember(owner = "loader!ci", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ci", name = "t", descriptor = "[Lloader!hi;")
	private Class275[] aClass275Array1;

	@OriginalMember(owner = "loader!ci", name = "l", descriptor = "Lloader!d;")
	private Class270 aClass270_1;

	@OriginalMember(owner = "loader!ci", name = "k", descriptor = "Lloader!e;")
	private Class271 aClass271_1;

	@OriginalMember(owner = "loader!ci", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method6036(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable3.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString96, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local70.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local45.length; local93++) {
					@Pc(132) String local132 = local45[local93] + local70[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local78 != 0 || local139.exists()) {
							@Pc(150) String local150 = local45[local93];
							if (local78 != 1 || local150.length() <= 0 || (new File(local150)).exists()) {
								(new File(local45[local93] + local70[local83])).mkdir();
								if (arg1 != null) {
									(new File(local45[local93] + local70[local83] + "/" + arg1)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(219) int local219 = local134.read();
								local134.seek(0L);
								local134.write(local219);
								local134.seek(0L);
								local134.close();
								aHashtable3.put(arg2, local139);
								return local139;
							}
						}
					} catch (@Pc(238) Exception local238) {
						try {
							if (local134 != null) {
								local134.close();
							}
						} catch (@Pc(247) Exception local247) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lloader!hi;")
	private static Class275 method6042(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(25) String local25;
		if (arg1 == 33) {
			local25 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local25 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local25 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(95) String[] local95 = new String[] { "c:/rscache/", "/rscache/", aString96, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(97) int local97 = 0; local97 < local95.length; local97++) {
			@Pc(109) String local109 = local95[local97];
			if (local109.length() <= 0 || (new File(local109)).exists()) {
				try {
					return new Class275(new File(local109, local25), "rw", 10000L);
				} catch (@Pc(133) Exception local133) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ci", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class269(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString93 = "Unknown";
		this.aString95 = arg2;
		this.anApplet2 = arg0;
		this.anInt7800 = arg1;
		aString91 = "1.1";
		try {
			aString93 = System.getProperty("java.vendor");
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
			aString97 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString97 = "";
		}
		try {
			aString92 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString92 = "";
		}
		try {
			aString96 = System.getProperty("user.home");
			if (aString96 != null) {
				aString96 = aString96 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString96 == null) {
			aString96 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
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
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass275_1 = new Class275(method6036(this.anInt7800, null, "random.dat"), "rw", 25L);
		this.aClass275_2 = new Class275(this.method6021("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass275_3 = new Class275(this.method6021("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass275Array1 = new Class275[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass275Array1[local193] = new Class275(this.method6021("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass270_1 = new Class270();
		} catch (@Pc(229) Throwable local229) {
		}
		try {
			this.aClass271_1 = new Class271();
		} catch (@Pc(236) Throwable local236) {
		}
		@Pc(239) ThreadGroup local239 = Thread.currentThread().getThreadGroup();
		for (@Pc(242) ThreadGroup local242 = local239.getParent(); local242 != null; local242 = local242.getParent()) {
			local239 = local242;
		}
		@Pc(254) Thread[] local254 = new Thread[1000];
		local239.enumerate(local254);
		for (@Pc(260) int local260 = 0; local260 < local254.length; local260++) {
			if (local254[local260] != null && local254[local260].getName().startsWith("AWT")) {
				local254[local260].setPriority(1);
			}
		}
		this.aBoolean661 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!ci", name = "d", descriptor = "(I)V")
	private void method6018(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean661 = true;
			this.notifyAll();
		}
		if (arg0 >= -30) {
			return;
		}
		try {
			this.aThread4.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		if (this.aClass275_2 != null) {
			try {
				this.aClass275_2.method6058();
			} catch (@Pc(35) IOException local35) {
			}
		}
		if (this.aClass275_3 != null) {
			try {
				this.aClass275_3.method6058();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass275Array1 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aClass275Array1.length; local51++) {
				if (this.aClass275Array1[local51] != null) {
					try {
						this.aClass275Array1[local51].method6058();
					} catch (@Pc(74) IOException local74) {
					}
				}
			}
		}
		if (this.aClass275_1 != null) {
			try {
				this.aClass275_1.method6058();
			} catch (@Pc(85) IOException local85) {
			}
		}
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!mg;")
	private Class276 method6019(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 != 1) {
			this.aClass271_1 = null;
		}
		return this.method6047(arg2, -27662, 1, arg1, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(ZLjava/awt/Component;I)Lloader!mg;")
	private Class276 method6020(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			method6042(null, -3, null);
		}
		return this.method6047(arg0 ? 1 : 0, -27662, 15, arg1, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "c", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method6021(@OriginalArg(1) String arg0) {
		return method6036(this.anInt7800, this.aString95, arg0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!mg;")
	private Class276 method6022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (arg1 == -22623) {
			@Pc(8) Point local8 = arg3.getLocationOnScreen();
			return this.method6047(local8.x + arg0, -27662, 14, null, arg2 + local8.y);
		} else {
			return (Class276) null;
		}
	}

	@OriginalMember(owner = "loader!ci", name = "c", descriptor = "(I)Z")
	private boolean method6023(@OriginalArg(0) int arg0) {
		if (arg0 >= -93) {
			this.method6038(null, (byte) -74);
		}
		return this.aClass270_1 != null;
	}

	@OriginalMember(owner = "loader!ci", name = "b", descriptor = "(B)Lloader!ql;")
	private Interface14 method6024(@OriginalArg(0) byte arg0) {
		if (arg0 != 43) {
			this.method6023(47);
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(Ljava/awt/Frame;Z)Lloader!mg;")
	private Class276 method6025(@OriginalArg(0) Frame arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.aClass276_1 = null;
		}
		return this.method6047(0, -27662, 7, arg0, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(I)Lloader!mg;")
	private Class276 method6026(@OriginalArg(0) int arg0) {
		if (arg0 != 6343) {
			method6042(null, -72, null);
		}
		return this.method6047(0, -27662, 18, null, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(Ljava/lang/String;I)Lloader!mg;")
	private Class276 method6027(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return arg1 > -32 ? (Class276) null : this.method6047(0, -27662, 16, arg0, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(IIIII)Lloader!mg;")
	private Class276 method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg1 == 29586 ? this.method6047(arg2 + (arg3 << 16), -27662, 6, null, arg4 + (arg0 << 16)) : (Class276) null;
	}

	@OriginalMember(owner = "loader!ci", name = "b", descriptor = "(ILjava/lang/Class;)Lloader!mg;")
	private Class276 method6029(@OriginalArg(1) Class arg0) {
		return this.method6047(0, -27662, 11, arg0, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(B)V")
	private void method6030(@OriginalArg(0) byte arg0) {
		aLong238 = Class273.method6055() + 5000L;
		if (arg0 > -28) {
			this.method6038(null, (byte) 118);
		}
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(IILjava/lang/Runnable;)Lloader!mg;")
	private Class276 method6031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Runnable arg2) {
		if (arg0 > -7) {
			aString91 = null;
		}
		return this.method6047(arg1, -27662, 2, arg2, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(I[IIILjava/awt/Point;Ljava/awt/Component;)Lloader!mg;")
	private Class276 method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Point arg4, @OriginalArg(5) Component arg5) {
		if (arg2 != -21560) {
			this.method6022(-11, -100, 94, null);
		}
		return this.method6047(arg3, -27662, 17, new Object[] { arg5, arg1, arg4 }, arg0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(ILjava/lang/String;)Lloader!mg;")
	private Class276 method6033(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 33) {
			this.method6031(-104, -124, null);
		}
		return this.method6047(0, -27662, 21, arg1, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "b", descriptor = "(ILjava/lang/String;)Lloader!mg;")
	private Class276 method6034(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != 12619) {
			this.anApplet2 = null;
		}
		return this.method6047(0, -27662, 12, arg1, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "c", descriptor = "(ILjava/lang/Class;)V")
	private void method6035(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString90.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg1, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		if (arg0 != 1) {
			this.aClass275Array1 = null;
		}
		local25.invoke(local36, Boolean.TRUE);
		if (!aString90.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg1, this.method6021("sw3d.dll").toString());
		local25.invoke(local36, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!ci", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class276 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean661) {
						return;
					}
					if (this.aClass276_1 != null) {
						local16 = this.aClass276_1;
						this.aClass276_1 = this.aClass276_1.aClass276_3;
						if (this.aClass276_1 == null) {
							this.aClass276_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt7811;
				if (local45 == 1) {
					if (Class273.method6055() < aLong238) {
						throw new IOException();
					}
					local16.anObject11 = new Socket(InetAddress.getByName((String) local16.anObject12), local16.anInt7808);
				} else if (local45 == 2) {
					@Pc(660) Thread local660 = new Thread((Runnable) local16.anObject12);
					local660.setDaemon(true);
					local660.start();
					local660.setPriority(local16.anInt7808);
					local16.anObject11 = local660;
				} else if (local45 == 4) {
					if (Class273.method6055() < aLong238) {
						throw new IOException();
					}
					local16.anObject11 = new DataInputStream(((URL) local16.anObject12).openStream());
				} else {
					@Pc(90) Object[] local90;
					if (local45 == 8) {
						local90 = (Object[]) local16.anObject12;
						if (((Class) local90[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local90[0]).getDeclaredMethod((String) local90[1], (Class[]) local90[2]);
					} else if (local45 == 9) {
						local90 = (Object[]) local16.anObject12;
						if (((Class) local90[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local90[0]).getDeclaredField((String) local90[1]);
					} else if (local45 == 18) {
						@Pc(128) Clipboard local128 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject11 = local128.getContents(null);
					} else if (local45 == 19) {
						@Pc(143) Transferable local143 = (Transferable) local16.anObject12;
						@Pc(146) Clipboard local146 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local146.setContents(local143, null);
					} else {
						@Pc(205) String local205;
						if (local45 == 3) {
							if (Class273.method6055() < aLong238) {
								throw new IOException();
							}
							local205 = (local16.anInt7808 >> 24 & 0xFF) + "." + (local16.anInt7808 >> 16 & 0xFF) + "." + (local16.anInt7808 >> 8 & 0xFF) + "." + (local16.anInt7808 & 0xFF);
							local16.anObject11 = InetAddress.getByName(local205).getHostName();
						} else if (local45 == 21) {
							if (Class273.method6055() < aLong238) {
								throw new IOException();
							}
							local16.anObject11 = InetAddress.getByName((String) local16.anObject12).getAddress();
						} else if (local45 == 5) {
							local16.anObject11 = this.aClass270_1.method6048();
						} else if (local45 == 6) {
							@Pc(597) Frame local597 = new Frame("Jagex Full Screen");
							local16.anObject11 = local597;
							local597.setResizable(false);
							this.aClass270_1.method6051(local16.anInt7810 >> 16, local597, local16.anInt7810 & 0xFFFF, local16.anInt7808 & 0xFFFF, local16.anInt7808 >>> 16);
						} else if (local45 == 7) {
							this.aClass270_1.method6050();
						} else {
							@Pc(447) int local447;
							if (local45 == 11) {
								@Pc(524) Field local524 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local524.setAccessible(true);
								@Pc(535) Vector local535 = (Vector) local524.get(((Class) local16.anObject12).getClassLoader());
								for (local447 = 0; local447 < local535.size(); local447++) {
									@Pc(549) Object local549 = local535.elementAt(local447);
									@Pc(556) Method local556 = local549.getClass().getDeclaredMethod("finalize");
									local556.setAccessible(true);
									local556.invoke(local549);
									local556.setAccessible(false);
									@Pc(573) Field local573 = local549.getClass().getDeclaredField("handle");
									local573.setAccessible(true);
									local573.set(local549, Integer.valueOf(0));
									local573.setAccessible(false);
								}
								local524.setAccessible(false);
							} else if (local45 == 12) {
								@Pc(515) Class275 local515 = method6042((String) local16.anObject12, this.anInt7800, this.aString95);
								local16.anObject11 = local515;
							} else if (local45 == 14) {
								@Pc(495) int local495 = local16.anInt7808;
								@Pc(498) int local498 = local16.anInt7810;
								this.aClass271_1.method6054(local495, local498);
							} else if (local45 == 15) {
								@Pc(277) boolean local277 = local16.anInt7808 != 0;
								@Pc(281) Component local281 = (Component) local16.anObject12;
								this.aClass271_1.method6052(local277, local281);
							} else if (local45 == 17) {
								local90 = (Object[]) local16.anObject12;
								this.aClass271_1.method6053((Point) local90[2], local16.anInt7810, local16.anInt7808, (Component) local90[0], (int[]) local90[1]);
							} else if (local45 == 16) {
								try {
									if (!aString90.startsWith("win")) {
										throw new Exception();
									}
									local205 = (String) local16.anObject12;
									if (!local205.startsWith("http://") && !local205.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(445) String local445 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local447 = 0; local205.length() > local447; local447++) {
										if (local445.indexOf(local205.charAt(local447)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local205 + "\"");
									local16.anObject11 = null;
								} catch (@Pc(487) Exception local487) {
									local16.anObject11 = local487;
									throw local487;
								}
							} else if (local45 == 20) {
								try {
									@Pc(341) Class[] local341 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(343) Runtime local343 = Runtime.getRuntime();
									@Pc(349) Method local349 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local341);
									local349.setAccessible(true);
									if (aString90.startsWith("win")) {
										if (aString97.startsWith("amd64") || aString97.startsWith("x86_64")) {
											local349.invoke(local343, local16.anObject12, this.method6021("jagmisc64.dll").toString());
										} else {
											local349.invoke(local343, local16.anObject12, this.method6021("jagmisc.dll").toString());
										}
									}
									local349.setAccessible(false);
								} catch (@Pc(409) Throwable local409) {
									local16.anObject11 = local409;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local16.anInt7809 = 1;
			} catch (@Pc(699) ThreadDeath local699) {
				throw local699;
			} catch (@Pc(702) Throwable local702) {
				local16.anInt7809 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!mg;")
	private Class276 method6037(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 95) {
			aMethod4 = null;
		}
		return this.method6047(0, -27662, 4, arg0, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method6038(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -102) {
			this.aBoolean661 = false;
		}
		@Pc(13) Class276 local13 = this.method6045(0, 125, 21, arg0, 0);
		return (byte[]) local13.anObject11;
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lloader!mg;")
	private Class276 method6039(@OriginalArg(0) Transferable arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 119) {
			aMethod3 = null;
		}
		return this.method6047(0, -27662, 19, arg0, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(II)Lloader!mg;")
	private Class276 method6040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 3) {
			this.anApplet2 = null;
		}
		return this.method6047(arg0, arg1 ^ 0xFFFF93F1, 3, null, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(ILjava/lang/Class;)Lloader!mg;")
	private Class276 method6041(@OriginalArg(1) Class arg0) {
		return this.method6047(0, -27662, 20, arg0, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lloader!mg;")
	private Class276 method6043(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		if (arg1 < 50) {
			this.anApplet2 = null;
		}
		return this.method6047(0, -27662, 9, new Object[] { arg0, arg2 }, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lloader!mg;")
	private Class276 method6044(@OriginalArg(0) Class[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) String arg3) {
		if (arg1 > -70) {
			this.method6031(-85, 57, null);
		}
		return this.method6047(0, -27662, 8, new Object[] { arg2, arg3, arg0 }, 0);
	}

	@OriginalMember(owner = "loader!ci", name = "a", descriptor = "(IIILjava/lang/Object;I)Lloader!mg;")
	private Class276 method6045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class276 local3 = new Class276();
		synchronized (local3) {
			if (arg1 <= 105) {
				aString96 = null;
			}
			local3.anInt7810 = arg0;
			local3.anObject12 = arg3;
			local3.anInt7811 = arg2;
			local3.anInt7808 = arg4;
			synchronized (this) {
				if (this.aClass276_2 == null) {
					this.aClass276_2 = this.aClass276_1 = local3;
				} else {
					this.aClass276_2.aClass276_3 = local3;
					this.aClass276_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(61) InterruptedException local61) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ci", name = "b", descriptor = "(I)Lloader!mg;")
	private Class276 method6046(@OriginalArg(0) int arg0) {
		return arg0 == -16017 ? this.method6047(0, arg0 ^ 0x529D, 5, null, 0) : (Class276) null;
	}

	@OriginalMember(owner = "loader!ci", name = "b", descriptor = "(IIILjava/lang/Object;I)Lloader!mg;")
	private Class276 method6047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Object arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class276 local3 = new Class276();
		local3.anInt7808 = arg0;
		if (arg1 != -27662) {
			this.method6045(95, -30, 124, null, -82);
		}
		local3.anInt7811 = arg2;
		local3.anInt7810 = arg4;
		local3.anObject12 = arg3;
		synchronized (this) {
			if (this.aClass276_2 == null) {
				this.aClass276_2 = this.aClass276_1 = local3;
			} else {
				this.aClass276_2.aClass276_3 = local3;
				this.aClass276_2 = local3;
			}
			this.notify();
			return local3;
		}
	}
}
