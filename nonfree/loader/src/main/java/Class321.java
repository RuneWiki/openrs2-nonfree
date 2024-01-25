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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!ae")
public final class Class321 implements Runnable {

	@OriginalMember(owner = "loader!ae", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString85;

	@OriginalMember(owner = "loader!ae", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString86;

	@OriginalMember(owner = "loader!ae", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString87;

	@OriginalMember(owner = "loader!ae", name = "v", descriptor = "Ljava/lang/String;")
	private static String aString88;

	@OriginalMember(owner = "loader!ae", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString89;

	@OriginalMember(owner = "loader!ae", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString90;

	@OriginalMember(owner = "loader!ae", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString91;

	@OriginalMember(owner = "loader!ae", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ae", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ae", name = "l", descriptor = "I")
	private static int anInt9179 = 1;

	@OriginalMember(owner = "loader!ae", name = "m", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable8 = new Hashtable(16);

	@OriginalMember(owner = "loader!ae", name = "x", descriptor = "J")
	private static volatile long aLong255 = 0L;

	@OriginalMember(owner = "loader!ae", name = "j", descriptor = "Lloader!tba;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "Lloader!ei;")
	private Class325 aClass325_1 = null;

	@OriginalMember(owner = "loader!ae", name = "i", descriptor = "Lloader!fca;")
	private Class327 aClass327_2 = null;

	@OriginalMember(owner = "loader!ae", name = "u", descriptor = "Lloader!fca;")
	private Class327 aClass327_1 = null;

	@OriginalMember(owner = "loader!ae", name = "f", descriptor = "Lloader!ei;")
	private Class325 aClass325_2 = null;

	@OriginalMember(owner = "loader!ae", name = "o", descriptor = "Lloader!fca;")
	private Class327 aClass327_3 = null;

	@OriginalMember(owner = "loader!ae", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ae", name = "d", descriptor = "Z")
	private boolean aBoolean672 = false;

	@OriginalMember(owner = "loader!ae", name = "q", descriptor = "Ljava/lang/String;")
	private String aString92;

	@OriginalMember(owner = "loader!ae", name = "k", descriptor = "I")
	private final int anInt9178;

	@OriginalMember(owner = "loader!ae", name = "n", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ae", name = "e", descriptor = "[Lloader!fca;")
	private final Class327[] aClass327Array1;

	@OriginalMember(owner = "loader!ae", name = "A", descriptor = "Lloader!b;")
	private Class322 aClass322_1;

	@OriginalMember(owner = "loader!ae", name = "c", descriptor = "Lloader!f;")
	private Class326 aClass326_1;

	@OriginalMember(owner = "loader!ae", name = "z", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
	private static File method7466(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) File local4 = (File) aHashtable8.get(arg0);
		if (local4 != null) {
			return local4;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString91, "/tmp/", "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(83) int local83 = 0; local83 < local76.length; local83++) {
				for (@Pc(93) int local93 = 0; local93 < local51.length; local93++) {
					@Pc(131) String local131 = local51[local93] + local76[local83] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
					@Pc(133) RandomAccessFile local133 = null;
					try {
						@Pc(138) File local138 = new File(local131);
						if (local78 != 0 || local138.exists()) {
							@Pc(152) String local152 = local51[local93];
							if (local78 != 1 || local152.length() <= 0 || (new File(local152)).exists()) {
								(new File(local51[local93] + local76[local83])).mkdir();
								if (arg1 != null) {
									(new File(local51[local93] + local76[local83] + "/" + arg1)).mkdir();
								}
								local133 = new RandomAccessFile(local138, "rw");
								@Pc(218) int local218 = local133.read();
								local133.seek(0L);
								local133.write(local218);
								local133.seek(0L);
								local133.close();
								aHashtable8.put(arg0, local138);
								return local138;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local133 != null) {
								local133.close();
							}
						} catch (@Pc(246) Exception local246) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lloader!fca;")
	private static Class327 method7488(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(19) String local19;
		if (arg1 == 33) {
			local19 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local19 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString91, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(99) String local99 = local89[local91];
			if (local99.length() <= 0 || (new File(local99)).exists()) {
				try {
					return new Class327(new File(local99, local19), "rw", 10000L);
				} catch (@Pc(126) Exception local126) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!ae", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class321(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString89 = "Unknown";
		this.anApplet2 = arg0;
		aString90 = "1.1";
		this.aString92 = arg2;
		this.anInt9178 = arg1;
		try {
			aString89 = System.getProperty("java.vendor");
			aString90 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString86 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString86 = "Unknown";
		}
		aString88 = aString86.toLowerCase();
		try {
			aString85 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString85 = "";
		}
		try {
			aString87 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString87 = "";
		}
		try {
			aString91 = System.getProperty("user.home");
			if (aString91 != null) {
				aString91 = aString91 + "/";
			}
		} catch (@Pc(86) Exception local86) {
		}
		if (aString91 == null) {
			aString91 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(96) Throwable local96) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(124) Exception local124) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(152) Exception local152) {
		}
		this.aClass327_3 = new Class327(method7466("random.dat", null, this.anInt9178), "rw", 25L);
		this.aClass327_2 = new Class327(this.method7461("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass327_1 = new Class327(this.method7461("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass327Array1 = new Class327[arg3];
		for (@Pc(193) int local193 = 0; local193 < arg3; local193++) {
			this.aClass327Array1[local193] = new Class327(this.method7461("main_file_cache.idx" + local193), "rw", 1048576L);
		}
		try {
			this.aClass322_1 = new Class322();
		} catch (@Pc(225) Throwable local225) {
		}
		try {
			this.aClass326_1 = new Class326();
		} catch (@Pc(232) Throwable local232) {
		}
		this.aBoolean672 = false;
		this.aThread6 = new Thread(this);
		this.aThread6.setPriority(10);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "loader!ae", name = "e", descriptor = "(I)Lloader!tba;")
	private Interface22 method7460() {
		return this.anInterface22_1;
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method7461(@OriginalArg(0) String arg0) {
		return method7466(arg0, this.aString92, this.anInt9178);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lloader!ei;")
	private Class325 method7462(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2) {
		if (arg1 != 60) {
			this.aString92 = null;
		}
		return this.method7485(new Object[] { arg0, arg2 }, (byte) 104, 9, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(IIBII)Lloader!ei;")
	private Class325 method7463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg2 > -38 ? (Class325) null : this.method7485(null, (byte) 104, 6, arg1 + (arg0 << 16), arg4 + (arg3 << 16));
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(II)Lloader!ei;")
	private Class325 method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == -21666 ? this.method7485(null, (byte) 104, 3, 0, arg0) : (Class325) null;
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(ZLjava/lang/String;B)Lloader!ei;")
	private Class325 method7465(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (arg2 != 68) {
			this.method7482(null, -52);
		}
		return arg0 ? this.method7485(arg1, (byte) 104, 12, 0, 0) : this.method7485(arg1, (byte) 104, 13, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lloader!ei;")
	private Class325 method7467(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1) {
		return this.method7485(arg0, (byte) 104, 15, 0, arg1 ? 1 : 0);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	private byte[] method7468(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (!arg0) {
			aString87 = null;
		}
		@Pc(13) Class325 local13 = this.method7472(21, 0, 0, 22495, arg1);
		return (byte[]) local13.anObject20;
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(ILjava/lang/String;)Lloader!ei;")
	private Class325 method7469(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -7113) {
			this.method7463(12, 122, (byte) -121, -115, -2);
		}
		return this.method7485(arg1, (byte) 104, 21, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "c", descriptor = "(I)V")
	private void method7470(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean672 = true;
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (arg0 != 0) {
			return;
		}
		if (this.aClass327_2 != null) {
			try {
				this.aClass327_2.method7508();
			} catch (@Pc(34) IOException local34) {
			}
		}
		if (this.aClass327_1 != null) {
			try {
				this.aClass327_1.method7508();
			} catch (@Pc(44) IOException local44) {
			}
		}
		if (this.aClass327Array1 != null) {
			for (@Pc(50) int local50 = 0; local50 < this.aClass327Array1.length; local50++) {
				if (this.aClass327Array1[local50] != null) {
					try {
						this.aClass327Array1[local50].method7508();
					} catch (@Pc(68) IOException local68) {
					}
				}
			}
		}
		if (this.aClass327_3 != null) {
			try {
				this.aClass327_3.method7508();
			} catch (@Pc(79) IOException local79) {
			}
		}
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!ei;")
	private Class325 method7471(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg0 != 2471) {
			this.method7473((byte) 105);
		}
		return this.method7485(arg1, (byte) 104, 1, 0, arg2);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(IIIILjava/lang/Object;)Lloader!ei;")
	private Class325 method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class325 local3 = new Class325();
		synchronized (local3) {
			local3.anInt9185 = arg2;
			local3.anInt9186 = arg0;
			local3.anObject19 = arg4;
			local3.anInt9184 = arg1;
			synchronized (this) {
				if (this.aClass325_2 == null) {
					this.aClass325_2 = this.aClass325_1 = local3;
				} else {
					this.aClass325_2.aClass325_3 = local3;
					this.aClass325_2 = local3;
				}
				if (arg3 != 22495) {
					this.anEventQueue2 = null;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(B)Lloader!ei;")
	private Class325 method7473(@OriginalArg(0) byte arg0) {
		if (arg0 > -71) {
			method7488(null, 76, null);
		}
		return this.method7485(null, (byte) 104, 5, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Lloader!ei;")
	private Class325 method7474(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? (Class325) null : this.method7485(arg0, (byte) 104, 2, 0, arg1);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Lloader!ei;")
	private Class325 method7475(@OriginalArg(0) Transferable arg0, @OriginalArg(1) boolean arg1) {
		return arg1 ? (Class325) null : this.method7485(arg0, (byte) 104, 19, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "b", descriptor = "(ILjava/lang/String;)Lloader!ei;")
	private Class325 method7476(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == -14714 ? this.method7485(arg1, (byte) 104, 16, 0, 0) : (Class325) null;
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(I)V")
	private void method7477(@OriginalArg(0) int arg0) {
		if (arg0 == -16733) {
			aLong255 = Class324.method7499() + 5000L;
		}
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(ILjava/net/URL;)Lloader!ei;")
	private Class325 method7478(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 != 17746) {
			this.method7477(54);
		}
		return this.method7485(arg1, (byte) 104, 4, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "d", descriptor = "(I)Lloader!ei;")
	private Class325 method7479(@OriginalArg(0) int arg0) {
		if (arg0 != 18) {
			anInt9179 = -77;
		}
		return this.method7485(null, (byte) 104, 18, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/Class;B)V")
	private void method7480(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString88.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg0, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		if (arg1 != 61) {
			this.method7486(-80, null, null, null, 104);
		}
		local25.invoke(local36, Boolean.TRUE);
		if (!aString88.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg0, this.method7461("sw3d.dll").toString());
		local25.invoke(local36, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lloader!ei;")
	private Class325 method7481(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Point local2 = arg0.getLocationOnScreen();
		if (arg2 >= -42) {
			aString91 = null;
		}
		return this.method7485(null, (byte) 104, 14, local2.y + arg3, arg1 + local2.x);
	}

	@OriginalMember(owner = "loader!ae", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class325 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean672) {
						return;
					}
					if (this.aClass325_1 != null) {
						local17 = this.aClass325_1;
						this.aClass325_1 = this.aClass325_1.aClass325_3;
						if (this.aClass325_1 == null) {
							this.aClass325_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local17.anInt9186;
				if (local46 == 1) {
					if (Class324.method7499() < aLong255) {
						throw new IOException();
					}
					local17.anObject20 = new Socket(InetAddress.getByName((String) local17.anObject19), local17.anInt9184);
				} else if (local46 == 2) {
					@Pc(63) Thread local63 = new Thread((Runnable) local17.anObject19);
					local63.setDaemon(true);
					local63.start();
					local63.setPriority(local17.anInt9184);
					local17.anObject20 = local63;
				} else if (local46 == 4) {
					if (Class324.method7499() < aLong255) {
						throw new IOException();
					}
					local17.anObject20 = new DataInputStream(((URL) local17.anObject19).openStream());
				} else {
					@Pc(160) Object[] local160;
					if (local46 == 8) {
						local160 = (Object[]) local17.anObject19;
						if (((Class) local160[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject20 = ((Class) local160[0]).getDeclaredMethod((String) local160[1], (Class[]) local160[2]);
					} else if (local46 == 9) {
						local160 = (Object[]) local17.anObject19;
						if (((Class) local160[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject20 = ((Class) local160[0]).getDeclaredField((String) local160[1]);
					} else if (local46 == 18) {
						@Pc(437) Clipboard local437 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local17.anObject20 = local437.getContents(null);
					} else if (local46 == 19) {
						@Pc(426) Transferable local426 = (Transferable) local17.anObject19;
						@Pc(429) Clipboard local429 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local429.setContents(local426, null);
					} else {
						@Pc(197) String local197;
						if (local46 == 3) {
							if (aLong255 > Class324.method7499()) {
								throw new IOException();
							}
							local197 = (local17.anInt9184 >> 24 & 0xFF) + "." + (local17.anInt9184 >> 16 & 0xFF) + "." + (local17.anInt9184 >> 8 & 0xFF) + "." + (local17.anInt9184 & 0xFF);
							local17.anObject20 = InetAddress.getByName(local197).getHostName();
						} else if (local46 == 21) {
							if (aLong255 > Class324.method7499()) {
								throw new IOException();
							}
							local17.anObject20 = InetAddress.getByName((String) local17.anObject19).getAddress();
						} else if (local46 == 5) {
							local17.anObject20 = this.aClass322_1.method7491();
						} else if (local46 == 6) {
							@Pc(314) Frame local314 = new Frame("Jagex Full Screen");
							local17.anObject20 = local314;
							local314.setResizable(false);
							this.aClass322_1.method7492(local17.anInt9184 & 0xFFFF, local17.anInt9185 & 0xFFFF, local314, local17.anInt9185 >> 16, local17.anInt9184 >>> 16);
						} else if (local46 == 7) {
							this.aClass322_1.method7490();
						} else {
							@Pc(291) Class327 local291;
							if (local46 == 12) {
								local291 = method7488(this.aString92, this.anInt9178, (String) local17.anObject19);
								local17.anObject20 = local291;
							} else if (local46 == 13) {
								local291 = method7488("", this.anInt9178, (String) local17.anObject19);
								local17.anObject20 = local291;
							} else if (local46 == 14) {
								@Pc(137) int local137 = local17.anInt9184;
								@Pc(140) int local140 = local17.anInt9185;
								this.aClass326_1.method7500(local140, local137);
							} else if (local46 == 15) {
								@Pc(271) boolean local271 = local17.anInt9184 != 0;
								@Pc(275) Component local275 = (Component) local17.anObject19;
								this.aClass326_1.method7502(local275, local271);
							} else if (local46 == 17) {
								local160 = (Object[]) local17.anObject19;
								this.aClass326_1.method7501((Component) local160[0], (int[]) local160[1], local17.anInt9185, local17.anInt9184, (Point) local160[2]);
							} else if (local46 == 16) {
								try {
									if (!aString88.startsWith("win")) {
										throw new Exception();
									}
									local197 = (String) local17.anObject19;
									if (!local197.startsWith("http://") && !local197.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(211) String local211 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (@Pc(213) int local213 = 0; local197.length() > local213; local213++) {
										if (local211.indexOf(local197.charAt(local213)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local197 + "\"");
									local17.anObject20 = null;
								} catch (@Pc(253) Exception local253) {
									local17.anObject20 = local253;
									throw local253;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local17.anInt9187 = 1;
			} catch (@Pc(547) ThreadDeath local547) {
				throw local547;
			} catch (@Pc(550) Throwable local550) {
				local17.anInt9187 = 2;
			}
			synchronized (local17) {
				local17.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!ei;")
	private Class325 method7482(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method7472(98, -11, 30, 5, null);
		}
		return this.method7485(arg0, (byte) 104, 7, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lloader!ei;")
	private Class325 method7483(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class[] arg2, @OriginalArg(3) String arg3) {
		return arg1 > -13 ? (Class325) null : this.method7485(new Object[] { arg0, arg3, arg2 }, (byte) 104, 8, 0, 0);
	}

	@OriginalMember(owner = "loader!ae", name = "b", descriptor = "(I)Z")
	private boolean method7484(@OriginalArg(0) int arg0) {
		if (arg0 >= -37) {
			return true;
		} else {
			return this.aClass322_1 != null;
		}
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/lang/Object;BIII)Lloader!ei;")
	private Class325 method7485(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 != 104) {
			return (Class325) null;
		}
		@Pc(9) Class325 local9 = new Class325();
		local9.anInt9186 = arg2;
		local9.anObject19 = arg0;
		local9.anInt9185 = arg3;
		local9.anInt9184 = arg4;
		synchronized (this) {
			if (this.aClass325_2 == null) {
				this.aClass325_2 = this.aClass325_1 = local9;
			} else {
				this.aClass325_2.aClass325_3 = local9;
				this.aClass325_2 = local9;
			}
			this.notify();
			return local9;
		}
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(I[ILjava/awt/Point;Ljava/awt/Component;II)Lloader!ei;")
	private Class325 method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) Component arg3, @OriginalArg(5) int arg4) {
		return this.method7485(new Object[] { arg3, arg1, arg2 }, (byte) 104, 17, arg4, arg0);
	}

	@OriginalMember(owner = "loader!ae", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method7487(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg1 <= 33) {
				this.method7478(7, null);
			}
			@Pc(13) FileOutputStream local13 = new FileOutputStream(arg0);
			local13.write(arg2, 0, arg2.length);
			local13.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			throw new RuntimeException();
		}
	}
}
